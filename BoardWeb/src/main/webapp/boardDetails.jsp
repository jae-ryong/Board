<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.4.min.js" integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous"></script>
<script src="./js/dat.js"></script>
</head>
<body>
	글 번호 : ${Board.board_number}<br>
	제목 :  ${Board.board_title}<br>
	글 작성자 : ${Board.board_author}<br>
	글 작성일 :  ${Board.board_date}<br>
	내용 : ${Board.board_contents}<br>
	좋아요 수 : ${Board.board_count}<br><br>
	<form action="delete" method="POST" style="display: inline-block;">
    	<input type="submit" value="삭제">
    	<input type="hidden" name="number" value="${Board.board_number}">
	</form>
	<button onclick="location.href='update.jsp?title=${Board.board_title}&contents=${Board.board_contents}&num=${Board.board_number}'">수정</button>
	<button onclick="sendLike()">좋아요</button>
	<input type="button" value="나가기" onclick="history.back()"/>
	<br><br>
	<div>
		<ul>
			<c:forEach var="name" items="${Dat}">
			<li>작성자: ${name.dat_author}, 댓글 : ${name.dat_coments}</li>
			</c:forEach>
		</ul>
	</div>
	<br><br>
	<input type="text" id="comment">
	 &nbsp; <button onclick="sendDat(${Board.board_number}, '${Login.id}')">댓글 달기</button>
</body>
</html>