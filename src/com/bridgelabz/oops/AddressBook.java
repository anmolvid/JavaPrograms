package com.bridgelabz.oops;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.bridgelabz.util.OopsUtility;

public class AddressBook {

    private static List<Person> persons = new ArrayList<Person>();

    public AddressBook() {}
   
    public AddressBook(List<Person> persons2) {
        persons = persons2;
    }

    public void addPerson() {
        Person person = new Person();
        System.out.println("Enter first name");
        person.setFirstname(OopsUtility.StringValue());
        System.out.println("Enter last name");
        person.setLastname(OopsUtility.StringValue());
        System.out.println("Enter phone number");
        person.setContactno(OopsUtility.longValue());
        person.setAddress(getAddress());
        persons.add(person);
    }

    public Address getAddress() {
        Address address = new Address();
        System.out.println("Enter street");
        address.setStreet(OopsUtility.StringValue());
        System.out.println("Enter city");
        address.setCity(OopsUtility.StringValue());
        System.out.println("Enter state");
        address.setState(OopsUtility.StringValue());
        System.out.println("Enter Zip Code");
        address.setZipcode(OopsUtility.longValue());
        return address;
    }

    public void editPerson() {
        System.out.println("Enter the first name of the person which has to be edited");
        String fName = OopsUtility.StringValue();
        System.out.println("Enter the last name of the person which has to be edited");
        String lName = OopsUtility.StringValue();
        Optional<Person> optional = persons.parallelStream()
                .filter(person -> fName.equals(person.getFirstname()) && lName.equals(person.getLastname())).findAny();
        if (optional.isPresent()) {
            editPerson(optional.get());
        } else {
            System.out.println("Entered first name and last name does not exist in address book");
        }
    }
   
    public void editPerson(Person existingPerson)
    {
        String reply= null;
        do {
            System.out.println("Whate do you want to edit");
            System.out.println("1.Phone Number 2.Address 3.Go Back");
            int choice1 = OopsUtility.intValue();
            switch (choice1) {
            case 1:
                System.out.println("Enter the phone number which has to be edited");
                existingPerson.setContactno(OopsUtility.longValue());
                System.out.println("Phone number updated");
                break;
            case 2:
                existingPerson.setAddress(editAddress(existingPerson));
                break;
            case 3:
                break;
            default:
                System.out.println("Please select correct choice");
                break;
            }
            System.out.println("Would you like to edit more details for the person? Yes/No");
            reply = OopsUtility.StringValue();
        } while (reply.equalsIgnoreCase("Yes"));       
    }

    public Address editAddress(Person existingPerson) {
        System.out.println("Editing address now");
        Address address = existingPerson.getAddress();
        String reply = null;
        do {
            System.out.println("1.Street\n2.City\n3.State\n4.Zip Code\n5.To go back");
            int choice2 = OopsUtility.intValue();
            switch (choice2) {
            case 1:
                System.out.println("Enter street which has to be edited");
                address.setStreet(OopsUtility.StringValue());
                break;
            case 2:
                System.out.println("Enter city which has to be edited");
                address.setCity(OopsUtility.StringValue());
                break;
            case 3:
                System.out.println("Enter state which has to be edited");
                address.setState(OopsUtility.StringValue());
                break;
            case 4:
                System.out.println("Enter Zip code which has to be edited");
                address.setZipcode(OopsUtility.longValue());
                break;
            case 5:
            default:
                System.out.println("Please select correct choice");
                break;
            }
            System.out.println("Would you like to edit more details for the person? Yes/No");
            reply = OopsUtility.StringValue();
        } while (reply.equalsIgnoreCase("Yes"));
        return address;
    }

    public void displayAddress() {
        if (!persons.isEmpty()) {
            persons.forEach(person -> {
                System.out.println("First name : " + person.getFirstname());
                System.out.println("Last name : " + person.getLastname());
                System.out.println("Phone number : " + person.getContactno());
                Address addr = person.getAddress();
                System.out.println("Address :\n");
                System.out.println("Street : " + addr.getStreet());
                System.out.println("City : " + addr.getCity());
                System.out.println("State : " + addr.getState());
                System.out.println("Zip Code : " + addr.getZipcode());
                System.out.println("--------------------------------------");
            });
        } else {
            System.out.println("Address book is empty");
        }
    }

    public void deletePerson() {
        System.out.println("Enter the first name of the person which has to be deleted");
        String fName = OopsUtility.StringValue();
        System.out.println("Enter the last name of the person which has to be deleted");
        String lName = OopsUtility.StringValue();
        if (!persons.isEmpty()) {
            boolean isDeleted = persons.removeIf(person -> fName.equals(person.getFirstname()) && lName.equals(person.getLastname()));
            if (!isDeleted) {
                System.out.println("Entered first name and last name does not exist in address book");
            }
        } else {
            System.out.println("Address book is empty");
        }
       
    }

    public void sortByLastName() {
        Collections.sort(persons, (person1, person2) -> person1.getLastname().compareTo(person2.getLastname()));
        System.out.println("Sorted by last Name");
    }

    public void sortByZipCode() {
        Collections.sort(persons,
                (person1, person2) -> person1.getAddress().getZipcode() > person2.getAddress().getZipcode() ? 1
                        : person1.getAddress().getZipcode() < person2.getAddress().getZipcode() ? -1
                                : 0);
        System.out.println("Sorted via Zip code");

    }
}



