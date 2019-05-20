package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"ISO-8859-1\">\n");
      out.write("\t\t<title>Tela de Login</title>\n");
      out.write("                 <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"Mark Otto, Jacob Thornton, and Bootstrap contributors\">\n");
      out.write("    <meta name=\"generator\" content=\"Jekyll v3.8.5\">\n");
      out.write("    <link rel=\"canonical\" href=\"https://getbootstrap.com/docs/4.3/examples/sign-in/\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"/docs/4.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <link href=\"css/petshop.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("            <style type=\"text/css\">@import url(\"css/petshop.css\"); </style>\n");
      out.write("\t</head>\n");
      out.write("\t<body  class=login-page>           \n");
      out.write("            <center>\n");
      out.write("            <h1>Login</h1>\n");
      out.write("        \n");
      out.write("\t<form name ='frmLogin' method = 'POST' action='LoginServlet'>\n");
      out.write("            <div> \n");
      out.write("                <input type=\"text\" id=\"inputEmail\" class=\"form-control\" placeholder=\"petshop@exemplo.com\" required=\"\" autofocus=\"\" name = 'usuario'>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <input type=\"password\" id=\"inputPassword\" class=\"form-control\" placeholder=\"Password\" required=\"\" name = 'senha'>\n");
      out.write("            </div>\t\t\n");
      out.write("            <div class =\"top\">\n");
      out.write("                <button class=\"css3button\" type=\"submit\">Sign in</button>\n");
      out.write("            </div>\n");
      out.write("\t</form>\n");
      out.write("            <br>\n");
      out.write("            </center>\n");
      out.write("            <div>\n");
      out.write("             <center>  <a class=\"nav-link\" href=\"CadastroCliente.jsp\">Ainda não tem um cadastro<span class=\"sr-only\"></span></a></center>               \n");
      out.write("          </div>\n");
      out.write("        <br>\n");
      out.write("           <div>\n");
      out.write("             <center>  <a class=\"nav-link\" href=\"CadastroClienteAlterar.jsp\">Alterar Cadastro<span class=\"sr-only\"></span></a></center>               \n");
      out.write("          </div>\n");
      out.write("\t</body>\n");
      out.write("</html>");
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
