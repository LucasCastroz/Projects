package br.com.indra.treinamento.controller;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.indra.treinamento.dao.DepartmentDAO;
import br.com.indra.treinamento.model.Department;

@Controller
public class DepartmentController {
	
	private DepartmentDAO dao = null;
	private final Logger logger = Logger.getLogger(DepartmentController.class);
	
	@Autowired
	public void setDepartmentDAO(DepartmentDAO dao) {
		this.dao = dao;
	}
	
	@RequestMapping("listDepartments")
	public String listDepartments(Model model) throws SQLException {

		model.addAttribute("departments", this.dao.findAll());
		
		logger.info("LISTA DE DEPARTAMENTOS");
		
		return "department/list";
	}
	
	@RequestMapping("loadDepartment")
	public String loadDepartment(Model model, Department department) throws SQLException {
		
		department = this.dao.findById(department);
		
		if (department == null) {
			model.addAttribute("formAction", "saveDepartment");
		} else {
			model.addAttribute("formAction", "updateDepartment");
		}
		
		model.addAttribute("department", department);
		
		logger.info("PREPARA MANUTENÇÂO DE DEPARTAMENTO");
		
		return "department/mantain";
	}

	@RequestMapping("saveDepartment")
	public String mantainDepartment(Department department) throws SQLException {

		this.dao.save(department);
		
		logger.info("ADICIONA DEPARTAMENTO");
		
		return "redirect:listDepartments";
	}
	
	@RequestMapping("updateDepartment")
	public String updateDepartment(Department department) throws SQLException {

		this.dao.update(department);
		
		logger.info("ATUALIZA DEPARTAMENTO");
		
		return "redirect:listDepartments";
	}

	@RequestMapping("deleteDepartment")
	public String deleteDepartment(Department department) throws SQLException {

		this.dao.delete(department);
		
		logger.info("REMOÇÂO DE DEPARTAMENTO");
		
		return "redirect:listDepartments";
	}

}
