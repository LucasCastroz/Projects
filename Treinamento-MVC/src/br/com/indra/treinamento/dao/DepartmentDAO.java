package br.com.indra.treinamento.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.indra.treinamento.model.Department;

public class DepartmentDAO extends DAO {

	public void create(Department department) throws Exception {

		Connection c = getConnection();

		PreparedStatement ps = c.prepareStatement("insert into departments(dept_no, dept_name)values (?,?)");
		ps.setString(1, department.getId());
		ps.setString(2, department.getName());
		ps.executeUpdate();

		ps.close();
		c.close();

	}

	public void update(Department department) throws Exception {

		Connection c = getConnection();

		PreparedStatement ps = c.prepareStatement("update departments set dept_name  = ? where dept_no = ?");
		ps.setString(1, department.getName());
		ps.setString(2, department.getId());

		ps.executeUpdate();

		ps.close();
		c.close();

		System.out.println(ps);

	}

	public void delete(Department department) throws Exception {

		Connection c = getConnection();

		PreparedStatement ps = c.prepareStatement(" delete from departments where dept_no = ?");
		ps.setString(1, department.getId());
		ps.executeUpdate();

		ps.close();
		c.close();

	}

	public List<Department> findAll() throws Exception {

		Connection c = getConnection();

		PreparedStatement ps = c.prepareStatement("select * from departments");
		ResultSet rs = ps.executeQuery();
		ArrayList<Department> departments = new ArrayList<>();
		Department department = null;

		while (rs.next()) {
			department = new Department(rs.getString("dept_no"), rs.getString("dept_name"));
			departments.add(department);

		}
		ps.close();
		c.close();
		return departments;

	}
}
