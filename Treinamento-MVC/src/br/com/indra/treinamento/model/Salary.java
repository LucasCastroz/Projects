package br.com.indra.treinamento.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Salary {

	private Date fromDate;
	private Date toDate;
	private long empNo;
	private long salary;

	public Salary() {
	}

	public Salary(Date fromDate, Date toDate, long empNo, long salary) {
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.empNo = empNo;
		this.salary = salary;

	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public long getEmpNo() {
		return empNo;
	}

	public void setEmpNo(long empNo) {
		this.empNo = empNo;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return this.getEmpNo() + " | " + this.getSalary() + "|"+

				dateFormat.format(this.getFromDate()) + " | "
				+ dateFormat.format(this.getToDate());

	}
}
