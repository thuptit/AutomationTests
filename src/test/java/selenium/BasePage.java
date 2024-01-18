package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import shared.WebDriverFactory;

import java.time.Duration;

public abstract class BasePage {
    private WebDriver _webDriver;

    public WebDriver get_webDriver() {
        return _webDriver;
    }

    protected void set_webDriver(WebDriver _webDriver) {
        this._webDriver = _webDriver;
    }

    public BasePage(){
        _webDriver = WebDriverFactory.createWebDriver(this.driverName());
    }
    public abstract String driverName();
    public void navigateTo(String url){
        _webDriver.get(url);
    }
    protected void waitElement(By elementLocator){
        WebDriverWait wait = new WebDriverWait(_webDriver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(elementLocator));
    }
    protected void quit(){
        _webDriver.quit();
    }
}
