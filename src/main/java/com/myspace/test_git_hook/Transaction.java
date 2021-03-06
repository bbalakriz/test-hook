package com.myspace.test_git_hook;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Transaction implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Transaction Amount")
	private int amount;
	@org.kie.api.definition.type.Label("Country")
	private java.lang.String countryCode;
	@org.kie.api.definition.type.Label("Merchant Category Code")
	private java.lang.String merchantCategory;
	@org.kie.api.definition.type.Label("Card Brand")
	private java.lang.String cardBrand;
	@org.kie.api.definition.type.Label("Email Notification")
	private java.lang.Boolean email;
	@org.kie.api.definition.type.Label("SMS Notification")
	private java.lang.Boolean sms;
	@org.kie.api.definition.type.Label("Create Case")
	private java.lang.Boolean createCase;

	private java.lang.String finalAdd;

	private java.lang.String newChange;

	public Transaction() {
	}

	public java.lang.String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(java.lang.String countryCode) {
		this.countryCode = countryCode;
	}

	public java.lang.String getMerchantCategory() {
		return this.merchantCategory;
	}

	public void setMerchantCategory(java.lang.String merchantCategory) {
		this.merchantCategory = merchantCategory;
	}

	public java.lang.String getCardBrand() {
		return this.cardBrand;
	}

	public void setCardBrand(java.lang.String cardBrand) {
		this.cardBrand = cardBrand;
	}

	public java.lang.Boolean getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.Boolean email) {
		this.email = email;
	}

	public java.lang.Boolean getSms() {
		return this.sms;
	}

	public void setSms(java.lang.Boolean sms) {
		this.sms = sms;
	}

	public java.lang.Boolean getCreateCase() {
		return this.createCase;
	}

	public void setCreateCase(java.lang.Boolean createCase) {
		this.createCase = createCase;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public java.lang.String getFinalAdd() {
		return this.finalAdd;
	}

	public void setFinalAdd(java.lang.String finalAdd) {
		this.finalAdd = finalAdd;
	}

	public java.lang.String getNewChange() {
		return this.newChange;
	}

	public void setNewChange(java.lang.String newChange) {
		this.newChange = newChange;
	}

	public Transaction(int amount, java.lang.String countryCode,
			java.lang.String merchantCategory, java.lang.String cardBrand,
			java.lang.Boolean email, java.lang.Boolean sms,
			java.lang.Boolean createCase, java.lang.String finalAdd,
			java.lang.String newChange) {
		this.amount = amount;
		this.countryCode = countryCode;
		this.merchantCategory = merchantCategory;
		this.cardBrand = cardBrand;
		this.email = email;
		this.sms = sms;
		this.createCase = createCase;
		this.finalAdd = finalAdd;
		this.newChange = newChange;
	}

}