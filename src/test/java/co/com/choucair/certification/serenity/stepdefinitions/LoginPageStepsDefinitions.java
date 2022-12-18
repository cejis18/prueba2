package co.com.choucair.certification.serenity.stepdefinitions;

import co.com.choucair.certification.serenity.interactions.OpenBrowser;
import co.com.choucair.certification.serenity.models.HomePageSerenity;
import co.com.choucair.certification.serenity.models.UserLogin;
import co.com.choucair.certification.serenity.questions.IncorrectCredentials;
import co.com.choucair.certification.serenity.questions.SuccessfulLogin;
import co.com.choucair.certification.serenity.tasks.EnterFieldsInLogin;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginPageStepsDefinitions {

    HomePageSerenity page;

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Jeffer");
    }

    @Given("The user enters the serenity.io page")
    public void theUserEntersTheSerenityIoPage() {
       OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.on(page));
    }
    @When("^The user enters the correct username and password$")
    public void theUserEntersTheCorrectUsernameAndPassword(List<UserLogin> user) {
       OnStage.theActorInTheSpotlight().attemptsTo(EnterFieldsInLogin.on(user.get(0)));
    }
    @Then("The user sees the home page admin")
    public void theUserSeesTheHomePageAdmin() {
        OnStage.theActorInTheSpotlight().should(seeThat(SuccessfulLogin.on()));
    }

    @Then("^The user displays an alert with the message (.*)$")
    public void theUserDisplaysAnAlertWithTheMessage(String message) {
        OnStage.theActorInTheSpotlight().should(seeThat(IncorrectCredentials.on(), Matchers.equalTo(message)));
    }
}
