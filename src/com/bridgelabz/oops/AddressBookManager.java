package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.util.OopsUtility;

public class AddressBookManager {

	static String ch_book;
	static String path="/home/admin1/Documents/MyPrograms/JavaPrograms/";
	
	ObjectMapper objectMapper = new ObjectMapper();
	static List<Person> listOfPersons = new ArrayList<Person>();
	File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();

	public void createBook() throws IOException {
		System.out.println("Enter name of address book");
		String book = OopsUtility.StringValue();
		File file = new File(path + book + ".json");
		boolean rs = file.createNewFile();
		if (rs) {
			System.out.println("File is created");
		} else {
			System.out.println("File of that name already exists");
		}
	}

	public void openBook() throws IOException {
		System.out.println("Files available are:");
		for (File file : arrayOfFiles) {
			if (file.getName().endsWith(".json"))
				System.out.println(file.getName());
		}
		System.out.println("Choose the address book");
		ch_book = OopsUtility.StringValue();

		for (File file : arrayOfFiles) {
			String filename = file.getName();
			if (ch_book.equals(filename)) {
				if (file.length() > 0) {
					System.out.println("Address book is not empty");
					String string = OopsUtility.readJsonFile(filename);
					listOfPersons = objectMapper.readValue(string, new TypeReference<List<Person>>() {
					});
					
					addressBook();
				} else {
					System.out.println("Address Book is empty");
					System.out.println("Add new data onto the Address Book");
					addressBook();
				}
			}
		}
	}

	public void saveBook() {
		System.out.println("Saving " + ch_book + " address book");
		for (File file : arrayOfFiles) {
			String filename = file.getName();
			if (ch_book.equals(filename)) {
				try {
//					String json = objectMapper.writeValueAsString(AddressBook.getListOfPerson());
					String json = OopsUtility.userWriteValueAsString(listOfPersons);
					OopsUtility.writeFile(json, filename);
					System.out.println("Address book details saved");
				} catch (Exception e) {
					System.out.println("Cannot write to file");
				}
			}
		}
	}

	public void saveAsBook() throws IOException {
		System.out.println("Files available are:");
		for (File file : arrayOfFiles) {
			if (file.getName().endsWith(".json"))
				System.out.println(file.getName());
		}
		System.out.println("Choose the address book you want to save as with extention (.json)");
		String ch_book1 = OopsUtility.StringValue();
		File file = new File(path + ch_book1);
		boolean rs = file.createNewFile();
		if (rs) {
			System.out.println("File is created");
			String json = OopsUtility.userWriteValueAsString(listOfPersons);
			OopsUtility.writeFile(json, ch_book1);
			System.out.println("Address book details saved");
		} else {
			System.out.println("File of that name already exists");
		}
	}
 
	public void close() {
		
		listOfPersons = null;

	}

	public void addressBook() throws IOException {
		AddressBook ab = new AddressBook();
		
		do {
			System.out.println("Enter choice");
			System.out.println(
					"1:Add Person  2:Edit Person  3:Display Persons  4:Delete Person  5:Sort  6:Go Back to main ");
			int choice = OopsUtility.intValue();
			switch (choice) {
			case 1:
				ab.addPerson();
				
				break;
			case 2:
				ab.editPerson();
				
				break;
			case 3:
				ab.displayAddress();
				
				break;
			case 4:
				ab.deletePerson();
				
				break;
			case 5:
			     sorting();
			     break;
				


			case 6:
				AddressBookApp.main(null);
			default:
				System.out.println("Invalid choice");
				
				break;
			}
		}while(ab!=null);
	
	}
	
	
	private void sorting() {
	
		AddressBook ab = new AddressBook();

		System.out.println("Enter your choice");
		System.out.println("1:Sort by Last Name  2:Sort by Zip Code 3. Quit");
		int ch = OopsUtility.intValue();
		switch (ch) {
		case 1:
			System.out.println("Sorting by last name");
			ab.sortByLastName();
			System.out.println("Your list is sorted");
			break;
		case 2:
			System.out.println("Sorting by zip code");
			ab.sortByZipCode();
			System.out.println("Your list is sorted");
			break;
			
		case 3:
			System.out.println("Quit");
			ab = null;
			break;
			
		default:
			System.out.println("Invalid choice");
			
			break;
		}
	}
	
}

