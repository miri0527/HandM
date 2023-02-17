<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
</head>
<body>
	<h1>Board List</h1>
	

		<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성날짜</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var = "dto">
			<tr>
				<td>${dto.boardNum}</td>
			</tr>
			<tr>
				<td><a href="./detail?boardNum=${dto.boardNum}">${dto.boardTitle}</a></td>
			</tr>
			<tr>
				<td>${dto.boardWriter}</td>
			</tr>
			<tr>
				<td>${dto.boardDate}</td>
			</tr>
			<tr>
				<td>${dto.boardTotal}</td>
			</tr>
			</c:forEach>
		</tbody>		
		</table>
</body>
</html>