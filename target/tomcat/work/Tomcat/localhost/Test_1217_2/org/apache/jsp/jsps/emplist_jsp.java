/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-12-21 08:30:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsps;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class emplist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>信息展示页面</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bootstrap/css/bootstrap.min.css\"> \r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bootstrap/js/jquery-2.2.1.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bootstrap/js/bootstrap-closable-tab.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bootstrap/js/closable-tab-div.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("//分页列表\r\n");
      out.write("$(function(){\r\n");
      out.write("\tvar pn;\r\n");
      out.write("\tvar row;\r\n");
      out.write("\tvar dId=\"\";\r\n");
      out.write("\tvar eLevel=\"\";\r\n");
      out.write("\tvar eSex=\"\";\r\n");
      out.write("\tvar wages=\"\";\r\n");
      out.write("\tvar queryEmpName=\"\";\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/emp/query/1/3\",\r\n");
      out.write("\t\tdataType:\"json\",\r\n");
      out.write("\t\ttype:\"post\",\r\n");
      out.write("\t\tsuccess:function(data){\r\n");
      out.write("\t\t\tempList(data);\r\n");
      out.write("\t\t\tpn=data.pageNum;//当前页\r\n");
      out.write("\t\t\trow=data.pageSize;//每页显示条数\r\n");
      out.write("\t\t\tpages=data.pages;//总页数\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("\t//首页\r\n");
      out.write("\t$(\"#first\").click(function(){\r\n");
      out.write("\t\tif(dId==\"\"&&eLevel==\"\"&&eSex==\"\"&&wages==\"\"&&queryEmpName==\"\"){\r\n");
      out.write("\t\t\tpage(pn,row);\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tpage1(pn,row,dId,eLevel,eSex,wages,queryEmpName);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tpn=1;\r\n");
      out.write("\t})\r\n");
      out.write("\t//上一页\r\n");
      out.write("\t$(\"#pre\").click(function(){\r\n");
      out.write("\t\tif(dId==\"\"&&eLevel==\"\"&&eSex==\"\"&&wages==\"\"&&queryEmpName==\"\"){\r\n");
      out.write("\t\t\tpage(pn-1,row);\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tpage1(pn-1,row,dId,eLevel,eSex,wages,queryEmpName);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tpn=pn-1;\r\n");
      out.write("\t})\r\n");
      out.write("\t//下一页\r\n");
      out.write("\t$(\"#suf\").click(function(){\r\n");
      out.write("\t\tif(dId==\"\"&&eLevel==\"\"&&eSex==\"\"&&wages==\"\"&&queryEmpName==\"\"){\r\n");
      out.write("\t\t\tpage(pn+1,row);\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tpage1(pn+1,row,dId,eLevel,eSex,wages,queryEmpName);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tpn=pn+1;\r\n");
      out.write("\t})\r\n");
      out.write("\t//尾页\r\n");
      out.write("\t$(\"#last\").click(function(){\r\n");
      out.write("\t\tif(dId==\"\"&&eLevel==\"\"&&eSex==\"\"&&wages==\"\"&&queryEmpName==\"\"){\r\n");
      out.write("\t\t\tpage(pages,row);\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tpage1(pages,row,dId,eLevel,eSex,wages,queryEmpName);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tpn=pages;\r\n");
      out.write("\t})\r\n");
      out.write("\t//每页显示条数\r\n");
      out.write("\t$(\"#rows\").change(function(){\r\n");
      out.write("\t\trow=$(\"#rows option:selected\").val();\r\n");
      out.write("\t\tif(dId==\"\"&&eLevel==\"\"&&eSex==\"\"&&wages==\"\"&&queryEmpName==\"\"){\r\n");
      out.write("\t\t\tpage(pn,row);\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tpage1(pn,row,dId,eLevel,eSex,wages,queryEmpName);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("\t$(\"#searchbutton\").click(function(){\r\n");
      out.write("\t\tdId=$(\"#querydName option:selected\").val();\r\n");
      out.write("\t\teLevel=$(\"#queryLevel option:selected\").val();\r\n");
      out.write("\t\teSex=$(\"#queryeSex option:selected\").val();\r\n");
      out.write("\t\twages=$(\"#wages option:selected\").val();\r\n");
      out.write("\t\tqueryEmpName=$(\"#queryEmpName\").val();\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/emp/query/1/3\",\r\n");
      out.write("\t\t\tdataType:\"json\",\r\n");
      out.write("\t\t\tdata:{pn:pn,row:row,dId:dId,eLevel:eLevel,eSex:eSex,wages:wages,queryEmpName:queryEmpName},\r\n");
      out.write("\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\t$(\"#tbody\").empty();\r\n");
      out.write("\t\t\t\tempList(data);\r\n");
      out.write("\t\t\t\tpn=data.pageNum;//当前页\r\n");
      out.write("\t\t\t\trow=data.pageSize;//每页显示条数\r\n");
      out.write("\t\t\t\tpages=data.pages;//总页数\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t})\r\n");
      out.write("})\r\n");
      out.write("//表格信息\r\n");
      out.write("function empList(data){\r\n");
      out.write("\tvar head=\"<tr align='center'><td><strong>\"+\"用户id\"+\"</strong></td><td><strong>\"+\"用户姓名\"+\"</strong></td><td><strong>\"+\"用户性别\"+\"</strong></td><td><strong>\"+\"用户薪资（元）\"+\"</strong></td><td><strong>\"+\"用户等级\"+\"</strong></td><td><strong>\"+\"地区名称\"+\"</strong></td></tr>\";\r\n");
      out.write("\t$(\"#tbody\").append(head);\r\n");
      out.write("\tfor(var i = 0; i < data.list.length; i++){\r\n");
      out.write("\t\tvar list= data.list[i];\r\n");
      out.write("\t\ttbody=\"<tr align='center'><td>\"+list.eId+\"</td><td>\"+list.eName+\"</td><td>\"+list.eSex+\"</td><td>\"+list.eWages+\"</td><td>\"+list.eLevel+\"</td><td>\"+list.dName+\"</td></tr>\";\r\n");
      out.write("\t\t$(\"#tbody\").append(tbody);\r\n");
      out.write("\t}\r\n");
      out.write("\t/* var ps=\"总共\"+data.total+\"条，总共\"+data.pages+\"页，当前页为第\"+data.pageNum+\"页\";\r\n");
      out.write("\t$(\"#msg\").append(ps); */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("//分页信息 \r\n");
      out.write("function page(pn,row){\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/emp/query/\"+pn+\"/\"+row,\r\n");
      out.write("\t\tdataType:\"json\",\r\n");
      out.write("\t\ttype:\"post\",\r\n");
      out.write("\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t$(\"#tbody\").empty();\r\n");
      out.write("\t\t\tempList(data);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("}\r\n");
      out.write("//条件查询\r\n");
      out.write("function page1(pn,row,dId,eLevel,eSex,wages,queryEmpName){\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/emp/query/\"+pn+\"/\"+row,\r\n");
      out.write("\t\tdataType:\"json\",\r\n");
      out.write("\t\tdata:{dId:dId,eLevel:eLevel,eSex:eSex,wages:wages,queryEmpName:queryEmpName},\r\n");
      out.write("\t\ttype:\"post\",\r\n");
      out.write("\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t$(\"#tbody\").empty();\r\n");
      out.write("\t\t\tempList(data);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("} \r\n");
      out.write("$(function(){\r\n");
      out.write("\t//查地区\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/emp/queryLocation\",\r\n");
      out.write("\t\tdataType:\"json\",\r\n");
      out.write("\t\tdata:{},\r\n");
      out.write("\t\ttype:\"post\",\r\n");
      out.write("\t\tsuccess:function(data){\r\n");
      out.write("\t\t\tfor(var i=0;i<data.length;i++){\r\n");
      out.write("\t\t\t\t$(\"#querydName\").append(\"<option value='\"+data[i].dId+\"'>\"+data[i].dName+\"</option>\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("})\r\n");
      out.write("$(function(){\r\n");
      out.write("\t//查等级\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/emp/queryLevel\",\r\n");
      out.write("\t\tdataType:\"json\",\r\n");
      out.write("\t\tdata:{},\r\n");
      out.write("\t\ttype:\"post\",\r\n");
      out.write("\t\tsuccess:function(data){\r\n");
      out.write("\t\t\tfor(var i=0;i<data.length;i++){\r\n");
      out.write("\t\t\t\t$(\"#queryLevel\").append(\"<option value='\"+data[i].eLevel+\"'>\"+data[i].eLevel+\"</option>\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("})\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("<br>\r\n");
      out.write("<div align=\"center\"><strong style=\"font-size:30px\">用户信息</strong></div>\r\n");
      out.write("<br>\r\n");
      out.write("<div class=\"search\" align=\"center\">\r\n");
      out.write("    <form method=\"post\" action=\"#\">\r\n");
      out.write("\t\t<span>地区名字：</span>\r\n");
      out.write("\t\t<select name=\"querydName\" id=\"querydName\">\r\n");
      out.write("\t\t\t<option value=\"\">--请选择--</option>\r\n");
      out.write("\t    </select>\r\n");
      out.write("\t    <span>工资：</span>\r\n");
      out.write("\t\t<select name=\"wages\" id=\"wages\">\r\n");
      out.write("\t\t\t<option value=\"\">--请选择--</option>\r\n");
      out.write("\t\t\t<option value=\"1\">升序</option>\r\n");
      out.write("\t\t\t<option value=\"2\">降序</option>\r\n");
      out.write("\t    </select>\r\n");
      out.write("\t    <span>级别：</span>\r\n");
      out.write("\t\t<select name=\"queryLevel\" id=\"queryLevel\">\r\n");
      out.write("\t\t\t<option value=\"\">--请选择--</option>\r\n");
      out.write("\t    </select>\r\n");
      out.write("\t    <span>性别：</span>\r\n");
      out.write("\t\t<select name=\"queryeSex\" id=\"queryeSex\">\r\n");
      out.write("\t\t\t<option  value=\"\">--请选择--</option>\r\n");
      out.write("\t\t\t<option value=\"1\">男</option>\r\n");
      out.write("\t\t\t<option value=\"2\">女</option>\t\t\r\n");
      out.write("\t    </select>\r\n");
      out.write("\t    <span>员工姓名：</span>\r\n");
      out.write("\t\t<input name=\"queryEmpName\" id=\"queryEmpName\" class=\"input-text\"\ttype=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${queryEmpName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" placeholder=\"请输入关键字\">\r\n");
      out.write("\t<input\tvalue=\"查 询\" type=\"button\" id=\"searchbutton\">\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("<br>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("\r\n");
      out.write("<table id=\"tbody\" class=\"table table-striped table-hover table-bordered\" style=\"width:70%\">\r\n");
      out.write("\t\r\n");
      out.write("</table>\r\n");
      out.write("<!-- 展示总条数，总页数 -->\r\n");
      out.write("<div style=\"vertical-align: middle;width:70%\"><div id=\"msg\" style=\"font-size:15px;margin-top:25px;float:left;width:30%\">总共");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${plist.total }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("条，总共");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${plist.pages }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("页，当前页为第");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${plist.pageNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("页</div>\r\n");
      out.write("\t<div style=\"float:left;width:40%\">\r\n");
      out.write("\t\t<ul class=\"pagination\">\r\n");
      out.write("\t\t\t<li id=\"first\"><a>首页</a></li>\r\n");
      out.write("\t\t\t<li id=\"pre\"><a>上一页</a></li>\r\n");
      out.write("\t\t\t<li id=\"suf\"><a>下一页</a></li>\r\n");
      out.write("\t\t\t<li id=\"last\"><a>尾页</a></li>\r\n");
      out.write("\t\t</ul> \r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"font-size:15px;margin-top:25px;float:left;width:20%\">\r\n");
      out.write("\t\t选择显示条数：\r\n");
      out.write("\t\t<select id=\"rows\">\r\n");
      out.write("\t\t<option value=\"1\">1</option>\r\n");
      out.write("\t\t<option value=\"2\">2</option>\r\n");
      out.write("\t\t<option value=\"3\">3</option>\r\n");
      out.write("\t\t<option value=\"4\">4</option>\r\n");
      out.write("\t\t<option value=\"5\">5</option>\r\n");
      out.write("\t\t<option value=\"6\">6</option>\r\n");
      out.write("\t\t<option value=\"7\">7</option>\r\n");
      out.write("\t\t<option value=\"8\">8</option>\r\n");
      out.write("\t\t<option value=\"9\">9</option>\r\n");
      out.write("\t\t<option value=\"10\">10</option>\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
