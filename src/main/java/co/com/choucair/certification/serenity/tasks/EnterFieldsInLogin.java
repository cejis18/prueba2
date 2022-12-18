package co.com.choucair.certification.serenity.tasks;

import co.com.choucair.certification.serenity.models.UserLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static co.com.choucair.certification.serenity.userinterfaces.LoginPage.*;

public class EnterFieldsInLogin implements Task {

    private UserLogin user;

    public EnterFieldsInLogin(UserLogin user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(user.getUserName()).into(INPUT_USER_NAME));
        actor.attemptsTo(Enter.theValue(user.getPassword()).into(INPUT_PASSWORD));
        actor.attemptsTo(Click.on(BTN_LOGIN));
    }

    public static EnterFieldsInLogin on(UserLogin user){
        return Tasks.instrumented(EnterFieldsInLogin.class, user);
    }
}
