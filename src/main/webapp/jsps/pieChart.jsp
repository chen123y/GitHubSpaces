<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="height: 100%">
<head>
<meta charset="UTF-8">
<title>折线图</title>
</head>
<body style="height: 100%; margin: 0">
    <div id="container" style="height: 60%;width:80%;margin:100px;float:left"></div>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/echarts.min.js"></script>
 	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
     
	<script type="text/javascript">
  	$(function(){
	  	//alert(2);
		$.ajax({
			type:"post",
			url:"${pageContext.request.contextPath }/user/pieCharts",
			data:{},
			dataType:"json",
			success:function(data){
				//alert(3);
				if(data!=null){
					var name=[];//x轴数据 
					var map=[];
					for(var i=0;i<data.length;i++){
						name.push(data[i].deptName); 
						map.push({value:data[i].userMoney,name:data[i].deptName});
					  }
					var dom = document.getElementById("container");
				  	var myChart = echarts.init(dom);
				  	var app = {};
				  	option = null;
				  	option = {
				      title : {
				          text: '部门平均薪资统计',
				          subtext: '纯属虚构',
				          x:'center'
				      },
				      tooltip : {
				          trigger: 'item',
				          formatter: "{a} <br/>{b} : {c} ({d}%)"
				      },
				      legend: {
				          orient: 'vertical',
				          left: 'left',
				          data: name
				      },
				      series : [
				          {
				              name: '访问来源',
				              type: 'pie',
				              radius : '55%',
				              center: ['50%', '60%'],
				              data:map,
				              itemStyle: {
				                  emphasis: {
				                      shadowBlur: 10,
				                      shadowOffsetX: 0,
				                      shadowColor: 'rgba(0, 0, 0, 0.5)'
				                  }
				              }
				          }
				      ]
				  	};
				  if (option && typeof option === "object") {
				      myChart.setOption(option, true);
				  }
				}
			},error:function(data){
				alert("图表获取失败");
			}	
		})
  	})
  </script>
</body>
</html>