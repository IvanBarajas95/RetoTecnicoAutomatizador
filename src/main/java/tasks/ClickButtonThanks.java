package tasks;

import interactions.ClickOnElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import ui.ModuleThanks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickButtonThanks implements Task {

    public final String buttonThanks;

    public ClickButtonThanks(String buttonThanks){
        this.buttonThanks = buttonThanks;
    }

    public static Performable button(String buttonThanks){
        return instrumented(ClickButtonThanks.class, buttonThanks);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(ClickOnElement.on(ModuleThanks.button(buttonThanks)));
    }
}
