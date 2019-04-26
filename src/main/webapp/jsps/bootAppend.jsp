<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>追加页面</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css">  
	<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap-table.css">  
	<script src="${pageContext.request.contextPath }/bootstrap/js/jquery-2.2.1.min.js"></script>
	<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap-table.js"></script>
</head>
<script type="text/javascript">
$(function(){
	$("#leftTable").bootstrapTable({
		url:"${pageContext.request.contextPath}/emp/queryLocation",//路径
		columns:[
			{field:"checked",checkbox:true},//前面的勾选框
			{field:"dId",title:"用户id",align:"center",valign:"middle",sortable:"true"},
			{field:"dName",title:"名称",align:"center",valign:"middle",sortable:"true"},
		],
		pagination:true,//分页 
		pageSize:3,//每页显示几条
		striped: true,//条纹		 
		search:true,//搜索
		showRefresh:true,//刷新
		pageList: [2, 3, 5, 10],//自定义页数
		showToggle:true,//是否显示详细视图和列表视图的切换按钮
		clickToSelect: true,   //是否启用点击选中行
		
	});
	//右表获取左表的表头
	var leftOptions=$("#leftTable").bootstrapTable("getOptions");
	leftOptions.url="";
	leftOptions.pagination=false;
	$("#rightTable").bootstrapTable(leftOptions);
	//全选按钮
	$("#selectAll").click(function(){
		var data=$("#leftTable").bootstrapTable("getData",1);
		var dataRight=$("#rightTable").bootstrapTable("getData",1);
		for(var i=0;i<data.length;i++){
			var flag=true;
			for(var j=0;j<dataRight.length;j++){
				if(data[i].dId==dataRight[j].dId){
					flag=false;
					break;
				}
			}
			if(flag){
				$("#rightTable").bootstrapTable("append",data[i]);
			}
		} 
	})
	//全删按钮
	$("#deleteAll").click(function(){
		$("#rightTable").bootstrapTable("removeAll");
	})
	//选择按钮
	$("#select").click(function(){
		var leftSelections=$("#leftTable").bootstrapTable("getSelections");
		var rightSelections=$("#rightTable").bootstrapTable("getData",1);
		for(var i=0;i<leftSelections.length;i++){
			var flag=true;
			for(var j=0;j<rightSelections.length;j++){
				if(leftSelections[i].dId==rightSelections[j].dId){
					flag=false;
					break;
				}
			}
			if(flag){
				$("#rightTable").bootstrapTable("append",leftSelections[i]);
			}
		} 
		$("#leftTable").bootstrapTable("refresh");
	})
	//删除按钮
	$("#delete").click(function(){
		var rightSelections=$("#rightTable").bootstrapTable("getSelections");
		var arr=[];
		$.each(rightSelections,function(i,n){
			arr[i]=n.dId;
		})
		$("#rightTable").bootstrapTable("remove",{field: "dId", values: arr});
	})
})

</script>
<body>
<div id="leftdiv" style="width:300px;height:400px;border:1px blue solid;margin:150px;float:left">
	<table id="leftTable">	
	</table>
</div>
<div id="middiv" style="width:100px;height:400px;border:1px red solid;margin-top:150px;padding-left:25px;padding-top:100px;float:left">
	<button id="selectAll">全选</button><br><br>
	<button id="deleteAll">全删</button><br><br>
	<button id="select">选择</button><br><br>
	<button id="delete">删除</button><br><br>
</div>
<div id="rightdiv" style="width:300px;height:400px;border:1px blue solid;margin:150px;float:left">
	<table id="rightTable">	
	</table>
</div>
</body>
</html>