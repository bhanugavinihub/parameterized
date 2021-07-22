package runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

		@RunWith(Cucumber.class)
		@CucumberOptions(
				features ="src/test/resources/Features",
				glue = { "stepDefination" }, 
				monochrome = true, 
				plugin = {"pretty","html:target/cucumber", "json:target/cucumber.json"}
				//,

			//	tags ={"@PCC_Footer_Linkden_Login.RNL"}

)
		public class TestRunner {
			
		}
		