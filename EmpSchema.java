package com.empdetails.bean;

public class EmpSchema {
	public int empId;
	public String empName;
	public String empPan;
	public double empSalary;
	
	public EmpSchema() { }
	
	public EmpSchema(int empId, String empName, String empPan, double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empPan = empPan;
		this.empSalary = empSalary;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpPan() {
		return empPan;
	}
	public void setEmpPan(String empPan) {
		this.empPan = empPan;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	@Override
	public String toString() {
		return "Emp [EmpId=" + empId + ", EmpName="
				+ empName + ", EmpPan=" + empPan + ", EmpSalary=" + empSalary + "]";
	}
}
