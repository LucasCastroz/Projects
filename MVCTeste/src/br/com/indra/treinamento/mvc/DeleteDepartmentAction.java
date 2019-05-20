package br.com.indra.treinamento.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.indra.treinamento.dao.DepartmentDAO;
import br.com.indra.treinamento.model.Department;

public class DeleteDepartmentAction implements Action {
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		DepartmentDAO dao = new DepartmentDAO();
		
		Department department = new Department();
		department.setId(request.getParameter("id"));
		
		dao.delete(department);
		
		System.out.println("### Departamento excluído...");
		
		return "/mvc?action=ListAllDepartmentsAction";
	}
}
