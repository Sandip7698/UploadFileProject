package com.example.UploadFileProject.dto;

import java.math.BigDecimal;

public class SqlOneDto {
	private Long id;
	private BigDecimal amount;
	private String coinType;
	private BigDecimal trnxAmt;
	private String txncode;
	private String drcr;
	private String account;
	private String narration;
	private String info;
	private String productCode;
	private String status;
	private String comments;
	private String datetime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCoinType() {
		return coinType;
	}

	public void setCoinType(String coinType) {
		this.coinType = coinType;
	}

	public BigDecimal getTrnxAmt() {
		return trnxAmt;
	}

	public void setTrnxAmt(BigDecimal trnxAmt) {
		this.trnxAmt = trnxAmt;
	}

	public String getTxncode() {
		return txncode;
	}

	public void setTxncode(String txncode) {
		this.txncode = txncode;
	}

	public String getDrcr() {
		return drcr;
	}

	public void setDrcr(String drcr) {
		this.drcr = drcr;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

}
