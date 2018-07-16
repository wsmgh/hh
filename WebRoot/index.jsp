<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <div align="center">
    	my page <br>
    	<a href="login.html">login</a><br>
    	<a href="ajax.html">ajax</a><br/>
    	<a href="graph.html">graph</a><br/>
    	<a href="weather.html">weather</a><br/>
    	<a href="search.html">search</a><br/>
    	<a href="qa.html">dati</a><br/>
    	<a href="test.html">test</a><br/>
    	<a href="regist.html">regist</a>
    </div>
  </body>
</html>
