package br.com.indra.treinamento.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.indra.treinamento.model.Employee;
import br.com.indra.treinamento.model.Gender;

public class EmployeeDAO extends DAO {

	public void save(Employee employee) throws SQLException {
		Connection connection = getConnction();
		
		PreparedStatement ps = connection.prepareStatement("insert into employees (emp_no, birth_date, first_name, last_name, gender, hire_date) values (?, ?, ?, ?, ?, ?)");
		ps.setLong(1, employee.getId());
		ps.setDate(2, new java.sql.Date(employee.getBirthDate().getTime()));
		ps.setString(3, employee.getFirstName());
		ps.setString(4, employee.getLastName());
		ps.setString(5, employee.getGender().toString());
		ps.setDate(6, new java.sql.Date(employee.getHireDate().getTime()));
		ps.executeUpdate();
		
		close(ps, connection);
	}
	
	public void update(Employee employee) throws SQLException {
		Connection connection = getConnction();
		
		PreparedStatement ps = connection.prepareStatement("update employees set birth_date = ?, first_name = ?, last_name = ?, gender = ?, hire_date = ? where emp_no = ?");
		ps.setDate(1, new java.sql.Date(employee.getBirthDate().getTime()));
		ps.setString(2, employee.getFirstName());
		ps.setString(3, employee.getLastName());
		ps.setString(4, employee.getGender().toString());
		ps.setDate(5, new java.sql.Date(employee.getHireDate().getTime()));
		ps.setLong(6, employee.getId());
		ps.executeUpdate();
		
		close(ps, connection);
	}
	
	public void delete(Employee employee) throws SQLException {
		Connection connection = getConnction();
		
		PreparedStatement ps = connection.prepareStatement("delete from employees where emp_no = ?");
		ps.setLong(1, employee.getId());
		ps.executeUpdate();
		
		close(ps, connection);
	}
	
	public List<Employee> findAll() throws SQLException {
		Connection connection = getConnction();
		
		PreparedStatement ps = connection.prepareStatement("select * from employees");
		ResultSet rs = ps.executeQuery();
		
		ArrayList<Employee> employees = new ArrayList<>();
		while (rs.next()) {
			employees.add(getEmployee(rs));
		}
		
		close(rs, ps, connection);
		
		return employees;
	}
	
	public Employee findById(Employee employee) throws SQLException {
		Connection connection = getConnction();
		
		PreparedStatement ps = connection.prepareStatement("select * from employees where emp_no = ?");
		ps.setLong(1, employee.getId());
		ResultSet rs = ps.executeQuery();
		
		Employee employeeReturn = null;
		if (rs.next()) {
			employeeReturn = getEmployee(rs);
		}
		
		close(rs, ps, connection);
		
		return employeeReturn;
	}
	
	private Employee getEmployee(ResultSet rs) throws SQLException {
		Employee employee = new Employee();
		employee.setId(rs.getLong("emp_no"));
		employee.setBirthDate(rs.getDate("birth_date"));
		employee.setFirstName(rs.getString("first_name"));
		employee.setLastName(rs.getString("last_name"));
		employee.setGender(Gender.valueOf(rs.getString("gender")));
		employee.setHireDate(rs.getDate("hire_date"));
		
		return employee;
	}
	

}
