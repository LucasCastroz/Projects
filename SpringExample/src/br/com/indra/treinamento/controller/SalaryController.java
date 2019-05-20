package br.com.indra.treinamento.controller;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.indra.treinamento.dao.SalaryDAO;
import br.com.indra.treinamento.model.Salary;

@Controller

public class SalaryController {
	private SalaryDAO dao = null;
	private final Logger logger = Logger.getLogger(SalaryDAO.class);

	@Autowired

	public void setSalaryDAO(SalaryDAO dao) {

		this.dao = dao;
	}

	
	@RequestMapping("listSalaries")
	public String listSalaries(Model model) throws SQLException {

		model.addAttribute("salaries", this.dao.findAll());

		logger.info("LISTA DE EMPLOYEES");

		return "salary/list";
	}

	@RequestMapping("loadSalary")
	public String loadSalary(Model model, Salary salary) throws SQLException {
		
		
		if (salary.getEmpNo() != 0 && salary.getFromDate() != null) {
			salary = this.dao.findById(salary);
		} else {
			salary = null;
		}
		 
		
		
		if (salary == null) {
			model.addAttribute("formAction", "saveSalary");
		} else {
			model.addAttribute("formAction", "updateSalary");
		}
		
	

	

		model.addAttribute("salary", salary);

		logger.info("PREPARA MANUTENÇÂO DO SALARIO");

		return "salary/mantain";
	}

	@RequestMapping("saveSalary")
	public String mantainSalary(Salary salary) throws SQLException {

		this.dao.create(salary);

		logger.info("ADICIONA SALARIO");

		return "redirect:listSalaries";
	}

	@RequestMapping("updateSalary")
	public String updateSalary(Salary salary) throws SQLException {

		this.dao.update(salary);

		logger.info("ATUALIZA SALARIO");

		return "redirect:listSalaries";
	}

	@RequestMapping("deleteSalary")
	public String deleteSalary(Salary salary) throws SQLException {

		
		this.dao.delete(salary);

		logger.info("REMOÇÂO DE SALARIO");

		return "redirect:listSalaries";
	}

}
