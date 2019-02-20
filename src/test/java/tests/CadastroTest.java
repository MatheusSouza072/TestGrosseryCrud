package tests;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java",
		plugin = "pretty",
		glue = {"" },
		monochrome = true,
		dryRun = false,
		snippets = SnippetType.CAMELCASE)

public class CadastroTest {

}
