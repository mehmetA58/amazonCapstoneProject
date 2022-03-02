package api.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigReader;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class TrelloCreateBoard extends TrelloTestBaseApi {
    Response response;
    JsonPath jsonPath;

    @Given("Send request for create {string} board")
    public void send_request_for_create_board(String boardName) {
        //url tanimla
        //expected data-request data
        //request gönder
        //responsu al
        //assert et
        setUp();
        spec.pathParams("first",1,"second","boards");
        HashMap<String,String>requestBody=new HashMap<>();
        requestBody.put("name",boardName);
        requestBody.put("key", "57d9b658cbed958b7146ccb29a08a0e7");
        requestBody.put("token","5d2a4ca448bc14f34cb6130e3c353af2d4e3331debaf83651a8652f6064f666f");
        System.out.println(requestBody);

      response= given()
                .spec(spec)
                .contentType("application/json")
                .body(requestBody)
                .when()
                .post("/{first}/{second}");

      response.prettyPrint();
      jsonPath=response.jsonPath();

    }
    @Then("Assert status code {int}")
    public void assertStatusCode(int statusCode) {
        Assert.assertEquals(statusCode,response.getStatusCode());

    }


    @Then("Assert board name is {string}")
    public void assert_board_name_is(String boardName) {
        Assert.assertEquals(boardName,jsonPath.getString("name"));

    }



}
