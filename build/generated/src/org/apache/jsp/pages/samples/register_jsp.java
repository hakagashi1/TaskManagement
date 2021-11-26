package org.apache.jsp.pages.samples;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>CelestialUI Admin</title>\n");
      out.write("        <!-- base:css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../vendors/typicons.font/font/typicons.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../vendors/css/vendor.bundle.base.css\">\n");
      out.write("        <!-- endinject -->\n");
      out.write("        <!-- plugin css for this page -->\n");
      out.write("        <!-- End plugin css for this page -->\n");
      out.write("        <!-- inject:css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../css/vertical-layout-light/style.css\">\n");
      out.write("        <!-- endinject -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../../images/favicon.png\" />\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-scroller\">\n");
      out.write("            <div class=\"col-lg-4 mx-auto\">\n");
      out.write("                <div class=\"text-left py-5 px-4 px-sm-5\">\n");
      out.write("                    <div class=\"brand-logo\">\n");
      out.write("                        <img src=\"../../images/logo.svg\" alt=\"logo\">\n");
      out.write("                    </div>\n");
      out.write("                    <h4>New here?</h4>\n");
      out.write("                    <h6 class=\"font-weight\">Signing up is easy. It only takes a few steps</h6>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <form class=\"forms-sample\" action=\"register\" method=\"post\">\n");
      out.write("                <div class=\"container-fluid page-body-wrapper full-page-wrapper\">\n");
      out.write("\n");
      out.write("                    <div class=\"content-wrapper d-flex align-items-center auth px-0\">\n");
      out.write("\n");
      out.write("                        <div class=\"row w-100 mx-0\">\n");
      out.write("                            <div class=\"col-md-6 grid-margin stretch-card\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"form-group row\">\n");
      out.write("                                            <label for=\"Username\" class=\"col-sm-3 col-form-label\">Username</label>\n");
      out.write("                                            <div class=\"col-sm-9\">\n");
      out.write("                                                <p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userDanger}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"username\" placeholder=\"Username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group row\">\n");
      out.write("                                            <label for=\"Email\" class=\"col-sm-3 col-form-label\">Email address</label>\n");
      out.write("                                            <div class=\"col-sm-9\">\n");
      out.write("                                                <p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${emailDanger}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                                <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"Email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group row\">\n");
      out.write("                                            <label for=\"Password\" class=\"col-sm-3 col-form-label\">Password</label>\n");
      out.write("                                            <div class=\"col-sm-9\">\n");
      out.write("                                                <p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${passDanger}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                                <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Password\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group row\">\n");
      out.write("                                            <label for=\"Re-Password\" class=\"col-sm-3 col-form-label\">Confirm Password</label>\n");
      out.write("                                            <div class=\"col-sm-9\">\n");
      out.write("                                                <p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${repassDanger}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                                <input type=\"password\" class=\"form-control\" name=\"repassword\" placeholder=\"Password\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 grid-margin stretch-card\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"form-group row\">\n");
      out.write("                                            <label for=\"First\" class=\"col-sm-3 col-form-label\">First name</label>\n");
      out.write("                                            <div class=\"col-sm-9\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"firstname\" placeholder=\"First name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${firstname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group row\">\n");
      out.write("                                            <label for=\"Middle\" class=\"col-sm-3 col-form-label\">Middle name</label>\n");
      out.write("                                            <div class=\"col-sm-9\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"middlename\" placeholder=\"Middle name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${middlename}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group row\">\n");
      out.write("                                            <label for=\"Last\" class=\"col-sm-3 col-form-label\">Last name</label>\n");
      out.write("                                            <div class=\"col-sm-9\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"lastname\" placeholder=\"Last name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lastname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group row\">\n");
      out.write("                                            <label for=\"Mobile\" class=\"col-sm-3 col-form-label\">Mobile</label>\n");
      out.write("                                            <div class=\"col-sm-9\">\n");
      out.write("                                                <p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mobileDanger}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"mobile\" placeholder=\"Mobile number\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mobile}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-6\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- content-wrapper ends -->\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-lg-4 mx-auto\">\n");
      out.write("                    <div class=\"text-left py-5 px-4 px-sm-5\">\n");
      out.write("                        <div class=\"mb-4\">\n");
      out.write("                            <div class=\"form-check\">\n");
      out.write("                                <label class=\"form-check-label text-muted\">\n");
      out.write("                                    <p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${agreeDanger}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                    <input type=\"checkbox\" name=\"agree\" class=\"form-check-input\">\n");
      out.write("                                    I agree to all Terms & Conditions\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mt-3\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary mr-2\">SIGN UP</button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"text-center mt-4 font-weight-light\">\n");
      out.write("                            Already have an account? <a href=\"login.html\" class=\"text-primary\">Login</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <!-- page-body-wrapper ends -->\n");
      out.write("        </div>\n");
      out.write("        <!-- container-scroller -->\n");
      out.write("        <!-- base:js -->\n");
      out.write("        <script src=\"../../vendors/js/vendor.bundle.base.js\"></script>\n");
      out.write("        <!-- endinject -->\n");
      out.write("        <!-- inject:js -->\n");
      out.write("        <script src=\"../../js/off-canvas.js\"></script>\n");
      out.write("        <script src=\"../../js/hoverable-collapse.js\"></script>\n");
      out.write("        <script src=\"../../js/template.js\"></script>\n");
      out.write("        <script src=\"../../js/settings.js\"></script>\n");
      out.write("        <script src=\"../../js/todolist.js\"></script>\n");
      out.write("        <!-- endinject -->\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${roles}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("r");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                    <div class=\"form-check\">\n");
          out.write("                                                        <label class=\"form-check-label\">\n");
          out.write("                                                            <input type=\"radio\" class=\"form-check-input\" name=\"role\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${r.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${r.id == role ?\"checked\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">\n");
          out.write("                                                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${r.role}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                        </label>\n");
          out.write("                                                    </div>\n");
          out.write("                                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
