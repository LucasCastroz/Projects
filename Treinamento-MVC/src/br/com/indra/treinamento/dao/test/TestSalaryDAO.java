package br.com.indra.treinamento.dao.test;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import br.com.indra.treinamento.dao.EmployeeDAO;
import br.com.indra.treinamento.dao.SalaryDAO;
import br.com.indra.treinamento.model.Employee;
import br.com.indra.treinamento.model.Salary;

public class TestSalaryDAO {
	
	public static void main(String[] args) throws SQLException, ParseException {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		
		//Insere Employee
		Employee employee = new Employee();
		employee.setEmpNo(500013);

		EmployeeDAO dao = new EmployeeDAO();
		employee = dao.findById(employee);

		
		//Insere Salary
		Salary salary = new Salary();
		salary.setEmpNo(employee.getEmpNo());
		salary.setSalary(10000);
		salary.setFromDate(dateFormat.parse("20/02/2002"));
		salary.setToDate(dateFormat.parse("20/02/2010"));
		
		SalaryDAO salaryDAO = new SalaryDAO();
		salaryDAO.create(salary);
		salary = salaryDAO.findById(salary);
		
		System.out.println(salary);
		
		//Realiza Update 
		salary.setSalary(200003000);
		salary.setToDate(dateFormat.parse("23/04/2015"));
		
		salaryDAO.update(salary);
		salary=salaryDAO.findById(salary);
		System.out.println(salary);
		
		//Faz o delete 
		
		salaryDAO.delete(salary);
		salary = salaryDAO.findById(salary);
		
		System.out.println(salary);
		
		
	}
}
