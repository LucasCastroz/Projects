/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Hibernate.HibernateAulaDAO;
import com.bean.TabelaProdutoBean;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author marco.junior
 */
@WebServlet(name = "ProdutoServlet", urlPatterns = {"/ProdutoServlet"})
public class ProdutoServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

                try
        { if(request.getParameter("action").equals("ListarProdutos"))
        
            processListar(request, response);
        }catch(Exception ex)
        {
            
        }

        
        
        try
        { if(request.getParameter("action").equals("retorno"))
        
            processRetorno(request, response);
        }catch(Exception ex)
        {
            
        }

                try
        { if(request.getParameter("action").equals("inserir"))
        
            processInserir(request, response);
        }catch(Exception ex)
        {
            
        }
        
        try
        {         
         if(request.getParameter("nome") != null && request.getParameter("categoria") != null &&
         request.getParameter("descricao") != null && request.getParameter("imagem1") != null &&
         request.getParameter("imagem2") != null && request.getParameter("imagem3") != null &&
         request.getParameter("peso") != null && request.getParameter("preco") != null &&
         request.getParameter("dataVencimento") != null )
         {
            String nome = request.getParameter("nome");
            String categoria = request.getParameter("categoria");
            String descricao = request.getParameter("descricao");
            String imagem1 = request.getParameter("imagem1");
            String imagem2 = request.getParameter("imagem2");
            String imagem3 = request.getParameter("imagem3");
            String peso = request.getParameter("peso");
            String preco = request.getParameter("preco");
            String dataVencimento = request.getParameter("dataVencimento");
            
            TabelaProdutoBean produto = new TabelaProdutoBean();
            produto.setNome(nome);
            produto.setCategoria(categoria);
            produto.setDescricao(descricao);
            produto.setImagem1(imagem1);
            produto.setImagem2(imagem2);
            produto.setImagem3(imagem3);
            produto.setPeso(peso);
            produto.setPreco(preco);
            produto.setDataVencimento(dataVencimento);
            
            HibernateAulaDAO bd = new HibernateAulaDAO();
            
            if(request.getParameter("cod") == null)
            {
            bd.insert(produto);
            RequestDispatcher rd = request.getRequestDispatcher("SucessoCadastroProduto.jsp");
            rd.forward(request,response);
            }
            else
            {
                
            }
         }
        }
        catch(Exception ex)
        {
            System.out.println("");
        }
        
        
    }

     protected void processListar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            try
            {
          RequestDispatcher rd = request.getRequestDispatcher("ListagemProduto.jsp");
          rd.forward(request,response);
                
            }catch(Exception ex)
            {
                
            }
        }

    
        protected void processRetorno(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            try
            {
          RequestDispatcher rd = request.getRequestDispatcher("TelaAdministrador.jsp");
          rd.forward(request,response);
                
            }catch(Exception ex)
            {
                
            }
        }
         
                protected void processInserir(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            try
            {
          RequestDispatcher rd = request.getRequestDispatcher("CadastroProduto.jsp");
          rd.forward(request,response);
                
            }catch(Exception ex)
            {
                
            }
        }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
