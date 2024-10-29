package cucumber.stepdefinitions;

import io.cucumber.java.en.When;
import tasks.AddProductsToCart;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddProductsToCartSteps {

    @When("^(.*)agrega dos productos al carrito$")
    public void agregaDosProductosAlcarrito(String Ivan){
        theActorInTheSpotlight().attemptsTo(AddProductsToCart.toCart());
    }

}
