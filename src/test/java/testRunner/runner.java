package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"src/test/java/stepDefinitions","src/test/java/utils"},
        plugin = {"pretty", "html:target/cucumber-html-report","json:cucumber.json"}
)
public class runner {
}