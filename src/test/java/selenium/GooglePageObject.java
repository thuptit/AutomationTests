package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class GooglePageObject extends BasePage {
    public void enterText(String text){
        By textarea = new By.ByXPath("//textarea[@id='APjFqb']");
        this.waitElement(textarea);
        WebElement element = this.get_webDriver().findElement(textarea);
        element.sendKeys("GEM vietnam");
        element.sendKeys(Keys.ENTER);
    }
    public void containsText(String text){
        By txtResult = new By.ById("result-stats");
        this.waitElement(txtResult);
        WebElement element = this.get_webDriver().findElement(txtResult);
        Assert.assertTrue(element.getText().contains(text));
        this.quit();
    }
    @Override
    public String driverName(){
        return "chrome";
    }
}
