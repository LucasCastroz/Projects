package br.com.indra.treinamento.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {

	protected Connection getConnction() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			new SQLException(e);
		}
		return DriverManager.getConnection("jdbc:mysql://localhost/employees", "root", "lucascastro27");
	}
	
	
	protected void close(Statement statement, Connection connection) {
		try {
			statement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected void close(ResultSet resultSet, Statement statement, Connection connection) {
		try {
			resultSet.close();
			close(statement, connection);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
