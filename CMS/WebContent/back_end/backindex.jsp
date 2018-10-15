
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台主页</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
      <!-- 引入 Bootstrap -->
      <link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
 
      <!-- HTML5 Shim 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
      <!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
      <!--[if lt IE 9]>
         <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
         <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
      <![endif]-->
      <link href="${pageContext.request.contextPath}/css/footer.css" rel="stylesheet">
</head>
<body>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-10 column">
		<img alt="CMS内容管理系统后台" src="${pageContext.request.contextPath}/img/logo.png">
		<h1></h1>	
		</div>
		<div class="col-md-2 column">
		<p>&nbsp;</p>
		<p><h3>欢迎您！${admin.admin_name}<br><a href="${pageContext.request.contextPath }/back_end/adminLogoutServlet">退出</a></h3></p>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-12 column">
			<ul class="breadcrumb">
				<li>
					 <a href="backindex.jsp">主页</a>
				</li>
				
			</ul>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-3 column">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">
						栏目、文章管理
					</h3>
				</div>
				<div class="panel-body">
					<a href="${pageContext.request.contextPath}/back_end/listChannelServlet" target="main">栏目列表</a>
				</div>
				<div class="panel-footer">
					<a href="${pageContext.request.contextPath}/back_end/addChannel.jsp" target="main">添加栏目</a>
				</div>
				<div class="panel-body">
					<a href="${pageContext.request.contextPath}/back_end/listArticleServlet" target="main">文章列表</a>
				</div>
				<div class="panel-footer">
					<a href="${pageContext.request.contextPath}/back_end/addArticle.jsp" target="main">添加文章</a>
				</div>
			</div>
			
			
			
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">
						管理员、用户管理
					</h3>
				</div>
				
				<div class="panel-body">
					<a href="${pageContext.request.contextPath}/back_end/listAdminServlet" target="main">管理员列表</a>
				</div>
				<div class="panel-footer">
					<a href="${pageContext.request.contextPath}/back_end/addAdmin.jsp" target="main">添加管理员</a>
				</div>
				
				<div class="panel-body">
					<a href="${pageContext.request.contextPath}/back_end/listUserServlet" target="main">用户列表</a>
				</div>
				<div class="panel-footer">
					<a href="${pageContext.request.contextPath}/back_end/addUser.jsp" target="main">添加用户</a>
				</div>
			</div>
			
			
		
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">
						评论、投票管理
					</h3>
				</div>
				<div class="panel-body">
					<a href="${pageContext.request.contextPath}/back_end/listComment.jsp" target="main">评论列表</a>
				</div>
				<div class="panel-footer">
					<a href="${pageContext.request.contextPath}/back_end/addComment.jsp" target="main">添加评论</a>
				</div>
				<div class="panel-body">
					<a href="${pageContext.request.contextPath}/back_end/listVote.jsp" target="main">投票列表</a>
				</div>
				<div class="panel-footer">
					<a href="${pageContext.request.contextPath}/back_end/addVote.jsp" target="main">添加投票</a>
				</div>
			</div>
			
		</div>
		<div class="col-md-9 column">
			<iframe frameborder="1" name="main" src="${pageContext.request.contextPath}/back_end/center.jsp" height="708px" width="100%" ></iframe>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-12 column">
			 <div class="bottom">
	<a href="#" rel="nofollow">关于我们</a>|<a href="#" rel="nofollow">广告服务</a>|<a href="#" rel="nofollow">联系我们</a>|<a href="#" rel="nofollow">法律声明</a>|<a href="#" rel="nofollow">网站地图</a>|<a target="_blank" href="#">版权声明</a>|<a href="#" rel="nofollow">帮助中心</a><br />
    版权所有　&copy; 2005-2020　豫ICP备25555555号
</div>
		</div>
	</div>
</div>
</body>
</html>