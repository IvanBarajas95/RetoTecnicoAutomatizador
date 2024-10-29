package cucumber.stepdefinitions;

import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import questions.ThanksProductsVisible;


public class ViewProductsSteps {

    @Then("^(.*) deberia ver los productos de la categoria Agradecimientos$")
    public void VerProductosCategoriaAgradecimientos(String Ivan){
        OnStage.theActorCalled(Ivan).should(GivenWhenThen.seeThat("Los productos de agradecimientos son visibles", ThanksProductsVisible.inSection(), Matchers.is(true)));
    }

}
