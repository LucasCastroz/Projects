package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bean.TabelaPetBean;
import com.bean.TabelaProdutoBean;
import com.bean.TabelaTelefoneBean;
import java.util.List;
import java.util.ArrayList;
import Hibernate.HibernateAulaDAO;
import com.bean.TabelaClienteBean;

public final class ListagemPet_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      java.util.ArrayList ClienteLista = null;
      synchronized (request) {
        ClienteLista = (java.util.ArrayList) _jspx_page_context.getAttribute("ClienteLista", PageContext.REQUEST_SCOPE);
        if (ClienteLista == null){
          ClienteLista = new java.util.ArrayList();
          _jspx_page_context.setAttribute("ClienteLista", ClienteLista, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>LISTAGEM DE PET's</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<center>\n");
      out.write("<form name=\"form1\" method=\"post\" action=\"index.jsp\">\n");
      out.write("<div class=\"container\">\n");
      out.write("<h1><strong>PET's CADASTRADOS</strong></h1>\n");
      out.write("<br>\n");
      out.write("<table class=\"table the-bordered\">\n");
      out.write("    <thead>\n");
      out.write("        <th>CODIGO</th>\n");
      out.write("        <th>NOME</th>\n");
      out.write("        <th>PESO</th>\n");
      out.write("        <th>RAÇA</th>\n");
      out.write("        <th>DATA DE NASCIMENTO</th>\n");
      out.write("        <!--th>DELETAR</th!-->\n");
      out.write("        <!--th>ALTERAR</th!-->\n");
      out.write("    </thead>\n");
      out.write("<tbody>\n");
      out.write("     \n");
 
List<TabelaPetBean> pets = HibernateAulaDAO.listar(TabelaPetBean.class);

for (int i = 0; i < pets.size(); i++) 
{
    TabelaPetBean pet = (TabelaPetBean) pets.get(i);

      out.write("        \n");
      out.write("<tr>\n");
      out.write("    <td> ");
      out.print( pet.getCod() );
      out.write("</td> \n");
      out.write("    <td> ");
      out.print( pet.getNome() );
      out.write("</td>\n");
      out.write("    <td> ");
      out.print( pet.getPeso());
      out.write("</td> \n");
      out.write("    <td> ");
      out.print( pet.getRaca() );
      out.write("</td>\n");
      out.write("    <td> ");
      out.print( pet.getDataDeNascimento() );
      out.write("</td>\n");
      out.write("    <!--td><a href=ClienteServlet?action=Deletar&cod=");
      out.print( pet.getCod() );
      out.write("><i style=\"font-size:24px;color:red\" class=\"fa\">&#xf014;</i></a></td!-->\n");
      out.write("    <!--td><a href=ClienteServlet?action=Alterar&cod=");
      out.print( pet.getCod() );
      out.write("><i class=\"fa fa-pencil-square-o\" style=\"font-size:24px;color:blue\"></i></a></td!-->\n");
      out.write("</tr>\n");
      out.write("    ");

}   

      out.write("\n");
      out.write("    </tbody>\n");
      out.write("  </table>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("<p><button><a href=\"ClienteServlet?action=retorno\" type=\"button\" border-radius:15px>Retornar</a></button></p>\n");
      out.write("</form>\n");
      out.write("</center>\n");
      out.write("</body>\n");
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
