package questions;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class ProductsInTheCart implements Question<Boolean> {

    private final List<Target> productos;

    public ProductsInTheCart(List<Target> productos) {
        this.productos = productos;
    }

    public static ProductsInTheCart sonVisibles(List<Target> productos) {
        return new ProductsInTheCart(productos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return productos.stream().allMatch(producto -> producto.resolveFor(actor).isVisible());
    }
}

