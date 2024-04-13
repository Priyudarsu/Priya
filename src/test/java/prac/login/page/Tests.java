package prac.login.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests 
{
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("amazon prime");
	driver.findElement(By.name("btnK")).click();
	driver.findElement(By.xpath("//*[text()='Watch Latest Movies']")).click();
	WebElement y=driver.findElement(By.xpath("//*[@role=\"button\"]"));
	y.click();
	y.sendKeys("Inspector rishi");
	}

}
