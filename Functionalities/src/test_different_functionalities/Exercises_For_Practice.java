 package test_different_functionalities;
 import java.util.List;
 import java.util.concurrent.TimeUnit;
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.chrome.ChromeDriver;
 
 import java.text.DateFormat;
 import java.text.SimpleDateFormat;
 import java.time.LocalDateTime;
 import java.time.format.DateTimeFormatter;
 import java.util.Date;

 public class Exercises_For_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Exercise- To print all the links which are having more than one word
		
		/*System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Setup\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://www.newtours.demoaut.com/");
		
		List<WebElement> elementList = driver.findElements(By.xpath("//a"));
		System.out.println("Number of Links = " +elementList.size());
		
		for(int i =0;i<elementList.size();i++)
		{
		//System.out.println(elementList.get(i).getText());
		String[] arr =elementList.get(i).getText().split(" ");
		if(arr.length>1)
		{
		System.out.println("Link with more than one word " + elementList.get(i).getText());
				
		}
		else 
		{
				
				
		}
		}*/
		//Exercise- To Understand the Different date formats and usage of it
		
		/*DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		
		DateFormat dateFormat1 = new SimpleDateFormat("dd/mm/yy mm:HH:ss");
		Date date1 = new Date();
		System.out.println(dateFormat1.format(date1));
		
		DateFormat dateFormat2 = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
		Date date2 = new Date();
		System.out.println(dateFormat2.format(date2));
		
		
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd");

		LocalDateTime now =LocalDateTime.now();
		String systemDt=dtf.format(now);
		System.out.println(systemDt);*/
        
		//Exercise- Now test date on web page using the above logic of date
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Setup\\chromedriver.exe");
		WebDriver driver;
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MMM dd, yyyy");
        LocalDateTime now =LocalDateTime.now();
		String systemDt=dtf.format(now);
		System.out.println(systemDt);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://www.newtours.demoaut.com/");
		
		//driver.findElement(By.xpath("//b[contains(text(),'Oct 30, 2018')]"));   // hard coded always need to update the date for testing
		//System.out.println(driver.findElement(By.xpath("//b[contains(text(),'Oct 30, 2018')]")).getText());// again this is hard coded if we will not modify the xpath it will not be able to detect such kind of element
         System.out.println("Date on WebPage is " + driver.findElement(By.xpath("//form[@name='home']//tbody//b")).getText());
         System.out.println("System Date is " + systemDt);
		if(systemDt ==driver.findElement(By.xpath("//form[@name='home']//tbody//b")).getText())
         {
        	System.out.println("Expected Date is matching");
        	
          
         }
         else
         {
        	  
        	System.out.println("Failed");
         }
         }
	     }
