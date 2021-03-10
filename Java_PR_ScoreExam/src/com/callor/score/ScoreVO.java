package com.callor.score;

public class ScoreVO {
	
	private String sNum;
	private int kor;
	private int eng;
	private int meth;
	private int music;
	
	private int total;
	private float avg;
	
	
	
	
	public ScoreVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public ScoreVO(String sNum, int kor, int eng, int meth, int music, int total, float avg) {
		super();
		this.sNum = sNum;
		this.kor = kor;
		this.eng = eng;
		this.meth = meth;
		this.music = music;
		this.total = total;
		this.avg = avg;
	}
	

	public String getsNum() {
		return sNum;
	}
	public void setsNum(String sNum) {
		this.sNum = sNum;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMeth() {
		return meth;
	}
	public void setMeth(int meth) {
		this.meth = meth;
	}
	public int getMusic() {
		return music;
	}
	public void setMusic(int music) {
		this.music = music;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "ScoreVO [sNum=" + sNum + ", kor=" + kor + ", eng=" + eng + ", meth=" + meth + ", music=" + music
				+ ", total=" + total + ", avg=" + avg + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
