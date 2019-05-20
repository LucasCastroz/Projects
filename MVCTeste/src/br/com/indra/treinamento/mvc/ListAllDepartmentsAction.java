package br.com.indra.treinamento.mvc;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.indra.treinamento.dao.DepartmentDAO;
import br.com.indra.treinamento.model.Department;

public class ListAllDepartmentsAction implements Action {
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		DepartmentDAO dao = new DepartmentDAO();
		List<Department> departments = dao.findAll();
		
		request.setAttribute("departments", departments);
		
		return "/WEB-INF/jsp/list-departments.jsp";
	}
}
