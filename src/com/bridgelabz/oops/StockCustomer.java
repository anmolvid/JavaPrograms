package com.bridgelabz.oops;

public class StockCustomer {
	private String stockname;
	private int noOfShares;
	private float sharePrice;
	private Transaction transaction;
	public String getStockname() {
		return stockname;
	}
	public void setStockname(String stockname) {
		this.stockname = stockname;
	}
	public int getNoOfShares() {
		return noOfShares;
	}
	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}
	public float getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(float sharePrice) {
		this.sharePrice = sharePrice;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	

}
