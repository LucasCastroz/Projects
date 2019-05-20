package br.com.indra.treinamento.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {

	protected Connection getConnection() throws SQLException {

		return DriverManager.getConnection("jdbc:mysql://localhost/employees", "root", "lucascastro27");

	}

	protected void close(Statement ps, Connection c) throws SQLException {

		try {

			ps.close();
			c.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	protected void close(ResultSet rs, Statement ps, Connection c) throws SQLException {

		try {

			rs.close();
			ps.close();
			c.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}