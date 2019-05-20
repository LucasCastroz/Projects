package br.com.indra.treinamento.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.indra.treinamento.dao.DepartmentDAO;
import br.com.indra.treinamento.model.Department;

public class LoadDepartmentAction implements Action {
	
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Department department = new Department();
		department.setId(request.getParameter("id"));
		
		DepartmentDAO dao = new DepartmentDAO();
		department = dao.findById(department);
		
		if (department == null) {
			request.setAttribute("subAction", "SAVE");
		} else {
			request.setAttribute("subAction", "UPDATE");
		}
		
		request.setAttribute("department", department);
		
		return "/WEB-INF/jsp/mantain-department.jsp";
	}
}
