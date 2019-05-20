package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Hibernate.HibernateAulaDAO;
import com.bean.TabelaUsuarioBean;

public final class barrademenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      com.bean.TabelaUsuarioBean bean = null;
      synchronized (request) {
        bean = (com.bean.TabelaUsuarioBean) _jspx_page_context.getAttribute("bean", PageContext.REQUEST_SCOPE);
        if (bean == null){
          bean = new com.bean.TabelaUsuarioBean();
          _jspx_page_context.setAttribute("bean", bean, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("     ");
      out.write("\n");
      out.write("    <link href=\"css/petshop.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <style type=\"text/css\">@import url(\"css/petshop.css\"); </style>\n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("    <script src=\"<c:url value=/resources/js/main.js />\"></script>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" ></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <title>Mundo Cão</title>\n");
      out.write("    <link rel=\"canonical\" href=\"https://getbootstrap.com/docs/4.3/examples/sign-in/\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"/docs/4.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\n");
      out.write("           \n");
      out.write("    \n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-expand-md navbar-dark fixed-top bg-dark\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">Pet Shop</a>\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExampleDefault\" aria-controls=\"navbarsExampleDefault\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("      \n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarsExampleDefault\">\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                 \n");
      out.write("            <li class=\"nav-item dropdown\">\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" href=\"http://example.com\" id=\"dropdown01\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Cão</a>\n");
      out.write("            <div class=\"dropdown-menu\" aria-labelledby=\"dropdown01\">\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\">- ITEM A</a>\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\">- ITEM B</a>\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\">- ITEM C</a>\n");
      out.write("            </div>\n");
      out.write("          </li>\n");
      out.write("            <li class=\"nav-item dropdown\">\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" href=\"http://example.com\" id=\"dropdown01\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Gato</a>\n");
      out.write("            <div class=\"dropdown-menu\" aria-labelledby=\"dropdown01\">\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\">- ITEM A</a>\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\">- ITEM B</a>\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\">- ITEM C</a>\n");
      out.write("            </div>\n");
      out.write("          </li>\n");
      out.write("\n");
      out.write("          <li>\n");
      out.write("            <div>\n");
      out.write("                <a class=\"nav-link\" href=\"Login.jsp\">Promoções <span class=\"sr-only\">(atual)</span></a>\n");
      out.write("            </div>\n");
      out.write("          </li>\n");
      out.write("           <\n");
      out.write("        </ul>\n");
      out.write("        <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("          <input class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Pesquisa\" aria-label=\"Search\">\n");
      out.write("          <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Pesquisar</button>    \n");
      out.write("            <p>");
      out.print(request.getAttribute("usuario"));
      out.write("</p>\n");
      out.write("            <a class=\"nav-link\" href=\"Login.jsp\">Login<span class=\"sr-only\">(atual)</span></a>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("    </body>\n");
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
