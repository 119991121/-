package com.chinasoft.pojo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class User  implements Serializable{
	private int user_id;
	private String username;
	private String password;
	private String name;
	private String groupId;
	private Date createdDate;
	private String phone;
	private String sex;
	private String email;
	private String position;
	private String education;
	private String idCardNo;
	private String department;
	private String address;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getIdCardNo() {
		return idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int user_id, String username, String password, String name, String groupId, Date createdDate,
			String phone, String sex, String email, String position, String education, String idCardNo,
			String department, String address) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.groupId = groupId;
		this.createdDate = createdDate;
		this.phone = phone;
		this.sex = sex;
		this.email = email;
		this.position = position;
		this.education = education;
		this.idCardNo = idCardNo;
		this.department = department;
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", username=" + username + ", password=" + password + ", name=" + name
				+ ", groupId=" + groupId + ", createdDate=" + createdDate + ", phone=" + phone + ", sex=" + sex
				+ ", email=" + email + ", position=" + position + ", education=" + education + ", idCardNo=" + idCardNo
				+ ", department=" + department + ", address=" + address + "]";
	}
	
}
