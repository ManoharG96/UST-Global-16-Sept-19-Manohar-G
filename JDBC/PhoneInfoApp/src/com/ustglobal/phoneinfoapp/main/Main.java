package com.ustglobal.phoneinfoapp.main;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.phoneinfoapp.dao.PhoneInfoBean;
import com.ustglobal.phoneinfoapp.dto.PhoneInfoDAO;
import com.ustglobal.phoneinfoapp.util.PhoneInfoManager;

public class Main {
	public static void main(String[] args) {
		System.out.println("Press 1 to get all contact info");
		System.out.println("Press 2 to search contact using name");
		System.out.println("Press 3 to operate on contact");

		Scanner scn = new Scanner(System.in);
		int ch = scn.nextInt();

		PhoneInfoDAO dao = PhoneInfoManager.getEmployeeDAO();

		switch (ch) {
		case 1:
			List <PhoneInfoBean> result= dao.getContactInfo();
			for (PhoneInfoBean bean : result) {
				System.out.println("Name: "+bean.getName());
				System.out.println("Number: "+bean.getNumber());
				System.out.println("Group: "+bean.getGroup());
				System.out.println();	
			}
			break;

		case 2:
			System.out.println("enter the contact name");
			Scanner scn8 = new Scanner(System.in);
			String ch3 = scn8.next();
			PhoneInfoBean result1= dao.serachContactinfo(ch3);
			if ( result1!= null) {
				System.out.println("Name: "+result1.getName());
				System.out.println("Number: "+result1.getNumber());
				System.out.println("Group: "+result1.getGroup());
				System.out.println();	
			}

			System.out.println("Press 1 to call");
			System.out.println("Press 2 to message");

			Scanner scn1 = new Scanner(System.in);
			int ch1 = scn1.nextInt();


			switch (ch1) {
			case 1:
				System.out.println("calling the contact");
				System.out.println("do you want to end the call : y or n");
				Scanner scn2 = new Scanner(System.in);
				char ch2 = scn2.next().charAt(0);
				if (ch2 == 'y') {
					System.out.println("Ending the call");
				}else {
					System.out.println("Cont...");
				}

				break;

			case 2:
				System.out.println("enter the message");
				Scanner scn3 = new Scanner(System.in);
				String ch5 = scn3.next();
				System.out.println(ch5+ " sending..");

				break;
			}

		case 3:
			System.out.println("Press 1 to add contact");
			System.out.println("Press 2 to delete contact");
			System.out.println("Press 3 to edit contact");

			Scanner scn4 = new Scanner(System.in);
			int ch4 = scn4.nextInt();

			switch (ch4) {

			case 1:
				System.out.println("Enter the name, number and group");
				Scanner scn5 = new Scanner(System.in);
				String name = scn5.next();
				double number= scn5.nextDouble();
				String group = scn5.next();
				int count = dao.insertContactInfo(name, number, group);
				System.out.println("contact add "+count);
				break;

			case 2:

				System.out.println("Enter to name to delete the contact");
				Scanner scn7 = new Scanner(System.in);
				String name2 = scn7.next();
				int count2 = dao.deleteContactInfo(name2);
				System.out.println("contact deleted "+count2);
				break;



			case 3:
				System.out.println("Enter to update their number, group and name");
				Scanner scn6 = new Scanner(System.in);

				double number10= scn6.nextDouble();
				String group10 = scn6.next();
				String name10= scn6.next();


				int count1 = dao.updateContactInfo(number10, group10, name10);
				System.out.println("contact updated "+count1);
				break;

			}

		}
	}
}
