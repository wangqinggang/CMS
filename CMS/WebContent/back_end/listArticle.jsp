<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文章列表</title>
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
					文章管理 <small>文章列表</small>
				</h1>
			</div>
<table class="table table-hover">
  <caption><h4>文章列表</h4></caption>
  <thead>
    <tr class="success">
      <th>文章id</th>
      <th>文章标题</th>
      <th>文章作者id</th>
      <th>文章简介</th>
      <th>阅读数</th>
      <th>评论数</th>
      <th>所属栏目</th>
      <th>删除</th>
      <th>修改</th>
      
    </tr>
  </thead>
  <tbody>
 <c:forEach items="${listArticle}" var="article">
    <tr>
      <td>${article.article_id}</td>
      <td>${article.title}</td>
      <td>${article.user_id}</td>
      <td>${article.summary}</td>
      <td>${article.content}</td>
      <td>${article.readtimes}</td>
      <td>${article.hits}</td>
      <td>${article.channel_id}</td>
      <td><a href="${pageContext.request.contextPath}/back_end/getArticleByIdServlet?id=${article.article_id }"><button type="button" class="btn btn-default">修改</button></a></td>
      <td><a href="${pageContext.request.contextPath}/back_end/deleteArticleServlet?id=${article.article_id }"><button type="button" class="btn btn-default">删除</button></a></td>\
      </tr>
      
</c:forEach>
  </tbody>
</table>
</div>
</div>
</body>
</html>