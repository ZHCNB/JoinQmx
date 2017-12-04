<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
<link rel="stylesheet" href="assets/js/login/css/style.css">
<script type="text/javascript" src="assets/js/login/jquery.min.js"></script>
<script type="text/javascript" src="jassets/js/login//scripts.js"></script>
</head>
<body>
	<div class="page-container">
		<h1>启明星招新后台(Login)</h1>
		<form action="LoginHome" method="post">
			<input type="text" name="user_name" class="username"
				placeholder="请输入您的用户名！"> <input type="password"
				name="password" class="password" placeholder="请输入您的用户密码！">
			<input type="submit" class="submit_button" value="登录"
				style="background-color: #ef4300; border: 1px solid #ff730e; box-shadow: 0 15px 30px 0 rgba(255, 255, 255, .25) inset, 0 2px 7px 0 rgba(0, 0, 0, .2); font-weight: 700;font-size: 24px;
    letter-spacing: 15px; cursor: pointer;">
		</form>
		<div class="connect">
			<p>启明星后台登陆</p>
		</div>
	</div>
	<script type="text/javascript">
		window.onload = function() {
			var config = {
				vx : 4,
				vy : 4,
				height : 2,
				width : 2,
				count : 100,
				color : "121, 162, 185",
				stroke : "100, 200, 180",
				dist : 6000,
				e_dist : 20000,
				max_conn : 10
			}
			CanvasParticle(config);
		}
	</script>
	<script type="text/javascript"
		src="assets/js/login/js/canvas-particle.js"></script>
</body>
</html>