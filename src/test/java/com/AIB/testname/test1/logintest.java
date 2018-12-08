package com.AIB.testname.test1;

import java.io.IOException;

import org.testng.annotations.Test;

import com.utilities.utility;

public class logintest
{

	@Test(dataProvider="logintests")
	public void m1(String name,String password) throws IOException
	{
		System.out.println("Test NG");
		String s1 = utility.getprop("url");
		System.out.println(s1);
		System.out.println(name);
		System.out.println(password);
		
		
		
	}

}

