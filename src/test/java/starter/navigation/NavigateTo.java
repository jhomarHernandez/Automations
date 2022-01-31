package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.ui.dashboard.login.LoginForm;

public class NavigateTo {
    public static Performable theLoginPage() {
        return Task.where("{0} opens the Wikipedia home page",
                Open.browserOn().the(LoginForm.class));
    }
}
