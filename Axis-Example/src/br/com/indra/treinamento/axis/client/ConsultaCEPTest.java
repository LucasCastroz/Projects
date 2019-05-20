package br.com.indra.treinamento.axis.client;

import java.net.URL;

import org.apache.log4j.Logger;

import br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente;
import br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteServiceLocator;
import br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP;

public class ConsultaCEPTest {

	public static void main(String[] args) {
		
		final Logger logger = Logger.getLogger(ConsultaCEPTest.class);
		
		try {
			AtendeClienteServiceLocator serviceLocator = new AtendeClienteServiceLocator();

			AtendeCliente port = serviceLocator.getAtendeClientePort(new URL("http://localhost:8080/AtendeCliente"));

			EnderecoERP endereco = port.consultaCEP("04728170");
			
			logger.info("END: " + endereco.getEnd());
			logger.info("BAIRRO: " + endereco.getBairro());
			logger.info("CEP: " + endereco.getCep());
			logger.info("Cidade: " + endereco.getCidade());
			logger.info("Complemento: " + endereco.getComplemento());
			logger.info("Complemento2: " +endereco.getComplemento2());
			logger.info("Id: " + endereco.getId());
			logger.info("Uf: " + endereco.getUf());
		} catch (Exception e) {
			logger.error("ERRO NESSA DISGRAMA!!!", e);;
		}
	}
	
}
