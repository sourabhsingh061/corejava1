package com.rays.collectionss;

public class Marksheet1 implements Comparable <Marksheet1>{
	private String rollno ;
	private String  fname;
	private String lname ;
	private int phy ;
	private int chem;
	private  int math;
	
	
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getPhy() {
		return phy;
	}
	public void setPhy(int phy) {
		this.phy = phy;
	}
	public int getChem() {
		return chem;
	}
	public void setChem(int chem) {
		this.chem = chem;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	@Override
	public int compareTo(Marksheet1 o) {
		
		return this.lname.compareTo(o. lname);
	}
	
	
	




}
 