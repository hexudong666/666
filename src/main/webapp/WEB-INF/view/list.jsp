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
<form action="list" method="post">
	图书名字:<input type="text" name="mhname" value="${mhname}">
	<input type="submit" value="搜索">
</form>
<body>
	<table>
		<tr>
			<td>图书编号</td>
			<td>图书名字</td>
			<td>图书作者</td>
			<td>作者手机号</td>
			<td><a href="list">倒序</a>
				<a href="sx">升序</a>
			</td>
			<td>图书类别</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}" var="f">
		<tr>
			<td>${f.bid}</td>
			<td>${f.bname}</td>
			<td>${f.zz}</td>
			<td>${f.sjh}</td>
			<td>${f.hy}</td>
			<td>${f.lx}</td>
			<td>
				<input type="button" value="修改" onclick="upd(${f.bid})">
			</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="10">
				当前是${info.pageNum}/${info.pages}页,共${info.total}条数据
				<a href="list?pageNum=1">首页</a>
				<a href="list?pageNum=${info.prePage}">上一页</a>
				<a href="list?pageNum=${info.nextPage}">下一页</a>
				<a href="list?pageNum=${info.pages}">尾页</a>
			</td>
		</tr>
	</table>
</body>
<script type="text/javascript">

	function upd(bid){
		alert("要修改的图书为"+bid)
		location="toupd?bid="+bid;
	}
	
</script>
</html>