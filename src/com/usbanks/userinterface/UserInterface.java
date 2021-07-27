package com.usbanks.userinterface;

import com.usbanks.entity.ComplaintDetailsExtractor;
import com.usbanks.entity.ComplaintDetails;
import com.usbanks.entity.CSVFileReader;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		ComplaintDetailsExtractor extract = new ComplaintDetailsExtractor();
		extract.loadData();

		int option;
		String ch = "Y";
		System.out.println("************************************************************************");
		System.out.println("**********************************MENU**********************************");
		System.out.println("************************************************************************");
		System.out.println("Enter 1 to display all the complaints based on the year");
		System.out.println("Enter 2 to display all the complaints based on the name of the bank");
		System.out.println("Enter 3 to display complaints based on the complaint id");
		System.out.println("Enter 4 to display number of days took by the bank to close a complaint");
		System.out.println("Enter 5 to display all the complaints closed/closed with explanation");
		System.out.println("Enter 6 to dispaly all the complaints which received a timely response");
		System.out.println("Enter 7 to store a new complaint");
		System.out.println("************************************************************************");
		System.out.println("Enter your choice: ");
		Scanner sc = new Scanner(System.in);
		option = sc.nextInt();
		switch (option) {
		case 1:
			String user_year;
			System.out.println("Enter the year");
			user_year = sc.next();
			extract.complaintsBasedOnYear(user_year);
			break;
		case 2:
			String user_bank = "";
			System.out.println("Enter the bank name");
			Scanner scan = new Scanner(System.in);
			user_bank += scan.nextLine();
			scan.close();
			// user_bank = sc.next();
			extract.complaintsBasedOnBankName(user_bank);
			break;
		case 3:
			String user_id;
			System.out.println("Enter the complaint ID");
			user_id = sc.next();
			extract.complaintsBasedOnComplaintID(user_id);
			break;
		case 4:
			extract.daysToCloseTheComplaint();
			break;
		case 5:
			extract.complaintsClosed();
			break;
		case 6:
			extract.complaintsReceivingTimelyResponse();
			break;
		case 7:
//			String dateReceived = "";
//			String product = "";
//			String subProduct = "";
//			String issue = "";
//			String subIssue = "";
//			String company = "";
//			String state = "";
//			String zipCode = "";
//			String submittedVia = "";
//			String dateSentToCompany = "";
//			String companyResponse = "";
//			String timelyResponse = "";
//			String customerDispute = "";
//			String complaintID = "";
//			Scanner scann = new Scanner(System.in);
//			dateReceived += scann.hasNext();
//			product += scann.hasNext();
//			subProduct += scann.hasNext();
//			issue += scann.hasNext();
//			subIssue += scann.hasNext();
//			company += scann.hasNext();
//			state += scann.hasNext();
//			zipCode += scann.hasNext();
//			submittedVia+=scann.hasNext();
//			dateSentToCompany += scann.hasNext();
//			companyResponse += scann.hasNext();
//			timelyResponse += scann.hasNext();
//			customerDispute += scann.hasNext();
//			complaintID += scann.hasNext();
//			ComplaintDetails newComplaint = new ComplaintDetails(dateReceived, product, subProduct, issue, subIssue,
//					company, state, zipCode,submittedVia, dateSentToCompany, companyResponse, timelyResponse, customerDispute);
//			CSVFileReader r=new CSVFileReader();
//			r.add(complaintID, newComplaint);
			break;
		default:
			System.out.println("Invalid option!");
			break;
		}
	}
}
