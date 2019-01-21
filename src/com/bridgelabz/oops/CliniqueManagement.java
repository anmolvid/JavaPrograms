package com.bridgelabz.oops;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.bridgelabz.util.OopsUtility;

public class CliniqueManagement {

//	static List<Patient> listOfPatient = new ArrayList<Patient>();
	static List<Doctor> listOfDoctors = new ArrayList<Doctor>();
	static List<Appointment> listOfAppointment = new ArrayList<Appointment>();
	static String path = "/home/admin1/Documents/MyPrograms/JavaPrograms/src/com/bridgelabz/oops/Doctor.json";
	static String file = "/home/admin1/Documents/MyPrograms/JavaPrograms/src/com/bridgelabz/oops/Patient.json";
	static String app = "/home/admin1/Documents/MyPrograms/JavaPrograms/src/com/bridgelabz/oops/Appointment.json";

	// Add method

	public void add() throws IOException {
		System.out.println("enter choice");
		// CliniqueManagement cm = new CliniqueManagement();

		System.out.println("1.to add doctor  2.to add patient ");
		int option = OopsUtility.intValue();
		switch (option) {
		case 1:
			addDoctor();
			break;
		case 2:
			addpatient();
			break;
		}

	}

	public void addDoctor() throws IOException {
		String doc = OopsUtility.readJsonFile(path);
		try {
			listOfDoctors = OopsUtility.userReadValue(doc, Doctor.class);
			System.out.println("File is not empty");
		} catch (Exception e) {
			System.out.println("File is empty");
		}
		Doctor doctor = new Doctor();
		System.out.println("Enter the id of doctor");
		doctor.setId(OopsUtility.intValue());
		System.out.println("Enter name of the doctor");
		doctor.setDname(OopsUtility.StringValue());
		System.out.println("Enter the specialization of doctor ");
		doctor.setSpecialization(OopsUtility.StringValue());
		System.out.println("Enter the availability of doctor ");
		doctor.setAvailability(OopsUtility.StringValue());
		listOfDoctors.add(doctor);
		String str = OopsUtility.userWriteValueAsString(listOfDoctors);
		OopsUtility.writeFile(str, path);
		System.out.println("Doctor is successfully added");

	}

	public void addpatient() throws IOException {
		List<Patient> listOfPatient = new ArrayList<Patient>();
		String pat = OopsUtility.readJsonFile(file);
		try {
			listOfPatient = OopsUtility.userReadValue(pat, Patient.class);
			System.out.println("File is not empty");
		} catch (Exception e) {
			System.out.println("File is empty");
		}
		Patient patient = new Patient();
		System.out.println("Enter id of patient");
		patient.setPid(OopsUtility.intValue());
		System.out.println("Enter name of patient");
		patient.setPname(OopsUtility.StringValue());
		System.out.println("Enter age of patient");
		patient.setAge(OopsUtility.intValue());
		System.out.println("Enter phone number");
		patient.setPhoneno(OopsUtility.longValue());
		listOfPatient.add(patient);
		String string = OopsUtility.userWriteValueAsString(listOfPatient);
		OopsUtility.writeFile(string, file);
		System.out.println("Patient is successfully added");

	}

	// search Method

	public void search() throws IOException {
		System.out.println("enter choice");

		System.out.println("1.to search doctor  2.to search patient ");
		int op = OopsUtility.intValue();
		switch (op) {
		case 1:
			System.out.println("Enter choice ");
			System.out.println(
					"1. to search by id  2. to search by name  3.to search by specialization 4.to search by avalability");
			int option = OopsUtility.intValue();
			switch (option) {
			case 1:

				List<Doctor> list = searchById();
				if (!list.isEmpty())
					System.out.println("Doctor is present");
				else
					System.out.println("Doctor is not present");

			case 2:
				List<Doctor> list1 = searchByName();
				if (!list1.isEmpty())
					System.out.println("Doctor is present");
				else
					System.out.println("Doctor is not present");
				break;

			case 3:
				List<Doctor> list2 = searchBySpecialization();
				if (!list2.isEmpty())
					System.out.println("Doctor is present");
				else
					System.out.println("Doctor is not present");
				break;

			case 4:
				List<Doctor> list3 = searchByAvalability();
				if (!list3.isEmpty())
					System.out.println("Doctor is present");
				else
					System.out.println("Doctor is not present");
				break;
			}

		case 2:
			System.out.println("Enter choice");
			System.out.println("1. to search patient by id   2. to search patient by mobile number");
			int ch = OopsUtility.intValue();
			switch (ch) {
			case 1:
				Patient patient = searchpatById();
				if (patient != null)
					System.out.println("Patient is Present");
				else
					System.out.println("Patient is Not present");
				break;

			case 2:
				Patient patient1 = searchpatByNo();
				if (patient1 != null)
					System.out.println("Patient is Present");
				else
					System.out.println("Patient Not present");
				break;

			}
		}

	}

	public List<Doctor> searchByName() throws IOException {
		String d = OopsUtility.readJsonFile(path);
		try {
			listOfDoctors = OopsUtility.userReadValue(d, Doctor.class);
			System.out.println("File is not empty");
			System.out.println("Enter the name of Doctor you want to search");
			String name = OopsUtility.StringValue();
			List<Doctor> doc = new ArrayList<Doctor>();

			for (Doctor dd : listOfDoctors) {
				if (name.equals(dd.getDname())) {
					doc.add(dd);
				}
			}
			return doc;

		} catch (Exception e) {
			System.out.println("File is empty");
			return null;
		}

	}

	public List<Doctor> searchById() throws IOException {
		String d = OopsUtility.readJsonFile(path);
		try {
			listOfDoctors = OopsUtility.userReadValue(d, Doctor.class);
			System.out.println("File is not empty");
			System.out.println("Enter the id of Doctor you want to search");
			int id = OopsUtility.intValue();
			List<Doctor> doc = new ArrayList<Doctor>();

			for (Doctor dd : listOfDoctors) {
				if (id == (dd.getId())) {
					System.out.println("Doctor of id " + dd.getId() + " is present");
					doc.add(dd);
				}
			}
			return doc;

		} catch (Exception e) {
			System.out.println("File is empty");
			return null;
		}

	}

	public List<Doctor> searchBySpecialization() throws IOException {
		String d = OopsUtility.readJsonFile(path);
		try {
			listOfDoctors = OopsUtility.userReadValue(d, Doctor.class);
			System.out.println("File is not empty");
			System.out.println("Enter the specialization of Doctor you want to search");
			String sp = OopsUtility.StringValue();
			// List<Doctor> doc = new ArrayList<Doctor>();
			List<Doctor> doc = new ArrayList<Doctor>();
			for (Doctor p : listOfDoctors) {
				if (sp.equals(p.getSpecialization())) {
					doc.add(p);
				}
			}
			return doc;

		} catch (Exception e) {
			System.out.println("File is empty");
			return null;
		}

	}

	public List<Doctor> searchByAvalability() throws IOException {
		String d = OopsUtility.readJsonFile(path);
		try {
			listOfDoctors = OopsUtility.userReadValue(d, Doctor.class);
			System.out.println("File is not empty");
			System.out.println("Enter the avalability of Doctor you want to search");
			String sp = OopsUtility.StringValue();

			List<Doctor> ava = new ArrayList<Doctor>();
			for (Doctor a : listOfDoctors) {
				if (sp.equals(a.getAvailability())) {
					ava.add(a);
				}
			}
			return ava;

		} catch (Exception e) {
			System.out.println("File is empty");
			return null;
		}

	}

	public Patient searchpatById() throws IOException {
		String d = OopsUtility.readJsonFile(file);
		List<Patient> listOfPatient = new ArrayList<Patient>();

		listOfPatient = OopsUtility.userReadValue(d, Patient.class);

		System.out.println("Enter the id of Patient you want to search");
		int idP = OopsUtility.intValue();

		for (Patient pp : listOfPatient) {
			if (idP == (pp.getPid())) {
				// System.out.println("Patient of id " + pp.getPid() + " is present");
				return pp;
			} else {
				System.out.println("");
			}
		}
		return null;

	}

	public Patient searchpatByNo() throws IOException {
		String d = OopsUtility.readJsonFile(file);
		List<Patient> listOfPatient = new ArrayList<Patient>();

		listOfPatient = OopsUtility.userReadValue(d, Patient.class);

		System.out.println("Enter the mobile no of Patient you want to search");
		long no = OopsUtility.longValue();

		for (Patient pp : listOfPatient) {
			if (no == (pp.getPhoneno())) {

				return pp;
			}
		}
		return null;
	}

	///// Appointment

	public void takeAppointment() throws IOException {
		String string = OopsUtility.readJsonFile(app);
		try {
			listOfAppointment = OopsUtility.userReadValue(string, Appointment.class);
			System.out.println("File is not empty");

		} catch (Exception e) {
			System.out.println("File is empty");
		}
		Patient patient = searchpatByNo();
		if (patient != null) {
			operation(patient);
		} else {
			addpatient();
			Patient patient2 = searchpatByNo();
			operation(patient2);
		}
		String json = OopsUtility.userWriteValueAsString(listOfAppointment);
		OopsUtility.writeFile(json, app);

	}

	//// Display

	public static void displayList(List<Doctor> docList) {
		for (Doctor doctor : docList) {
			System.out.println("Doctor's ID: " + doctor.getId());
			System.out.println("Doctor's name: " + doctor.getDname());
			System.out.println("Doctor's specialization: " + doctor.getSpecialization());
			System.out.println("Doctor's availability: " + doctor.getAvailability());
		}
	}

	public static void searchDoc(List<Doctor> doctorList, Patient patient) {
		System.out.println("Enter id");
//		Appointment appointment = null;
//		List<Patient> patientAppointmentList = appointment.getListOfPatients();
		int id = OopsUtility.intValue();
		int flag = 0;
		try {
			for (Doctor doctor : doctorList) {
				if (id == doctor.getId()) {
					for (Appointment app : listOfAppointment) {
						if (doctor.getDname().equals(app.getDoc_name())) {
							List<Patient> patientAppointmentList = app.getListOfPatients();
							if (patientAppointmentList.size() < 5) {
								for (Patient patient2 : patientAppointmentList) {
									if (patient.getPid() == patient2.getPid()) {
										System.out.println("You have an appointment already");
										flag = 1;
										break;
									} else {
										patientAppointmentList.add(patient);
										app.setListOfPatients(patientAppointmentList);
										System.out.println("Appointment is set");
										flag = 1;
										break;
									}
								}

							} else {
								System.out.println("Appointment is full");
								flag = 1;
								break;
							}
						}
					}

					if (flag == 0) {
						Appointment appointment2 = new Appointment();
						List<Patient> patientList1 = new ArrayList<Patient>();
						patientList1.add(patient);
						appointment2.setDoc_name(doctor.getDname());
						appointment2.setListOfPatients(patientList1);
						listOfAppointment.add(appointment2);
						System.out.println("Appointment is set");
					}

				}
			}

		} catch (Exception e) {
			System.out.println("Enter the correct id");
		}
	}

	public void operation(Patient patient) throws IOException {
		System.out.println("Search doctor by- 1:Name 2:Speciality 3:Availability");
		int choice = OopsUtility.intValue();
		switch (choice) {
		case 1:
			List<Doctor> doctorList = searchByName();
			displayList(doctorList);
			searchDoc(doctorList, patient);
			break;
		case 2:
			List<Doctor> doctorList1 = searchBySpecialization();
			displayList(doctorList1);
			searchDoc(doctorList1, patient);
			break;
		case 3:
			List<Doctor> doctorList2 = searchByAvalability();
			displayList(doctorList2);
			searchDoc(doctorList2, patient);
			break;
		}
	}

	/// Famous doctor

	public static void famousDoctor() throws IOException {
		String string = OopsUtility.readJsonFile(app);
		Map<String, Integer> map = new HashMap<>();
		try {
			listOfAppointment = OopsUtility.userReadValue(string, Appointment.class);
			for (int i = 0; i < listOfAppointment.size(); i++) {
				Appointment appointment = listOfAppointment.get(i);
				String doctorName = appointment.getDoc_name();
				Integer numberOfAppointments = appointment.getListOfPatients().size();
				map.put(doctorName, numberOfAppointments);
			}
			int maxValue = Collections.max(map.values());
			for (Entry<String, Integer> entry : map.entrySet()) {
				if (entry.getValue() == maxValue) {
					System.out.println(

							"Famous Doctor Name: " + entry.getKey() + " ---> No of appointments: " + entry.getValue());
				}
			}
		} catch (Exception e) {
			System.out.println("No list of appointments! Can't search for famous doctors");
		}
	}

	public static void famousSpecialist() throws IOException {
		String string = OopsUtility.readJsonFile(path);
		List<String> list = new ArrayList<>();
		try {
			listOfDoctors = OopsUtility.userReadValue(string, Doctor.class);
			for (Doctor doctor : listOfDoctors) {
				for (Doctor doctor1 : listOfDoctors) {
					if (doctor.getSpecialization().equals(doctor1.getSpecialization())) {
						list.add(doctor.getSpecialization());
					}
				}
			}
			int max = 0;
			int curr = 0;
			String currKey = null;
			Set<String> unique = new HashSet<String>(list);
			for (String key : unique) {
				curr = Collections.frequency(list, key);
				if (max < curr) {
					max = curr;
					currKey = key;
				}
			}
			System.out.println("Specialization  " + currKey + " is famours");
		} catch (Exception e) {
			System.out.println("There are no doctors in the system");
		}
	}

}
