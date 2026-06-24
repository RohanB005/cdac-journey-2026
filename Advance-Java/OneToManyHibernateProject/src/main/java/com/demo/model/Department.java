package com.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	private int did;
	private String dname;
	
	@OneToMany
	
	@JoinColumn(name="dept_id")
	
	private List<Employee> employee;
	public Department() {
		
	}
	public Department(int did, String dname, List<Employee> employee) {
		this.did = did;
		this.dname = dname;
		this.employee = employee;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public List<Employee> getEmployees(){
		return employee;
	}
	public void setEmployees(List<Employee> employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + "]";
	}
	
}
