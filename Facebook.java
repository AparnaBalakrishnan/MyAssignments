package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Aparna");
		driver.findElement(By.name("lastname")).sendKeys("Balakrishnan");
		driver.findElement(By.name("reg_email__")).sendKeys("9566297297");
		driver.findElement(By.id("password_step_input")).sendKeys("25072000");
		driver.findElement(By.xpath("//select[@id='day']")).click();
		driver.findElement(By.xpath("//option[text()='25']")).click();
		driver.findElement(By.xpath("//select[@id='month']")).click();
		driver.findElement(By.xpath("//option[text()='Jul']")).click();
		driver.findElement(By.xpath("//select[@id='year']")).click();
		driver.findElement(By.xpath("//option[text()='2000']")).click();
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
