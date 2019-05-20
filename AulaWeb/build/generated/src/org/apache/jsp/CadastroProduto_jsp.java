package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CadastroProduto_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/barrademenu.jsp", out, false);
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>    \n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <title>Cadastro de Produtos</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("    </head>\n");
      out.write("    <body>                  \n");
      out.write("    <div id=\"cliente\" class=\"tab-pane container active\"><br><br><br><br> \n");
      out.write("    <center> <h1>Cadastro de Produtos</h1> </center>\n");
      out.write("    <form name=\"frmIncluir\" action=\"ProdutoServlet\" method=\"GET\">\n");
      out.write("    <div id=\"cliente\" class=\"tab-pane container active\">  \n");
      out.write("     <table border=\"1\">\n");
      out.write("         <div class=\"row\">\n");
      out.write("              <div class=\"col-md-6 mb-3\">\n");
      out.write("               Nome:\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"firstName\" placeholder=\"\" value=\"\" required=\"\"name=\"nome\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-md-3 mb-3\">\n");
      out.write("                    Categoria :\n");
      out.write("                 <select type=\"text\" class=\"form-control\" id=\"firstName\" placeholder=\"\" value=\"\" required=\"\"name=\"categoria\">\n");
      out.write("                    <option value=\"CAES\">CAES</option>\n");
      out.write("                    <option value=\"GATOS\">GATOS</option>\n");
      out.write("                  </select>\n");
      out.write("                </div>\n");
      out.write("         </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-9 mb-3\">\n");
      out.write("                    Descrição :\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"endereco\" placeholder=\"\" value=\"\" required=\"\" name=\"descricao\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3 mb-3\">\n");
      out.write("                    Descrição Imagem 1 :\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"numero\" placeholder=\"\" value=\"\" required=\"\" name=\"imagem1\">\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"col-md-3 mb-3\">\n");
      out.write("                    Descrição Imagem 2 :\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"numero\" placeholder=\"\" value=\"\" required=\"\" name=\"imagem2\">\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"col-md-3 mb-3\">\n");
      out.write("                    Descrição Imagem 3 :\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"numero\" placeholder=\"\" value=\"\" required=\"\" name=\"imagem3\">\n");
      out.write("                    </div>\n");
      out.write("                </div>        \n");
      out.write("                 <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3 mb-3\">\n");
      out.write("                    Peso :\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"cpf\" placeholder=\"\" value=\"\" required=\"\" name=\"peso\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 mb-3\">\n");
      out.write("                    Preço :\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"rg\" placeholder=\"\" value=\"\" required=\"\" name=\"preco\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 mb-3\">\n");
      out.write("                    Data de Vencimento\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"dataDeNascimento\" placeholder=\"\" value=\"\" required=\"\" name=\"dataVencimento\">\n");
      out.write("                     </div>\n");
      out.write("                </div>                                 \n");
      out.write("    </table>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3 mb-3\">\n");
      out.write("            <button class=\"btn btn-primary btn-lg\" type=\"submit\" id=\"inserir\">Inserir Produto</button>\n");
      out.write("            </div>\n");
      out.write("            <div class =\"col-md-3 mb-3\">\n");
      out.write("            <button class=\"btn btn-primary btn-lg\" type=\"reset\">Limpar Dados</button>\n");
      out.write("            </div>  \n");
      out.write("            <div class =\"col-md-3 mb-3\">\n");
      out.write("                <p> <a class=\"btn btn-primary btn-lg\" href=\"ProdutoServlet?action=retorno\">Retornar</a></p>\n");
      out.write("            </div>  \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("  </div>             \n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("</body>   \n");
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