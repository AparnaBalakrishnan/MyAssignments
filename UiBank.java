package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiBank {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://uibank.uipath.com/register-account");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("Aparna");
		driver.findElement(By.xpath("//select[@id='title']")).click();
		driver.findElement(By.xpath("//option[text()='Mrs']")).click();
		driver.findElement(By.id("middleName")).sendKeys("B");
		driver.findElement(By.id("lastName")).sendKeys("Balakrishnan");
		driver.findElement(By.xpath("//select[@id='sex']")).click();
		driver.findElement(By.xpath("//option[text()='Female']")).click();
		driver.findElement(By.xpath("//select[@id='employmentStatus']")).click();
		driver.findElement(By.xpath("//option[text()='Full-time']")).click();
		driver.findElement(By.id("username")).sendKeys("Aparna");
		driver.findElement(By.id("email")).sendKeys("aparnabalakrishnan");
		driver.findElement(By.id("password")).sendKeys("25072000");
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
