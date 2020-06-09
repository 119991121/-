<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SSM CRUD</title>
</head>
<body>
	${msg}<br/>
	添加用户<br/>
	<form action="user/InsertOne" method="post">
		username:<input type="text" name="username" > 
		password:<input type="text" name="password" > 
		<br/>
		phone:<input type="text" name="phone" > 
		address:<input type="text" name="address" >
		<br/> 
		email:<input type="text" name="email" > 
		c_id:<input type="text" name="c_id" > 
		<br/>
		<input type="submit" value="提交">
	</form>
	<br/>删除用户<br/>
	<form action="user/DeleteOne" method="post">
		username:<input type="text" name="username" >  
		<br/>
		<input type="submit" value="提交">
	</form>
	<br/>查询用户<bar/>
	<form action="user/SelectOne" method="post">
		username:<input type="text" name="username" > 
		<br/>
		<input type="submit" value="提交">
	</form>
	<br/>修改用户<br/>
	<form action="user/UpdateOne" method="post">
		username:<input type="text" name="username" > 
		<br/>
		<input type="submit" value="提交">
	</form>
</body>
</html>