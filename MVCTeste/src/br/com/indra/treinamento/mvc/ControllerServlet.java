package br.com.indra.treinamento.mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mvc")
public class ControllerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String parameter = request.getParameter("action");
		String className = "br.com.indra.treinamento.mvc." + parameter;

		try {
			Class clazz = Class.forName(className);

			Action action = (Action) clazz.newInstance();
			String page = action.execute(request, response);

			request.getRequestDispatcher(page).forward(request, response);
		} catch (Exception e) {
			throw new ServletException("A Exception has ocurred in Action " + className, e);
		}
	}

}
