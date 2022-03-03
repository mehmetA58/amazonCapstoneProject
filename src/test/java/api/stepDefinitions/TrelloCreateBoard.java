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


}
