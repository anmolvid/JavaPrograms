package com.bridgelabz.oops;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.OopsUtility;

public class StockPortfolio {
	static List<Stock> listOfStock = new ArrayList<>();
	static String stockFile = "/home/admin1/Documents/MyPrograms/JavaPrograms/src/com/bridgelabz/oops/stock.json";

	public static void addStock() throws IOException {
		String string = OopsUtility.readJsonFile(stockFile);
		try {
			listOfStock = OopsUtility.userReadValue(string, Stock.class);
			System.out.println("File is not empty!");
		} catch (Exception e) {
			System.out.println("File is empty!");
		}
		Stock stock = new Stock();
		System.out.println("Enter the stock name");
		stock.setStockName(OopsUtility.StringValue());
		System.out.println("Enter the number of stock");
		stock.setNoOfShares(OopsUtility.intValue());
		System.out.println("Enter the price for per share");
		stock.setSharePrice(OopsUtility.floatValue());
		listOfStock.add(stock);
		String json = OopsUtility.userWriteValueAsString(listOfStock);
		OopsUtility.writeFile(json, stockFile);
	}

	public static void valueOfEachShare() throws IOException {
		String string = OopsUtility.readJsonFile(stockFile);
		float valueOfEachShare;
		try {
			listOfStock = OopsUtility.userReadValue(string, Stock.class);
			System.out.println("File is not empty!");
			for (Stock stock : listOfStock) {
				System.out.println("Stock Name: " + stock.getStockName());
				valueOfEachShare = stock.getNoOfShares() * stock.getSharePrice();
				System.out.println("Value of each stock: " + valueOfEachShare);
				System.out.println("----------------------------------------");
			}
		} catch (Exception e) {
			System.out.println("File is empty!");
		}
	}

	public static void valueOfTotalStocks() throws IOException {
		String string = OopsUtility.readJsonFile(stockFile);
		double totalStockValue = 0;
		try {
			listOfStock = OopsUtility.userReadValue(string, Stock.class);
			System.out.println("File is not empty!");
			for (Stock stock : listOfStock) {
				totalStockValue += (stock.getNoOfShares() * stock.getSharePrice());
			}
			System.out.println("Value of Total Stock: " + totalStockValue);
		} catch (Exception e) {
			System.out.println("File is empty!");
		}
	}

	public static void displayStockDetails() throws IOException {
		String string = OopsUtility.readJsonFile(stockFile);
		try {
			listOfStock = OopsUtility.userReadValue(string, Stock.class);
			System.out.println("File is not empty!");
			for (Stock stock : listOfStock) {
				System.out.println("Stock Name: " + stock.getStockName());
				System.out.println("Number of Shares: " + stock.getNoOfShares());
				System.out.println("Share price :" + stock.getSharePrice());
				System.out.println("------------------------------------");
			}
		} catch (Exception e) {
			System.out.println("File is empty!");
		}
	}

	public static int noOfShares() throws IOException {
		String string = OopsUtility.readJsonFile(stockFile);
		int sum = 0;
		try {
			listOfStock = OopsUtility.userReadValue(string, Stock.class);
			System.out.println("File is not empty!");
			for (Stock stock : listOfStock) {
				sum += stock.getNoOfShares();
			}
			return sum;
		} catch (Exception e) {
			System.out.println("File is empty!");
			return 0;
		}
	}
}

