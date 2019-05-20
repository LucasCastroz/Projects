package br.com.indra.treinamento.controller;

import java.sql.SQLException;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.indra.treinamento.dao.EmployeeDAO;
import br.com.indra.treinamento.model.Employee;

@Controller
public class EmployeeController {
	
	private EmployeeDAO dao = null;
	private final Logger logger = Logger.getLogger(EmployeeController.class);
	
	@Autowired
	public void setEmployeeDAO(EmployeeDAO dao) {
		this.dao = dao;
	}
	
	@RequestMapping("listEmployees")
	public String listEmployees(Model model) throws SQLException {

		model.addAttribute("employees", this.dao.findAll());
		
		logger.info("LISTA DE EMPREGADOS");
		
		return "employee/list";
	}


}
