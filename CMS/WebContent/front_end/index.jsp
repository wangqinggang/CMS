<%@page import="com.cms.service.user.userLoginServlet"%>
<%@page import="com.cms.entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
      <!-- 引入 Bootstrap -->
      <link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
 
      <!-- HTML5 Shim 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
      <!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
      <!--[if lt IE 9]>
         <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
         <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
      <![endif]-->
<link href="${pageContext.request.contextPath}/css/footer.css" rel="stylesheet"/>
</head>
<body>

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button> <a class="navbar-brand" href="#">Study821</a>
				</div>
				
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active">
							 <a href="#">前端开发</a>
						</li>
						<li>
							 <a href="#">教程视频</a>
						</li>
						<li class="dropdown">
						
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">投票<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									 <a href="#">HTML5</a>
								</li>
								<li>
									 <a href="#">Javascript</a>
								</li>
								<li>
									 <a href="#">Jsp</a>
								</li>
								<li class="divider">
								</li>
								<li>
									 <a href="#">Separated link</a>
								</li>
								<li class="divider">
								</li>
								<li>
									 <a href="#">One more separated link</a>
								</li>
							</ul>
						</li>
					</ul>
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input type="text" class="form-control" />
						</div> <button type="submit" class="btn btn-default">搜索</button>
					</form>
					<ul class="nav navbar-nav navbar-right">
						<li>
							 <a href="${pageContext.request.contextPath}/front_end/userLogoutServlet">退出&nbsp; 用户</a>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">${user.user_name}<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									 <a href="#">Action</a>
								</li>
								<li>
									 <a href="#">Another action</a>
								</li>
								<li>
									 <a href="#">Something else here</a>
								</li>
								<li class="divider">
								</li>
								<li>
									 <a href="#">Separated link</a>
								</li>
							</ul>
						</li>
					</ul>
				</div>
				
			</nav>
			<div class="jumbotron">
				<h1>
					Hello, world!
				</h1>
				<p>
					This is a template for a simple marketing or informational website. It includes a large callout called the hero unit and three supporting pieces of content. Use it as a starting point to create something more unique.
				</p>
				<p>
					 <a class="btn btn-primary btn-large" href="#">Learn more</a>
				</p>
			</div>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-9 column">
			<div class="page-header">
				<h1>
					文章大标题 <small>副标题</small>
				</h1>
			</div>
			<h2>
				文章标题
			</h2>
			<p>
				文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介
			</p>
			<p>
				 <a class="btn" href="#">查看详细 »</a>
			</p>
			<h2>
				文章标题
			</h2>
			<p>
				文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介
			</p>
			<p>
				 <a class="btn" href="#">查看详细 »</a>
			</p>
			<h2>
				文章标题
			</h2>
			<p>
				文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介文章简介
			</p>
			<p>
				 <a class="btn" href="#">查看详细 »</a>
			</p>
			<ul class="pagination">
				<li>
					 <a href="#">上一页</a>
				</li>
				<li>
					 <a href="#">1</a>
				</li>
				<li>
					 <a href="#">2</a>
				</li>
				<li>
					 <a href="#">3</a>
				</li>
				<li>
					 <a href="#">4</a>
				</li>
				<li>
					 <a href="#">5</a>
				</li>
				<li>
					 <a href="#">下一页</a>
				</li>
			</ul>
		</div>
		<div class="col-md-3 column">
			<div class="list-group">
				 <a href="#" class="list-group-item active">热门文章</a>
				<div class="list-group-item">
					<span class="badge">999+</span>Jsp入门教程
				</div>
				<div class="list-group-item">
					<span class="badge">999+</span>JavaScript 教程
				</div>
				<div class="list-group-item">
					 <span class="badge">999+</span> MySQL 创建数据表
				</div> 
				<a class="list-group-item active">推荐文章</a>
				<div class="list-group-item">
					<span class="badge">999+</span>Jsp入门教程
				</div>
				<div class="list-group-item">
					<span class="badge">999+</span>JavaScript 教程
				</div>
				<div class="list-group-item">
					 <span class="badge">999+</span> MySQL 创建数据表
				</div> 
			</div>
			
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">
						网站简介
					</h3>
				</div>
				<div class="panel-body">
					网站站主：浮想
				</div>
				
				<div class="panel-footer">
					站主邮箱：599252594@qq.com
				</div>
			</div>
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