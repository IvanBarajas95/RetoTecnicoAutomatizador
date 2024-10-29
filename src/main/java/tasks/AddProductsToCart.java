package tasks;

import interactions.HoverOverElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;
import ui.ModuleThanks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProductsToCart implements Task {

    @Override

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ModuleThanks.BOTON_LISTA),
                Click.on(ModuleThanks.PRIMER_PRODUCTO_AGREGAR),
                Click.on(ModuleThanks.BOTON_SEGUIRCOMPRANDO),
                Click.on(ModuleThanks.SEGUNDO_PRODUCTO_AGREGAR)


        );
        // Obtener y verificar el mensaje actual
        String mensajeActual = actor.asksFor(Text.of(ModuleThanks.MENSAJE_PRODUCTO_AGREGADO));
        System.out.println("Mensaje actual: " + mensajeActual); // Imprimir el mensaje actual
    }



    public static AddProductsToCart toCart(){
        return instrumented(AddProductsToCart.class);
    }
}

