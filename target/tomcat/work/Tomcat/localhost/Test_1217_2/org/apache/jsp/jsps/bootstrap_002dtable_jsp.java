/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-12-23 12:08:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsps;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bootstrap_002dtable_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Bootstrap-table</title>\r\n");
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
      out.write("\t$(\"#myTable\").bootstrapTable({\r\n");
      out.write("\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/emp/queryLocation\",//路径\r\n");
      out.write("\t\tcolumns:[\r\n");
      out.write("\t\t\t{field:\"checked\",checkbox:true},//前面的勾选框\r\n");
      out.write("\t\t\t{field:\"dId\",title:\"用户id\",align:\"center\",valign:\"middle\",sortable:\"true\"},\r\n");
      out.write("\t\t\t{field:\"dName\",title:\"名称\",align:\"center\",valign:\"middle\",sortable:\"true\"},\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t],\r\n");
      out.write("\t\t//cardVisible:true,需放在列中,该列可见 ,visible:false 该列不可见\r\n");
      out.write("\t\t//searchable:false 需放在列中,禁止查询该列\r\n");
      out.write("\t\t//sortable  是排序  默认为true\r\n");
      out.write("\t\t//sortOrder: \"asc\", //排序方式\r\n");
      out.write("\t\t//queryParams: oTableInit.queryParams, //传递参数（*）\r\n");
      out.write("\t\t//sidePagination: \"server\",           //分页方式：client客户端分页，server服务端分页（*）\r\n");
      out.write("        //pageNumber:3,    //初始化加载第一页，默认第一页\r\n");
      out.write("       \tshowColumns:true,  //是否显示所有的列\r\n");
      out.write("        //minimumCountColumns:1,  //最少允许的列数\r\n");
      out.write("        clickToSelect: true,   //是否启用点击选中行\r\n");
      out.write("        height: 300,  //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度\r\n");
      out.write("\t\t//uniqueId: \"dId\", //每一行的唯一标识，一般为主键列\r\n");
      out.write("\t\tpagination:true,//分页    \r\n");
      out.write("\t\tpageSize:3,//每页显示几条\r\n");
      out.write("\t\tstriped: true,//条纹\t\t \r\n");
      out.write("\t\tsearch:true,//搜索\r\n");
      out.write("\t\tshowRefresh:true,//刷新\r\n");
      out.write("\t\tpageList: [2, 3, 5, 10],//自定义页数\r\n");
      out.write("\t\tshowToggle:true,//是否显示详细视图和列表视图的切换按钮\r\n");
      out.write("\t\tidField:\"id\",\r\n");
      out.write("\t\tshowPaginationSwitch:true,\r\n");
      out.write("\t\t//detailView:true,\r\n");
      out.write("\t\t//点击行的事件\r\n");
      out.write("\t\t/* onClickRow:function(row, $element,field){\r\n");
      out.write("            var i = $element.data('index');//可通过此参数获取当前行号\r\n");
      out.write("            alert(\"序号为\"+i+1+\"，\"+\"名称\"+row.dName+\"，\"+\"该列为\"+field);\r\n");
      out.write("       \r\n");
      out.write("\t\t}, */\r\n");
      out.write("\t\t//当选中一行时触发的函数，参数——row：选中行的数据。\r\n");
      out.write("\t\t /* onCheck:function(row){\r\n");
      out.write("\t            alert(\"您选中的行的城市的名称为\"+row.dName);\r\n");
      out.write("\t      } */\r\n");
      out.write("\t     //当某一列隐藏/显示时触发，与showColumns:true一起使用。\r\n");
      out.write("\t\tonColumnSwitch:function(field, checked){\r\n");
      out.write("            alert(field);\r\n");
      out.write("       }\r\n");
      out.write("\t})\t\r\n");
      out.write("\t//jquery的调用方法,点击行的事件\r\n");
      out.write("\t/* $('#table1').on(\"click-row.bs.table\",function(e, row, $element,field) {\r\n");
      out.write("        var i = $element.data('index');//可通过此参数获取当前行\r\n");
      out.write("        alert(i+\"，\"+row.dStatus+\"，\"+field);\r\n");
      out.write("    }); */\r\n");
      out.write("\t\r\n");
      out.write("})\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("<table id=\"myTable\">\t\r\n");
      out.write("</table>\r\n");
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