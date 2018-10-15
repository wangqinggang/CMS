<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
      <!-- 引入 Bootstrap -->
      <link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
 
      <!-- HTML5 Shim 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
      <!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
      <!--[if lt IE 9]>
         <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
         <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
      <![endif]-->
</head>
<body>
<div class="container">
	<div class="row clearfix">
<div class="page-header">
				<h1>
					用户管理 <small>用户列表</small>
				</h1>
			</div>
<table class="table table-hover">
  <caption><h4>用户列表</h4></caption>
  <thead>
    <tr class="success">
      <th>用户id</th>
      <th>用户名称</th>
      <th>用户密码</th>
      <th>用户权限开启</th>
      <th>修改</th>
      <th>删除</th>
    </tr>
  </thead>
  <tbody>
 <c:forEach items="${listAdmin}" var="admin">
    <tr>
      <td>${admin.admin_id}</td>
      <td>${admin.admin_name}</td>
      <td>${admin.admin_pwd}</td>
      <td>${admin.admin_right}</td>
      <td><a href="${pageContext.request.contextPath}/back_end/getAdminByIdServlet?id=${admin.admin_id }"><button type="button" class="btn btn-default">修改</button></a></td>
      <td><a href="${pageContext.request.contextPath}/back_end/deleteAdminServlet?id=${admin.admin_id }"><button type="button" class="btn btn-default">删除</button></a></td></tr>
      <tr>
</c:forEach>
  </tbody>
</table>
</div>
</div>
</body>
</html>