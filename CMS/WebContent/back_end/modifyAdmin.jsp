<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改管理员信息</title>
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
		<div class="col-md-12 column">
			<div class="page-header">
				<h1>
					管理员管理 <small>添加管理员</small>
				</h1>
			</div>
			<form role="form" action="${pageContext.request.contextPath}/back_end/modifyAdminServlet?id=${admin.admin_id}" method="post">
				<div class="form-group">
					 <label>管理员名称</label><input type="text" class="form-control" value="${admin.admin_name}" name="admin_name"/>
				</div>
				<div class="form-group">
					 <label >管理员密码</label><input type="password" class="form-control" value="${admin.admin_pwd}" name="admin_pwd"/>
				</div>
				<div class="form-group">
				<label>管理员权限是否开启</label>
					 <label class="checkbox-inline">
					    <input type="radio" name="right" value="1" <c:if test="${admin.admin_right=='true'}">checked</c:if>>开启
					  </label>
					  <label class="checkbox-inline">
					    <input type="radio" name="right"  value="0" <c:if test="${admin.admin_right=='false'}">checked</c:if>>关闭
					  </label>
				</div>
				<button type="submit" class="btn btn-default">修改</button>
			</form>
		</div>
	</div>
</div>
</body>
</html>