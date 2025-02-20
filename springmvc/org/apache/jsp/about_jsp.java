/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.81
 * Generated at: 2024-10-03 05:14:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>About - Student Learning Management System</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: 'Arial', sans-serif;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            background-image: url('https://images.unsplash.com/photo-1588072432836-e10032774350?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwyMDc4MnwwfDF8c2VhcmNofDJ8fHN0dWRlbnRzfGVufDB8fHx8MTYzMzgxNDYyMA&ixlib=rb-1.2.1&q=80&w=1920');\r\n");
      out.write("            background-size: cover;\r\n");
      out.write("            background-position: center;\r\n");
      out.write("            color: #333;\r\n");
      out.write("        }\r\n");
      out.write("        .container {\r\n");
      out.write("            max-width: 1200px;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            background-color: rgba(255, 255, 255, 0.8); /* Light background to make text readable */\r\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("        }\r\n");
      out.write("        .about-header {\r\n");
      out.write("            background-color: rgba(76, 175, 80, 0.9);\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        .about-header h1 {\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            font-size: 36px;\r\n");
      out.write("        }\r\n");
      out.write("        .about-content {\r\n");
      out.write("            padding: 40px;\r\n");
      out.write("            margin: 20px 0;\r\n");
      out.write("        }\r\n");
      out.write("        .about-content h2 {\r\n");
      out.write("            font-size: 28px;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        .about-content p {\r\n");
      out.write("            font-size: 18px;\r\n");
      out.write("            line-height: 1.6;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        .features-list {\r\n");
      out.write("            list-style: none;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("        }\r\n");
      out.write("        .features-list li {\r\n");
      out.write("            font-size: 18px;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            margin-bottom: 10px;\r\n");
      out.write("            background-color: #f9f9f9;\r\n");
      out.write("            border-left: 4px solid #4CAF50;\r\n");
      out.write("        }\r\n");
      out.write("        footer {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            background-color: #4CAF50;\r\n");
      out.write("            color: white;\r\n");
      out.write("            position: relative;\r\n");
      out.write("            bottom: 0;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"about-header\">\r\n");
      out.write("            <h1>About Student Learning Management System</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"about-content\">\r\n");
      out.write("            <h2>Project Overview</h2>\r\n");
      out.write("            <p>The <strong>Student Learning Management System</strong> is a comprehensive solution designed to streamline and automate the process of managing student courses within educational institutions. It provides administrators, instructors, and students with a user-friendly interface for managing course registrations, tracking progress, and generating reports. The system is built using modern technologies to ensure scalability and performance.</p>\r\n");
      out.write("\r\n");
      out.write("            <h2>Features</h2>\r\n");
      out.write("            <ul class=\"features-list\">\r\n");
      out.write("                <li>Efficient student Learning registration and management</li>\r\n");
      out.write("                <li>Real-time tracking of course progress and grades</li>\r\n");
      out.write("                <li>Instructor management and course assignment</li>\r\n");
      out.write("                <li>Customizable reports and data export functionality</li>\r\n");
      out.write("                <li>User-friendly interface with role-based access</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <p>The system enhances the overall experience for students and faculty by providing a central hub for managing academic courses and their associated resources. Built on the latest frameworks, the application is robust, secure, and designed to meet the dynamic needs of educational institutions.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <footer>\r\n");
      out.write("        &copy; 2024 Student Learning Management System. All rights reserved.\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
}
