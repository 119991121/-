package com.chinasoft.AiFace;

import com.baidu.aip.face.AipFace;

public class AiFaceObject {
		 //设置APPID/AK/SK
	    public static final String APP_ID = "20305711";
	    public static final String API_KEY = "0bjFiSeye5HI7gaQEE828zCZ";
	    public static final String SECRET_KEY = "8fCBSwGRdRTu4Dy2WOaoGdhPTmrOxOjp";
	    //这上面的东西在你申请百度接口的时候 都会给的
	    
	    //创建一个aipface对象
	    private static AipFace client = new AipFace(APP_ID, API_KEY, SECRET_KEY);
	    //创建单例的原因是避免多次获取sdk
	    
	    public static AipFace getClient(){
	    	client.setConnectionTimeoutInMillis(2000);
	    	client.setSocketTimeoutInMillis(60000);
	    	return client;
	    }
	    
}

