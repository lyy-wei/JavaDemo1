<%--
  Created by IntelliJ IDEA.
  User: LC
  Date: 2020/12/2
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>登录</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css" media="all"/>
</head>
<body>
<input type="hidden" id="path" value="${pageContext.request.contextPath}">

<div id="jsi-snow-container" class="container"></div>
<div class="login">
    <h1>登录</h1>

    <div class="layui-form-item">
        <input class="layui-input" name="username" placeholder="用户名" lay-verify="required" type="text" id="username"
               autocomplete="off">
    </div>
    <div class="layui-form-item">
        <input class="layui-input" name="password" id="password" placeholder="密码" lay-verify="required" type="password"
               autocomplete="off">
    </div>
    <div class="layui-form-item form_code">
        <input class="layui-input" name="code" placeholder="验证码" lay-verify="required" type="text"
               autocomplete="off">
        <div class="code"><img src="${pageContext.request.contextPath}/images/code.jpg" width="116" height="36"></div>
    </div>
    <button class="layui-btn login_btn" id="login" onclick="login()">登录</button><br><br>
    <button class="layui-btn login_btn" id="reg">注册</button>

</div>

<div style="display: none;" id="gb">
    <form class="layui-form" action="">
        <div class="layui-form-item">
            <label class="layui-form-label">用户账号</label>
            <div class="layui-input-inline">
                <input type="text" name="username" required lay-verify="required" placeholder="请输入账号" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">用户密码</label>
            <div class="layui-input-inline">
                <input type="password" name="password" required lay-verify="pwd" placeholder="请输入密码" autocomplete="off" class="layui-input" id="pass1">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">确认密码</label>
            <div class="layui-input-inline">
                <input type="password" name="passwords" required lay-verify="pwd" placeholder="请再次输入密码" autocomplete="off" class="layui-input" id="pass2">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">邮箱</label>
            <div class="layui-input-inline">
                <input type="email" name="email" required lay-verify="emails" placeholder="请输入邮箱" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">联系方式</label>
            <div class="layui-input-inline">
                <input type="text" name="phone" required lay-verify="phones" placeholder="请输入手机号" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">单选框</label>
            <div class="layui-input-block">
                <input type="radio" name="sex" value="男" title="男" checked>
                <input type="radio" name="sex" value="女" title="女">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">复选框</label>
            <div class="layui-input-block">
                <input type="checkbox" name="like[write]" title="发呆">
                <input type="checkbox" name="like[read]" title="发呆" checked>
                <input type="checkbox" name="like[dai]" title="发呆">
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">所在地</label>
                <div class="layui-input-inline">
                    <select name="type" lay-verify="required" lay-filter="type">
                        <option value=""></option>
                        <option value="1">北京</option>
                        <option value="2">上海</option>
                        <option value="3">广州</option>
                    </select>
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">真实姓名</label>
            <div class="layui-input-inline">
                <input type="text" name="truename" required lay-verify="truename" placeholder="请输入您的姓名" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">身份证</label>
            <div class="layui-input-inline">
                <input type="text" name="cardId" required lay-verify="cardId" placeholder="请输入身份证号" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </form>

</div>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/layui/layui.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/login.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/snow_canvas.js"></script>
</body>
</html>
