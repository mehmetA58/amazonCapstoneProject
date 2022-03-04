package api.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigReader;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class TrelloCreateBoard extends TrelloTestBaseApi {
    Response response;
    JsonPath jsonPath;



    @Then("Assert board name is {string}")
    public void assert_board_name_is(String boardName) {
        Assert.assertEquals(boardName,jsonPath.getString("name"));

    }


    @Given("birtane board create edelim.")
    public void birtaneBoardCreateEdelim() {
        //https://api.trello.com/1/boards/?name=aaa&key=57d9b658cbed958b7146ccb29a08a0e7&token=5d2a4ca448bc14f34cb6130e3c353af2d4e3331debaf83651a8652f6064f666f
    setUp();
    spec.pathParams("first",1,"second","boards");
        HashMap<String,String> requestBody=new HashMap<>();
        requestBody.put("key", "57d9b658cbed958b7146ccb29a08a0e7");
        requestBody.put("token","5d2a4ca448bc14f34cb6130e3c353af2d4e3331debaf83651a8652f6064f666f");
        requestBody.put("name","amazon");
        System.out.println(requestBody);

        response=given()
                .spec(spec)
                .contentType("application/json")
                .body(requestBody)
                .when()
                .post("/{first}/{second}");

        response.prettyPrint();


    }

    @Given("birtane card create edelim")
    public void birtaneCardCreateEdelim() {
        //'https://api.trello.com/1/cards?idList=622274e122918328ab6c9ad9'
        setUp();
        spec.pathParams("first",1,"second","cards");
        HashMap<String,String> requestBody=new HashMap<>();
        requestBody.put("key", "57d9b658cbed958b7146ccb29a08a0e7");
        requestBody.put("token","5d2a4ca448bc14f34cb6130e3c353af2d4e3331debaf83651a8652f6064f666f");
        requestBody.put("idList","622274e122918328ab6c9ad9");
        requestBody.put("name","kart olustu");
        System.out.println(requestBody);

        response=given()
                .spec(spec)
                .contentType("application/json")
                .body(requestBody)
                .when()
                .post("/{first}/{second}");




    }
}
