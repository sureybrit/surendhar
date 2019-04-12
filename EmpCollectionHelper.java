package com.empdetails.helper;
import java.util.ArrayList;
import java.util.Iterator;
import com.empdetails.bean.EmpSchema;

public class EmpCollectionHelper {
	private  static ArrayList<EmpSchema> empList=null;
	static
	{
		empList=new ArrayList<EmpSchema>();
		EmpSchema b1=new EmpSchema(101,"Suresh","AFTGFH12345",33350.00);
		EmpSchema b2=new EmpSchema(102,"Mahesh","POKUH28843",150200.00);
		EmpSchema b3=new EmpSchema(103,"Deepak","ROPET56723",830000.00);
		EmpSchema b4=new EmpSchema(104,"Pradeep","QWVGT98561",1000350.00);
		EmpSchema b5=new EmpSchema(105,"Ankita","JUOLP761632",1950000.00);

		empList.add(b1);
		empList.add(b2);
		empList.add(b3);
		empList.add(b4);
		empList.add(b5);

	}
public  EmpCollectionHelper(){}
	
	/*************Add New Employee Details in ArrayList************/
	public void addNewEmpDetails(EmpSchema emp) 
	{			
			empList.add(emp);				
	}
	
	public static ArrayList<EmpSchema> getempList() {
		return empList;
	}

	public static void setempList(ArrayList<EmpSchema> empList) {
		EmpCollectionHelper.empList = empList;
	}

	
	/*************Fetch All Employee Details ***********/

	public static  void displayEmpCount()
	{
		Iterator<EmpSchema>empIt=empList.iterator();
		EmpSchema tempEmp=null;
		
		int totalCount=0;
		while(empIt.hasNext())
		{
			totalCount++;
			tempEmp=empIt.next();
			//System.out.println(tempEmp);			
		}
		//System.out.println("Total Count of Employees" + totalCount);
			System.out.println(totalCount);
	}
}
