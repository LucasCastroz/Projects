package br.com.indra.treinamento.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Employee {

	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dateBirth;

	private long empNo;
	private String firstName;
	private String lastName;
	private Gender gender;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date hireDate;

	public Employee() {
	}

	public Employee(Date dateBirth, Date hireDate, long empNo, String firstName, String lastName, Gender gender) {
		this.empNo = empNo;
		this.dateBirth = dateBirth;
		this.hireDate = hireDate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;

	}

	public Date getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public long getEmpNo() {
		return empNo;
	}

	public void setEmpNo(long empNo) {
		this.empNo = empNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender =gender;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return this.getEmpNo() + " | " + 
				dateFormat.format(this.getDateBirth()) + " | " +  
				this.getFirstName() + " | " + 
				this.getLastName() + " | " + 
				this.getGender() + " | " + 
				dateFormat.format(this.getHireDate());
	}

}