package cucumber.stepdefinitions;

import io.cucumber.java.en.Given;

public class NavigateToCategorySteps {
    @Given("^Ivan esta en la categoria (.*)$") // Agregar espacio antes de (.*)
    public void ivanEstaEnLaCategoria(String categoria) { // Aceptar el argumento
        // Crear una instancia de EnterPageFloristeriaMundoFlorSteps
        EnterPageFloristeriaMundoFlorSteps steps = new EnterPageFloristeriaMundoFlorSteps();
        steps.queEstoyEnLaPaginaWeb("Ivan"); // Llamar al método para abrir la página

        // Crear una instancia de SelectCategoryThanks
        SelectCategoryThanks category = new SelectCategoryThanks();
        category.seleccionoLaCatergoria(categoria); // Pasar el argumento 'categoria'
    }
}
