<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>서울시 공공 예약 서비스</title>
</head>
<body>
	<!-- 사이트 박스 시작 -->
	<section class="site-box min-height-100vh flex flex-column">
		
		<!-- 메인 컨텐츠 박스 시작 -->
		<main class="main-box flex-grow-1 visible-md-up">
			<section class="main-box-section con">
				<!-- 로그인 페이지 시작 -->
				<div class="section-login min-height-50vh flex flex-jc-c flex-ai-c">
					<form name="form" onsubmit="check(this); return false;"
						action="main" method="POST">
						<input type="hidden" name="loginid">
						<div class="login-title">LOGIN</div>
						<div class="login_cell__title">
							<span>아이디</span>
						</div>
						<div class="login_cell__body">
							<input type="text" name="id" maxlength="50" placeholder="ID">
						</div>
						<div class="login_cell__title">
							<span>비밀번호</span>
						</div>
						<div class="login_cell__body">
							<input type="password" name="password" maxlength="50"
								placeholder="Password">
						</div>
						<div class="loginInput_cell">
							<div>
								<button class="btn btn-go" type="submit">
									<i class="fas fa-sign-in-alt"></i> Login
								</button>
								<button class="btn btn-back" type="button"
									onclick="history.back();">
									<i class="fas fa-undo"></i> Back
								</button>
							</div>
							<div>
								<a href="/Controller의 Request Mapping 내용 기재">회원가입</a>
							</div>
						</div>
					</form>
				</div>
				<!-- 로그인 페이지 끝 -->
			</section>
		</main>
		<!-- 메인 컨텐츠 박스 끝 -->





		<!-- 맨 위 버튼 시작 -->
		<nav class="top-button btn flex flex-jc-c flex-ai-c">
			<div class="">
				<a href="#header"><i class="fas fa-chevron-up"></i></a>
			</div>
		</nav>
		<!-- 맨 위 버튼 끝 -->


		<!-- 맨 아래 버튼 시작 -->
		<nav class="bottom-button btn flex flex-jc-c flex-ai-c">
			<div class="">
				<a href="#bottom"><i class="fas fa-chevron-down"></i></a>
			</div>
		</nav>
		<br>
		<br>
		<!-- 맨 아래 버튼 끝 -->


		<!-- 푸터 시작 -->
		<footer id="bottom" class="bottom-bar con-min-width visible-md-up">
			<div class="con flex flex-ai-c">
				<div class="bottom-bar__site-info">
					<span><i class="far fa-envelope"></i> jmk4379@naver.com</span> <br>
					<br> <span>COPYRIGHT 2022. Munkyeong. All rights reserved.</span>
				</div>
			</div>
		</footer>
		<!-- 푸터 끝 -->

	</section>
	<!-- 사이트 박스 끝 -->
</body>
</html>