package com.example.UploadFileProject.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SqlTwoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private BigDecimal count;
	private String account;
	private String datetime;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getCount() {
		return count;
	}

	public void setCount(BigDecimal count) {
		this.count = count;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

}
