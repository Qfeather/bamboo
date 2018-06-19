<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Register</title>
	<link href="../statics/css/bootstrap_3.3.7_css_bootstrap.min.css" rel="stylesheet">
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../statics/css/ie10-viewport-bug-workaround.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="../statics/css/signin.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="../statics/css/regstyle.css">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <script src="../statics/css/ie-emulation-modes-warning.js.下载"></script>
</head>
<body>
	<div id="center">
    	<form class="form-signin">
        	<h2 id="h2" class="form-signin-heading">Register</h2>
        	<!-- 用户名 -->
        	<label for="username" class="mylabel">Username</label>
        	<input id="username" type="email" class="form-control" placeholder="Email address" required="" autofocus="">
        	<br>
        	<!-- 密码 -->
        	<label for="password" class="mylabel">Password</label>
        	<input id="password" type="password" class="form-control" placeholder="Password" required="" style="margin-bottom: 0px;"">
        	<br>
        	        	<!-- 用户姓名 -->
        	<label for="input" class="mylabel">Your Nmae</label>
        	<input id="name" type="text" id="inputEmail" class="form-control" placeholder="Your Name" required="" autofocus="">
        	<br>
        	        	<!-- 性别 -->
        	<label for="sex" class="mylabel">Your Sex</label>
        	<input id="sex" type="text" class="form-control" placeholder="Your Sex" required="" autofocus="">
        	<br>
        	        	<!-- 年龄 -->
        	<label for="age" class="mylabel">Your Age</label>
        	<input id="age" type="text" class="form-control" placeholder="Your Age" required="" autofocus="">
        	 <br>      	
        	 			<!-- 电话 -->
        	<label for="tel" class="mylabel">Your TEL</label>
        	<input id="tel" type="email" class="form-control" placeholder="TEL" required="" autofocus="">
        	<br>


        	<button id="input" class="btn btn-lg btn btn-info btn-block" type="submit" style="width: 45%">提 交</button>
        	<button id="rewrite" class="btn btn-lg btn btn-danger btn-block" type="rewrite" style="width: 45%">重 置</button>
     	</form>
    </div> 
</body>
</html>