<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">
<head>
<meta charset="UTF-8">
<title>Spring Security Example</title>
</head>
<body>
	<h1>Spring Security SignUp page</h1>
	<hr>
	<form action="@{/signUp}" method="post" th:object="${userDTO}">
		<div>
			<input type="text" name="id" placeholder="아이디">
		</div>
		<div>
			<input type="password" name="password" placeholder="비밀번호">
		</div>
		<div>
			<input type="text" name="name" placeholder="이름">
		</div>
		<button type="submit">가입하기</button>
		<button type="button" onclick="location.href='/home';">취소</button>
	</form>
</body>
</html>