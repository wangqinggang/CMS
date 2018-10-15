<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改文章信息</title>
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
					文章管理 <small>添加文章</small>
				</h1>
			</div>
			<form role="form" action="${pageContext.request.contextPath}/back_end/modifyArticleServlet?id=${article.article_id}" method="post">
				<div class="form-group">
					 <label>文章标题</label><input type="text" class="form-control"  value="${article.article_id} name="title"/>
				</div>
				<div class="form-group">
					 <label >文章作者</label><input type="text" class="form-control" value="${article.user_id} name="user_id" placehoder="用户id"/>
				</div>
				<div class="form-group">
					 <label >文章简介</label><input type="text" class="form-control" value="${article.summery} name="summary"/>
				</div>
				<div class="form-group">
					 <label >所属栏目</label><input type="text" class="form-control" value="${article.channel_id} name="channel_id"/>
				</div>
				<div class="form-group">
					 <label >文章内容</label><textarea rows="10" class="form-control" value="${article.content} name="content">
					 </textarea>
				</div>
				
				<button type="submit" class="btn btn-default">添加</button>
			</form>
		</div>
	</div>
</div>
</body>
</html>