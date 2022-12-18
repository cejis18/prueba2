package co.com.choucair.certification.serenity.runners;



import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login_page.feature",
                glue = "co.com.choucair.certification.serenity.stepdefinitions",
                snippets = CAMELCASE)
public class LoginPage {
}
