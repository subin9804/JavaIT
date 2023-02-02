<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- JSP를 사용할 땐 타임리프를 추가하지 않는다
spring web, spring dev tool
-->
<!-- 
spring.mvc.view.prefix=/WEB-INF/jsp/
spring.mvc.view.suffix=.jsp
 -->
 <!-- src/webapp/WEB-INF/jsp/main.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SpringBoot에서 JSP 사용</title>
</head>
<body>

	<h2>Hello, JSP</h2>
	<hr>
	<h3 style="color:red;">${m1}</h3>
	
	<form action="./next" method="get">
		<input type="text" name="input_name" value=""/>
		<button type="submit">입력</button>
	</form>
	
</body>
</html>