package SeleniumPKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class BrowserTest {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/");
        driver.getTitle();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
        System.out.println("THis is web page title");
        driver.findElement(By.linkText("REGISTER")).click();
        driver.findElement(By.name("firstName")).sendKeys("Amit");
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Pawar");
        driver.findElement(By.name("phone")).sendKeys("9970717298");
        driver.findElement(By.id("userName")).sendKeys("amitdpwar2@gmail.com");
        driver.findElement(By.name("address1")).sendKeys("Splendour");
        driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Pune");
        driver.findElement(By.cssSelector("input[name='state']")).sendKeys("Maharashtra");
        driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys("411057");
        WebElement Sele= driver.findElement(By.xpath("//select[@name='country']"));
        Select obj= new Select(Sele);
        obj.selectByVisibleText("ALBANIA");
        driver.findElement(By.id("email")).sendKeys("amitdpawar2@gmail.com");
        driver.findElement(By.name("password")).sendKeys("India123");
        driver.findElement(By.name("confirmPassword")).sendKeys("India123");
        driver.findElement(By.xpath("//input[@name='submit'][@type='submit']")).click();
        String msg= driver.findElement(By.xpath("//table/tbody/tr[3]/td/p[1]/font/b")).getText();
        System.out.println(msg);
        String msg2=driver.findElement(By.xpath("//p/font/b[contains(text(),'Note: Your user name is')]")).getText();
        Assert.assertEquals(msg,"Dear Amit Pawar,");
        Assert.assertEquals(msg2,"Note: Your user name is amitdpa@gmail.com.","Unable to verify username");
        System.out.println(msg2);
       // driver.close();


    }
}
