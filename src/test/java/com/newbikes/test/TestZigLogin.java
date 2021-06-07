package com.newbikes.test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.newbikes.base.BaseUI;
import com.newbikes.page.ZigWheelsLogin;
import com.newbikes.utils.DriverSetUp;
import com.newbikes.utils.POM_xlsx;

public class TestZigLogin extends BaseUI{

	public TestZigLogin(WebDriver driver, WebElement element) {
		super(driver, element);
	} 
	 
	public static void loginError() throws InterruptedException, IOException{
		WebElement wb6=ZigWheelsLogin.Login();
		wb6.click();
		Thread.sleep(2000);
		WebElement wb7=ZigWheelsLogin.Sign();
		wb7.click();
		Thread.sleep(2000);
	    Set<String> windows=driver.getWindowHandles();
	    Iterator<String> it=windows.iterator();
	    String win1=it.next();
	    String win2=it.next();
	    driver.switchTo().window(win2);
	    Thread.sleep(2000);
	    WebElement wb8=ZigWheelsLogin.Mail();
	    wb8.sendKeys(DriverSetUp.propertyFile("email"));
	    Thread.sleep(2000);
	    WebElement wb9=ZigWheelsLogin.Next();
	    wb9.click();
	    Thread.sleep(2000);
	    WebElement wb10=ZigWheelsLogin.Mistake();
	    String error = wb10.getText();
	    System.out.println("\n------CAPTURE ERROR MESSAGE---------\n");
	    System.out.println(error);
	    POM_xlsx.Error_message(error);
	    Thread.sleep(2000);
	    driver.close();
        driver.switchTo().window(win1);
        Thread.sleep(2000); 
        DriverSetUp.CloseDriver();
	}
	
	

}
