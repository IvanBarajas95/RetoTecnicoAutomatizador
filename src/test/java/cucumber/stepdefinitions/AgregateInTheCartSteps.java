package cucumber.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.OpenPage;
import tasks.ClickButtonThanks;
import tasks.AddProductsToCart;

public class AgregateInTheCartSteps {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast()); // Asegúrate de inicializar el escenario
    }

    @Given("que he agregado los productos de la categoría {string} al carrito")
    public void queHeAgregadoLosProductosDeLaCategoriaAlCarrito(String categoria) {
        // Asegúrate de que el actor "Iván" esté creado
        OnStage.theActorCalled("Iván").attemptsTo(
                OpenPage.enLaPaginaPrincipal(),   // Abre la página
                ClickButtonThanks.button(categoria), // Selecciona la categoría
                AddProductsToCart.toCart()         // Agrega los productos al carrito
        );
    }
}


