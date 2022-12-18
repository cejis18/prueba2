package co.com.choucair.certification.serenity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.choucair.certification.serenity.userinterfaces.LoginPage.TEXT_ALERT;

public class IncorrectCredentials implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TEXT_ALERT.resolveFor(actor).getText();
    }

    public static IncorrectCredentials on(){
        return new IncorrectCredentials();
    }
}
