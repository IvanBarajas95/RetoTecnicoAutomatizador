package cucumber.stepdefinitions;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.OpenCart;

public class OpenCartStep {
    @When("de clic en la opción “CARRO”")
    public void abrirCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenCart.enLaPagina()
        );
    }
}
