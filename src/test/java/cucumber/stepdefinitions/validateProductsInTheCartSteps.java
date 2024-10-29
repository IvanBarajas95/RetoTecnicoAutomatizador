package cucumber.stepdefinitions;

import io.cucumber.java.en.Then;
import questions.ProductsInTheCart;
import ui.ModuleThanks;

import java.util.Arrays;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;


public class validateProductsInTheCartSteps {
    @Then("los productos se agregaran al carrito de compras")
    public void validarProductosEnCarrito() {
        theActorInTheSpotlight().should(seeThat(
                ProductsInTheCart.sonVisibles(Arrays.asList(
                        ModuleThanks.PRODUCTO_1_EN_CARRITO,
                        ModuleThanks.PRODUCTO_2_EN_CARRITO
                )), is(true)
        ));
    }
}
