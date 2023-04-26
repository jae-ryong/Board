<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.login.vo.LoginVO"%>
<%@ page import="com.board.vo.BoardVO"%>
<%@ page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	form {
		margin: 50px auto;
		padding: 20px;
		width: 80%;
		background-color: #f2f2f2;
		border-radius: 10px;
		box-shadow: 0 0 10px rgba(0,0,0,0.3);
	}
	
	input[type=text], textarea {
		padding: 10px;
		width: 100%;
		border: none;
		border-radius: 5px;
		margin: 5px 0;
	}
	
	input[type=submit], input[type=button] {
		background-color: #4CAF50;
		color: white;
		padding: 10px 20px;
		border: none;
		border-radius: 5px;
		cursor: pointer;
	}
	
	input[type=submit]:hover, input[type=button]:hover {
		background-color: #3e8e41;
	}
</style>

</head>
<body>
	<c:set var="today" value="<%=new java.util.Date()%>"/>
	<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("loginname");
	%>
	<form action="boardlist" method="POST">
		<div>
			<label for="title">글제목</label>
			<input type="text" name="title" id="title">
		</div>
		<div>
			<label for="author">글 작성자</label>
			<span><%=name%></span>
			<input type="hidden" name="author" value="<%=name%>">
		</div>
		<div>
			<label for="contents">글 내용</label>
			<textarea name="contents" rows="5" cols="30"></textarea>
		</div>
		<div>
			<label for="day">글 작성일</label>
			<fmt:formatDate value="${today}" pattern="yyyy-MM-dd" />
			<input type="hidden" name="day" value="${today}"/>
		</div>
		<div>
			<input type="submit" value="저장" name="ok">
			<input type="button" value="취소" onclick="history.back()"/>
		</div>
	</form>
</body>
</html>