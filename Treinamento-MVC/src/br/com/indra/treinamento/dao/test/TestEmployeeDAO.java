package br.com.indra.treinamento.dao.test;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import br.com.indra.treinamento.dao.EmployeeDAO;
import br.com.indra.treinamento.model.Employee;
import br.com.indra.treinamento.model.Gender;

public class TestEmployeeDAO {
	public static void main(String[] args) throws SQLException, ParseException  {

		SimpleDateFormat dateBirt = new SimpleDateFormat("dd/MM/yyyy");

		
		
		
		
		
		Employee employee = new Employee();
		
		//Inserir
		employee.setEmpNo(500004);
		employee.setDateBirth(dateBirt.parse("22/02/1984"));
		employee.setFirstName("Teste1");
		employee.setLastName("Java1");
		employee.setGender(Gender.M);
		employee.setHireDate(dateBirt.parse("02/04/2001"));
		
		EmployeeDAO dao = new EmployeeDAO();
		

		dao.create(employee);
		employee = dao.findById(employee);
		
		
		JOptionPane.showMessageDialog(null, employee);

		
		
		//Update
		employee.setDateBirth(dateBirt.parse("22/12/1984"));
		employee.setFirstName("TReste1");
		employee.setLastName("Java1");
		employee.setGender(Gender.F);
		employee.setHireDate(dateBirt.parse("02/04/2002"));

		
		dao.update(employee);
		employee = dao.findById(employee);
		System.out.println(employee);
		
		
		
		dao.delete(employee);
		employee = dao.findById(employee);

		System.out.println(employee);

	}

}