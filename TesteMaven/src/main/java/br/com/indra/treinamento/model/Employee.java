package br.com.indra.treinamento.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {

	private Date dateBirth;
	private Date hireDate;
	private long id;
	private String firstName;
	private String lastName;
	private Gender gender;

	public Employee() {
	}

	public Employee(Date dateBirth, Date hireDate, long id, String firstName, String lastName, Gender gender) {
		this.id = id;
		this.dateBirth = dateBirth;
		this.hireDate = hireDate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;

	}

	
	
	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return this.getId() + " | " + 
				dateFormat.format(this.getDateBirth()) + " | " +  
				this.getFirstName() + " | " + 
				this.getLastName() + " | " + 
				this.getGender() + " | " + 
				dateFormat.format(this.getHireDate());
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
		this.gender = gender;
	}

}