package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.GenericLinkedList;
import com.bridgelabz.util.OopsUtility;
import com.bridgelabz.util.Queue;
import com.bridgelabz.util.StackLinkedList;

public class StockAccount {
	static String stocks_acc;
	static String path = "/home/admin1/Documents/MyPrograms/JavaPrograms/";
	// private AddressBook addressBook = new AddressBook();
	// ObjectMapper objectMapper = new ObjectMapper();
	static List<StockCustomer> listOfCustomer = new ArrayList<StockCustomer>();
	static GenericLinkedList<String> list = new GenericLinkedList<String>();
	static StackLinkedList<String> slist = new StackLinkedList<String>();
	static StackLinkedList<String> templist = new StackLinkedList<String>();
	
	static Queue<String> queue = new Queue<String>();

	public static void createAccount() throws IOException {

		System.out.println("Enter your name");
		String name = OopsUtility.StringValue();
		File file = new File(path + name + ".json");
		boolean rs = file.createNewFile();
		if (rs) {
			System.out.println("account is created");
		} else {
			System.out.println("account of that name already exists");
		}
	}

	public static void openAccount() throws IOException {
		System.out.println("accounts avalabile are :");
		File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();
		for (File file : arrayOfFiles) {
			if (file.getName().endsWith(".json"))
				System.out.println(file.getName());
		}
		System.out.println("Choose the account");
		stocks_acc = OopsUtility.StringValue();

		for (File file : arrayOfFiles) {
			String filename = file.getName();
			if (stocks_acc.equals(filename)) {
				if (file.length() > 0) {
					System.out.println("Account is not empty");
					String string = OopsUtility.readJsonFile(filename);
					listOfCustomer = OopsUtility.userReadValue(string, StockCustomer.class);
					stockOptions();
				} else {
					System.out.println("Account is empty");

					stockOptions();
				}
			}
		}
	}

	public static void buyStocks() throws IOException {
		System.out.println("These are the stocks available");
		StockPortfolio.displayStockDetails();
		System.out.println("Enter the stock you want to buy ");
		String s_name = OopsUtility.StringValue();
		System.out.println("Enter the no of shares you want to buy ");
		int shares = OopsUtility.intValue();
		String s1 = OopsUtility.readJsonFile(path + stocks_acc);
		String s2 = OopsUtility.readJsonFile(StockPortfolio.stockFile);
		StockPortfolio.listOfStock = OopsUtility.userReadValue(s2, Stock.class);
		try {
			listOfCustomer = OopsUtility.userReadValue(s1, StockCustomer.class);
			StockCustomer s_Customer = addData(s_name, shares);
			listOfCustomer.add(s_Customer);
		} catch (Exception e) {
			StockCustomer s_Customer = addData(s_name, shares);
			listOfCustomer.add(s_Customer);
		}
		String json=OopsUtility.userWriteValueAsString(StockPortfolio.listOfStock);
		OopsUtility.writeFile(json, StockPortfolio.stockFile);
	}

	public static StockCustomer addData(String stockName, int no_Stocks) {
		for (Stock s : StockPortfolio.listOfStock) {
			if (stockName.equals(s.getStockName())) {
				int newno = (s.getNoOfShares() - no_Stocks);
				s.setNoOfShares(newno);
				StockCustomer st = new StockCustomer();
				st.setStockname(stockName);
				st.setNoOfShares(no_Stocks);
				st.setSharePrice(s.getSharePrice());
				Transaction transaction = new Transaction();
				String date = getDate();
				transaction.setDate(date);
				transaction.setTransactionStatus("purchase");
				st.setTransaction(transaction);
				return st;
			}

		}
		return null;

	}

	public static String getDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String date = dtf.format(now);
		return date;
	}

	public static void sellStock() throws IOException {
		acc_Display();
		System.out.println("Enter the name of stock you want to sell ");
		String name1 = OopsUtility.StringValue();
		System.out.println("Enter the no of stock you want to sell ");
		int no = OopsUtility.intValue();
		String s1 = OopsUtility.readJsonFile(path + stocks_acc);
		String s2=OopsUtility.readJsonFile(StockPortfolio.stockFile);
		StockPortfolio.listOfStock=OopsUtility.userReadValue(s2, Stock.class);
		try {
			listOfCustomer = OopsUtility.userReadValue(s1, StockCustomer.class);
			StockCustomer s_Customer = updateStock(name1, no);
			listOfCustomer.add(s_Customer);
			update(name1, no);
		} catch (Exception e) {
			System.out.println("Buy stock before selling!");
		}
		String json = OopsUtility.userWriteValueAsString(StockPortfolio.listOfStock);
		OopsUtility.writeFile(json, StockPortfolio.stockFile);
	}

	public static void update(String s_name, int s_num) {
		for (Stock stock : StockPortfolio.listOfStock) {
			if (s_name.equals(stock.getStockName())) {

				int newno = stock.getNoOfShares() + s_num;
				stock.setNoOfShares(newno);

			}
		}

	}

	public static StockCustomer updateStock(String name2, int num) {
		for (StockCustomer sc : listOfCustomer) {
			if (name2.equals(sc.getStockname())) {
				StockCustomer customer = new StockCustomer();
				customer.setStockname(name2);

				customer.setNoOfShares(num);
				customer.setSharePrice(sc.getSharePrice());
				Transaction transaction = new Transaction();
				String date = getDate();
				transaction.setDate(date);
				transaction.setTransactionStatus("sold");
				customer.setTransaction(transaction);
				return customer;
				// sc.setNoOfShares(num);

			}
		}
		return null;
	}

	public static void save() {
		System.out.println("Saving " + stocks_acc + " address book");
		File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();
		for (File file : arrayOfFiles) {
			String filename = file.getName();
			if (stocks_acc.equals(filename)) {
				try {
					String json = OopsUtility.userWriteValueAsString(listOfCustomer);
					OopsUtility.writeFile(json, filename);
					System.out.println(" details saved");
				} catch (Exception e) {
					System.out.println("Cannot write to file");
				}
			}
		}
	}

	public static void acc_Display() {
		System.out.println("Displaying " + stocks_acc + " stock accounts ");
		File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();

		for (File file : arrayOfFiles) {
			String filename = file.getName();
			if (stocks_acc.equals(filename)) {
				try {
					System.out.println("Displaying......");
					for (StockCustomer c : listOfCustomer) {
						System.out.println("Name of stock " + c.getStockname());
						System.out.println("Number of shares " + c.getNoOfShares());

						System.out.println("Transaction Date " + c.getTransaction().getDate());
						System.out.println("Transaction Status " + c.getTransaction().getTransactionStatus());
					}
				} catch (Exception e) {
					System.out.println("File is empty! ");
				}
			}
		}
	}

	public static void addreport() throws IOException {
		String string = OopsUtility.readJsonFile(path + stocks_acc);
		try {
			listOfCustomer = OopsUtility.userReadValue(string, StockCustomer.class);
			for (StockCustomer customer : listOfCustomer) {
				list.add(customer.getStockname());
				queue.insert(customer.getTransaction().getDate());
				slist.push(customer.getTransaction().getTransactionStatus());
			}
		} catch (Exception e) {
			System.out.println("File is empty");
		}
	}

	public static void printReport() throws IOException {
		addreport();
		System.out.println("----------Stock details---------");
		System.out.println("Stock name: ");
		list.getLinkedList();
		System.out.println();
		System.out.print("Date ");
		for (int i = 0; i < queue.getSize(); i++) {
			System.out.print(queue.remove() + "\t");
		}
		System.out.println();
		while (!slist.isEmpty()) {
			templist.push(slist.pop());
		}
		System.out.print("Status  ");
		while (!templist.isEmpty()) {
			System.out.print(templist.pop() + "\t\t\t");
		}
	}

	public static void stockOptions() throws IOException {

		int run = 0;
		do {
			System.out.println("Enter the choice  1.Buy Stock 2. Sell Stock 3. Save 4.Print");
			int choice = OopsUtility.intValue();
			switch (choice) {
			case 1:
				buyStocks();
				break;
			case 2:
				sellStock();
				break;
			case 3:
				save();
				break;
			case 4:
				printReport();
				break;
			case 5:
				StockAccountManagement.main(null);
				break;
			default:
				System.out.println("Please select correct choice");
				break;
			}
		} while (run < 1);
	}
}
