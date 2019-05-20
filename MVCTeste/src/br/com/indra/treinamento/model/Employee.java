package br.com.indra.treinamento.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	
		private long id;
		private Date birthDate;
		private String firstName;
		private String lastName;
		private Gender gender;
		private Date hireDate;
		
		public Employee() {}
		
		public Employee(long id, Date birthDate, String firstName, String lastName, Gender gender, Date hireDate) {
			super();
			this.id = id;
			this.birthDate = birthDate;
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
			this.hireDate = hireDate;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public Date getBirthDate() {
			return birthDate;
		}

		public void setBirthDate(Date birthDate) {
			this.birthDate = birthDate;
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

		public Date getHireDate() {
			return hireDate;
		}

		public void setHireDate(Date hireDate) {
			this.hireDate = hireDate;
		}
		
		@Override
		public String toString() {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			return this.getId() + " | " + 
					dateFormat.format(this.getBirthDate()) + " | " +  
					this.getFirstName() + " | " + 
					this.getLastName() + " | " + 
					this.getGender() + " | " + 
					dateFormat.format(this.getHireDate());
		}
}
