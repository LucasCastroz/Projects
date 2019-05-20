package br.com.indra.treinamento.model;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.indra.treinamento.dao.EmployeeDAO;

@WebService (endpointInterface = "br.com.indra.treinamento.model.EmployeeInterface")
public class EmployeeImpl implements EmployeeInterface{
	private EmployeeDAO employeeDAO = new EmployeeDAO();
	
	@WebMethod
	public List <Employee> getAll(){
		
		return employeeDAO.findAll();
	}

	
}
