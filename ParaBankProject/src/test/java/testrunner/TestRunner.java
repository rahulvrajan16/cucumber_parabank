package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue={"step/definitions"}, monochrome = true,
        plugin = {"pretty","html:target/HtmlReports/HtmlReport",
                  "junit:target/JunitReports/report",
                  "json:target/JsonReports/JsonReport.json"},
        tags ="@Regression"
)
public class TestRunner {
}
