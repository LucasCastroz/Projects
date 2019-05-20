package br.com.indra.treinamento.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.indra.treinamento.model.Employee;
import br.com.indra.treinamento.model.Gender;

@Repository
public class EmployeeDAO extends DAO {

	public void create(Employee employee) throws SQLException {

		Connection c = getConnection();

		PreparedStatement ps = c.prepareStatement(
				"insert into employees(emp_no, birth_date, first_name, last_name, gender, hire_date)values (?,?,?,?,?,?)");
		ps.setLong(1, employee.getEmpNo());
		ps.setDate(2, new java.sql.Date(employee.getDateBirth().getTime()));
		ps.setString(3, employee.getFirstName());
		ps.setString(4, employee.getLastName());
		ps.setString(5, employee.getGender().toString());
		ps.setDate(6, new java.sql.Date(employee.getHireDate().getTime()));

		ps.executeUpdate();

	}

	public void update(Employee employee) throws SQLException {

		Connection c = getConnection();

		PreparedStatement ps = c.prepareStatement(
				"update employees set birth_date  = ?, first_name = ?, last_name = ?, gender = ?, hire_date = ?  where emp_no = ?");

		ps.setDate(1, new java.sql.Date(employee.getDateBirth().getTime()));
		ps.setString(2, employee.getFirstName());
		ps.setString(3, employee.getLastName());
		ps.setString(4, employee.getGender().toString());
		ps.setDate(5, new java.sql.Date(employee.getHireDate().getTime()));
		ps.setLong(6, employee.getEmpNo());

		ps.executeUpdate();
		close(ps, c);

	}

	public void delete(Employee employee) throws SQLException {

		Connection c = getConnection();

		PreparedStatement ps = c.prepareStatement("delete from employees where  emp_no = ?");

		ps.setLong(1, employee.getEmpNo());

		ps.executeUpdate();

	}

	public List<Employee> findAll() throws SQLException {
		Connection c = getConnection();

		PreparedStatement ps = c.prepareStatement("select * from employees order by emp_no limit 0, 10");
		ResultSet rs = ps.executeQuery();

		ArrayList<Employee> employees = new ArrayList<>();
		while (rs.next()) {
			employees.add(getEmployee(rs));
		}

		close(rs, ps, c);

		return employees;

	}

	public Employee findById(Employee employee) throws SQLException {
		Connection c = getConnection();

		PreparedStatement ps = c.prepareStatement("select * from employees where emp_no = ? ");
		ps.setLong(1, employee.getEmpNo());
		ResultSet rs = ps.executeQuery();

		Employee employeeReturn = null;
		if (rs.next()) {
			employeeReturn = getEmployee(rs);
		}

		close(rs, ps, c);

		return employeeReturn;
	}

	private Employee getEmployee(ResultSet rs) throws SQLException {

		Employee employee = new Employee();
		employee.setEmpNo(rs.getLong("emp_no"));
		employee.setDateBirth(rs.getDate("birth_date"));
		employee.setFirstName(rs.getString("first_name"));
		employee.setLastName(rs.getString("last_name"));
		employee.setGender(Gender.valueOf(rs.getString("gender")));
		employee.setHireDate(rs.getDate("hire_date"));

		return employee;
	}

}
