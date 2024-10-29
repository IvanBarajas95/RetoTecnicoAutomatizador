package cucumber.utils;

import net.serenitybdd.rest.SerenityRest;
import io.restassured.response.Response;

public class ApiUtils {

    public static Response getUsers(int page) {
        return SerenityRest.given()
                .baseUri("https://reqres.in")
                .when()
                .get("/api/users?page=" + page);
    }

    public static Response createUser(String jsonBody) {
        return SerenityRest.given()
                .contentType("application/json")
                .body(jsonBody)
                .when()
                .post("/api/users");
    }

    public static Response updateUser(int id, String jsonBody) {
        return SerenityRest.given()
                .contentType("application/json")
                .body(jsonBody)
                .when()
                .put("/api/users/" + id);
    }

    public static Response deleteUser(int id) {
        return SerenityRest.given()
                .when()
                .delete("/api/users/" + id);
    }
}
