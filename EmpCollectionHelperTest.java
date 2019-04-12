package com.empdetails.junit;


import junit.framework.Assert;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import com.empdetails.bean.EmpSchema;
import com.empdetails.exception.EmpException;
import com.empdetails.helper.EmpCollectionHelper;

	public class EmpCollectionHelperTest {
	static EmpCollectionHelper collectionHelper;
	static EmpSchema emp=null;
	
	@BeforeClass
	public   static  void beforeClass()
	{
		collectionHelper=new EmpCollectionHelper();
		emp =new EmpSchema(888,"Rutuja", "ASDFG12345", 340000);		
	}
	@AfterClass
	public static  void afterClass()
	{		
		collectionHelper=null;
		emp=null;
	}	
	
	
	@Test 
	public void testAddNewEmp() throws EmpException
	{
		collectionHelper.addNewEmpDetails(emp);
		//Assert.assertEquals(4, collectionHelper.displayBookCount());
		Assert.assertNotNull(collectionHelper.toString());
		
	}
}
