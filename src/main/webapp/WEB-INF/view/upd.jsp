<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="fm" %>
   <%@  taglib  prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/css.css"/> 
<script type="text/javascript" src="<%=path%>/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="<%=path%>/My97DatePicker/WdatePicker.js"></script>
</head>
<body>
	 <form action="xg" method="post">
		手机号:<input type="text" name="sjh" value="${book.sjh}"><br><br><br>
		欢迎程度:<input type="text" name="hy" value="${book.hy}"><br><br><br>
		<input type="submit" value="修改">
	</form> 
</body>
</html>