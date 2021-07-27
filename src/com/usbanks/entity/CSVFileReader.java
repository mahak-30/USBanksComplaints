package com.usbanks.entity;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class CSVFileReader {

	public HashMap<String, ComplaintDetails> BankComplaintObject = new HashMap<>();

	public void Reader() {
		String pathToFile = "C:/Users/DELL/Downloads/complaints.csv";
		String line = "";
		try {
			BufferedReader bf = new BufferedReader(new FileReader(pathToFile));
			while ((line = bf.readLine()) != null) {
				String[] attributes = line.split(",");
				ComplaintDetails complaintObject = new ComplaintDetails();
				complaintObject.dateReceived = attributes[0];
				complaintObject.product = attributes[1];
				complaintObject.subProduct = attributes[2];
				complaintObject.issue = attributes[3];
				complaintObject.subIssue = attributes[4];
				complaintObject.company = attributes[5];
				complaintObject.state = attributes[6];
				complaintObject.zipCode = attributes[7];
				complaintObject.submittedVia = attributes[8];
				complaintObject.dateSentToCompany = attributes[9];
				complaintObject.companyResponse = attributes[10];
				complaintObject.timelyResponse = attributes[11];
				complaintObject.customerDispute = attributes[12];
				BankComplaintObject.put(attributes[13], complaintObject);
			}
			bf.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	HashMap<String, ComplaintDetails> getBankComplaintObject() {

		return BankComplaintObject;
	}
	
//	public void add(String complaintID, ComplaintDetails complaint)
//	{
//		BankComplaintObject.put(complaintID, complaint);
//	}

	
}
