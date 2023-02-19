package swaglabs.tasks.authentication;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Button;
import swaglabs.model.SwaglabsUser;

public class Login {
    public static Performable asA(SwaglabsUser user) {
        return Task.where("{0} login as a" + user,
                Enter.theValue(user.username).into("#user-name"),
                Enter.theValue(user.password).into("#password"),
                Click.on(Button.withText("Login"))
        );
    }
}
