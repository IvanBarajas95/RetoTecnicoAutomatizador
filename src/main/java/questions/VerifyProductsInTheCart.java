package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class VerifyProductsInTheCart implements Question<Boolean> {

    private final List<Target> productos;

    public VerifyProductsInTheCart(List<Target> productos) {
        this.productos = productos;
    }

    public static VerifyProductsInTheCart sonVisibles(List<Target> productos) {
        return new VerifyProductsInTheCart(productos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return productos.stream().allMatch(producto -> producto.resolveFor(actor).isVisible());
    }
}


