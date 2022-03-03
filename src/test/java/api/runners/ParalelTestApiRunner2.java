package api.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        plugin = {"pretty",
                "html:target/Paralel2_Api_cucumber-reports.html",
                "json:target/json-reports/Paralel2_Api_cucumber.json",
                "junit:target/xml-report/Paralel2_Api_cucumber.xml"
        },
        features = "src/test/resources/features/api_features",
        glue = "api/stepDefinitions",
        tags =  "",
        dryRun = false
)

public class ParalelTestApiRunner2 {
}
