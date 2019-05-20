package br.com.indra.treinamento.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.indra.treinamento.model.Title;

@Repository
public class TitleDAO extends DAO {

	public void create(Title title) throws SQLException {

		Connection c = getConnection();

		PreparedStatement ps = c
				.prepareStatement("insert into titles(emp_no, title, from_date, to_date)values (?,?,?,?)");
		ps.setLong(1, title.getEmpNo());
		ps.setString(2, title.getTitle());
		ps.setDate(3, new java.sql.Date(title.getFromDate().getTime()));
		ps.setDate(4, new java.sql.Date(title.getToDate().getTime()));

		ps.executeUpdate();

	}

	public void update(Title title) throws SQLException {

		Connection c = getConnection();

		PreparedStatement ps = c
				.prepareStatement("update titles set to_date  = ?  where emp_no = ? and title =? and from_date = ? ");

		ps.setDate(1, new java.sql.Date(title.getToDate().getTime()));
		ps.setLong(2, title.getEmpNo());
		ps.setString(3, title.getTitle());
		ps.setDate(4, new java.sql.Date(title.getFromDate().getTime()));
		

		ps.executeUpdate();
		close(ps, c);

	}

	public void delete(Title title) throws SQLException {

		Connection c = getConnection();

		PreparedStatement ps = c.prepareStatement("delete from titles where emp_no = ? and title =? and from_date = ?");

		ps.setLong(1, title.getEmpNo());
		ps.setString(2, title.getTitle());
		ps.setDate(3, new java.sql.Date(title.getFromDate().getTime()));

		ps.executeUpdate();

	}

	public List<Title> findAll() throws SQLException {
		Connection c = getConnection();

		PreparedStatement ps = c.prepareStatement("select * from titles order by emp_no limit 0,10");
		ResultSet rs = ps.executeQuery();

		ArrayList<Title> titles = new ArrayList<>();
		while (rs.next()) {
			titles.add(getTitle(rs));
		}

		close(rs, ps, c);

		return titles;

	}

	public Title findById(Title title) throws SQLException {
		Connection c = getConnection();

		PreparedStatement ps = c
				.prepareStatement("select * from titles where emp_no = ? and title = ? and from_date = ?");
		ps.setLong(1, title.getEmpNo());
		ps.setString(2, title.getTitle());
		ps.setDate(3, new java.sql.Date(title.getFromDate().getTime()));
		ResultSet rs = ps.executeQuery();

		Title titleReturn = null;
		if (rs.next()) {
			titleReturn = getTitle(rs);
		}

		close(rs, ps, c);

		return titleReturn;
	}

	private Title getTitle(ResultSet rs) throws SQLException {

		Title title = new Title();
		title.setEmpNo(rs.getLong("emp_no"));

		title.setTitle(rs.getString("title"));
		title.setFromDate(rs.getDate("from_date"));

		title.setToDate(rs.getDate("to_date"));

		return title;
	}

}
