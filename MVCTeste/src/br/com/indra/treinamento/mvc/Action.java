package br.com.indra.treinamento.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	
		public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception;

}
