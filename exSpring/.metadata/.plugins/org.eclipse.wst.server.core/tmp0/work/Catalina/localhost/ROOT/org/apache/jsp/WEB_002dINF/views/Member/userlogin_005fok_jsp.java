/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.51
 * Generated at: 2020-06-19 07:22:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.Member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userlogin_005fok_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/lunas/eclipse-workspace/exSpring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/exMember/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1591085337233L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>로그온</TITLE>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<STYLE TYPE=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body { font-family: 돋움, Verdana; font-size: 9pt}\r\n");
      out.write("td   { font-family: 돋움, Verdana; font-size: 9pt; text-decoration: none; color: #000000; \r\n");
      out.write("      BACKGROUND-POSITION: left top; BACKGROUND-REPEAT: no-repeat;}\r\n");
      out.write("//-->\r\n");
      out.write("</STYLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<body bgcolor=\"#FFFFFF\" text=\"#000000\" leftmargin=0 topmargin=0 >\r\n");
      out.write("<br><br>\r\n");
      out.write("<TABLE width=\"683\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" height=\"265\">\r\n");
      out.write("<TR>\r\n");
      out.write("  <TD width=100>&nbsp;</td>\r\n");
      out.write("  <TD>\r\n");
      out.write("    <table width=\"583\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" height=\"265\">\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t\t  <td height=\"298\"> \r\n");
      out.write("\t\t    <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t  <tr> \r\n");
      out.write("\t\t\t    <td width=\"9\"><img src=\"/img/h_b02.gif\" width=\"9\" height=\"21\"></td>\r\n");
      out.write("\t\t\t\t<td bgcolor=\"7aaad5\"> \r\n");
      out.write("\t\t\t\t <div align=\"center\"><font color=\"#FFFFFF\"><b>로그인 되었습니다</b></font></div>\r\n");
      out.write("\t\t\t\t </td>\r\n");
      out.write("\t\t\t\t <td width=\"9\"><img src=\"/img/f_b03.gif\" width=\"9\" height=\"21\"></td>\r\n");
      out.write("\t\t\t  </tr>\r\n");
      out.write("\t\t\t </table>\r\n");
      out.write("\t\t\t <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"550\">\r\n");
      out.write("\t\t\t   <tr> \r\n");
      out.write("\t\t\t     <td bgcolor=\"#7aaad5\"> \r\n");
      out.write("\t\t\t\t   <table border=\"0\" cellpadding=\"3\" cellspacing=\"1\" width=\"99%\" height=\"321\">\r\n");
      out.write("\t\t\t\t     <tr bgcolor=\"#FFFFFF\"> \r\n");
      out.write("\t\t\t\t\t   <td align=CENTER bgcolor=\"#eff4f8\" height=\"92\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("님 환영합니다 \r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t     <tr bgcolor=\"#FFFFFF\"> \r\n");
      out.write("\t\t\t\t\t   <td align=CENTER bgcolor=\"#eff4f8\" height=\"92\"> \r\n");
      out.write("\t\t\t\t\t  <a href=\"userinfo_modify\"> [내정보수정] </a>\r\n");
      out.write("\t\t\t\t\t  <a href=\"logout\"> [로그아웃] </a>\r\n");
      out.write("\t\t\t\t\t  <a href=\"userinfo_list\"> [메인 페이지이동] </a> \r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t\t  <tr bgcolor=\"#FFFFFF\"> \r\n");
      out.write("\t\t\t\t\t\t<td bgcolor=\"#ffffff\" align=CENTER height=\"138\"> \r\n");
      out.write("\t\t\t\t\t\t  <table width=\"600\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t\t\t  <td> \r\n");
      out.write("\t\t\t\t\t\t\t\t<table cellpadding=2 cellspacing=0 align=center border=0>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <tr> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p style=\"LINE-HEIGHT:15PX;\"><font color=\"#AFAFB1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t이곳은 JAVA & JSP를 배우고자 하는 분이면 누구나\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   <FONT COLOR=\"#006F70\">이용가능한 </FONT>곳입니다.<BR><BR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td> \r\n");
      out.write("\t\t\t\t\t\t\t\t  </tr> \r\n");
      out.write("\t\t\t\t\t              <tr> \r\n");
      out.write("\t\t\t\t\t\t\t        <td> \r\n");
      out.write("\t\t\t\t\t\t\t          <p style=\"LINE-HEIGHT:15PX;\"><font color=\"#AFAFB1\">즐거운 시간 \r\n");
      out.write("\t\t\t\t\t\t\t          <font color=\"#ff7508\">많이 배우고 가시길</font>을 바랍니다.<br>\r\n");
      out.write("\t\t\t\t\t\t\t            <br>\r\n");
      out.write("\t\t\t\t\t\t\t            <br>\r\n");
      out.write("\t\t\t\t\t\t\t          </p>\r\n");
      out.write("\t\t\t\t\t\t\t       </td>\r\n");
      out.write("\t\t\t\t\t\t\t      </tr>\r\n");
      out.write("\t\t\t\t\t\t         </table>\r\n");
      out.write("\t\t\t\t\t\t       </td>\r\n");
      out.write("\t\t\t\t\t         </tr>\r\n");
      out.write("\t\t\t\t\t       </table>\r\n");
      out.write("\t\t\t\t         </td>\r\n");
      out.write("\t\t\t\t       </tr>\r\n");
      out.write("\t\t\t         </table>\r\n");
      out.write("\t\t\t  <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t  <td width=\"9\"><img src=\"/img/h_b04.gif\" width=\"12\" height=\"11\"></td>\r\n");
      out.write("\t\t\t\t  <td bgcolor=\"7aaad5\" width=\"612\"> \r\n");
      out.write("\t\t\t\t\t<div align=\"center\"></div>\r\n");
      out.write("\t\t\t\t  </td>\r\n");
      out.write("\t\t\t\t  <td width=\"10\"><img src=\"/img/h_b05.gif\" width=\"12\" height=\"11\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t  </table>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("  \t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/Member/userlogin_ok.jsp(6,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty user}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t<script>\r\n");
          out.write("\t\talert(\"회원전용공간입니다\");\r\n");
          out.write("\t\tlocation.href=\"userlogin_form\";\r\n");
          out.write("\t</script>\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}
