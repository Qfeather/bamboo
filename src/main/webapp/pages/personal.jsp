
<%--
  Created by IntelliJ IDEA.
  User: Qfeather
  Date: 2018/6/25
  Time: 8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="https://v3.bootcss.com/favicon.ico">

    <title>Document</title>
    <script src="../statics/js/jquery.js"></script>
    <link rel="stylesheet" type="text/css" href="../statics/css/perstyle.css">
    <!-- Bootstrap core CSS -->
    <link href="../statics/css/bootstrap_3.3.7_css_bootstrap.min.css" rel="stylesheet">
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../statics/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <script src="../statics/js/bootstrap.js"></script>
    <script src="../statics/css/ie-emulation-modes-warning.js"></script>
</head>
<body style="background:#fafafa;">
<div style="width:100%;">
    <!-- menu -->
    <div id="menu" style="color: #fff; font-size: 22px; height:50px; width: 100%; position: fixed;top: 0px; ">
        <!-- home按钮 -->
        <div style="width: 50px;height: 100%;float: left;margin-left: 445px;">
            <a href="../pages/home.jsp"><span class="glyphicon glyphicon-home cbutton"></span></a>
        </div>
        <!-- search按钮 -->
        <div style="width: 50px;height: 100%;float: left;margin-left: 803px;">
            <a href=""><span class="glyphicon glyphicon-search cbutton"></span></a>
        </div>
        <!-- personal按钮 -->
        <div style="width: 50px;height: 100%;float: left;">
            <a href="#"><span class="glyphicon glyphicon-user cbutton"></span></a>
        </div>
        <!-- collection按钮 -->
        <div style="width: 50px;height: 100%;float: left;">
            <a href=""><span class="glyphicon glyphicon-heart-empty cbutton"></span></a>
        </div>
    </div>
    <!-- body -->
    <div id="cen" style=" width: 53% ">
        <!-- 个人信息部分-->
        <div id="centop" style=" height:250px;  width:100%;">
            <!-- 头像 -->
            <div id="headimg" style="width: 150px; height: 150px; border-radius:50%; overflow: hidden;">
                <img style="height: 100%; width:100%;" src="${user.headimg}">
            </div>
            <!-- 个人信息 -->
            <div id="messgae" style="height: 150px;width: 500px;">
                <!-- 显示用户 设置 -->
                <div id="config" style="height: 50px; width: 100%">
                    <!-- 用户名显示 -->
                    <div style="height: 100%;  float: left; font-size: 18px;">
                        <p style="margin-top: 14px;">${user.username}</p>
                    </div>
                    <!-- 设置图标 -->
                    <div style="height: 100%;width: 50px;float: left; margin-top: 5px;">
                        <button type="button" style="font-size: 24px; padding: 0px 6px; margin-left: 15px;" class="btn btn-default btn-lg">
                            <span style="margin-top: 5px;" class="glyphicon glyphicon-cog" aria-hidden="true"></span>
                        </button>
                    </div>
                </div>
                <!-- 个人简介 -->
                <div id="personaltext" style="height: 100px;width: 100% font-size:14px;">
                    <p style="margin-top: 5px;">${user.profile}</p>
                </div>
            </div>
        </div>
        <hr/>
        <div id="collection" style="height: 640px; width: 100%;">
            <div id="pcoll"><p>收藏夹</p></div>
            <!-- 收藏夹部分 -->
            <div style="height: 600px;width: 100%;">
                <!-- 第一行图片 -->

                <%--request.setAttribute("stu",list);   类似于键值对，找后面的value值永远是通过前面的key值来找   传入页面中foreach   items调用的则是key--%>
                <ul style="height: 250px;">
                    <c:forEach var="photo" items="${photo}">
                        <li><div class="collphoto"><img class="tablephoto" src="${photo}"></div></li>
                     </c:forEach>
                </ul>
            </div>
        </div>
        <!-- 			<div style="height: 88px;width: 100%;"></div> -->

    </div>


</div>


<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">个人信息</h4>
            </div>


            <div class="modal-body">
                <form>
                    <div class="form-group">
                        <label for="uusername">用户账号</label>
                        <p id="uusername" class="form-control-static">${user.username}</p>
                    </div>

                    <div class="form-group">
                        <label for="uname">用户姓名</label>
                        <input type="text" class="form-control" id="uname">
                    </div>

                    <div class="form-group">
                        <label for="usex">性别</label>
                        <input type="text" class="form-control" id="usex">
                    </div>

                    <div class="form-group">
                        <label for="uage">年龄</label>
                        <input type="text" class="form-control" id="uage">
                    </div>

                    <div class="form-group">
                        <label for="uhomepages">个人主页</label>
                        <input type="text" class="form-control" id="uhomepages">
                    </div>

                    <div class="form-group">
                        <label for="utel">联系电话</label>
                        <input type="text" class="form-control" id="utel">
                    </div>

                    <div class="form-group">
                        <label for="uhead">个人头像</label>
                        <input type="file" id="uhead">
                        <p class="help-block">上传你的头像</p>
                    </div>

                    <div class="form-group">
                        <label for="uprofile">个人简介</label>
                        <textarea id="uprofile" class="form-control" rows="3"></textarea>
                    </div>
                </form>
            </div>

            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary">确认修改</button>
            </div>
        </div>
    </div>
</div>


</body>
</html>
