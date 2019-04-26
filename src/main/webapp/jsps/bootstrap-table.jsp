<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bootstrap-table</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css">  
	<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap-table.css">  
	<script src="${pageContext.request.contextPath }/bootstrap/js/jquery-2.2.1.min.js"></script>
	<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath }/bootstrap/js/bootstrap-table.js"></script>
</head>
<script type="text/javascript">
$(function(){
	$("#myTable").bootstrapTable({
		url:"${pageContext.request.contextPath}/emp/queryLocation",//路径
		columns:[
			{field:"checked",checkbox:true},//前面的勾选框
			{field:"dId",title:"用户id",align:"center",valign:"middle",sortable:"true"},
			{field:"dName",title:"名称",align:"center",valign:"middle",sortable:"true"},
			
		],
		//cardVisible:true,需放在列中,该列可见 ,visible:false 该列不可见
		//searchable:false 需放在列中,禁止查询该列
		//sortable  是排序  默认为true
		//sortOrder: "asc", //排序方式
		//queryParams: oTableInit.queryParams, //传递参数（*）
		//sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
        //pageNumber:3,    //初始化加载第一页，默认第一页
       	showColumns:true,  //是否显示所有的列
        //minimumCountColumns:1,  //最少允许的列数
        clickToSelect: true,   //是否启用点击选中行
        height: 300,  //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
		//uniqueId: "dId", //每一行的唯一标识，一般为主键列
		pagination:true,//分页    
		pageSize:3,//每页显示几条
		striped: true,//条纹		 
		search:true,//搜索
		showRefresh:true,//刷新
		pageList: [2, 3, 5, 10],//自定义页数
		showToggle:true,//是否显示详细视图和列表视图的切换按钮
		idField:"id",
		showPaginationSwitch:true,
		//detailView:true,
		//点击行的事件
		/* onClickRow:function(row, $element,field){
            var i = $element.data('index');//可通过此参数获取当前行号
            alert("序号为"+i+1+"，"+"名称"+row.dName+"，"+"该列为"+field);
       
		}, */
		//当选中一行时触发的函数，参数——row：选中行的数据。
		 /* onCheck:function(row){
	            alert("您选中的行的城市的名称为"+row.dName);
	      } */
	     //当某一列隐藏/显示时触发，与showColumns:true一起使用。
		onColumnSwitch:function(field, checked){
            alert(field);
       }
	})	
	//jquery的调用方法,点击行的事件
	/* $('#table1').on("click-row.bs.table",function(e, row, $element,field) {
        var i = $element.data('index');//可通过此参数获取当前行
        alert(i+"，"+row.dStatus+"，"+field);
    }); */
	
})
</script>
<body>
<table id="myTable">	
</table>
</body>
</html>