package cucumber.stepdefinitions;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.ClickButtonThanks;

public class SelectCategoryThanks {

    @When("^selecciono la categoria (.*)$")
    public void seleccionoLaCatergoria(String categoria){
        OnStage.theActorInTheSpotlight().attemptsTo(ClickButtonThanks.button(categoria));
    }
}

