package co.com.choucair.certification.serenity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target INPUT_USER_NAME = Target.the("User name").
            located(By.id("LoginPanel0_Username"));

    public static final Target INPUT_PASSWORD= Target.the("Password").
            located(By.id("LoginPanel0_Password"));

    public static final Target BTN_LOGIN= Target.the("BUTTON LOGIN").
            located(By.id("LoginPanel0_LoginButton"));

    public static final Target TEXT_DASHBOARD= Target.the("TEXT dashboard").
            locatedBy("//h1[text()='Dashboard']");

    public static final Target TEXT_ALERT= Target.the("TEXT ALERT").
            located(By.className("toast-message"));

}
