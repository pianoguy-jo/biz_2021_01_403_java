package com.callor.oop.medel;

/*
 * 쇼핑카트에 필요한 데이터 항목들
 * 구매자
 * 상품명
 * 규격
 * 날자 
 * 시각
 * 수량
 * 구매단가
 * 구매금액
 */

public class CartVO {
	
	
	// 인슨턴스 변수의 인닉
	private String cartUserName;//구매자
	private String catrPName;//상품명
	private String cartStd; //규격
	private String cartDate;//날짜
	private String catrTime;//시간
	private int cartQty;//수량
	private int cartPrice;//가격
	private int cartTotal;//합계
	public String getCartUserName() {
		return cartUserName;
	}
	public void setCartUserName(String cartUserName) {
		this.cartUserName = cartUserName;
	}
	public String getCatrPName() {
		return catrPName;
	}
	public void setCatrPName(String catrPName) {
		this.catrPName = catrPName;
	}
	public String getCartStd() {
		return cartStd;
	}
	public void setCartStd(String cartStd) {
		this.cartStd = cartStd;
	}
	public String getCartDate() {
		return cartDate;
	}
	public void setCartDate(String cartDate) {
		this.cartDate = cartDate;
	}
	public String getCatrTime() {
		return catrTime;
	}
	public void setCatrTime(String catrTime) {
		this.catrTime = catrTime;
	}
	public int getQty() {
		return cartQty;
	}
	public void setQty(int qty) {
		cartQty = qty;
	}
	public int getCartPrice() {
		return cartPrice;
	}
	public void setCartPrice(int cartPrice) {
		this.cartPrice = cartPrice;
	}
	public int getCartTotal() {
		return cartTotal;
	}
	public void setCartTotal(int cartTotal) {
		this.cartTotal = cartTotal;
	}
	@Override
	public String toString() {
		return "CartVO [cartUserName=" + cartUserName + ", catrPName=" + catrPName + ", cartStd=" + cartStd
				+ ", cartDate=" + cartDate + ", catrTime=" + catrTime + ", Qty=" + cartQty + ", cartPrice=" + cartPrice
				+ ", cartTotal=" + cartTotal + "]";
	}
	
	
	
	
	// private으로 은닉된 인슨턴스 변수에 값을 저장, 읽기하기위한 용도의
	// getter(), setter() method 선언
	
	
}
