<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css"> 
<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap-tab.css"> 
<script src="${pageContext.request.contextPath }/bootstrap/js/jquery-2.2.1.min.js"></script>
<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap-tab.js"></script>
</head>
<body>
<div class="container" style="border: 1px red solid">
	<div class="row clearfix">
		<div class="col-md-2 column">
			<div class="btn-group btn-group-vertical">
				 <button id="but1" class="btn btn-default" type="button"><em class="glyphicon glyphicon-align-left"></em>设备管理</button> 
				 <button id="but2" class="btn btn-default" type="button"><em class="glyphicon glyphicon-align-center"></em>实验管理</button> 
				 <button id="but3" class="btn btn-default" type="button"><em class="glyphicon glyphicon-align-right"></em>样品管理</button> 
				 <button id="but4" class="btn btn-default" type="button"><em class="glyphicon glyphicon-align-justify"></em>人员管理</button>
			</div>
		</div>
		<div class="col-md-10 column">
			<ul id="myTab" class="nav nav-tabs">
			   		   
			</ul>		
			<div id="myTabContent" class="tab-content">
			    <div class="tab-pane fade" id="device">
			        <p>设备管理系统。。。。。</p>
			    </div>
			    <div class="tab-pane fade" id="test">
			        <p>实验管理系统。。。。。</p>
			    </div>
			    <div class="tab-pane fade" id="demo">
			        <p>样品管理系统。。。。。。</p>
			    </div>
			    <div class="tab-pane fade" id="user">
			        <p>人员管理系统。。。。。。</p>
			    </div>
			</div>
		</div>
	</div>
</div>
	<script type="text/javascript">
		$("#but1").click(function(){
			var name = $("#but1").text();
			createTab("#device",name);
			//$('#myTab a[href="#device"]').tab('show')
		});
		$("#but2").click(function(){
			var name = $("#but2").text();
			createTab("#test",name);
		});
		$("#but3").click(function(){
			var name = $("#but3").text();
			createTab("#demo",name);
		});
		$("#but4").click(function(){
			var name = $("#but4").text();
			createTab("#user",name);
		});
		function createTab(id,name){
			var flag=true;
			$("#myTab a").each(function(i,n){
				var a=$(this).attr("href");
				if(a==id){
					flag=false;
				}
			}) 
			if(flag){
				$("#myTab").append("<li><a href='"+id+"' data-toggle='tab'>"+name+"</a></li>");
				$("#myTab a[href='"+id+"']").tab('show')
			}
		}
	</script>
</body>
</html>