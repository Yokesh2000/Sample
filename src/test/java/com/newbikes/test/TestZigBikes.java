package com.newbikes.test;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

import com.newbikes.base.BaseUI;
import com.newbikes.page.ZigWheelsBikes;
import com.newbikes.utils.POM_xlsx;

public class TestZigBikes extends BaseUI {

	public TestZigBikes(WebDriver driver, WebElement element) {
		super(driver, element);
	}  
	public static void details() throws InterruptedException, IOException {
		WebElement wb1=ZigWheelsBikes.Close();
		wb1.click();
		WebElement newBikes=ZigWheelsBikes.Bikes();
		Actions act = new Actions(driver);
		act.moveToElement(newBikes).build().perform();
		Thread.sleep(2000);
		WebElement wb2=ZigWheelsBikes.Upcomming();
		wb2.click();
		WebElement bikeModel =ZigWheelsBikes.Model();
		Select s = new Select(bikeModel);
		s.selectByVisibleText("Honda");
		((JavascriptExecutor)driver).executeScript("scroll(0,1500)");
		Thread.sleep(2000);
		WebElement wb3=ZigWheelsBikes.Cal();
		wb3.click();
        printingBikeDetails(); 
}
	public static void printingBikeDetails() throws IOException{
		System.out.println("\n-----LIST OF BIKES PRICE LESS THAN RS. 4.00 LAKHS AT (HONDA) BRAND ----\n");
		String[] bikeName= new String[15];
		String[] bikePrice= new String[15];
		String[] bikeLaunch = new String[15];
		int[] price = new int[15];
		int i=0,j=0,k=0;
		for(WebElement link: ZigWheelsBikes.bikeNames()){
			bikeName[i]=link.getAttribute("title");
			i++;
		}
		for(WebElement link1:ZigWheelsBikes.bikeLaunchDate()){
			bikeLaunch[k]=link1.getText();
			k++;
		}
		for(WebElement link2:ZigWheelsBikes.bikePrices()){
			bikePrice[j]=(link2.getText());
            String subString=bikePrice[j].substring(4,8);
 			price[j]=(int)Float.parseFloat(subString);
			j++;
		}
		int count1=0,count=0;
		for(count1=0;count1<(bikeName.length)-1;count1++){
	     	 
	     	   if(price[count1]<4){
	     	   	System.out.println("MODEL NAME: "+bikeName[count1]+"\nPRICE: "+bikePrice[count1]+"\n"+bikeLaunch[count1]+"\n");
	        		System.out.println("\n");
	        		count++;
	     	   }
	     	  }
	 	System.out.println("TOTAL NUMBER OF BIKE UPCOMMING(INDIA) AT PRICE LESS THAN 4.00 LAKHS : "+count);
	 	POM_xlsx.WriteExcelfile(bikeName, bikePrice, bikeLaunch, price);
	}
	}
