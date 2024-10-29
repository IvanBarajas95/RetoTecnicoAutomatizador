package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.interactions.Actions;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class HoverOverElement implements Interaction {

    private final Target element;

    public HoverOverElement(Target element) {
        this.element = element;
    }

    public static HoverOverElement on(Target element) {
        return Tasks.instrumented(HoverOverElement.class, element);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Actions actions = new Actions(BrowseTheWeb.as(actor).getDriver());
        actions.moveToElement(element.resolveFor(actor)).perform();
    }
}

