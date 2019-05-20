package br.com.indra.treinamento.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.indra.treinamento.model.Department;

public class DepartmentDAO extends DAO {

	public void save(Department department) throws SQLException {
		Connection connection = getConnction();
		
		PreparedStatement ps = connection.prepareStatement("insert into departments (dept_no, dept_name) values (?, ?)");
		ps.setString(1, department.getId());
		ps.setString(2, department.getName());
		ps.executeUpdate();
		
		close(ps, connection);
	}
	
	public void update(Department department) throws SQLException {
		Connection connection = getConnction();
		
		PreparedStatement ps = connection.prepareStatement("update departments set dept_name  = ? where dept_no = ?");
		ps.setString(1, department.getName());
		ps.setString(2, department.getId());
		ps.executeUpdate();
		
		close(ps, connection);
	}
	
	public void delete(Department department) throws SQLException {
		Connection connection = getConnction();
		
		PreparedStatement ps = connection.prepareStatement("delete from departments where dept_no = ?");
		ps.setString(1, department.getId());
		ps.executeUpdate();
		
		close(ps, connection);
	}
	
	public List<Department> findAll() throws SQLException {
		Connection connection = getConnction();
		
		PreparedStatement ps = connection.prepareStatement("select * from departments");
		ResultSet rs = ps.executeQuery();
		
		ArrayList<Department> departments = new ArrayList<>();
		while (rs.next()) {
			departments.add(getDepartment(rs));
		}
		
		close(rs, ps, connection);
		
		return departments;
	}
	
	public Department findById(Department department) throws SQLException {
		Connection connection = getConnction();
		
		PreparedStatement ps = connection.prepareStatement("select * from departments where dept_no = ?");
		ps.setString(1, department.getId());
		ResultSet rs = ps.executeQuery();
		
		Department departmentReturn = null;
		if (rs.next()) {
			departmentReturn = getDepartment(rs);
		}
		
		close(rs, ps, connection);
		
		return departmentReturn;
	}
	
	private Department getDepartment(ResultSet rs) throws SQLException {
		Department department = new Department();
		department.setId(rs.getString("dept_no"));
		department.setName(rs.getString("dept_name"));
		
		return department;
	}

}
