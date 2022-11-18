package com.example.UploadFileProject.dto;

import java.math.BigDecimal;

public class SqlTwoDto {
	private BigDecimal count;
	private String account;
	private String datetime;
	private Long id;

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
