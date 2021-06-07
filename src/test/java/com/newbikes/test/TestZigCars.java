package com.newbikes.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.newbikes.base.BaseUI;
import com.newbikes.page.ZigWheelsCars;
import com.newbikes.utils.DriverSetUp;
import com.newbikes.utils.POM_xlsx;

public class TestZigCars extends BaseUI{

	public TestZigCars(WebDriver driver, WebElement element) {
		super(driver, element);
	}
  
	public static void usedCars() throws InterruptedException, IOException{
		WebElement usedCars = ZigWheelsCars.Used();
		Actions action = new Actions(driver);
		action.moveToElement(usedCars).build().perform();
		Thread.sleep(2000);
		WebElement wb4=ZigWheelsCars.City();
		wb4.click();
		int counts=0;
		String[] car=new String[15];
		System.out.println("\n-----POPULAR CAR MODELS IN THE LIST OF USED CAR AT CHENNAI----\n");
		for(WebElement link:ZigWheelsCars.carNames()){
			System.out.println(link.getAttribute("car_name"));
			car[counts]=(link.getAttribute("car_name"));
			counts++;
		}
		System.out.println("TOTAL NUMBER OF car details: "+counts);
	    POM_xlsx.WriteExcel(car);
	   driver.navigate().to(DriverSetUp.propertyFile("baseUrl"));
	   Thread.sleep(2000); 
	}
}
