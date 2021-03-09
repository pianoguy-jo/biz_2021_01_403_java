package com.com.iolist;

public class Loo9VO {
	
	private String date; // 거래일자
	private String proName; // 상품명
	private String corrName;//거래처
	private String ceoName;//대표자
	private int diviNum;//구분
	private int iPrice;//매입단가
	private int uPrice;//매출단가
	private int qty;// 수량
	private int totalIPrice;//매입금액
	private int totalUPrice;//판매금액
	
	
	public Loo9VO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Loo9VO(String date, String proName, String corrName, String ceoName, int diviNum, int iPrice, int uPrice,
			int qty, int totalIPrice, int totalUPrice) {
		super();
		this.date = date;
		this.proName = proName;
		this.corrName = corrName;
		this.ceoName = ceoName;
		this.diviNum = diviNum;
		this.iPrice = iPrice;
		this.uPrice = uPrice;
		this.qty = qty;
		this.totalIPrice = totalIPrice;
		this.totalUPrice = totalUPrice;
	}



	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getCorrName() {
		return corrName;
	}
	public void setCorrName(String corrName) {
		this.corrName = corrName;
	}
	public String getCeoName() {
		return ceoName;
	}
	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}
	public int getDiviNum() {
		return diviNum;
	}
	public void setDiviNum(int diviNum) {
		this.diviNum = diviNum;
	}
	public int getiPrice() {
		return iPrice;
	}
	public void setiPrice(int iPrice) {
		this.iPrice = iPrice;
	}
	public int getuPrice() {
		return uPrice;
	}
	public void setuPrice(int uPrice) {
		this.uPrice = uPrice;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getTotalIPrice() {
		return totalIPrice;
	}
	public void setTotalIPrice(int totalIPrice) {
		this.totalIPrice = totalIPrice;
	}
	public int getTotalUPrice() {
		return totalUPrice;
	}
	public void setTotalUPrice(int totalUPrice) {
		this.totalUPrice = totalUPrice;
	}
	@Override
	public String toString() {
		return "Loo9VO [date=" + date + ", proName=" + proName + ", corrName=" + corrName + ", ceoName=" + ceoName
				+ ", diviNum=" + diviNum + ", iPrice=" + iPrice + ", uPrice=" + uPrice + ", qty=" + qty
				+ ", totalIPrice=" + totalIPrice + ", totalUPrice=" + totalUPrice + "]";
	}
	
	

}
