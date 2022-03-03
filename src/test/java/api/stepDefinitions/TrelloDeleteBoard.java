package api.stepDefinitions;

import io.cucumber.java.en.Given;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class TrelloDeleteBoard extends TrelloTestBaseApi{
    Response response;
    JsonPath jsonPath;
    //--url 'https://api.trello.com/1/boards/{id}'

    @Given("Send request for delete {string}")
    public void sendRequestForDelete(String boardID) {
       setUp();
        spec.pathParams("first",1,"second","boards","third",boardID);
        HashMap<String,String> requestBody=new HashMap<>();
        requestBody.put("key", "57d9b658cbed958b7146ccb29a08a0e7");
        requestBody.put("token","5d2a4ca448bc14f34cb6130e3c353af2d4e3331debaf83651a8652f6064f666f");
        requestBody.put("id",boardID);
        System.out.println(requestBody);

        response= given()
                .spec(spec)
                .contentType("application/json")
                .body(requestBody)
                .when()
                .delete("/{first}/{second}/{third}");
        response.prettyPrint();



    }

}
