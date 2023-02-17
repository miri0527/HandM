<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detail</title>
</head>
<body>
	<h1>Board Detail</h1>
	<form action="./detail" method="get">
		<h3>Num : ${dto.boardNum}</h3>
		<h3>Title : ${dto.boardTitle}</h3>
		<h3>Writer : ${dto.boardWriter }</h3>
		<h3>Date : ${dto.boardDate}</h3>
		<h3>Views : ${dto.boardTotal}</h3>
		<h3>Contents : ${dto.boardContents}</h3>
	</form>
	
	<button type="submit"><a href="./update?boardNum=${dto.boardNum}">수정하기</a></button>
</body>
</html>