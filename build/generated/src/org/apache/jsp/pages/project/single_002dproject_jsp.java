package org.apache.jsp.pages.project;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.ActionDAO;
import entity.Action;
import java.util.List;

public final class single_002dproject_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Task Management</title>\n");
      out.write("        <!-- base:css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../vendors/typicons.font/font/typicons.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../vendors/css/vendor.bundle.base.css\">\n");
      out.write("        <!-- end inject -->\n");
      out.write("        <!-- plugin css for this page -->\n");
      out.write("        <!-- End plugin css for this page -->\n");
      out.write("        <!-- inject:css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../css/vertical-layout-light/style.css\">\n");
      out.write("        <!-- end inject -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../../images/favicon.png\" />\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container-scroller\">\n");
      out.write("\n");
      out.write("            <!--_navbar.jsp-->\n");
      out.write("            <nav class=\"navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row\">\n");
      out.write("                <div class=\"text-center navbar-brand-wrapper d-flex align-items-center justify-content-center\">\n");
      out.write("                    <a class=\"navbar-brand brand-logo\" href=\"home\"><img src=\"images/logo.svg\" alt=\"logo\" /></a>\n");
      out.write("                    <a class=\"navbar-brand brand-logo-mini\" href=\"index.html\"><img src=\"images/logo-mini.svg\" alt=\"logo\" /></a>\n");
      out.write("                    <button title=\"collapse\" class=\"navbar-toggler navbar-toggler align-self-center d-none d-lg-flex\" type=\"button\" data-toggle=\"minimize\"><span class=\"typcn typcn-th-menu\"></span></button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"navbar-menu-wrapper d-flex align-items-center justify-content-end\">\n");
      out.write("                    <ul class=\"navbar-nav navbar-nav-right\">\n");
      out.write("                        <li class=\"nav-item d-none d-lg-flex  mr-2\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">Help</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item dropdown d-flex\">\n");
      out.write("                            <a class=\"nav-link count-indicator dropdown-toggle d-flex justify-content-center align-items-center\" id=\"messageDropdown\" href=\"#\" data-toggle=\"dropdown\">\n");
      out.write("                                <i class=\"typcn typcn-message-typing\"></i>\n");
      out.write("                                <span class=\"count bg-success\">2</span>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-menu dropdown-menu-right navbar-dropdown preview-list\" aria-labelledby=\"messageDropdown\">\n");
      out.write("                                <p class=\"mb-0 font-weight-normal float-left dropdown-header\">Messages</p>\n");
      out.write("                                <a class=\"dropdown-item preview-item\">\n");
      out.write("                                    <div class=\"preview-thumbnail\">\n");
      out.write("                                        <img src=\"images/faces/face4.jpg\" alt=\"image\" class=\"profile-pic\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"preview-item-content flex-grow\">\n");
      out.write("                                        <h6 class=\"preview-subject ellipsis font-weight-normal\">David Grey\n");
      out.write("                                        </h6>\n");
      out.write("                                        <p class=\"font-weight-light small-text mb-0\">\n");
      out.write("                                            The meeting is cancelled\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"dropdown-item preview-item\">\n");
      out.write("                                    <div class=\"preview-thumbnail\">\n");
      out.write("                                        <img src=\"images/faces/face2.jpg\" alt=\"image\" class=\"profile-pic\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"preview-item-content flex-grow\">\n");
      out.write("                                        <h6 class=\"preview-subject ellipsis font-weight-normal\">Tim Cook\n");
      out.write("                                        </h6>\n");
      out.write("                                        <p class=\"font-weight-light small-text mb-0\">\n");
      out.write("                                            New product launch\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"dropdown-item preview-item\">\n");
      out.write("                                    <div class=\"preview-thumbnail\">\n");
      out.write("                                        <img src=\"images/faces/face3.jpg\" alt=\"image\" class=\"profile-pic\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"preview-item-content flex-grow\">\n");
      out.write("                                        <h6 class=\"preview-subject ellipsis font-weight-normal\"> Johnson\n");
      out.write("                                        </h6>\n");
      out.write("                                        <p class=\"font-weight-light small-text mb-0\">\n");
      out.write("                                            Upcoming board meeting\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item dropdown  d-flex\">\n");
      out.write("                            <a class=\"nav-link count-indicator dropdown-toggle d-flex align-items-center justify-content-center\" id=\"notificationDropdown\" href=\"#\" data-toggle=\"dropdown\">\n");
      out.write("                                <i class=\"typcn typcn-bell mr-0\"></i>\n");
      out.write("                                <span class=\"count bg-danger\">2</span>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-menu dropdown-menu-right navbar-dropdown preview-list\" aria-labelledby=\"notificationDropdown\">\n");
      out.write("                                <p class=\"mb-0 font-weight-normal float-left dropdown-header\">Notifications</p>\n");
      out.write("                                <a class=\"dropdown-item preview-item\">\n");
      out.write("                                    <div class=\"preview-thumbnail\">\n");
      out.write("                                        <div class=\"preview-icon bg-success\">\n");
      out.write("                                            <i class=\"typcn typcn-info-large mx-0\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"preview-item-content\">\n");
      out.write("                                        <h6 class=\"preview-subject font-weight-normal\">Application Error</h6>\n");
      out.write("                                        <p class=\"font-weight-light small-text mb-0\">\n");
      out.write("                                            Just now\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"dropdown-item preview-item\">\n");
      out.write("                                    <div class=\"preview-thumbnail\">\n");
      out.write("                                        <div class=\"preview-icon bg-warning\">\n");
      out.write("                                            <i class=\"typcn typcn-cog mx-0\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"preview-item-content\">\n");
      out.write("                                        <h6 class=\"preview-subject font-weight-normal\">Settings</h6>\n");
      out.write("                                        <p class=\"font-weight-light small-text mb-0\">\n");
      out.write("                                            Private message\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"dropdown-item preview-item\">\n");
      out.write("                                    <div class=\"preview-thumbnail\">\n");
      out.write("                                        <div class=\"preview-icon bg-info\">\n");
      out.write("                                            <i class=\"typcn typcn-user-outline mx-0\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"preview-item-content\">\n");
      out.write("                                        <h6 class=\"preview-subject font-weight-normal\">New user registration</h6>\n");
      out.write("                                        <p class=\"font-weight-light small-text mb-0\">\n");
      out.write("                                            2 days ago\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item nav-profile dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle  pl-0 pr-0\" href=\"#\" data-toggle=\"dropdown\" id=\"profileDropdown\">\n");
      out.write("                                <i class=\"typcn typcn-user-outline mr-0\"></i>\n");
      out.write("                                <span class=\"nav-profile-name\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.firstname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.lastname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-menu dropdown-menu-right navbar-dropdown\" aria-labelledby=\"profileDropdown\">\n");
      out.write("                                <a class=\"dropdown-item\">\n");
      out.write("                                    <i class=\"typcn typcn-cog text-primary\"></i> Profile\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"logout\">\n");
      out.write("                                    <i class=\"typcn typcn-power text-primary\"></i> Logout\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <button title=\"menu\" class=\"navbar-toggler navbar-toggler-right d-lg-none align-self-center\" type=\"button\" data-toggle=\"offcanvas\">\n");
      out.write("                        <span class=\"typcn typcn-th-menu\"></span>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <div class=\"container-fluid page-body-wrapper\">\n");
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../partials/_settings-panel.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("\n");
      out.write("                ");

                    List<Action> projectAction = new ActionDAO().getActionByGroupId(1);
                    List<Action> userAction = new ActionDAO().getActionByGroupId(2);
                    List<Action> taskAction = new ActionDAO().getActionByGroupId(3);
                    List<Action> bugAction = new ActionDAO().getActionByGroupId(4);
                    List<Action> commentAction = new ActionDAO().getActionByGroupId(5);
                
      out.write("\n");
      out.write("\n");
      out.write("                <nav class=\"sidebar sidebar-offcanvas\" id=\"sidebar\">\n");
      out.write("                    <ul class=\"nav\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <div class=\"d-flex sidebar-profile\">\n");
      out.write("                                <div class=\"sidebar-profile-image\">\n");
      out.write("                                    <img src=\"images/faces/face29.png\" alt=\"image\">\n");
      out.write("                                    <span class=\"sidebar-status-indicator\"></span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"sidebar-profile-name\">\n");
      out.write("                                    <p class=\"sidebar-name\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.firstname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.lastname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                    <p class=\"sidebar-designation\">Welcome</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"nav-search\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Type to search...\" aria-label=\"search\" aria-describedby=\"search\">\n");
      out.write("                                    <div class=\"input-group-append\">\n");
      out.write("                                        <span class=\"input-group-text\" id=\"search\">\n");
      out.write("                                            <i class=\"typcn typcn-zoom\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <p class=\"sidebar-menu-title\">Dash menu</p>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"../../home\">\n");
      out.write("                                <i class=\"typcn typcn-device-desktop menu-icon\"></i>\n");
      out.write("                                <span class=\"menu-title\">Dashboard <span class=\"badge badge-primary ml-3\">New</span></span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#ui-basic\" aria-expanded=\"false\" aria-controls=\"ui-basic\">\n");
      out.write("                                <i class=\"typcn typcn-briefcase menu-icon\"></i>\n");
      out.write("                                <span class=\"menu-title\">Project</span>\n");
      out.write("                                <i class=\"typcn typcn-chevron-right menu-arrow\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"collapse\" id=\"ui-basic\">\n");
      out.write("                                <ul class=\"nav flex-column sub-menu\">\n");
      out.write("                                    ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems(projectAction);
      _jspx_th_c_forEach_0.setVar("p");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                                        <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/project/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.name.toLowerCase()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("-project\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</a></li>\n");
            out.write("                                        ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#form-elements\" aria-expanded=\"false\" aria-controls=\"form-elements\">\n");
      out.write("                                <i class=\"typcn typcn-film menu-icon\"></i>\n");
      out.write("                                <span class=\"menu-title\">Users</span>\n");
      out.write("                                <i class=\"menu-arrow\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"collapse\" id=\"form-elements\">\n");
      out.write("                                <ul class=\"nav flex-column sub-menu\">\n");
      out.write("                                    ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_1.setParent(null);
      _jspx_th_c_forEach_1.setItems(userAction);
      _jspx_th_c_forEach_1.setVar("u");
      int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                                        <li class=\"nav-item\"> <a class=\"nav-link\" href=\"../user/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.name.toLowerCase()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("-user\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</a></li>\n");
            out.write("                                        ");
            int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_1.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
      }
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#charts\" aria-expanded=\"false\" aria-controls=\"charts\">\n");
      out.write("                                <i class=\"typcn typcn-chart-pie-outline menu-icon\"></i>\n");
      out.write("                                <span class=\"menu-title\">Tasks</span>\n");
      out.write("                                <i class=\"menu-arrow\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"collapse\" id=\"charts\">\n");
      out.write("                                <ul class=\"nav flex-column sub-menu\">\n");
      out.write("                                    ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_2.setParent(null);
      _jspx_th_c_forEach_2.setItems(taskAction);
      _jspx_th_c_forEach_2.setVar("u");
      int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
        if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                                        <li class=\"nav-item\"> <a class=\"nav-link\" href=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.name.toLowerCase()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("-task\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</a></li>\n");
            out.write("                                        ");
            int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_2.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
      }
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#tables\" aria-expanded=\"false\" aria-controls=\"tables\">\n");
      out.write("                                <i class=\"typcn typcn-th-small-outline menu-icon\"></i>\n");
      out.write("                                <span class=\"menu-title\">Bug</span>\n");
      out.write("                                <i class=\"menu-arrow\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"collapse\" id=\"tables\">\n");
      out.write("                                <ul class=\"nav flex-column sub-menu\">\n");
      out.write("                                    ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_3.setParent(null);
      _jspx_th_c_forEach_3.setItems(bugAction);
      _jspx_th_c_forEach_3.setVar("u");
      int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
        if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                                        <li class=\"nav-item\"> <a class=\"nav-link\" href=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.name.toLowerCase()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("-bug\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</a></li>\n");
            out.write("                                        ");
            int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_3.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_3.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
      }
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#icons\" aria-expanded=\"false\" aria-controls=\"icons\">\n");
      out.write("                                <i class=\"typcn typcn-compass menu-icon\"></i>\n");
      out.write("                                <span class=\"menu-title\">Comments</span>\n");
      out.write("                                <i class=\"menu-arrow\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"collapse\" id=\"icons\">\n");
      out.write("                                <ul class=\"nav flex-column sub-menu\">\n");
      out.write("                                    ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_4.setParent(null);
      _jspx_th_c_forEach_4.setItems(commentAction);
      _jspx_th_c_forEach_4.setVar("u");
      int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
        if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                                        <li class=\"nav-item\"> <a class=\"nav-link\" href=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.name.toLowerCase()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("-comment\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</a></li>\n");
            out.write("                                        ");
            int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_4.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_4.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
      }
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"sidebar-legend\">\n");
      out.write("                        <li>\n");
      out.write("                            <p class=\"sidebar-menu-title\">Category</p>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\"><a href=\"#\" class=\"nav-link\">#Sales</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a href=\"#\" class=\"nav-link\">#Marketing</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a href=\"#\" class=\"nav-link\">#Growth</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("                <div class=\"main-panel\">\n");
      out.write("                    <div class=\"content-wrapper\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <h3 class=\"mb-0 font-weight-bold\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.firstname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.lastname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("                                <p>Your last login: 21h ago from newzealand.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <div class=\"d-flex align-items-center justify-content-md-end\">\n");
      out.write("                                    <div class=\"mb-3 mb-xl-0 pr-1\">\n");
      out.write("                                        <div class=\"dropdown\">\n");
      out.write("                                            <button class=\"btn bg-white btn-sm dropdown-toggle btn-icon-text border mr-2\" type=\"button\" id=\"dropdownMenu3\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                                <i class=\"typcn typcn-calendar-outline mr-2\"></i>Last 7 days\n");
      out.write("                                            </button>\n");
      out.write("                                            <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuSizeButton3\" data-x-placement=\"top-start\">\n");
      out.write("                                                <h6 class=\"dropdown-header\">Last 14 days</h6>\n");
      out.write("                                                <a class=\"dropdown-item\" href=\"#\">Last 21 days</a>\n");
      out.write("                                                <a class=\"dropdown-item\" href=\"#\">Last 28 days</a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"pr-1 mb-3 mr-2 mb-xl-0\">\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-sm bg-white btn-icon-text border\"><i class=\"typcn typcn-arrow-forward-outline mr-2\"></i>Export</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"pr-1 mb-3 mb-xl-0\">\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-sm bg-white btn-icon-text border\"><i class=\"typcn typcn-info-large-outline mr-2\"></i>info</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-12 grid-margin stretch-card\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <h4 class=\"card-title\">Striped Table</h4>\n");
      out.write("                                        <p class=\"card-description\">\n");
      out.write("                                            Add class <code>.table-striped</code>\n");
      out.write("                                        </p>\n");
      out.write("                                        <div class=\"table-responsive\">\n");
      out.write("                                            <table class=\"table table-striped\">\n");
      out.write("                                                <thead>\n");
      out.write("                                                    <tr>\n");
      out.write("                                                        <th>\n");
      out.write("                                                            Task\n");
      out.write("                                                        </th>\n");
      out.write("                                                        <th>\n");
      out.write("                                                            User\n");
      out.write("                                                        </th>\n");
      out.write("                                                        <th>\n");
      out.write("                                                            First name\n");
      out.write("                                                        </th>\n");
      out.write("                                                        <th>\n");
      out.write("                                                            Progress\n");
      out.write("                                                        </th>\n");
      out.write("                                                        <th>\n");
      out.write("                                                            Deadline\n");
      out.write("                                                        </th>\n");
      out.write("                                                    </tr>\n");
      out.write("                                                </thead>\n");
      out.write("                                                <tbody>\n");
      out.write("                                                    ");
      if (_jspx_meth_c_forEach_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                </tbody>\n");
      out.write("                                            </table>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- content-wrapper ends -->\n");
      out.write("                    <!-- partial:partials/_footer.jsp -->\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../partials/_footer.jsp", out, false);
      out.write("\n");
      out.write("                    <!-- partial -->\n");
      out.write("                </div>\n");
      out.write("                <!-- main-panel ends -->\n");
      out.write("            </div>\n");
      out.write("            <!-- page-body-wrapper ends -->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- base:js -->\n");
      out.write("        <script src=\"../../vendors/js/vendor.bundle.base.js\"></script>\n");
      out.write("        <!-- end inject -->\n");
      out.write("        <!-- Plugin js for this page-->\n");
      out.write("        <!-- End plugin js for this page-->\n");
      out.write("        <!-- inject:js -->\n");
      out.write("        <script src=\"../../js/off-canvas.js\"></script>\n");
      out.write("        <script src=\"../../js/hoverable-collapse.js\"></script>\n");
      out.write("        <script src=\"../../js/template.js\"></script>\n");
      out.write("        <script src=\"../../js/settings.js\"></script>\n");
      out.write("        <script src=\"../../js/todolist.js\"></script>\n");
      out.write("        <!-- end inject -->\n");
      out.write("        <!-- plugin js for this page -->\n");
      out.write("        <script src=\"../../vendors/progressbar.js/progressbar.min.js\"></script>\n");
      out.write("        <script src=\"../../vendors/chart.js/Chart.min.js\"></script>\n");
      out.write("        <!-- End plugin js for this page -->\n");
      out.write("        <!-- Custom js for this page-->\n");
      out.write("        <script src=\"../../js/dashboard.js\"></script>\n");
      out.write("        <!-- End custom js for this page-->\n");
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

  private boolean _jspx_meth_c_forEach_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent(null);
    _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tasks}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_5.setVar("t");
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                        <tr>\n");
          out.write("                                                            <td>\n");
          out.write("                                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                            </td>\n");
          out.write("                                                            <td class=\"py-1\">\n");
          out.write("                                                                <img src=\"../../images/faces/face7.jpg\" alt=\"image\"/>\n");
          out.write("                                                            </td>\n");
          out.write("                                                            <td>\n");
          out.write("                                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.getUser().getFirstName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.getUser().getLastName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" \n");
          out.write("                                                            </td>\n");
          out.write("                                                            <td>\n");
          out.write("                                                                <div class=\"progress\">\n");
          out.write("                                                                    <div class=\"progress-bar bg-warning\" role=\"progressbar\" style=\"width: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\n");
          out.write("                                                                </div>\n");
          out.write("                                                            </td>\n");
          out.write("                                                            <td>\n");
          out.write("                                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.plannedEndDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                            </td>\n");
          out.write("                                                        </tr>\n");
          out.write("                                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_5.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_5);
    }
    return false;
  }
}
