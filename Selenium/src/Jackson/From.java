package Jackson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class From {
	@Test
	public void openurl(){
		driver.close();
	}
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	public void url() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver.get("https://github.com/unnati098/Class");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		try {
		Thread.sleep(1000);
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Unnati");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Patel");
		WebElement r1 = driver.findElement(By.xpath("//input[@id=\"sex-1\"]"));
		r1.click();
		driver.findElement(By.xpath("//input[@id=\"exp-2\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).sendKeys("1997-02-25");
		driver.findElement(By.xpath("//input[@id=\"profession-0\"]")).click();
		WebElement select1 = driver.findElement(By.xpath("//input[@id=\"profession-1\"]"));
		select1.click();
		System.out.println(select1.isSelected());
		driver.findElement(By.xpath("//input[@id=\"tool-2\"]")).click();
		Select drop = new Select(driver.findElement(By.xpath("//select[@id=\"continents\"]")));
		drop.selectByVisibleText("Antartica");
		Select drop1 = new Select(driver.findElement(By.xpath("//select[@id=\"selenium_commands\"]")));
		drop1.selectByVisibleText("WebElement Commands");
		driver.findElement(By.xpath("//input[@class=\"input-file\"]")).sendKeys("C:\\Users\\2093906\\Desktop\\1.jpeg");
		driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
		try {
			Thread.sleep(20000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			driver.quit();

	}

}
