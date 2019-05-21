package test_different_functionalities;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class Find_Elements_Which_Contains_Links {

	public static void main(String[] args) throws InterruptedException{
		     System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Setup\\chromedriver.exe"); // here we are passing two arguments in set property(Property,Value)
		     WebDriver driver;
		     driver = new ChromeDriver();
		     driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		     driver.get("http://www.newtours.demoaut.com/");
		
		     
		     
		     
		     List<WebElement> elementList = driver.findElements(By.xpath("//a")); //An ordered collection (also known as a sequence).The user of this interface has precise control over where in the list each element is inserted. The user can access elements by their integer index (position in the list), and search for elements in the list.
		     System.out.println("Number of Links = " +elementList.size()); // here Size() Returns the number of elements in this list. If this list contains more than Integer.MAX_VALUE elements, returns Integer.MAX_VALUE.
		     
		    /* System.out.println(elementList);
		     elementList.get(0).click();
		     driver.navigate().back();
		     System.out.println(elementList);*/
		     
		     /*for(int i =0;i<elementList.size();i++)                 // using this loop we are printing the text of The links which are get stored or detected by the Driver element in List
		     {
		     System.out.println(elementList.get(i).getText());
		     }*/
		    /*for(int i =0;i<elementList.size();i++)
		    {
		    	System.out.println(elementList);
		    }*/
		     
		     
		     
		     
		     // Now to Know that Inside every link How many Links are there and further if we want to know the names of the links 
		     /*for(int i =0; i<elementList.size(); i++)              
		     {
		     System.out.println(driver.findElements(By.xpath("//a")).get(i).getText());
		     driver.findElements(By.xpath("//a")).get(i).click();
		     List<WebElement> elementList1 = driver.findElements(By.xpath("//a"));
		     System.out.println(elementList1.size());
		      for( int j=0; j<elementList1.size();j++){
		    	  System.out.println(driver.findElements(By.xpath("//a")).get(j).getText());
		      }
		     driver.navigate().back();
		     }*/
		     
		     
		     
		     
		     
		     
		     
		     // Q- When we are using elementList variable which is a reference object which stores the address of the values which are getting stored by List it is giving stale element error where as when we are using driver.find element for that get text or click it is working fine?  
		     // Q- In below query when we are clicking first and after that before navigating to back page we are getting text it runs up to 11 and index 12 stop with error?
		     // Q- In below query when we are clicking first and after navigate back to the page and then getting text again it is working right
		     
		     /*for(int i=0;i<elementList.size();i++)                  // Doing the same activity But not like that now we will click on every link one by one it will open other page and then we will go back to that initial page and will get text          
		     {
		     
		    	 
			 elementList.get(i).click();
			 Thread.sleep(2000);
			 //driver.findElements(By.xpath("//a")).get(i).click();
			 
			 //elementList.get(i).click();
			 
			 //driver.findElements(By.xpath("//a")).get(i).click();
             //Thread.sleep(2000);
			 //System.out.println("Clicked on Link" + driver.findElements(By.xpath("//a")).get(i).getText() ); //here what was going on when we click on link it will go to other page on which again we are trying to get the i values as 16 which was on first page so what we need to do is just print this before because so that we can get the initial value of i without going to the new link page
			 //Thread.sleep(2000);
             driver.navigate().back();
             System.out.println(elementList.get(i).getText());//driver.findElements(By.xpath("//a")).get(i).getText());
             //System.out.println("Clicked on Link" + driver.findElements(By.xpath("//a")).get(i).getText() );
             //Thread.sleep(2000);
		     }*/
		     //driver.navigate().forward();
		     //driver.navigate().to("");
		     driver.close();
		     //driver.quit();
		
		
		
		
	}

	}


