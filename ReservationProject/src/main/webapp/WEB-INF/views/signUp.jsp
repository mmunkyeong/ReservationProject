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
			<input type="text" name="id" placeholder="ìì´ë">
		</div>
		<div>
			<input type="password" name="password" placeholder="ë¹ë°ë²í¸">
		</div>
		<div>
			<input type="text" name="name" placeholder="ì´ë¦">
		</div>
		<button type="submit">ê°ìíê¸°</button>
		<button type="button" onclick="location.href='/home';">ì·¨ì</button>
	</form>
</body>
</html>