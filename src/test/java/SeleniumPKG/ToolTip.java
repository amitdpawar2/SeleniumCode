package SeleniumPKG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;

import static com.sun.org.apache.xml.internal.serialize.LineSeparator.Web;

public class ToolTip {
    WebDriver driver;

    @BeforeClass
            public void Setup()
    {
       driver= new ChromeDriver();
        driver.get("http://www.menucool.com/tooltip/javascript-tooltip");
    }
    Actions actions = new Actions();


}
