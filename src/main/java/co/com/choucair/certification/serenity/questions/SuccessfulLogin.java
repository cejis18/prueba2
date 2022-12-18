package co.com.choucair.certification.serenity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.choucair.certification.serenity.userinterfaces.LoginPage.TEXT_DASHBOARD;

public class SuccessfulLogin implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return TEXT_DASHBOARD.resolveFor(actor).isDisplayed();
    }

    public static SuccessfulLogin on(){
        return new SuccessfulLogin();
    }
}
