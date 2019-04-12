package com.empdetails.ui;

import java.util.Scanner;

import com.empdetails.bean.EmpSchema;
import com.empdetails.exception.EmpException;
import com.empdetails.helper.EmpCollectionHelper;
import com.empdetails.helper.EmpDataValidator;


public class EmpUI {
	static Scanner sc=new Scanner(System.in);
	static EmpCollectionHelper collectionhelper=null;
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0;
		collectionhelper=new EmpCollectionHelper();
		
		while(true)
		{
			System.out.println("1:Add Employee Details \n"+
					"2:Compute Income Tax amount and display the details \n3:Exit");

			System.out.println("\nEnter UR Choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:	enterNewEmpDetails();break;
			case 2: collectionhelper.displayEmpCount();break;
			default:System.exit(0);			
			}
		}
	}
	
	private static void enterNewEmpDetails() 
	{
		System.out.println("How many new Employees ? ");
		
		int bcount=sc.nextInt();
		
		while (bcount!=0) {
		
		System.out.println("Enter EmpId:");
		String empId=sc.next();
		try 
		{
			if(EmpDataValidator.validateEmpId(empId))
			System.out.println("Enter Employee name:");
			String empName=sc.next();
			if(EmpDataValidator.validateEmpName(empName))
				System.out.println("Enter Pan card No: ");
				String empPan =sc.next();
				if(EmpDataValidator.validateEmpPan(empPan))
				{	
					System.out.println("Enter Employee Salary:");
					String empSalary=sc.next();
				if(EmpDataValidator.validateEmpSalary(empSalary))
				{
						EmpSchema emp=new EmpSchema(Integer.parseInt(empId), empName, empPan, Double.parseDouble(empSalary));
						collectionhelper.addNewEmpDetails(emp);
				}	
			}
						
		} 
		catch (EmpException e)
		{			
			System.out.println(e.getMessage());
		}
		bcount--;
}
		
	}
}