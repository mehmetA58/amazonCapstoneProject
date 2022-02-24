package api.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        plugin = {"pretty",
                "html:target/Paralel1_Api_cucumber-reports.html",
                "json:target/json-reports/Paralel1_Api_cucumber.json",
                "junit:target/xml-report/Paralel1_Api_cucumber.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/resources/features/api_features",
        glue = "src/test/java/api/stepDefinitions",
        tags="@Paralel1"  ,

        dryRun= false
)

public class ParalelTestApiRunner1 {

}
