<!DOCTYPE html>
<html xmlns:th="https://www.thymeleaf.org">
<head>
<title>Spring Security Example</title>
</head>
<body>
	<h1>Spring Security Login page</h1>
	<div thif="${param.error}">Invalid username and password.</div>
	<div thif="${param.logout}">You have been logged out.</div>
	<form thaction="@{/login}" method="post">
		<div>
			<label> User Name : <input type="text" name="username" /></label>
		</div>
		<br>
		<div>
			<label> Password : <input type="password" name="password" /></label>
		</div>
		<br>
		<div>
			<input type="submit" value="Sign In" />
			<br>
			
			
			<!--  <input type="button" onclick="location.href='/signUp'" value="Sign Up" />-->
		</div>
		<br>
		<div>
			<a href="@{/signUp}">signUp</a>
		</div>
	</form>
</body>
</html>