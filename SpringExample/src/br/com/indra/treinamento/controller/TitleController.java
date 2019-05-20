package br.com.indra.treinamento.controller;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.indra.treinamento.dao.TitleDAO;
import br.com.indra.treinamento.model.Title;

@Controller

public class TitleController {
	private TitleDAO dao = null;
	private final Logger logger = Logger.getLogger(TitleDAO.class);

	@Autowired

	public void setTitleDAO(TitleDAO dao) {

		this.dao = dao;
	}

	
	@RequestMapping("listTitles")
	public String listTitles(Model model) throws SQLException {

		model.addAttribute("titles", this.dao.findAll());

		logger.info("LISTA DE PROFISSOES");

		return "title/list";
	}

	@RequestMapping("loadTitle")
	public String loadTitle(Model model, Title title) throws SQLException {
		
		
		if (title.getEmpNo() != 0 && title.getTitle() != null && title.getFromDate() != null) {
			title = this.dao.findById(title);
		} else {
			title = null;
		}
		 
		
		
		if (title == null) {
			model.addAttribute("formAction", "saveTitle");
		} else {
			model.addAttribute("formAction", "updateTitle");
		}
		
	

	

		model.addAttribute("title", title);

		logger.info("PREPARA MANUTENÇÂO DA PROFISSAO");

		return "title/mantain";
	}

	@RequestMapping("saveTitle")
	public String mantainTitle(Title title) throws SQLException {

		this.dao.create(title);

		logger.info("ADICIONA PROFISSAO");

		return "redirect:listTitles";
	}

	@RequestMapping("updateTitle")
	public String updateTitle(Title title) throws SQLException {

		this.dao.update(title);

		logger.info("ATUALIZA PROFISSAO");

		return "redirect:listTitles";
	}

	@RequestMapping("deleteTitle")
	public String deleteTitle(Title title) throws SQLException {

		
		this.dao.delete(title);

		logger.info("REMOÇÂO DE PROFISSAO");

		return "redirect:listTitles";
	}

}
