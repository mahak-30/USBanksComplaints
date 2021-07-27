package com.usbanks.entity;
import com.usbanks.entity.*;

import java.util.HashMap;
import java.util.Scanner;

public class ComplaintDetailsExtractor {

	CSVFileReader readBankFile = new CSVFileReader();
	Scanner sc = new Scanner(System.in);

	public void loadData() {
		readBankFile.Reader();
	}

	public void complaintsBasedOnYear(String user_year) {
		for (HashMap.Entry<String, ComplaintDetails> entry : readBankFile.getBankComplaintObject().entrySet()) {
			if (entry.getValue().dateReceived.contains(user_year)) {
				System.out.println(entry.getValue().dateReceived + " " + entry.getValue().product + " "
						+ entry.getValue().subProduct + " " + entry.getValue().issue + " " + entry.getValue().subIssue
						+ " " + entry.getValue().company + " " + entry.getValue().zipCode + " " + entry.getValue().state
						+ " " + entry.getValue().submittedVia + " " + entry.getValue().dateSentToCompany + " "
						+ entry.getValue().companyResponse + " " + entry.getValue().timelyResponse + " "
						+ entry.getValue().customerDispute);
			}
		}
	}

	public void complaintsBasedOnBankName(String user_bank) {
		for (HashMap.Entry<String, ComplaintDetails> entry : readBankFile.getBankComplaintObject().entrySet()) {
			if (entry.getValue().company.equalsIgnoreCase(user_bank)) {
				System.out.println(entry.getValue().dateReceived + " " + entry.getValue().product + " "
						+ entry.getValue().subProduct + " " + entry.getValue().issue + " " + entry.getValue().subIssue
						+ " " + entry.getValue().company + " " + entry.getValue().zipCode + " " + entry.getValue().state
						+ " " + entry.getValue().submittedVia + " " + entry.getValue().dateSentToCompany + " "
						+ entry.getValue().companyResponse + " " + entry.getValue().timelyResponse + " "
						+ entry.getValue().customerDispute);
			}
		}
	}

	public void complaintsBasedOnComplaintID(String user_id) {
		for (HashMap.Entry<String, ComplaintDetails> entry : readBankFile.getBankComplaintObject().entrySet()) {
			if (readBankFile.getBankComplaintObject().containsKey(user_id)) {
				System.out.println(entry.getValue().dateReceived + " " + entry.getValue().product + " "
						+ entry.getValue().subProduct + " " + entry.getValue().issue + " " + entry.getValue().subIssue
						+ " " + entry.getValue().company + " " + entry.getValue().zipCode + " " + entry.getValue().state
						+ " " + entry.getValue().submittedVia + " " + entry.getValue().dateSentToCompany + " "
						+ entry.getValue().companyResponse + " " + entry.getValue().timelyResponse + " "
						+ entry.getValue().customerDispute);
			}
		}
	}
	
	public void daysToCloseTheComplaint()
	{
		
	}

	public void complaintsClosed() {
		for (HashMap.Entry<String, ComplaintDetails> entry : readBankFile.getBankComplaintObject().entrySet()) {
			String compResponse = entry.getValue().companyResponse;

			if (compResponse.equalsIgnoreCase("Closed") || compResponse.equalsIgnoreCase("Closed with explanation")) {
				System.out.println(entry.getValue().dateReceived + " " + entry.getValue().product + " "
						+ entry.getValue().subProduct + " " + entry.getValue().issue + " " + entry.getValue().subIssue
						+ " " + entry.getValue().company + " " + entry.getValue().zipCode + " " + entry.getValue().state
						+ " " + entry.getValue().submittedVia + " " + entry.getValue().dateSentToCompany + " "
						+ entry.getValue().companyResponse + " " + entry.getValue().timelyResponse + " "
						+ entry.getValue().customerDispute);
			}
		}
	}

	public void complaintsReceivingTimelyResponse() {
		for (HashMap.Entry<String, ComplaintDetails> entry : readBankFile.getBankComplaintObject().entrySet()) {
			if (entry.getValue().timelyResponse.equals("Yes")) {
				System.out.println(entry.getValue().dateReceived + " " + entry.getValue().product + " "
						+ entry.getValue().subProduct + " " + entry.getValue().issue + " " + entry.getValue().subIssue
						+ " " + entry.getValue().company + " " + entry.getValue().zipCode + " " + entry.getValue().state
						+ " " + entry.getValue().submittedVia + " " + entry.getValue().dateSentToCompany + " "
						+ entry.getValue().companyResponse + " " + entry.getValue().timelyResponse + " "
						+ entry.getValue().customerDispute);
			}
		}
	}

	public ComplaintDetailsExtractor() {
		super();
	}

}
