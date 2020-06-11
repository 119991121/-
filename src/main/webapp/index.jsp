<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/new_ssm/user/addUser" method="post">
  		<p>username: <input type="text" name="username" /></p>
  		<p>password: <input type="text" name="password" /></p>
  		<p>groupId: <input type="text" name="groupId" /></p>
  		<input type="submit" value="提交" />
	</form>
	<br/>删除用户<br/>
	<form action="/new_ssm/user/delete" method="post">
		user_id:<input type="text" name="user_id" >  
		<br/>
		<input type="submit" value="提交">
	</form>
	<br/>查询用户<bar/>
	<form action="/new_ssm/user/selectUser" method="post">
		positionName:<input type="text" name="positionName" >
		idCardNo:<input type="text" name="idCardNo" >
		user_id:<input type="text" name="user_id" >
		name:<input type="text" name="name" >
		departmentName:<input type="text" name="departmentName" > 
		<br/>
		<input type="submit" value="提交">
	</form>
	<br/>修改用户<br/>
	<form action="/new_ssm/user/update" method="post">
		user_id:<input type="text" name="user_id" >
		username:<input type="text" name="username" > 
		password: <input type="text" name="password" />
		positionName:<input type="text" name="positionName" > 
		departmentName:<input type="text" name="departmentName" > 
		<br/>
		<input type="submit" value="提交">
	</form>
</body>
</html>