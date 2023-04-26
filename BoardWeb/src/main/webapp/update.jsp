<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 수정</title>
<style>
    body {
        font-family: Arial, Helvetica, sans-serif;
    }
    
    h1 {
        margin-bottom: 30px;
    }
    
    form {
        display: inline-block;
        border: 1px solid #ccc;
        padding: 20px;
        border-radius: 5px;
        box-shadow: 2px 2px 5px #ccc;
    }
    
    label {
        display: inline-block;
        width: 150px;
        font-weight: bold;
        margin-bottom: 10px;
    }
    
    input[type=text], textarea {
        width: 100%;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 5px;
        resize: none;
    }
    
    input[type=submit], input[type=button] {
        background-color: #4CAF50;
        color: white;
        padding: 10px 20px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        margin-right: 10px;
    }
    
    input[type=submit]:hover, input[type=button]:hover {
        background-color: #3e8e41;
    }
    
    input[type=submit]:focus, input[type=button]:focus {
        outline: none;
    }
</style>
</head>
<body>
	<center>
	<h1>글 수정</h1>
	<form action="update" method="POST">
		<label>원래 제목 :</label> ${param.title}<br>
		<label>바꿀 제목 :</label> <input type="text" name="title"><br><br>
		${param.number}
		<input type="hidden" name="number" value="${param.number}">
		<label>원래 내용 :</label> ${param.contents}<br>
		<label>바꿀 내용 :</label> <textarea name="contents" rows="5"></textarea><br><br>
		<input type="submit" value="수정">
		<input type="button" value="나가기" onclick="history.back()"/>
	</form>
	</center>
</body>
</html>