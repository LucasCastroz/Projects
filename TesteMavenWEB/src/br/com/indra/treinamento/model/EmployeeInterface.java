package br.com.indra.treinamento.model;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-04-17T16:28:58.038-03:00
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "http://model.treinamento.indra.com.br/", name = "EmployeeInterface")
@XmlSeeAlso({ObjectFactory.class})
public interface EmployeeInterface {

    @WebMethod
    @RequestWrapper(localName = "getAll", targetNamespace = "http://model.treinamento.indra.com.br/", className = "br.com.indra.treinamento.model.GetAll")
    @ResponseWrapper(localName = "getAllResponse", targetNamespace = "http://model.treinamento.indra.com.br/", className = "br.com.indra.treinamento.model.GetAllResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<br.com.indra.treinamento.model.Employee> getAll();
}