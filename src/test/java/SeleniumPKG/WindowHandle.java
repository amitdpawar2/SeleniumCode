package SeleniumPKG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        String parent_window = driver.getWindowHandle();

        driver.findElement(By.id("tabButton")).click();
        Set<String> WinHandle = driver.getWindowHandles();
        System.out.println(WinHandle);
        for(String win:WinHandle)
        {
        if(!win.equals(parent_window))
        {
            driver.switchTo().window(win);
            Assert.assertEquals(driver.findElement(By.id("sampleHeading")).getText(),"This is a sample page");
            driver.close();
        }
        }
        driver.switchTo().window(parent_window);
        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/browser-windows");
        Assert.assertEquals(driver.getTitle(),"ToolsQA");
        //driver.findElement(By.xpath("//span[text()='Alerts']")).click();

        //driver.quit();
        driver.findElement(By.xpath("//span[text()='Alerts']")).click();
        driver.findElement(By.id("alertButton")).click();
        Alert ale = driver.switchTo().alert();
        // ale.getText();
        System.out.println(ale.getText());
        ale.accept();
    }
}