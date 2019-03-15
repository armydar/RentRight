package agencyRegistration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class registerAgency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Algorism-Adefemi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://develop.rentright.co");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div[2]/span/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div[2]/ul/div/li[1]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"SGN__FNAME\"]/div/input")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id=\"SGN__LNAME\"]/div/input")).sendKeys("last");
		driver.findElement(By.xpath("//*[@id=\"SGN__EMAIL\"]/div/input")).sendKeys("testing@gail.com");
		driver.findElement(By.xpath("//*[@id=\"SGN__PHONE\"]/div/input")).sendKeys("0809876432");
		driver.findElement(By.xpath("//*[@id=\"SGN__PASSWORD\"]/div/input")).sendKeys("password");
		
		WebElement oCheckBox = driver.findElement(By.xpath("//*[@id=\"FORM_26\"]/div[2]/label/span[1]/input"));
		 
		 oCheckBox.click();
		driver.findElement(By.xpath("//*[@id=\"INPUT_100\"]")).click();
		
		
	}

}
