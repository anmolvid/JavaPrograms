package com.bridgelabz.oops;

import java.io.IOException;

import com.bridgelabz.util.OopsUtility;

public class StockPortfolioApp {
	public static void main(String[] args) throws IOException {
//		boolean isRunning = true;
//		while (isRunning) {
		int flag=0;
		do {
			System.out.println("Enter-- 1:Add Stock  2:Calculate each stock value  3:Calculate value of total stocks  4:Display   ");
			int choice = OopsUtility.intValue();
			switch (choice) {
			case 1:
				StockPortfolio.addStock();
				
				break;
			case 2:
				StockPortfolio.valueOfEachShare();
				
				break;
			case 3:
				StockPortfolio.valueOfTotalStocks();
				
				break;
			case 4:
				StockPortfolio.displayStockDetails();
				
				break;
				
			

			default:
				System.out.println("Invalid choice");
				
				break;
			}
		}while(flag<1);
	}
}


