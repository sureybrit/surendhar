package com.empdetails.helper;

import java.util.regex.Pattern;

import com.empdetails.exception.EmpException;

public class EmpDataValidator {
	public  static  boolean validateEmpId(String empId)throws EmpException
	{
		String IdPattern="\\d{3}";
		if(Pattern.matches(IdPattern, empId))
		{
			return true;
		}
		else
		{
			throw new EmpException("Only 3-digit EmpID is Allowed");
		}
	}
	
	
	public  static  boolean validateEmpName(String empName)throws EmpException
	{
		String custPattern="[A-Za-z]{6,20}";
		if(Pattern.matches(custPattern, empName))
		{
			return true;
		}
		else
		{
			throw new EmpException("Employee Name should start with CAPITAL ");
		}
	}
	
	
	public  static  boolean validateEmpPan(String empPan)throws EmpException
	{
		String PanPattern="[A-Z0-9]{10}";
		if(Pattern.matches(PanPattern, empPan))
		{
			return true;
		}
		else
		{
			throw new EmpException("Pan Name should be in 10 digits and in the correct format ");
		}
	}
	
	
	public  static  boolean validateEmpSalary(String empSalary)throws EmpException
	{
		String salaryPattern="\\d{10,4}.?[0-9]{2}$";
		if(Pattern.matches(salaryPattern, empSalary))
		{
			return true;
		}
		else
		{
			throw new EmpException("Only numbers (and paise if any) is Allowed");
		}
	}
}

