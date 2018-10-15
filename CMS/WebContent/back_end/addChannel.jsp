<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加栏目</title>
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
					栏目管理 <small>添加栏目</small>
				</h1>
			</div>
			<form role="form" action="${pageContext.request.contextPath}/back_end/addChannelServlet" method="post">
				<div class="form-group">
					 <label>栏目名称</label><input type="text" class="form-control"  name="channel_name"/>
				</div>
				<div class="form-group">
					 <label >栏目类型</label><input type="text" class="form-control"  name="channel_type"/>
				</div>
				<div class="form-group">
				<label>是否是父栏目</label>
					 <label class="checkbox-inline">
					    <input type="radio" name="isparent" value="1" checked>
					  </label>
					  <label class="checkbox-inline">
					    <input type="radio" name="isparent"  value="0">否
					  </label>
				</div>
				<div class="form-group">
				<label>是否显示</label>
					 <label class="checkbox-inline">
					    <input type="radio" name="isshow" value="1" checked>是
					  </label>
					  <label class="checkbox-inline">
					    <input type="radio" name="isshow"  value="0">否
					  </label>
				</div>
				<div class="form-group">
				<label>父栏目</label>
					 <label class="checkbox-inline">
					    <input type="radio" name="channel_id" value="1" checked>前端开发
					  </label>
					  <label class="checkbox-inline">
					    <input type="radio" name="channel_id"  value="2">教程视频
					  </label>
					  <label class="checkbox-inline">
					    <input type="radio" name="channel_id"  value="7">人工智能
					  </label>
				</div>
				<button type="submit" class="btn btn-default">添加</button>
			</form>
		</div>
	</div>
</div>
</body>
</html>