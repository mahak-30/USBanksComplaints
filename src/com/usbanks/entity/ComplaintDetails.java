package com.usbanks.entity;

public class ComplaintDetails {

	String dateReceived;
	String product;
	String subProduct;
	String issue;
	String subIssue;
	String company;
	String state;
	String zipCode;
	String submittedVia;
	String dateSentToCompany;
	String companyResponse;
	String timelyResponse;
	String customerDispute;
	String complaintID;

	public ComplaintDetails(String dateReceived, String product, String subProduct, String issue, String subIssue,
			String company, String state, String zipCode, String submittedVia, String dateSentToCompany,
			String companyResponse, String timelyResponse, String customerDispute) {
		super();
		this.dateReceived = dateReceived;
		this.product = product;
		this.subProduct = subProduct;
		this.issue = issue;
		this.subIssue = subIssue;
		this.company = company;
		this.state = state;
		this.zipCode = zipCode;
		this.submittedVia = submittedVia;
		this.dateSentToCompany = dateSentToCompany;
		this.companyResponse = companyResponse;
		this.timelyResponse = timelyResponse;
		this.customerDispute = customerDispute;
	}

	public ComplaintDetails() {
		super();
	}

	public String getDateReceived() {
		return dateReceived;
	}

	public void setDateReceived(String dateReceived) {
		this.dateReceived = dateReceived;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getSubProduct() {
		return subProduct;
	}

	public void setSubProduct(String subProduct) {
		this.subProduct = subProduct;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public String getSubIssue() {
		return subIssue;
	}

	public void setSubIssue(String subIssue) {
		this.subIssue = subIssue;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getSubmittedVia() {
		return submittedVia;
	}

	public void setSubmittedVia(String submittedVia) {
		this.submittedVia = submittedVia;
	}

	public String getDateSentToCompany() {
		return dateSentToCompany;
	}

	public void setDateSentToCompany(String dateSentToCompany) {
		this.dateSentToCompany = dateSentToCompany;
	}

	public String getCompanyResponse() {
		return companyResponse;
	}

	public void setCompanyResponse(String companyResponse) {
		this.companyResponse = companyResponse;
	}

	public String getTimelyResponse() {
		return timelyResponse;
	}

	public void setTimelyResponse(String timelyResponse) {
		this.timelyResponse = timelyResponse;
	}

	public String getCustomerDispute() {
		return customerDispute;
	}

	public void setCustomerDispute(String customerDispute) {
		this.customerDispute = customerDispute;
	}

	public String getComplaintID() {
		return complaintID;
	}

	public void setComplaintID(String complaintID) {
		this.complaintID = complaintID;
	}

	@Override
	public String toString() {
		return "ComplaintDetails [dateReceived=" + dateReceived + ", product=" + product + ", subProduct=" + subProduct
				+ ", issue=" + issue + ", subIssue=" + subIssue + ", company=" + company + ", state=" + state
				+ ", zipCode=" + zipCode + ", submittedVia=" + submittedVia + ", dateSentToCompany=" + dateSentToCompany
				+ ", companyResponse=" + companyResponse + ", timelyResponse=" + timelyResponse + ", customerDispute="
				+ customerDispute + ", complaintID=" + complaintID + "]";
	}

}
