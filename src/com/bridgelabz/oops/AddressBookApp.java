package com.bridgelabz.oops;

import java.io.IOException;

import com.bridgelabz.util.OopsUtility;

public class AddressBookApp {
	
		public static void main(String[] args) throws IOException {
			AddressBookManager addBookMan = new AddressBookManager();
			do {
				System.out.println("Enter your choice");
				System.out.println("1:Create Book  2:Open Book  3:Save Book  4:Save As  5:Close Book  6:Quit");
				int choice = OopsUtility.intValue();
				switch (choice) {
				case 1:
					addBookMan.createBook();
					break;
				case 2:
					addBookMan.openBook();
					break;
				case 3:
					addBookMan.saveBook();
					break;
				case 4:
					addBookMan.saveAsBook();
					//isRunning=true;
					break;
				case 5:
					addBookMan.close();
					//isRunning=true;
					break;
				case 6:
					System.out.println("Quit");
					addBookMan = null;
					break;

				}
			}while(addBookMan != null);
			System.out.println("You have exited");

		}
	}

