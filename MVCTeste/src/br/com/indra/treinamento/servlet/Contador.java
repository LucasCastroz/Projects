package br.com.indra.treinamento.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/contador")
public class Contador extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private int contador = 0;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		System.out.println("######## INICIANDO A SERVLET...");
	}
	
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("######## DESTRUINDO A SERVLET...");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		this.contador++;

		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Contador</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>O contador agora é: " + this.contador + "</h3>");
		out.println("</body>");
		out.println("</html>");
	}
}