package com.miquido.javaforqa.week05;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class ApiTest {

  @Test
  void getUser() {
    RestAssured.get("https://reqres.in/api/users/2")
        .then()
        .assertThat()
        .statusCode(200)
        .body("data.id", equalTo(2));
  }

  @Test
  void userNotFound() {
    RestAssured.get("https://reqres.in/api/users/23")
        .then()
        .assertThat()
        .statusCode(404);
  }

  @Test
  void createUser() {
    RestAssured
        .given()
          .contentType(ContentType.JSON)
          .body("{\n" +
            "    \"name\": \"morpheus\",\n" +
            "    \"job\": \"leader\"\n" +
            "}")
        .when()
          .post("https://reqres.in/api/users")
        .then().assertThat()
          .statusCode(201)
          .body("job", equalTo("leader"));

  }

}
