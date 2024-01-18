package shared;

import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class  WebDriverFactory {
    public static WebDriver createWebDriver(String driverName){
        if(driverName.equalsIgnoreCase("chrome"))
            return new ChromeDriver();
        else if(driverName.equalsIgnoreCase("edge"))
            return new EdgeDriver();
        else if(driverName.equalsIgnoreCase("firefox"))
            return new FirefoxDriver();

        throw new NotFoundException("Diver Name is not found");
    }
}
