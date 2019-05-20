package br.com.indra.treinamento.model.testemaven;

import javax.xml.ws.Endpoint;

public class EmployeePublisher {
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/employee", new EmployeeImpl());
	}

}
