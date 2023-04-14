package swaglabs.tasks.authentication;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Button;
import org.openqa.selenium.By;
import swaglabs.model.SwaglabsUser;

public class Login {
    public static Performable asA(SwaglabsUser user) {
        return Task.where("{0} login as a" + user,
                Click.on(By.xpath("//android.widget.HorizontalScrollView/following-sibling::android.view.View[2]")),
                Enter.theValue(user.username).into("//android.widget.ImageView[1]/following-sibling::android.widget.EditText[1]"),
                Enter.theValue(user.password).into("//android.widget.ImageView[1]/following-sibling::android.widget.EditText[2]"),
                Click.on(By.xpath("//android.widget.ImageView[1]/following-sibling::android.widget.Button[1]"))
        );
    }
}
