package cucumber.stepdefinitions;

import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.targets.Target;
import questions.VerifyProductsInTheCart;
import ui.ModuleThanks;
import static org.hamcrest.CoreMatchers.is;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.Arrays;
import java.util.List;

public class VerifyProductsInTheCartStep {

    @Then("se deberán visualizar los productos agregados")
    public void verificarProductosEnCarrito() {
        // Crear una lista de Targets para los productos a verificar
        List<Target> productosEsperados = Arrays.asList(
                ModuleThanks.PRODUCTO_1_EN_CARRO,  // Ajusta esto según tu implementación de ModuleThanks
                ModuleThanks.PRODUCTO_2_EN_CARRITO
        );

        OnStage.theActorInTheSpotlight().should(
                seeThat(VerifyProductsInTheCart.sonVisibles(productosEsperados), is(true))
        );
    }
}

