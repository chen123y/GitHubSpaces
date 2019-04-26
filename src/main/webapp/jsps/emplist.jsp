<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>信息展示页面</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css"> 
<script src="${pageContext.request.contextPath }/bootstrap/js/jquery-2.2.1.min.js"></script>
<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap-closable-tab.js"></script>
<script src="${pageContext.request.contextPath }/bootstrap/js/closable-tab-div.js"></script>
</head>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
//分页列表
$(function(){
	var pn;
	var row;
	var dId="";
	var eLevel="";
	var eSex="";
	var wages="";
	var queryEmpName="";
	$.ajax({
		url:"${pageContext.request.contextPath }/emp/query/1/3",
		dataType:"json",
		type:"post",
		success:function(data){
			empList(data);
			pn=data.pageNum;//当前页
			row=data.pageSize;//每页显示条数
			pages=data.pages;//总页数
		}
	})
	//首页
	$("#first").click(function(){
		if(dId==""&&eLevel==""&&eSex==""&&wages==""&&queryEmpName==""){
			page(pn,row);
		}else{
			page1(pn,row,dId,eLevel,eSex,wages,queryEmpName);
		}
		pn=1;
	})
	//上一页
	$("#pre").click(function(){
		if(dId==""&&eLevel==""&&eSex==""&&wages==""&&queryEmpName==""){
			page(pn-1,row);
		}else{
			page1(pn-1,row,dId,eLevel,eSex,wages,queryEmpName);
		}
		pn=pn-1;
	})
	//下一页
	$("#suf").click(function(){
		if(dId==""&&eLevel==""&&eSex==""&&wages==""&&queryEmpName==""){
			page(pn+1,row);
		}else{
			page1(pn+1,row,dId,eLevel,eSex,wages,queryEmpName);
		}
		pn=pn+1;
	})
	//尾页
	$("#last").click(function(){
		if(dId==""&&eLevel==""&&eSex==""&&wages==""&&queryEmpName==""){
			page(pages,row);
		}else{
			page1(pages,row,dId,eLevel,eSex,wages,queryEmpName);
		}
		pn=pages;
	})
	//每页显示条数
	$("#rows").change(function(){
		row=$("#rows option:selected").val();
		if(dId==""&&eLevel==""&&eSex==""&&wages==""&&queryEmpName==""){
			page(pn,row);
		}else{
			page1(pn,row,dId,eLevel,eSex,wages,queryEmpName);
		}
	})
	$("#searchbutton").click(function(){
		dId=$("#querydName option:selected").val();
		eLevel=$("#queryLevel option:selected").val();
		eSex=$("#queryeSex option:selected").val();
		wages=$("#wages option:selected").val();
		queryEmpName=$("#queryEmpName").val();
		$.ajax({
			url:"${pageContext.request.contextPath }/emp/query/1/3",
			dataType:"json",
			data:{pn:pn,row:row,dId:dId,eLevel:eLevel,eSex:eSex,wages:wages,queryEmpName:queryEmpName},
			type:"post",
			success:function(data){
				$("#tbody").empty();
				empList(data);
				pn=data.pageNum;//当前页
				row=data.pageSize;//每页显示条数
				pages=data.pages;//总页数
			}
		})
	})
})
//表格信息
function empList(data){
	var head="<tr align='center'><td><strong>"+"用户id"+"</strong></td><td><strong>"+"用户姓名"+"</strong></td><td><strong>"+"用户性别"+"</strong></td><td><strong>"+"用户薪资（元）"+"</strong></td><td><strong>"+"用户等级"+"</strong></td><td><strong>"+"地区名称"+"</strong></td></tr>";
	$("#tbody").append(head);
	for(var i = 0; i < data.list.length; i++){
		var list= data.list[i];
		tbody="<tr align='center'><td>"+list.eId+"</td><td>"+list.eName+"</td><td>"+list.eSex+"</td><td>"+list.eWages+"</td><td>"+list.eLevel+"</td><td>"+list.dName+"</td></tr>";
		$("#tbody").append(tbody);
	}
	/* var ps="总共"+data.total+"条，总共"+data.pages+"页，当前页为第"+data.pageNum+"页";
	$("#msg").append(ps); */
}

//分页信息 
function page(pn,row){
	$.ajax({
		url:"${pageContext.request.contextPath }/emp/query/"+pn+"/"+row,
		dataType:"json",
		type:"post",
		success:function(data){
			$("#tbody").empty();
			empList(data);
		}
	})
}
//条件查询
function page1(pn,row,dId,eLevel,eSex,wages,queryEmpName){
	$.ajax({
		url:"${pageContext.request.contextPath}/emp/query/"+pn+"/"+row,
		dataType:"json",
		data:{dId:dId,eLevel:eLevel,eSex:eSex,wages:wages,queryEmpName:queryEmpName},
		type:"post",
		success:function(data){
			$("#tbody").empty();
			empList(data);
		}
	})
} 
$(function(){
	//查地区
	$.ajax({
		url:"${pageContext.request.contextPath }/emp/queryLocation",
		dataType:"json",
		data:{},
		type:"post",
		success:function(data){
			for(var i=0;i<data.length;i++){
				$("#querydName").append("<option value='"+data[i].dId+"'>"+data[i].dName+"</option>");
			}
		}
	})
})
$(function(){
	//查等级
	$.ajax({
		url:"${pageContext.request.contextPath }/emp/queryLevel",
		dataType:"json",
		data:{},
		type:"post",
		success:function(data){
			for(var i=0;i<data.length;i++){
				$("#queryLevel").append("<option value='"+data[i].eLevel+"'>"+data[i].eLevel+"</option>");
			}
		}
	})
})
</script>
<body>
<br>
<div align="center"><strong style="font-size:30px">用户信息</strong></div>
<br>
<div class="search" align="center">
    <form method="post" action="#">
		<span>地区名字：</span>
		<select name="querydName" id="querydName">
			<option value="">--请选择--</option>
	    </select>
	    <span>工资：</span>
		<select name="wages" id="wages">
			<option value="">--请选择--</option>
			<option value="1">升序</option>
			<option value="2">降序</option>
	    </select>
	    <span>级别：</span>
		<select name="queryLevel" id="queryLevel">
			<option value="">--请选择--</option>
	    </select>
	    <span>性别：</span>
		<select name="queryeSex" id="queryeSex">
			<option  value="">--请选择--</option>
			<option value="1">男</option>
			<option value="2">女</option>		
	    </select>
	    <span>员工姓名：</span>
		<input name="queryEmpName" id="queryEmpName" class="input-text"	type="text" value="${queryEmpName }" placeholder="请输入关键字">
	<input	value="查 询" type="button" id="searchbutton">
	</form>
</div>
<br>
<div align="center">

<table id="tbody" class="table table-striped table-hover table-bordered" style="width:70%">
	
</table>
<!-- 展示总条数，总页数 -->
<div style="vertical-align: middle;width:70%"><div id="msg" style="font-size:15px;margin-top:25px;float:left;width:30%">总共${plist.total }条，总共${plist.pages }页，当前页为第${plist.pageNum}页</div>
	<div style="float:left;width:40%">
		<ul class="pagination">
			<li id="first"><a>首页</a></li>
			<li id="pre"><a>上一页</a></li>
			<li id="suf"><a>下一页</a></li>
			<li id="last"><a>尾页</a></li>
		</ul> 
	</div>
	<div style="font-size:15px;margin-top:25px;float:left;width:20%">
		选择显示条数：
		<select id="rows">
		<option value="1">1</option>
		<option value="2">2</option>
		<option value="3">3</option>
		<option value="4">4</option>
		<option value="5">5</option>
		<option value="6">6</option>
		<option value="7">7</option>
		<option value="8">8</option>
		<option value="9">9</option>
		<option value="10">10</option>
		</select>
	</div>
</div>
</div>

</body>
</html>