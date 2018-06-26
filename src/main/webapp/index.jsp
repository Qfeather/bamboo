<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!-- saved from url=(0039)https://v3.bootcss.com/examples/signin/ -->
<html lang="zh-CN">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="https://v3.bootcss.com/favicon.ico">

    <title>Login</title>

    <!-- Bootstrap core CSS -->
    <link href="statics/css/bootstrap_3.3.7_css_bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="statics/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="statics/css/signin.css" rel="stylesheet">

    <link href="statics/css/style.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../statics/../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="statics/css/ie-emulation-modes-warning.js.下载"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

  </head>

  <body>

    
    <div class="container">
    <div id="center">
      <form class="form-signin" action="/hello/get">
        <h2 id="h2" class="form-signin-heading">Login</h2>
        <!-- 用户名 -->
        <label for="username" class="sr-only">Username</label>
        <input id="username" type="text"class="form-control" placeholder="Username" required="" autofocus="" name="username"><br>
        <!-- 密码 -->
        <label for="password" class="sr-only">Password</label>
        <input id="password" type="password"  class="form-control" placeholder="Password" required="" name="password">
        <br>
          <button id="login" class="btn btn-lg btn-info btn-block" type="submit">登录</button>
      </form>
        <button id="reg" class="btn btn-lg btn-link btn-block" type=""><a href="pages/register.jsp">注册</a></button>

    </div> <!-- /container -->
    </div>

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="./login_files/ie10-viewport-bug-workaround.js.下载"></script>
  

</body></html>