package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ui.ModuleThanks;

public class ThanksProductsVisible implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        // Accede directamente al Target y verifica si es visible
        return ModuleThanks.PRODUCT_LIST.resolveFor(actor).isVisible();
    }

    public static ThanksProductsVisible inSection() {
        return new ThanksProductsVisible();
    }
}
