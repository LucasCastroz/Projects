package br.com.indra.treinamento.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.indra.treinamento.dao.DepartmentDAO;
import br.com.indra.treinamento.model.Department;

public class MantainDepartmentAction implements Action {
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		
		Department department = new Department();
		department.setId(id);
		department.setName(name);
		
		DepartmentDAO dao = new DepartmentDAO();
		
		if (request.getParameter("subAction").equals("SAVE")) {
			dao.save(department);
		} else {
			dao.update(department);
		}
		
		System.out.println("### Departamento adicionado/atualizado ...");
		
		return "/mvc?action=ListAllDepartmentsAction";
	}
}
