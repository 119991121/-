package com.chinasoft.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.baidu.aip.face.AipFace;
import com.chinasoft.AiFace.AiFaceObject;
import com.chinasoft.AiFace.FaceDetect;
import com.chinasoft.AiFace.FaceRegister;
import com.chinasoft.AiFace.FaceSearch;
import com.chinasoft.AiFace.FaceUpdate;


@Controller
@RequestMapping("/user")
public class UserFaceController {

	AipFace client = AiFaceObject.getClient();
	
	@RequestMapping(value = "/addFace", method = RequestMethod.POST)
	@ResponseBody
	public Map adduser(MultipartFile file, String faceid) throws IOException {
		System.out.println(file.getName());
		System.out.println(file.getContentType());
		
		Map<String,Object> result = new HashMap<>();
		
		//���ͼƬ�Ƿ��ȡ
        if(!file.isEmpty()) {
        	InputStream in = file.getInputStream();
    		byte[] data = new byte[in.available()];
    		in.read(data);
            in.close();
            String image = Base64.getEncoder().encodeToString(data);//base64����
            
            //���ͼƬ�Ƿ��ʶ��
            JSONObject detect = new FaceDetect().detect(client, image);
            if(detect.get("error_code").toString().equals(String.valueOf(0))) {
            	
            	//����Ƿ��Ѿ�����������Ϣ
            	JSONObject search = new FaceSearch().Facecomparison(client, image);
            	if(search.get("error_code").toString().equals(String.valueOf(0))) {
            		result.put("error_code", 3);
            		result.put("messege", "������Ϣ�Ѵ���");
            		System.out.println(result);
            		return result;
            	}else {
            		
            		//���ע��
            		JSONObject add = new FaceRegister().adduser(client, image, faceid);
                	if(add.get("error_code").toString().equals(String.valueOf(0))) {
                		result.put("error_code", 0);
                		result.put("messege", "ע��ɹ�");
                		System.out.println(result);
                		return result;
                	}else {
                		result.put("error_code", 4);
                		result.put("messege", "������Ϣע��ʧ��");
                		System.out.println(result);
                		return result;
                	}
            	}
            }else {
            	result.put("error_code", 2);
        		result.put("messege", "�޷�ʶ������");
        		System.out.println(result);
        		return result;
            }
        }else {
        	result.put("error_code", 1);
    		result.put("messege", "ͼƬ�ϴ�ʧ��");
    		System.out.println(result);
    		return result;
        }
	}
	
	@RequestMapping(value = "/facelogin", method = RequestMethod.POST)
	@ResponseBody
	public Map Login(MultipartFile file) throws IOException {
		System.out.println(file.getName());
		System.out.println(file.getContentType());
		
		Map<String,Object> result = new HashMap<>();

        
        //���ͼƬ�Ƿ��ȡ
        if(!file.isEmpty()) {
        	InputStream in = file.getInputStream();
    		byte[] data = new byte[in.available()];
    		in.read(data);
            in.close();
            String image = Base64.getEncoder().encodeToString(data);//base64����
            JSONObject detect = new FaceDetect().detect(client, image);

            //���ͼƬ�Ƿ��ʶ��
            if(detect.get("error_code").toString().equals(String.valueOf(0))) {
            	
            	//�����û�������Ϣ
            	JSONObject search = new FaceSearch().Facecomparison(client, image);
            	if(search.get("error_code").toString().equals(String.valueOf(222207))) {
            		result.put("error_code", 3);
            		result.put("messege", "������Ϣδע��");
            		return result;
            	}else {
            		result.put("error_code", 0);
                	result.put("messege", "��¼�ɹ�");
                	JSONObject json1 = (JSONObject) search.get("result");
                	JSONArray userlist = (JSONArray) json1.get("user_list");
                	JSONObject json2 = (JSONObject) userlist.get(0);
                	int faceid = Integer.valueOf((String) json2.get("user_id"));
                	System.out.println(faceid);
                	return result;
            	}
            }else {
            	result.put("error_code", 2);
        		result.put("messege", "�޷�ʶ������");
        		System.out.println(result);
        		return result;
            }
        }else {
        	result.put("error_code", 1);
    		result.put("messege", "ͼƬ�ϴ�ʧ��");
    		System.out.println(result);
    		return result;
        }
	}
	
	@RequestMapping(value = "/updateFace", method = RequestMethod.POST)
	@ResponseBody
	public Map updateuser(MultipartFile file, String faceid) throws IOException {
		System.out.println(file.getName());
		System.out.println(file.getContentType());
		
		Map<String,Object> result = new HashMap<>();
		
		//���ͼƬ�Ƿ��ȡ
        if(!file.isEmpty()) {
        	InputStream in = file.getInputStream();
    		byte[] data = new byte[in.available()];
    		in.read(data);
            in.close();
            String image = Base64.getEncoder().encodeToString(data);//base64����
            
            //���ͼƬ�Ƿ��ʶ��
            JSONObject detect = new FaceDetect().detect(client, image);
            if(detect.get("error_code").toString().equals(String.valueOf(0))) {
            	JSONObject update = new FaceUpdate().updateuser(client, image, faceid);
            	if(update.get("error_code").toString().equals(String.valueOf(0))) {
                	result.put("error_code", 0);
                	result.put("messege", "�޸ĳɹ�");
                	System.out.println(result);
                	return result;
                }else {
                	result.put("error_code", 3);
                	result.put("messege", "������Ϣ����ʧ��");
                	System.out.println(result);
                	return result;
                }
            }else {
            	result.put("error_code", 2);
        		result.put("messege", "�޷�ʶ������");
        		System.out.println(result);
        		return result;
            }
        }else {
        	result.put("error_code", 1);
    		result.put("messege", "ͼƬ�ϴ�ʧ��");
    		System.out.println(result);
    		return result;
        }
	}
}
