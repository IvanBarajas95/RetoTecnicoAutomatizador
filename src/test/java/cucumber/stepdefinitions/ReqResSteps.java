package cucumber.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import net.serenitybdd.rest.SerenityRest;

public class ReqResSteps {

    private Response response;
    private int userId;

    @Given("que accedo al servicio de listar usuarios de ReqRes")
    public void accessListUsers() {
        // No se necesita acción aquí, solo se accede al servicio.
    }

    @When("realizo una solicitud GET al endpoint {string}")
    public void getUsers(String endpoint) {
        response = SerenityRest.given()
                .baseUri("https://reqres.in")
                .when()
                .get(endpoint);
    }

    @Then("la respuesta debe contener la lista de usuarios en la página {int} y el estado de la respuesta debe ser {int}")
    public void verifyGetUsers(int page, int statusCode) {
        response.then().statusCode(statusCode);
        assertEquals(page, response.jsonPath().getInt("page"));
        assertThat(response.jsonPath().getList("data"), is(not(empty())));
    }

    @Given("que tengo los datos para crear un nuevo usuario")
    public void prepareUserData() {
        // Definimos los datos del nuevo usuario.
        String jsonBody = "{\"name\": \"morpheus\", \"job\": \"leader\"}";
        response = SerenityRest.given()
                .baseUri("https://reqres.in")
                .contentType("application/json")
                .body(jsonBody)
                .when()
                .post("/api/users");
        userId = response.jsonPath().getInt("id"); // Guardar el ID del nuevo usuario.
    }

    @When("realizo una solicitud POST al endpoint {string} con los datos del usuario")
    public void postUser(String endpoint) {
        // El cuerpo ya se envió en el método prepareUserData.
        // No se necesita acción adicional aquí.
    }

    @Then("la respuesta debe indicar que el usuario fue creado exitosamente con un estado {int}, y debe devolver el ID del usuario creado")
    public void verifyCreateUser(int statusCode) {
        response.then().statusCode(statusCode);
        assertEquals(userId, response.jsonPath().getInt("id"));
    }

    @Given("que tengo un ID de usuario existente")
    public void existingUserId() {
        userId = 2; // Suponiendo que este ID existe.
        // Aquí podrías hacer una verificación adicional si es necesario.
    }

    @When("realizo una solicitud PUT al endpoint {string} con datos actualizados")
    public void putUser(String endpoint) {
        String jsonBody = "{\"name\": \"morpheus\", \"job\": \"zion resident\"}";
        response = SerenityRest.given()
                .baseUri("https://reqres.in")
                .contentType("application/json")
                .body(jsonBody)
                .when()
                .put("/api/users/" + userId);
    }

    @Then("la respuesta debe indicar que el usuario fue actualizado exitosamente con un estado {int}, y debe devolver los datos actualizados")
    public void verifyUpdateUser(int statusCode) {
        response.then().statusCode(statusCode);
        assertEquals("morpheus", response.jsonPath().getString("name"));
        assertEquals("zion resident", response.jsonPath().getString("job"));
    }

    @When("realizo una solicitud DELETE al endpoint {string}")
    public void deleteUser(String endpoint) {
        response = SerenityRest.given()
                .baseUri("https://reqres.in")
                .when()
                .delete("/api/users/" + userId);
    }

    @Then("la respuesta debe devolver un estado {int}, indicando que el usuario fue eliminado exitosamente")
    public void verifyDeleteUser(int statusCode) {
        response.then().statusCode(statusCode);
        // No hay contenido para verificar en caso de eliminación exitosa (204).
        assertEquals(204, statusCode);
    }
}
