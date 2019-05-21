package test_different_functionalities;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.WebElement;

import java.util.Set;




import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_On_Alert_Frames_WindowHandling_ExplicitWait {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// TODO Auto-generated method stub
		
		
		//Test on Alert
		
		/*String Path = System.getProperty("user.dir");
		System.out.println(Path);                         // from this we can check what Path consist in it or User Directory
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Setup\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get(System.getProperty("user.dir") + "\\Alert.html");
		
		driver.findElement(By.xpath("//button")).click();
		Alert myAlert=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println("Alert text " + myAlert.getText());
		//myAlert.accept();   // accept or dismiss is same thing
		 myAlert.dismiss();*/
	
	    // Test on Frames
		
		    /*System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Setup\\chromedriver.exe");
			WebDriver driver;
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get(System.getProperty("user.dir") + "\\Frames.html");
			
			driver.switchTo().frame(0);
			
			//WebElement userName = driver.findElement(By.name("userName")); // this is the way when we are storing the location in userName variable in which we have to fill the value mercury
			//userName.sendKeys("mercury");                                 // here we are passing that value to the stored location
	        
			
			
			driver.findElement(By.name("userName")).sendKeys("mercury");   // here we are not storing the location just directly finding it and passing the values
			driver.switchTo().defaultContent();
			driver.switchTo().frame(1);                                    // here we are passing the value or index of the frame
			
			//WebElement password = driver.findElement(By.name("password"));
			//password.sendKeys("mercury");
			
			
			driver.findElement(By.name("password")).sendKeys("mercury");
			driver.switchTo().defaultContent();
			
			
			//driver.switchTo().frame("iframe1");                               // here we are passing the name of the frame
			//driver.switchTo().frame("IF2");                                   // here we are passing the id of the frame
			
			
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='iframe1']"))); //here we are switching to the frame by using X.path 
		    driver.findElement(By.name("password")).sendKeys("mercury");*/
			
		 
	       //Test On WindowHandling
		    
		   /* System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Setup\\chromedriver.exe");
			WebDriver driver;
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get(System.getProperty("user.dir") + "\\Windows.html");
			
			
			System.out.println(driver.findElement(By.xpath("//button")).getText());
			driver.findElement(By.xpath("//button")).click();
			System.out.println(driver.findElement(By.xpath("//button")).getText());
			String win1=driver.getWindowHandle();
			System.out.println("Parent Window ID = "+win1 );
			Set<String> winIds = driver.getWindowHandles();
			for(String win:winIds)
			{   driver.switchTo().window(win);
				System.out.println(driver.getTitle());
				System.out.println(win);
				
			}
			driver.quit();*/
		
		  
		
		
		      // Test On Explicit_Wait
		      /*System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Setup\\chromedriver.exe");
		      WebDriver driver;
		      driver = new ChromeDriver();
		      driver.manage().window().maximize();
		      driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		      driver.get("http://www.newtours.demoaut.com/");
		      
		      File myfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		      FileUtils.copyFile(myfile,new File(System.getProperty("user.dir") +"\\SCREENSHOT.JPG"));
	          
		      Thread.sleep(15000);
		      
		      WebDriverWait wait = new WebDriverWait(driver,60); //Explicit wait will not wait till 60 just check the instant it will  find element it will stop waiting
		      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("userName"))));
		      explicitWait(driver,driver.findElement(By.name("userName")));
		      driver.findElement(By.name("userName")).sendKeys("mercury");
	
	
	          }
	
	         public static boolean explicitWait(WebDriver driver, WebElement element)

	         {
		        boolean status= true;
		       try{
			      WebDriverWait wait = new WebDriverWait(driver,60);
			      wait.until(ExpectedConditions.visibilityOf(element));
			      wait.until(ExpectedConditions.elementToBeClickable(element));
			
			 }
	          catch(Exception e){
		
		      status=false;
		      System.out.println("Unable to wait for the Element" + element);
              }
		      return status;*/		
	          }

}
