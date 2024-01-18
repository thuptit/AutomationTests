package common;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/java/cucumber/scenario first.feature",
        glue = {"definition","MyStepDefinition"}
)
public class TestRunner {
    private final TestNGCucumberRunner testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());

    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        // Setup before the test class starts

    }

    @Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
    public void runCucumberScenario(PickleWrapper pickle, FeatureWrapper feature) throws Throwable {
        testNGCucumberRunner.runScenario(pickle.getPickle());
    }

    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return testNGCucumberRunner.provideScenarios();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        testNGCucumberRunner.finish();
    }
}
