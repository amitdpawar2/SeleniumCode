package SeleniumPKG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PrintTitle {
    WebDriver driver;


    @BeforeClass
    public void SetUp() throws Exception {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @Test
    public void Execute() {
        // driver.getTitle();
        Assert.assertEquals("ToolsQA", driver.getTitle());
        driver.findElement(By.id("firstName")).sendKeys("Amit");
        driver.findElement(By.id("lastName")).sendKeys("Pawar");
        driver.findElement(By.id("userEmail")).sendKeys("amitdpawar@gmail.com");

        //driver.findElement(By.xpath("//input[@name='gender'][@value='Male']")).click();
        driver.findElement(By.id("userNumber")).sendKeys("9970717298");
        driver.findElement(By.id("dateOfBirthInput")).clear();

        driver.findElement(By.id("dateOfBirthInput")).sendKeys("26 Jun 1984");
       // JavascriptExecutor jse = (JavascriptExecutor)driver;
        //jse.executeScript("document.getElementById('dateOfBirthInput').setAttribute('value', '26 Jun 1984')");


    }

}
