package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("            <div class=\"container-fluid page-body-wrapper full-page-wrapper\">\n");
      out.write("                <div class=\"content-wrapper d-flex align-items-center auth px-0\">\n");
      out.write("                    <div class=\"row w-100 mx-0\">\n");
      out.write("                        <div class=\"col-lg-4 mx-auto\">\n");
      out.write("                            <div class=\"auth-form-light text-left py-5 px-4 px-sm-5\">\n");
      out.write("                                <div class=\"brand-logo\">\n");
      out.write("                                    <img src=\"../../images/logo.svg\" alt=\"logo\">\n");
      out.write("                                </div>\n");
      out.write("                                <h4>New here?</h4>\n");
      out.write("                                <h6 class=\"font-weight-light\">Signing up is easy. It only takes a few steps</h6>\n");
      out.write("                                <form class=\"pt-3\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control form-control-lg\" id=\"exampleInputUsername1\" placeholder=\"Username\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"email\" class=\"form-control form-control-lg\" id=\"exampleInputEmail1\" placeholder=\"Email\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <select title=\"country\" class=\"form-control form-control-lg\" id=\"exampleFormControlSelect2\">\n");
      out.write("                                            <option>Country</option>\n");
      out.write("                                            <option>United States of America</option>\n");
      out.write("                                            <option>United Kingdom</option>\n");
      out.write("                                            <option>India</option>\n");
      out.write("                                            <option>Germany</option>\n");
      out.write("                                            <option>Argentina</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"password\" class=\"form-control form-control-lg\" id=\"exampleInputPassword1\" placeholder=\"Password\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"mb-4\">\n");
      out.write("                                        <div class=\"form-check\">\n");
      out.write("                                            <label class=\"form-check-label text-muted\">\n");
      out.write("                                                <input type=\"checkbox\" class=\"form-check-input\">\n");
      out.write("                                                I agree to all Terms & Conditions\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"mt-3\">\n");
      out.write("                                        <a class=\"btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn\" href=\"../../index.html\">SIGN UP</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"text-center mt-4 font-weight-light\">\n");
      out.write("                                        Already have an account? <a href=\"login.html\" class=\"text-primary\">Login</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- content-wrapper ends -->\n");
      out.write("            </div>\n");
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
}
