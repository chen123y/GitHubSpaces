/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-12-17 11:21:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsps;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pieChart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html style=\"height: 100%\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>折线图</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"height: 100%; margin: 0\">\r\n");
      out.write("    <div id=\"container\" style=\"height: 60%;width:80%;margin:100px;float:left\"></div>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/echarts.min.js\"></script>\r\n");
      out.write(" \t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("     \r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("  \t$(function(){\r\n");
      out.write("\t  \t//alert(2);\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/pieCharts\",\r\n");
      out.write("\t\t\tdata:{},\r\n");
      out.write("\t\t\tdataType:\"json\",\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\t//alert(3);\r\n");
      out.write("\t\t\t\tif(data!=null){\r\n");
      out.write("\t\t\t\t\tvar name=[];//x轴数据 \r\n");
      out.write("\t\t\t\t\tvar map=[];\r\n");
      out.write("\t\t\t\t\tfor(var i=0;i<data.length;i++){\r\n");
      out.write("\t\t\t\t\t\tname.push(data[i].deptName); \r\n");
      out.write("\t\t\t\t\t\tmap.push({value:data[i].userMoney,name:data[i].deptName});\r\n");
      out.write("\t\t\t\t\t  }\r\n");
      out.write("\t\t\t\t\tvar dom = document.getElementById(\"container\");\r\n");
      out.write("\t\t\t\t  \tvar myChart = echarts.init(dom);\r\n");
      out.write("\t\t\t\t  \tvar app = {};\r\n");
      out.write("\t\t\t\t  \toption = null;\r\n");
      out.write("\t\t\t\t  \toption = {\r\n");
      out.write("\t\t\t\t      title : {\r\n");
      out.write("\t\t\t\t          text: '部门平均薪资统计',\r\n");
      out.write("\t\t\t\t          subtext: '纯属虚构',\r\n");
      out.write("\t\t\t\t          x:'center'\r\n");
      out.write("\t\t\t\t      },\r\n");
      out.write("\t\t\t\t      tooltip : {\r\n");
      out.write("\t\t\t\t          trigger: 'item',\r\n");
      out.write("\t\t\t\t          formatter: \"{a} <br/>{b} : {c} ({d}%)\"\r\n");
      out.write("\t\t\t\t      },\r\n");
      out.write("\t\t\t\t      legend: {\r\n");
      out.write("\t\t\t\t          orient: 'vertical',\r\n");
      out.write("\t\t\t\t          left: 'left',\r\n");
      out.write("\t\t\t\t          data: name\r\n");
      out.write("\t\t\t\t      },\r\n");
      out.write("\t\t\t\t      series : [\r\n");
      out.write("\t\t\t\t          {\r\n");
      out.write("\t\t\t\t              name: '访问来源',\r\n");
      out.write("\t\t\t\t              type: 'pie',\r\n");
      out.write("\t\t\t\t              radius : '55%',\r\n");
      out.write("\t\t\t\t              center: ['50%', '60%'],\r\n");
      out.write("\t\t\t\t              data:map,\r\n");
      out.write("\t\t\t\t              itemStyle: {\r\n");
      out.write("\t\t\t\t                  emphasis: {\r\n");
      out.write("\t\t\t\t                      shadowBlur: 10,\r\n");
      out.write("\t\t\t\t                      shadowOffsetX: 0,\r\n");
      out.write("\t\t\t\t                      shadowColor: 'rgba(0, 0, 0, 0.5)'\r\n");
      out.write("\t\t\t\t                  }\r\n");
      out.write("\t\t\t\t              }\r\n");
      out.write("\t\t\t\t          }\r\n");
      out.write("\t\t\t\t      ]\r\n");
      out.write("\t\t\t\t  \t};\r\n");
      out.write("\t\t\t\t  if (option && typeof option === \"object\") {\r\n");
      out.write("\t\t\t\t      myChart.setOption(option, true);\r\n");
      out.write("\t\t\t\t  }\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},error:function(data){\r\n");
      out.write("\t\t\t\talert(\"图表获取失败\");\r\n");
      out.write("\t\t\t}\t\r\n");
      out.write("\t\t})\r\n");
      out.write("  \t})\r\n");
      out.write("  </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
