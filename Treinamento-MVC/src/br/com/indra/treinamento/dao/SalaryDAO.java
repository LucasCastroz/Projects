package br.com.indra.treinamento.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.indra.treinamento.model.Salary;

public class SalaryDAO extends DAO {

	public void create(Salary salary) throws SQLException {

		Connection c = getConnection();

		PreparedStatement ps = c
				.prepareStatement("insert into salaries(emp_no, salary, from_date, to_date )values (?,?,?,?)");

		ps.setLong(1, salary.getEmpNo());
		ps.setLong(2, salary.getSalary());
		ps.setDate(3, new java.sql.Date(salary.getFromDate().getTime()));
		ps.setDate(4, new java.sql.Date(salary.getToDate().getTime()));

		ps.executeUpdate();

		close(ps, c);
	}

	public void update(Salary salary) throws SQLException {

		Connection c = getConnection();

		PreparedStatement ps = c
				.prepareStatement("update salaries set salary = ?,  to_date = ? where emp_no = ? and from_date = ?");

		ps.setLong(1, salary.getSalary());
		ps.setDate(2, new java.sql.Date(salary.getToDate().getTime()));
		ps.setLong(3, salary.getEmpNo());
		ps.setDate(4, new java.sql.Date(salary.getFromDate().getTime()));

		ps.executeUpdate();

		close(ps, c);

	}

	public void delete(Salary salary) throws SQLException {

		Connection c = getConnection();

		PreparedStatement ps = c.prepareStatement("delete from salaries where  emp_no = ? and from_date=?");

		ps.setLong(1, salary.getEmpNo());
		ps.setDate(2, new java.sql.Date(salary.getFromDate().getTime()));
		ps.executeUpdate();
		close(ps, c);

	}

	public List<Salary> findAll() throws SQLException {
		Connection c = getConnection();

		PreparedStatement ps = c.prepareStatement("select * from salaries");
		ResultSet rs = ps.executeQuery();

		ArrayList<Salary> salaries = new ArrayList<>();
		while (rs.next()) {
			salaries.add(getSalary(rs));
		}

		close(rs, ps, c);

		return salaries;

	}

	public Salary findById(Salary salary) throws SQLException {
		Connection c = getConnection();

		PreparedStatement ps = c.prepareStatement("select * from salaries where emp_no = ? and from_date=?");
		ps.setLong(1, salary.getEmpNo());
		ps.setDate(2, new java.sql.Date(salary.getFromDate().getTime()));
		ResultSet rs = ps.executeQuery();

		Salary salaryReturn = null;
		if (rs.next()) {
			salaryReturn = getSalary(rs);
		}
		return salaryReturn;

	}

	private Salary getSalary(ResultSet rs) throws SQLException {

		Salary salary = new Salary();
		salary.setEmpNo(rs.getLong("emp_no"));
		salary.setSalary(rs.getLong("salary"));
		salary.setFromDate(rs.getDate("from_date"));
		salary.setToDate(rs.getDate("to_date"));

		return salary;
	}

}
