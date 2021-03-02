package com.callor.oop.model;

/*
 * 카트 정보를 담아 App에서 사용할 Value Objact 클래스
 * 
 * 구매자, 상품명, 구격, 날짜, 시각, 수량, 구매단가, 구매금액
 * 
 * 객체 추상화 캡슐
 */

public class CartVO {
	
	private String userName;
	private String productName;
	private String standard;
	private String Date;
	private String Time;
	
	private int qty;
	private int price;
	private int total;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "CartVO [userName=" + userName + ", productName=" + productName + ", standard=" + standard + ", Date="
				+ Date + ", Time=" + Time + ", qty=" + qty + ", price=" + price + ", total=" + total + "]";
	}
	
	
}
