package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import starter.ui.dashboard.OverviewData;
import starter.ui.dashboard.login.DoLogin;
import starter.navigation.NavigateTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Cuando("él envía sus credenciales")
    public void élEnvíaSusCredenciales() {
        theActorInTheSpotlight().attemptsTo(
                DoLogin.withCredentials("xt9196","123")
        );
    }

    @Entonces("él debería tener acceso para administrar su cuenta")
    public void élDeberíaTenerAccesoParaAdministrarSuCuenta() {
        theActorInTheSpotlight().should(
                seeThat("The displayed credit available", OverviewData.creditAvailable(), Matchers.equalTo("$17,800")),
                seeThat("The displayed total balance", OverviewData.totalBalance(), Matchers.equalTo("$350"))
        );
    }

    @Dado("{string} tiene una cuenta activa")
    public void sergeyTieneUnaCuentaActiva(String name) {
        theActorCalled(name).can(BrowseTheWeb.with(Serenity.getDriver()));
        theActorCalled(name).wasAbleTo(
                NavigateTo.theLoginPage()
        );
    }
}
