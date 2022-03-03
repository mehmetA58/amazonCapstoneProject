package ui.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={
                "html:target/cucumber-reportsUI.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"

        },
        features = "src/test/resources/features/ui_features",
        glue = "ui/stepDefinitions",
        tags = "@Regression",
        dryRun =false
)


public class Runner {
}
