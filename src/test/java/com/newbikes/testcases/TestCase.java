package com.newbikes.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.newbikes.test.TestZigBikes;
import com.newbikes.test.TestZigCars;
import com.newbikes.test.TestZigLogin;
import com.newbikes.utils.DriverSetUp;

public class TestCase {

	@BeforeTest
	public static void Initiation() throws IOException{
		DriverSetUp.Initiate(1);
	}
    @Test(priority=1)
	public static void ZigBikes() throws IOException, InterruptedException{
    	 TestZigBikes.details();
     } 
    @Test(priority=2)
    public static void ZigCars() throws InterruptedException, IOException{
    	TestZigCars.usedCars();
    }
    @Test(priority=3)
    public static void ZigLogin() throws InterruptedException, IOException{
    	TestZigLogin.loginError();
    }
}
