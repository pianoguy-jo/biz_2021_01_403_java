package com.callor.student;

public class StudentVO {
	
	private String sNum; // 학번
	private String sName; // 이름
	private String deap;//학과
	private int grade; // 학년
	private int claNum;// 반
	private String addr;//주소
	private String telNum;//전화번호
	
	
	
	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public StudentVO(String sNum, String sName, String deap, int grade, int claNum, String addr, String telNum) {
		super();
		this.sNum = sNum;
		this.sName = sName;
		this.deap = deap;
		this.grade = grade;
		this.claNum = claNum;
		this.addr = addr;
		this.telNum = telNum;
	}



	public String getsNum() {
		return sNum;
	}
	public void setsNum(String sNum) {
		this.sNum = sNum;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getDeap() {
		return deap;
	}
	public void setDeap(String deap) {
		this.deap = deap;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClaNum() {
		return claNum;
	}
	public void setClaNum(int claNum) {
		this.claNum = claNum;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTelNum() {
		return telNum;
	}
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	@Override
	public String toString() {
		return "StudentVO [sNum=" + sNum + ", sName=" + sName + ", deap=" + deap + ", grade=" + grade + ", claNum="
				+ claNum + ", addr=" + addr + ", telNum=" + telNum + "]";
	}

	

}
