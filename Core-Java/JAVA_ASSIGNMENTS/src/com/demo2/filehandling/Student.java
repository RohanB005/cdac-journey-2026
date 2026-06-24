package com.demo2.filehandling;

public class Student {
	private int studid;
	private String name;
	private String degree;
	private String email;
	
	public Student(int studid, String name, String degree, String email) {
		this.studid = studid;
		this.name = name;
		this.degree = degree;
		this.email = email;
	}
	
	public int getStudid() {return studid;}
	public String getName() {return name; }
	public String getDegree() {return degree;}
	public String getEmail() {return email;}
	
	public void setName(String name) {this.name = name;}
	public void setDegree(String degree) {this.degree = degree;}
	public void setEmail(String email) {this.email = email;}
	
	public String toCSV() {
		return studid + "," + name + "," + degree + "," + email;
	}
	
	public void display() {
		System.out.println(studid + " " + name + " " + degree + " " + email);
	}
}
