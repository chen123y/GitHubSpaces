<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
<title>Insert title here</title>
</head>
<script type="text/javascript">
$(function(){
	//加载所有省份
	$.ajax({
		url:"${pageContext.request.contextPath}/UserServlet",
		type:"post",
		dataType:"json",
		data:{"method":"findPro"},
		success:function(data){
			if(data.list){
				$(data.list).each(function(a,b){
					$("#province").append("<option value='"+b.province_code+"'>"+b.province_name+"</option>");
				});
			}
		}
	});
});
$(function(){
	$("#province").change(function(){
		var province_code=$("#province option:selected").val();
		$.ajax({
			url:"${pageContext.request.contextPath}/UserServlet",
			type:"post",
			dataType:"json",
			data:{"method":"findCity",province_code:province_code},
			success:function(data){
				$("#city").html("");
				$("#city").html("<option>--请选择--</option>");
				$("#area").html("");
				$("#area").html("<option>--请选择--</option>");
				if(data.list){
					$(data.list).each(function(a,b){
						$("#city").append("<option value='"+b.city_code+"'>"+b.city_name+"</option>");
					});
				}
			}
		});
	});
	
	$("#city").change(function(){
		var city_code=$("#city option:selected").val();
		$.ajax({
			url:"${pageContext.request.contextPath}/UserServlet",
			type:"post",
			dataType:"json",
			data:{"method":"findArea",city_code:city_code},
			success:function(data){
				$("#area").html("");
				$("#area").html("<option>--请选择--</option>");
				if(data.list){
					$(data.list).each(function(a,b){
						$("#area").append("<option value='"+b.area_code+"'>"+b.area_name+"</option>");
					});
				}
			}
		});
	});
	$("#btn").click(function(){
		var username=$("input[name='username']").val();
		var usercode=$("input[name='usercode']").val();
		var birthday=$("input[name='birthday']").val();
		var phone=$("input[name='phone']").val();
		var sex=$("input[name='sex']:checked").val();
		var province_name=$("#province option:selected").text();
		var city_name=$("#city option:selected").text();
		var area_name=$("#area option:selected").text();
		$.ajax({
			url:"${pageContext.request.contextPath}/UserServlet",
			type:"post",
			dataType:"json",
			data:{"method":"addUser",username:username,usercode:usercode,
				birthday:birthday,phone:phone,sex:sex,province_name:province_name,
				city_name:city_name,area_name:area_name
				},
			success:function(data){
				alert("添加成功");
			}	
		});
	});
});
</script>
<body>
<form action="#" method="post">
<p>姓名：<input type="text" name="username" value=""></p>
<p>账号：<input type="text" name="usercode" value=""></p>
<p>生日：<input type="text" name="birthday" value=""></p>
<p>电话：<input type="text" name="phone" value=""></p>
<p>性别：<input type="radio" name="sex" value="男">男<input type="radio" name="sex" value="女">女</p>
省：<select id="province" name="province">
<option>--请选择--</option>
</select>

市：<select id="city" name="city">
<option>--请选择--</option>
</select>

区：<select id="area" name="area">
<option>--请选择--</option>
</select>
<br>
<p><input type="button" id="btn" value="提交"></p>

</form>
</body>
</html>