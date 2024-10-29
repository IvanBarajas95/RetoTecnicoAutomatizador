package cucumber.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Clase de ejecución para los tests de Cucumber con Serenity.
 * Esta clase configura el runner de Cucumber para ejecutar pruebas utilizando Serenity BDD.
 * Se encarga de especificar la ubicación de los archivos de características y los glues necesarios para la ejecución de los tests.
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "cucumber.stepdefinitions",
        //tags = "",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {
}
