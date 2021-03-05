package com.callor.shop.model;

public class ScoreVO {
	
	private String num;
	private int Kor;
	private int eng;
	private int math;
	private int music;
	private int history;
	
	private int total;
	private float Avg;
	
	//super class Contructor
	//  슈퍼생성자
	// 기본생성자
	public ScoreVO() {
		
	}
	
	// field contrucsor
	// 매개변수가 있는 생성자
	// 필드 생성자
	
	public ScoreVO(String num, int kor, int eng, int math, int music, int history) {
		super();
		this.num = num;
		this.Kor = kor;
		this.eng = eng;
		this.math = math;
		this.music = music;
		this.history = history;
	}


	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getKor() {
		return Kor;
	}
	public void setKor(int kor) {
		Kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMusic() {
		return music;
	}
	public void setMusic(int music) {
		this.music = music;
	}
	public int getHistory() {
		return history;
	}
	public void setHistory(int history) {
		this.history = history;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public float getSub() {
		return Avg;
	}
	public void setSub(float Avg) {
		this.Avg = Avg;
	}
	@Override
	public String toString() {
		return "ScoreVO [num=" + num + ", Kor=" + Kor + ", eng=" + eng + ", math=" + math + ", music=" + music
				+ ", history=" + history + ", total=" + total + ", Avg=" + Avg + "]";
	}
	
	
}
