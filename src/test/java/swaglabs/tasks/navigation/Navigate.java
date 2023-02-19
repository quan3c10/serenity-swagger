package swaglabs.tasks.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate {
    public static Performable toTheCatalogPage() {
        return Open.url("https://www.saucedemo.com/inventory.html");
    }

    public static Performable toTheShoppingCart() {
        return Click.on(".shopping_cart_link");
    }
}
