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
.board-table th {
	background-color: #ccc;
	border: 1px solid black;
	padding: 5px;
}

.board-table td {
	border: 1px solid black;
	padding: 5px;
}
</style>
</head>
<body>

	${Login.id}님 환영합니다.
	<hr>
	자유게시판
	<form action="boardwrite.jsp" method="POST">
		<input type="hidden" name="loginname" value="${Login}">
		<button type="submit">글쓰기</button>
	</form>


	<br>
	<br>
	<table class="board-table">
		<thead>
			<tr>
				<th>글번호</th>
				<th>글제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>좋아요 개수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="board" items="${Board}">
				<tr>
					<td>${board.board_number}</td>
					<td><a href="details?board_number=${board.board_number}">${board.board_title}</a></td>
					<td>${board.board_author}</td>
					<td>${board.board_date}</td>
					<td>${board.board_count}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>