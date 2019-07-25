package Test_Steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Test/Demo.feature",plugin="json:target/jsonreport.json")
public class TestRunner {

}
