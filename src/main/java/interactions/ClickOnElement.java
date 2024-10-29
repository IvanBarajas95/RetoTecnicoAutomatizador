package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ClickOnElement implements Interaction {

    private final Target button;

    public ClickOnElement (Target button){
        this.button = button;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(button));
    }

    public static ClickOnElement on(Target button){
        return Tasks.instrumented(ClickOnElement.class, button);
    }
}
