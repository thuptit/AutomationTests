package definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.GooglePageObject;

public class MyStepDefinition {
    private final GooglePageObject _googlePage;
    public MyStepDefinition(){
        _googlePage = new GooglePageObject();
    }

    @Given("I navigate browser to {string}")
    public void iNavigateBrowserTo(String arg0) {
        _googlePage.navigateTo(arg0);
    }

    @When("I enter to input to search {string}")
    public void iEnterToInputToSearch(String arg0) {
        _googlePage.enterText(arg0);
    }

    @Then("the result should be {string} on the screen")
    public void theResultShouldBeOnTheScreen(String arg0) {
        _googlePage.containsText(arg0);
    }
}
