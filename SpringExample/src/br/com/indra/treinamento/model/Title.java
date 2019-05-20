package br.com.indra.treinamento.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Title {
	
	
	
	private long empNo;
	private String title;

	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date fromDate;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date toDate;


	public Title() {
	}

	public Title(long empNo,String title , Date fromDate, Date toDate  ) {
		
		this.empNo = empNo;
		this.title = title;
		this.fromDate = fromDate;
		this.toDate = toDate;
		
		

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	
}