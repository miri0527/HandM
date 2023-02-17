<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<body>
	<h1>Board Update</h1>
	
	<form action="./update" method="post">
		<input type="hidden" name="boardNum" value="${dto.boardNum}"> 
		제목 : <input type="text" name="boardTitle"  value="${dto.boardTitle}"><br>
		작성자 : <input type="text" value="${dto.boardWriter}">
		<button type="submit">등록하기</button>
	</form>
	
</body>
</html>