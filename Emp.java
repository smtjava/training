package com.comparator;

import java.util.Comparator;

import com.comparable.Employee;

public class Emp implements Comparator<Emp>{
	private String name;
	private String phone;
	private int empId;
	
	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.getEmpId()-o2.getEmpId();
		//return o1.getName()- o2.getName();
	}
	
	
	public Emp(String name,String phone,int empId) {
		this.name=name;
		this.phone=phone;
		this.empId=empId;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", phone=" + phone + ", empId=" + empId + "]";
	}

	

			
}