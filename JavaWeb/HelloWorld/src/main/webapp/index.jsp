<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Hello World Program</title>
</head>
<body>
  <%= "<h1>JSP : Hello Per Scholas!!</h1> <br/> Today's DateTime : " %>
  <%= new java.util.Date() %>
</body>
</html>