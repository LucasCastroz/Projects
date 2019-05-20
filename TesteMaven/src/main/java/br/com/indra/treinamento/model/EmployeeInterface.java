package br.com.indra.treinamento.model;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface EmployeeInterface {
	@WebMethod
	
	public List<Employee> getAll();

}
