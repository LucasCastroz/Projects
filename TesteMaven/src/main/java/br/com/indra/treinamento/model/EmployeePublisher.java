package br.com.indra.treinamento.model;

import javax.xml.ws.Endpoint;

public class EmployeePublisher {
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9080/employee", new EmployeeImpl());
	}

}
