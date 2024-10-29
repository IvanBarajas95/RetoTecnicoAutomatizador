package cucumber.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.OpenPage;

public class EnterPageFloristeriaMundoFlorSteps {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        WebDriverManager.chromedriver().setup();
    }

    @Given("^(.*) estoy en la pagina principal de la tienda$")
    public void queEstoyEnLaPaginaWeb(String Ivan) {
        OnStage.theActorCalled(Ivan).attemptsTo(
                OpenPage.enLaPaginaPrincipal()
        );
    }
}

