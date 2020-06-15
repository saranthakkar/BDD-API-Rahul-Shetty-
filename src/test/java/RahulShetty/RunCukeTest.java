package RahulShetty;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "src\\test\\Resource\\PostData.feature",
@CucumberOptions(features = "src\\test\\Resource\\GetData.feature",
//@CucumberOptions(features = "src\\test\\Resource\\PutData.feature",
//@CucumberOptions(features = "src\\test\\Resource\\Delete.feature",

        plugin = {"html:target/Cucumber-html-report",
        "json:target/Cucumber-report.json"
})
public class RunCukeTest {
}
