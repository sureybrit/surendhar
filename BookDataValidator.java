package com.cg.helper;

import java.util.regex.Pattern;
import com.cg.exception.BookException;

public class BookDataValidator {
	public  static  boolean validateBookName(String bookName)throws BookException
	{
		String custPattern="[A-Za-z]{6,20}";
		if(Pattern.matches(custPattern, bookName))
		{
			return true;
		}
		else
		{
			throw new BookException("Book Name should start with CAPITAL & Min 6 and Max 20 characters Allowed");
		}
	}
	
	public  static  boolean validateBookId(String bookId)throws BookException
	{
		String IdPattern="\\d{3}";
		if(Pattern.matches(IdPattern, bookId))
		{
			return true;
		}
		else
		{
			throw new BookException("Only 3-digit BookID is Allowed");
		}
	}
	
	public  static  boolean validateBookPrice(String bookPrice)throws BookException
	{
		String pricePattern="\\d{2,4}.?[0-9]{2}$";
		if(Pattern.matches(pricePattern, bookPrice))
		{
			return true;
		}
		else
		{
			throw new BookException("Only numbers (and paise if any) is Allowed");
		}
	}
}
