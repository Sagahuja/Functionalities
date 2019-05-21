package test_different_functionalities;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Xpath_Properties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Setup\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com/");
        
        driver.findElement(By.xpath("//div[@class='_3BTv9X']//child::img[@alt='Kent Grand Plus TDS 8 L RO + UV +UF Water Purifier']")).click();
        driver.navigate().back();
        
		
		
		
	}

}
