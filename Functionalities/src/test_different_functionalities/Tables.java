package test_different_functionalities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Setup\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://www.newtours.demoaut.com/");
		WebElement userName = driver.findElement(By.name("userName"));  // What is WebElement
		userName.sendKeys("mercury");                                   // userName is Variable
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		
		

	}

}
