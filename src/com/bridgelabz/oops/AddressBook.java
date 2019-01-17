package com.bridgelabz.oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bridgelabz.util.OopsUtility;

public class AddressBook {
	static List<Person> listOfPerson = new ArrayList<Person>();

	public void addPerson() {
		Person person = new Person();
		System.out.println("Enter the first name");
		person.setFirstname(OopsUtility.StringValue());
		System.out.println("Enter last name");
		person.setLastname(OopsUtility.StringValue());
		System.out.println("Enter contact number");
		person.setContactno(OopsUtility.longValue());

		Address address = new Address();
		System.out.println("Enter street");
		address.setStreet(OopsUtility.StringValue());
		System.out.println("Enter city");
		address.setCity(OopsUtility.StringValue());
		System.out.println("Enter state");
		address.setState(OopsUtility.StringValue());
		System.out.println("Enter zipcode");
		address.setZipcode(OopsUtility.longValue());
		person.setAddress(address);
		listOfPerson.add(person);
	}

	public void editPerson() {
		System.out.println("Enter the first name of the person you want to edit");
		String fname = OopsUtility.StringValue();
		System.out.println("Enter the last name");
		String lname = OopsUtility.StringValue();
		for (Person p : listOfPerson) {
			if (fname.equals(p.getFirstname()) && lname.equals(p.getLastname())) {
				do {
				System.out.println("Enter option you want to edit");
				System.out.println("1. Contact No  2. Address  3.Quit");
				int option = OopsUtility.intValue();
					switch (option) {
					case 1:
						System.out.println("Enter new number");
						long newno = OopsUtility.longValue();
						p.setContactno(newno);
						System.out.println("Contact number got updated");
						break;
					case 2:
						System.out.println("Enter the option you want to edit");
						Address add = p.getAddress();
						addressUpdate(add);
						break;
						
					case 3:
						System.out.println("Quit");
						add = null;
						break;

					default:
						System.exit(0);
					}
				} while (p != null);

			} else {
				System.out.println("Person does not exit in the address book");
			}
		}
	}

	public void addressUpdate(Address add) {
		do {
		System.out.println("1. Street 2. City 3.State 4.Zipcode  5.Quit");
		int choice = OopsUtility.intValue();
			switch (choice) {
			case 1:
				System.out.println("enter street: ");
				String str = OopsUtility.StringValue();
				add.setStreet(str);
				System.out.println("Street got updated");
				break;

			case 2:
				System.out.println("enter city");
				String city = OopsUtility.StringValue();
				add.setCity(city);
				System.out.println("City got updated");
				break;

			case 3:
				System.out.println("enter the state");
				String st = OopsUtility.StringValue();
				add.setState(st);
				System.out.println("State got updated");
				break;

			case 4:
				System.out.println("enter the zipcode");
				long zp = OopsUtility.longValue();
				add.setZipcode(zp);
				System.out.println("zipcode got updated");
				break;
			case 5:
				System.out.println("Quit");
				add = null;
				break;

				

			default:
				System.exit(0);

			}
		} while (add != null);
		System.out.println("You have exited");
	}

	public void display() {
		for (Person per : listOfPerson) {
			System.out.println(" firstname: " + per.getFirstname());
			System.out.println(" Lastname: " + per.getLastname());
			System.out.println("Contact Number " + per.getContactno());
			Address add = per.getAddress();
			System.out.println(" Street " + add.getStreet());
			System.out.println("City:"
					+ "" + add.getCity());
			System.out.println("State " + add.getState());

		}

	}

	public void remove() {
		System.out.println("Enter the first name of the person you want to edit");
		String fname = OopsUtility.StringValue();
		System.out.println("Enter the last name");
		String lname = OopsUtility.StringValue();

		if (!listOfPerson.isEmpty()) {
			for (Person pp : listOfPerson) {

				if (fname.equals(pp.getFirstname()) && lname.equals(pp.getLastname())) {
					listOfPerson.remove(pp);
					System.out.println("Person got deleted");
				} else {
					System.out.println("Person doesnt exit ");
				}

			}

		}

		else {
			System.out.println("List is empty");
		}
	}

	public static List<Person> getListOfPerson() {
		return listOfPerson;
	}

	public static void setListOfPerson(List<Person> listOfPerson) {
		AddressBook.listOfPerson = listOfPerson;
	}

	public void sortByZipCode() {
		Collections.sort(listOfPerson,
				(person1, person2) -> person1.getAddress().getZipcode() > person2.getAddress().getZipcode() ? 1
						: person1.getAddress().getZipcode() < person2.getAddress().getZipcode() ? -1
								: person1.getAddress().getZipcode() == person2.getAddress().getZipcode() ? 0 : -10);
	}

	public void sortLastName() {
		Collections.sort(listOfPerson, (person1, person2) -> person1.getLastname().compareTo(person2.getLastname()));
	}

}
