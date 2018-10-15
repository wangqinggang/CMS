<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%String path=request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员登陆</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
      <!-- 引入 Bootstrap -->
      <link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
 
      <!-- HTML5 Shim 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
      <!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
      <!--[if lt IE 9]>
         <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
         <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
      <![endif]-->
      
      <link href="<%=path%>/css/footer.css" rel="stylesheet">
<script type="text/javascript">
     function check(form){
    	 if(document.forms.loginForm.uname.value==""){
    		 alert("请输入用户名！")
    		 document.forms.loginForm.uname.focus();
    		 return false;
    	 }
    	 if(document.forms.loginForm.upwd.value==""){
    		 alert("请输入密码！");
    		 document.forms.loginForm.upwd.focus();
    		 return false;
    	 }
     
     }
</script>
</head>
<body>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="page-header">
				<h1>
					CMS内容管理系统 <small>您的博客管理中心！</small>
				</h1>
			</div>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-3 column">
		</div>
		<div class="col-md-6 column">
		<h1>&nbsp;</h1>
			<form class="form-horizontal" role="form" action="<%=path%>/adminLoginServlet" method="post" name="loginForm">
				<div class="form-group">
					<h2>管理员登录</h2>
				</div>
				<div class="form-group">
					 <label for="inputEmail3" class="col-sm-2 control-label">用户名：</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="inputEmail3" name="uname"/>
					</div>
				</div>
				<div class="form-group">
					 <label for="inputPassword3" class="col-sm-2 control-label">密码：</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" id="inputPassword3" name="upwd"/>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<div class="checkbox">
							 <label><input type="checkbox" />记住登录</label>
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						 <button type="submit" class="btn btn-default" onclick="return check(forms);">登录</button>
					</div>
				</div>
				<div class="form-group">
				    <div class="col-sm-offset-2 col-sm-10" style="color:red;">
						 <p>${error}</p>
					</div>
				
				</div>
			</form>
			<h1>&nbsp;</h1>
		</div>
		<div class="col-md-3 column">
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