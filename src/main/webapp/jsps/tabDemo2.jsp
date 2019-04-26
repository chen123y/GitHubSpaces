<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css"> 
<script src="${pageContext.request.contextPath }/bootstrap/js/jquery-2.2.1.min.js"></script>
<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap-closable-tab.js"></script>
<script src="${pageContext.request.contextPath }/bootstrap/js/closable-tab-div.js"></script>
</head>
<script type="text/javascript">
	$(function(){
		$("#btn1").click(function(){
			var item = {'id':'1','name':'设备管理','url':'tab_first.html','closable':true};
		    closableTab.addTab(item);
		})
		$("#btn2").click(function(){
			var item = {'id':'2','name':'实验管理','url':'emplist.jsp','closable':true};
		    closableTab.addTab(item);
		})
		$("#btn3").click(function(){
			var item = {'id':'3','name':'样品管理','url':'tab_first3.html','closable':true};
		    closableTab.addTab(item);
		})
		$("#btn4").click(function(){
			var item = {'id':'4','name':'人员管理 ','url':'tab_first4.html','closable':true};
		    closableTab.addTab(item);
		})
	})
</script>
<body>
	
    
    <div class="container" style="border: 1px black solid;">
	<div class="row clearfix" style="border: 1px">
		<div class="col-md-2 column" style="padding-top: 40px;padding-bottom:20px ;border: 1px">
			<ul class="nav nav-pills nav-stacked" style="padding-left: 50px;" >
			  <li><button id="btn1" type="button" class="btn btn-default">设备管理</button></li>
			  <li><button id="btn2" type="button" class="btn btn-default">实验管理</button></li>
			  <li><button id="btn3" type="button" class="btn btn-default">样品管理</button></li>
			  <li><button id="btn4" type="button" class="btn btn-default">人员管理 </button></li>
			  
			</ul>
		</div>
		<div class="col-md-10 column">
			
			<ul id="myTab" class="nav nav-tabs">
			
			</ul>
			<div id="myTabContent" class="tab-content" style="height:100px;">
				
				
			</div>
			
		</div>
	</div>
</div>
</body>
</html>