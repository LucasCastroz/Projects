package br.com.indra.treinamento.controller;

import java.sql.SQLException;

import org.apache.log4j.Logger;
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
	
	@RequestMapping("loadEmployee")
	public String loadEmployee(Model model, Employee employee) throws SQLException {
		
		employee = this.dao.findById(employee);
		
		if (employee == null) {
			model.addAttribute("formAction", "saveEmployee");
		} else {
			model.addAttribute("formAction", "updateEmployee");
		}
		
		model.addAttribute("employee", employee);
		
		logger.info("PREPARA MANUTENÇÂO DE EMPREGADO");
		
		return "employee/mantain";
	}

	@RequestMapping("saveEmployee")
	public String mantainEmployee(Employee employee) throws SQLException {

		this.dao.save(employee);
		
		logger.info("ADICIONA EMPREGADO");
		
		return "redirect:listEmployees";
	}
	
	@RequestMapping("updateEmployee")
	public String updateEmployee(Employee employee) throws SQLException {

		this.dao.update(employee);
		
		logger.info("ATUALIZA EMPREGADO");
		
		return "redirect:listEmployees";
	}

	@RequestMapping("deleteEmployee")
	public String deleteEmployee(Employee employee) throws SQLException {

		this.dao.delete(employee);
		
		logger.info("REMOÇÂO DE EMPREGADO");
		
		return "redirect:listEmployees";
	}

}
