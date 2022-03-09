package Jackson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro_chrome {

public static void main(String[] args) {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

WebDriver driver = new ChromeDriver();
//driver.get("https://www.youtube.com/");
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
//String tittle = driver.getTitle();
//String url = driver.getCurrentUrl();
//String page = driver.getPageSource();

//System.out.println("tittle is ..."+tittle);
//System.out.println("url is ..."+url);
//System.out.println("Page is ..."+page);

//driver.get("https://www.gmail.com");
//driver.navigate().back();

/*
 * driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
 * driver.findElement(By.id("inputUsername")).sendKeys("unnati28797@gmail.com");
 * driver.findElement(By.name("inputPassword")).sendKeys("unnatipatel");
 * driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
 */


driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
driver.findElement(By.linkText("Forgot your password?")).click();
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/input[1]")).sendKeys("unnatipate4l");
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]")).sendKeys("unnatipatel098@gmail.com");
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]")).sendKeys("8748979798");
driver.findElement(By.className("reset-pwd-btn")).click();
try {
Thread.sleep(20000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
driver.quit();

}

}