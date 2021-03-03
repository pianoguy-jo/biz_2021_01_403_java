package com.callor.shop.service;

public class CartVO1 {
	
	private String userName;//손님이름
	private String ProducName;//상품이름
	private String date;//추가날짜
	private String time;//추가시각
	private int qty;//수량
	private int price;//단가
	private int total;//합계
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProducName() {
		return ProducName;
	}
	public void setProducName(String producName) {
		ProducName = producName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
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
		return "CartVO [userName=" + userName + ", ProducName=" + ProducName + ", date=" + date + ", time=" + time
				+ ", qty=" + qty + ", price=" + price + ", total=" + total + "]";
	}
	
	

}
