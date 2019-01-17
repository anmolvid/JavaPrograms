package com.bridgelabz.oops;

import java.io.IOException;
import java.util.List;

import com.bridgelabz.util.OopsUtility;

public class CliniqueManagementApp {

	public static void main(String[] args) throws IOException {
       
		int i=100;
		//boolean run=true;
		do {
		System.out.println("Enter your choice");
		System.out.println("1.add 2.search 3.To take appointment  4.Famous doctor 5.Famous Specialist 6.quit");
		CliniqueManagement cm = new CliniqueManagement();
		int choice = OopsUtility.intValue();
		switch (choice) {
		case 1:
			cm.add();
			//run=true;
			break;
		case 2:
			cm.search();
			//run=true;
			break;
			
		case 3:
			cm.takeAppointment();
			//run=true;
			break;
			
		case 4:
			
			cm.famousDoctor();
			//run=true;
			break;
			
		case 5:
			cm.famousSpecialist();
			//run=true;
			break;
			
		case 6:
			//run=false;
			System.exit(0);
			}
		}while(i<=100);
	}
}


