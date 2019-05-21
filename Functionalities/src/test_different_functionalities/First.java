// Notes of Selenium
/*Code-> RCserver-> EF,IE,CH
Code-> EF,IE,CH diredtly communicate we don't need tp launch any external server to interact with browser


                                                                                              HTTP
Selenium  ----->           jSON wire Protocol             ----------->     Browser Drivers  ------------>  Browser
Java                       Over                                             IE Drivers                      IE
C#                         HTTP                                             Chrome Drivers  <-------------
Ruby                                                                                           HTTP
--
selenium jar files                                       chrome.exe

https://www.seleniumhq.org/download/
http://chromedriver.chromium.org/downloads
https://chromedriver.storage.googleapis.com/index.html?path=2.43/
set of jar files which contains some packages which consist of some classes in which some methods are written
we can kep chromedriver.exe and selenium standalone jar files inside the project we can keep them anywhere 
but in long run when we need to run this code on other's systems it will change the paths 

Locators:
----------
Value is not a locator we can use it by using xpath
ID
Name
Class Name
Tag Name
Link Text       Tag name with a <anchor tag>
Partial Link Text
Xpath
CSS selector

----------------
Radio Button 
Alerts 
Drop down button
Windows
Frames




minimize the instance 
keys to windows + m  (action class)
                                     



https://chrome.google.com/webstore/detail/chropath/ljngjbnaijcbncmcnjfhigebomdlkcjo?hl=en

chro path                                   

fire path





xpath are of two types
Relative xpath
Absolute Xpath





//tagname
//div//td
//div[@Value='abc'] -- if it found multiple the one which founded by it first will perform the action on that and if we want to perform the action on second finding then we do this by find elements or occurences of that ( how many findings are found and the select on which you want to perform action)




//body[@Vlink="# qwe"]
when we need to pass multiple properties
//input[@Value ='oneway'][@type='radio']



camelcasting
driver.navigate.forward
driver.navigate.backward

as new page is load list will lost the reference of stored elements  thats why stale error is there





find all the links that has more than one word
------------------------------------------------------------------------------------------------------------------------------------------
Xpath
//tagname[@ properties ='']
//input[@value ='login'][@alt ='Sign-in']
//div[@align ='Center']
//div[@name ='Sign-in']//input

Properties of Xpath
-------------------
Parent
Child
Preceding Sibling
Following Sibling
Ancestor

tagname[@_=]
//Parent :: tagname[@_=]
//div[text()='Samsung Galaxy On6 (Black, 64 GB)']//parent::a
only img
//div[text()='Samsung Galaxy On6 (Black, 64 GB)']//parent::a//img      //below is also same 
//div[text()='Samsung Galaxy On6 (Black, 64 GB)']//parent::a//child::img   //below is also same
//div[@class='_2PX1l4']//div[@class="_3BTv9X"]//child::img[@alt='Kent Grand Plus TDS 8 L RO + UV +UF Water Purifier']//ancestor::div



we can split string with identifier 
ABCD -Split by c it will give out put AB D
Or we can use contains (space) as well



Frames
-------------------------------------------------------------------------------------
Frames is like a container it can be visible or non visible or have borders it is not necessary that every page has a frame there can be pages which has more than one frame
Frame contains website in it
Frames can be inside some other frame
Hnadling of frame for that we have to go to inside of frame no operations or no locators will workoutside from the frame
frames are visible are not even we dont know this

 if we want to enter inside the frame then we have enter in main frame and then again we switch to frame it will allow you to get inside its emberded frame
 But for exit from the frame we will get totally out of all frames can nopt be able to access the parent frame of nested frame
function name is same but paramters passing are different so frame is overloading function




Waits
---------------------------------------------------------------------------------------------------------
4 types of WAITS 
1.Implicit Wait   ---> only one time generally at the start of your script and it will applicable for every element --> driver.manage().timeouts().implicitlyWait(10,TimeUnit,SECONDS);
2.Explicit Wait    --- FOR PARTICULAR THING FOR PARTICULAR ELEMENT FOR PARTICULAR FUNCTION WE HAVE TO DEFINED EACH AND EVERY TIME WHEN EVER WE WANT TO USE TO HANDLE THOSE CASES WHICH ARE GETTING FAILED OR NOT CONTROLLED BY Implicit WAIT 
3.Fluent Wait
4.Static Wait ----> Thread.sleep(1000); here 1000 means 1 seconds

Poling time concept where it will wait for particular milli seconds and again it will check in the mean time if it is get loaded it will get stopped

inside code of wait function
for(loop)
TRY{
Locator.is.displayed
break();
}
catch{
52000}


topic - handling windows is left

java - date,time class








Public static void main(String[] args){

DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy");

LocalDateTime now =LoacalDateTime.now();
String systemDt=dtf.format(now);
System.out.println(systemDt);



//form[@name='home']//tbody//b- date xpath




Handling windows
--------------



every window will get launch has alpha numeric id and we have to capture that id to switch between the windows
by default browser will work on first window 





POM
---

Test Cases
Operations     <------>                           Page Objects
                                                  Public WebElement get username()
obj.getusername().sendkeys                        { return.driver.findelement.by.xpath("username");
                                                   }


Page Factory - in that we don't need to create function again and again we can use locators as well
}




Null pointer exception - when we declare a vairable using the variable without assigning the value to that variable because we have not define the value of vairable







write down all test cases writen earlier to page object model means using locators



Test cases- actually scenarios
Page object - methods defination
utilities -  repeatetive methods which we need to use example- explicit wait when we need to use ,window 




new peoject -maven-com.sapient.projectname GROUP ID , com.companyname.projectname - Artifact id same as group id


maven
gecko driver
firefox driver


Similary for testng













Right click - click new - file- config. properties
right inside that username=mercury
than testclass testng method get config 

Public void getconfigvalue() throws IOException

Properties prop = new Properties();
File reader file =new 
Reading data from Excel file

Build path 






*/

package test_different_functionalities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class First {

	     public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	    	
	    	//System.setProperty("webdriver.chrome.driver", "D:\\Qurate\\SeleniumQurate\\Setup\\chromedriver.exe"); // This is the hard coded way to give the path 
			//WebDriver driver =new ChromeDriver();  //web driver is an interface and chrome driver is a class
			//ChromeDriver d1 = new ChromeDriver();  // using chrome driver we can not be able to handle other drivers where as using webdriver we can handle others drivers as well
	        //driver = new ChromeDriver();
	    	System.out.println("Path = " +System.getProperty("user.dir"));
	        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Setup\\chromedriver.exe");
			WebDriver driver;     // Declaration of Variable Driver which we will use to expect or Find elements on web pages
			driver = new ChromeDriver();
			//System.out.println(driver.manage().window().getSize());     //that is for just getting the current size of the window
			//driver.manage().window().maximize();                        // that is for maximizing the size of window
			//System.out.println(driver.manage().window().getSize());     // after maximizing again we can check the current size of the window
			//Thread.sleep(2000);                                         // type of Wait
			//driver.manage().window().setSize(driver.manage().window().getSize());  // that is just we are getting the current size of the window in Driver variable
			//driver.manage().window().setPosition(new Point(-2000,0));             // using this we are just setting the new size of the window
		
			driver.get("http://www.newtours.demoaut.com/");  // this is the url which we need to launch for testing
			String expTitle ="Welcome: Mercury Tours";       // expTitle is the Expected title is variable we can use anything here
			String actTitle = driver.getTitle();             // actTitle is actual title
			if(expTitle.equals(actTitle))                    // ACTUAL TITLE ,EXPECTED TITLE
			{System.out.println("Pass : Title is " + actTitle);
			}
				
			else {
				System.out.println("FAIL : Title is " + actTitle);
			}
			
			
			
			WebElement userName = driver.findElement(By.name("userName"));  // What is WebElement
			userName.sendKeys("mercury");                                   // userName is Variable
			
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("mercury");
			Thread.sleep(5000);
			driver.findElement(By.name("login")).click();
			Thread.sleep(5000);
			WebElement SIGN_OFF = driver.findElement(By.linkText("SIGN-OFF"));
			Thread.sleep(5000);
		    System.out.println(SIGN_OFF.getText());
		    
		    
		    if(driver.findElement(By.linkText("SIGN-OFF")).isDisplayed())
		    {
		    	System.out.println("PASS: ");
		    }
		    
		    else
		    {
		    	System.out.println("FAIL: ");
		    }
		
			
			// we can use try catch exception , When we will get to know that now we need to use Try - Catch
		
		  /*  try
		    {
		    	if(driver.findElement(By.linkText("SIGN-OFF")).isDisplayed())
			    {
			    	System.out.println("PASS: ");
			    }
		    }
			   catch(Exception e){
		    
			    	System.out.println("FAIL: ");
			    
		    	
		    }*/
		
			//find locator of drop down click on it
			//create an object of select class(java)
		    
			Select mySelect = new Select(driver.findElement(By.name("passCount")));  // Here select is a class and mySelect is a variable which store the information and that information is Object
			mySelect.selectByIndex(3);
			Thread.sleep(2000);
			
	/*		mySelect.selectByValue("3");              // these are the Ways through which we can Select the Values in Drop down either by index,by value, by Visible Text
			Thread.sleep(2000);
			mySelect.selectByVisibleText("2");
			Thread.sleep(2000);
	*/	
	    driver.findElement(By.xpath("//input[@value='oneway']")).click();
		
	    Select mySelect1 = new Select(driver.findElement(By.name("fromPort")));
		mySelect1.selectByIndex(1);
		
		Select mySelect2 = new Select(driver.findElement(By.name("fromMonth")));
		mySelect2.selectByIndex(9);
		
		Select mySelect3 = new Select(driver.findElement(By.name("fromDay")));
		mySelect3.selectByIndex(9);
		
		Select mySelect4 = new Select(driver.findElement(By.name("toPort")));
		mySelect4.selectByIndex(2);
		
		Select mySelect5 = new Select(driver.findElement(By.name("toMonth")));
		mySelect5.selectByIndex(9);
		
		Select mySelect6 = new Select(driver.findElement(By.name("toDay")));
		mySelect6.selectByIndex(12);
		
		driver.findElement(By.xpath("//input[@name='servClass'][@value='Business']")).click();
		//driver.findElement(By.xpath("//select[@name='airline'][@value='Business']")).click();
		//driver.findElement(By.xpath("//select[@name='airline']"));
		Select mySelect7 =new Select(driver.findElement(By.name("airline"))); // Can we do this activity in other ways means  without using select class and myselect variable
		mySelect7.selectByIndex(2);
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();	
	    driver.close();
		
		}

	


	}


