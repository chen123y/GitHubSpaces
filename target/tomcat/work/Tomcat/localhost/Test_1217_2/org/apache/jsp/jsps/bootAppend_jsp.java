/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-12-20 06:37:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsps;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bootAppend_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>追加页面</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bootstrap/css/bootstrap.min.css\">  \r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bootstrap/css/bootstrap-table.css\">  \r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bootstrap/js/jquery-2.2.1.min.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bootstrap/js/bootstrap-table.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$(\"#leftTable\").bootstrapTable({\r\n");
      out.write("\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/emp/queryLocation\",//路径\r\n");
      out.write("\t\tcolumns:[\r\n");
      out.write("\t\t\t{field:\"checked\",checkbox:true},//前面的勾选框\r\n");
      out.write("\t\t\t{field:\"dId\",title:\"用户id\",align:\"center\",valign:\"middle\",sortable:\"true\"},\r\n");
      out.write("\t\t\t{field:\"dName\",title:\"名称\",align:\"center\",valign:\"middle\",sortable:\"true\"},\r\n");
      out.write("\t\t],\r\n");
      out.write("\t\tpagination:true,//分页 \r\n");
      out.write("\t\tpageSize:3,//每页显示几条\r\n");
      out.write("\t\tstriped: true,//条纹\t\t \r\n");
      out.write("\t\tsearch:true,//搜索\r\n");
      out.write("\t\tshowRefresh:true,//刷新\r\n");
      out.write("\t\tpageList: [2, 3, 5, 10],//自定义页数\r\n");
      out.write("\t\tshowToggle:true,//是否显示详细视图和列表视图的切换按钮\r\n");
      out.write("\t\tclickToSelect: true,   //是否启用点击选中行\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\t//右表获取左表的表头\r\n");
      out.write("\tvar leftOptions=$(\"#leftTable\").bootstrapTable(\"getOptions\");\r\n");
      out.write("\tleftOptions.url=\"\";\r\n");
      out.write("\tleftOptions.pagination=false;\r\n");
      out.write("\t$(\"#rightTable\").bootstrapTable(leftOptions);\r\n");
      out.write("\t//全选按钮\r\n");
      out.write("\t$(\"#selectAll\").click(function(){\r\n");
      out.write("\t\tvar data=$(\"#leftTable\").bootstrapTable(\"getData\",1);\r\n");
      out.write("\t\tvar dataRight=$(\"#rightTable\").bootstrapTable(\"getData\",1);\r\n");
      out.write("\t\tfor(var i=0;i<data.length;i++){\r\n");
      out.write("\t\t\tvar flag=true;\r\n");
      out.write("\t\t\tfor(var j=0;j<dataRight.length;j++){\r\n");
      out.write("\t\t\t\tif(data[i].dId==dataRight[j].dId){\r\n");
      out.write("\t\t\t\t\tflag=false;\r\n");
      out.write("\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(flag){\r\n");
      out.write("\t\t\t\t$(\"#rightTable\").bootstrapTable(\"append\",data[i]);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t} \r\n");
      out.write("\t})\r\n");
      out.write("\t//全删按钮\r\n");
      out.write("\t$(\"#deleteAll\").click(function(){\r\n");
      out.write("\t\t$(\"#rightTable\").bootstrapTable(\"removeAll\");\r\n");
      out.write("\t})\r\n");
      out.write("\t//选择按钮\r\n");
      out.write("\t$(\"#select\").click(function(){\r\n");
      out.write("\t\tvar leftSelections=$(\"#leftTable\").bootstrapTable(\"getSelections\");\r\n");
      out.write("\t\tvar rightSelections=$(\"#rightTable\").bootstrapTable(\"getData\",1);\r\n");
      out.write("\t\tfor(var i=0;i<leftSelections.length;i++){\r\n");
      out.write("\t\t\tvar flag=true;\r\n");
      out.write("\t\t\tfor(var j=0;j<rightSelections.length;j++){\r\n");
      out.write("\t\t\t\tif(leftSelections[i].dId==rightSelections[j].dId){\r\n");
      out.write("\t\t\t\t\tflag=false;\r\n");
      out.write("\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(flag){\r\n");
      out.write("\t\t\t\t$(\"#rightTable\").bootstrapTable(\"append\",leftSelections[i]);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t} \r\n");
      out.write("\t\t$(\"#leftTable\").bootstrapTable(\"refresh\");\r\n");
      out.write("\t})\r\n");
      out.write("\t//删除按钮\r\n");
      out.write("\t$(\"#delete\").click(function(){\r\n");
      out.write("\t\tvar rightSelections=$(\"#rightTable\").bootstrapTable(\"getSelections\");\r\n");
      out.write("\t\tvar arr=[];\r\n");
      out.write("\t\t$.each(rightSelections,function(i,n){\r\n");
      out.write("\t\t\tarr[i]=n.dId;\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t$(\"#rightTable\").bootstrapTable(\"remove\",{field: \"dId\", values: arr});\r\n");
      out.write("\t})\r\n");
      out.write("})\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"leftdiv\" style=\"width:300px;height:400px;border:1px blue solid;margin:150px;float:left\">\r\n");
      out.write("\t<table id=\"leftTable\">\t\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"middiv\" style=\"width:100px;height:400px;border:1px red solid;margin-top:150px;padding-left:25px;padding-top:100px;float:left\">\r\n");
      out.write("\t<button id=\"selectAll\">全选</button><br><br>\r\n");
      out.write("\t<button id=\"deleteAll\">全删</button><br><br>\r\n");
      out.write("\t<button id=\"select\">选择</button><br><br>\r\n");
      out.write("\t<button id=\"delete\">删除</button><br><br>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"rightdiv\" style=\"width:300px;height:400px;border:1px blue solid;margin:150px;float:left\">\r\n");
      out.write("\t<table id=\"rightTable\">\t\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
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
