package br.com.indra.treinamento.dao.test;
import java.util.List;

import br.com.indra.treinamento.dao.DepartmentDAO;
import br.com.indra.treinamento.model.Department;

public class TestDepartmentDAO {

	public static void main(String[] args)throws Exception {
		
		Department departmentTreinamento = new Department();
		departmentTreinamento.setId("105");
		departmentTreinamento.setName("Treinamento Java105");
		
		
		
		DepartmentDAO teste1 = new DepartmentDAO();
		teste1.create(departmentTreinamento);
		
		List<Department> departments = teste1.findAll();
		for (Department department : departments) {
			System.out.println(department.getId() + " | " + department.getName());
			
		}
		//atualiza update
		
		departmentTreinamento.setName("Treinamento Java105 Alt");
		teste1.update(departmentTreinamento);
		
		departments = teste1.findAll();
		for (Department department : departments) {
			System.out.println(department.getId() + " | " + department.getName());
			
		}
		// deleta pelo id
		departmentTreinamento.setId("105");
		teste1.delete(departmentTreinamento);

		departments = teste1.findAll();
		for (Department department : departments) {
			System.out.println(department.getId() + " | " + department.getName());
			
		}
	
		
	}
	
}
