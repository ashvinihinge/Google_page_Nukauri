package com.Google_Page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Google_Home_Page {

	
	@Test
	public void openGooglePage() throws InterruptedException, AWTException {
		
		ChromeDriver driver=new ChromeDriver();
		
		//driver.get("https://www.google.com/");
		
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
		username.sendKeys("hingeashvini209@gmail.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("209ash@@");
		driver.findElement(By.xpath("//button[@class='btn-primary loginButton']")).click();

		driver.findElement(By.linkText("View profile")).click();
		
		
		Actions at = new Actions(driver);
		at.sendKeys(Keys.PAGE_DOWN).build().perform();
				
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Update resume']")).click();
		
		// System.out.println("File Update Succefully");

				//Using Robot Class to Upload File
				
				Robot rb = new Robot();
				rb.delay(3000);

				//Copy File to cilp board
				StringSelection ss = new StringSelection(
						"Ashwini_Hinge_3_Yrs_QA.pdf");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

							//Perform control + action to  paste file
				rb.keyPress(KeyEvent.VK_CONTROL);
				rb.keyPress(KeyEvent.VK_V);

				rb.keyRelease(KeyEvent.VK_CONTROL);
				rb.keyRelease(KeyEvent.VK_V);

				rb.keyPress(KeyEvent.VK_ENTER);
				rb.keyRelease(KeyEvent.VK_ENTER);
				rb.keyPress(KeyEvent.VK_ENTER);
				
				Thread.sleep(3000);
				
				rb.keyRelease(KeyEvent.VK_CONTROL);
				rb.keyPress(KeyEvent.VK_UP);
				
				Thread.sleep(2000);
			//	driver.close();
				
			
	
	
	

	
		
		driver.manage().window().maximize();
		

	}
}
