package api.stepDefinitions;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class APIRequests {

    public String boardID="";
    public ArrayList cardIDList = new ArrayList();

    public void createNewBoard(String boardName){

        RestAssured.baseURI = "https://api.trello.com/1";

        RequestSpecification httpRequest = RestAssured.given();
//Response alma metodumuz
        JSONObject requestParams = new JSONObject();
        requestParams.put("key", "57d9b658cbed958b7146ccb29a08a0e7");
        requestParams.put("token","5d2a4ca448bc14f34cb6130e3c353af2d4e3331debaf83651a8652f6064f666f");

        requestParams.put("name", boardName);

        httpRequest.header("Content-type", "application/json");
        httpRequest.body(requestParams.toString());


        Response response = httpRequest.request(Method.POST,"/boards");

        this.boardID = response.jsonPath().getString("id");

        int statusCode = response.getStatusCode();
        System.out.println(statusCode);
        Assert.assertEquals(statusCode,200);

    }

    public void createNewCard(String cardName){
        String idList = increment(this.boardID);


        RestAssured.baseURI = "https://api.trello.com/1";

        RequestSpecification httpRequest = RestAssured.given();

        JSONObject requestParams = new JSONObject();
        requestParams.put("key", "57d9b658cbed958b7146ccb29a08a0e7");
        requestParams.put("token","5d2a4ca448bc14f34cb6130e3c353af2d4e3331debaf83651a8652f6064f666f");
        requestParams.put("idList", idList);
        requestParams.put("name", cardName);

        httpRequest.header("Content-type", "application/json");
        httpRequest.body(requestParams.toString());


        Response response = httpRequest.request(Method.POST,"/cards");

        int statusCode = response.getStatusCode();
        System.out.println(statusCode);
        Assert.assertEquals(statusCode,200);

        this.cardIDList.add(response.jsonPath().getString("id"));
    }

    public String increment(String number) {
        char[] cars = number.toCharArray();
        for (int i = cars.length - 1; i >= 0; i--) {
            if (cars[i] == 'z') {
                cars[i] = 'a';
            } else if (cars[i] == '9') {
                cars[i] = '0';
            } else {
                cars[i]++;
                break;
            }
        }
        return String.valueOf(cars);
    }

    public void updateCard(String name){

        String cardID = (String) this.cardIDList.get(0);

        RestAssured.baseURI = "https://api.trello.com/1";

        RequestSpecification httpRequest = RestAssured.given();

        JSONObject requestParams = new JSONObject();
        requestParams.put("key", "57d9b658cbed958b7146ccb29a08a0e7");
        requestParams.put("token","5d2a4ca448bc14f34cb6130e3c353af2d4e3331debaf83651a8652f6064f666f");
        requestParams.put("name", name);

        httpRequest.header("Content-type", "application/json");
        httpRequest.body(requestParams.toString());


        Response response = httpRequest.request(Method.PUT,"/cards/" + cardID);

        int statusCode = response.getStatusCode();
        String updatedName = response.jsonPath().getString("name");

        System.out.println(statusCode);
        Assert.assertEquals(statusCode,200);
        Assert.assertEquals(updatedName,name);
    }

    public void deleteCard1(){
        String cardID = (String) this.cardIDList.get(0);

        RestAssured.baseURI = "https://api.trello.com/1";

        RequestSpecification httpRequest = RestAssured.given();

        JSONObject requestParams = new JSONObject();
        requestParams.put("key", "57d9b658cbed958b7146ccb29a08a0e7");
        requestParams.put("token","5d2a4ca448bc14f34cb6130e3c353af2d4e3331debaf83651a8652f6064f666f");

        httpRequest.header("Content-type", "application/json");
        httpRequest.body(requestParams.toString());


        Response response = httpRequest.request(Method.DELETE,"/cards/" + cardID);

        int statusCode = response.getStatusCode();

        System.out.println(statusCode);
        Assert.assertEquals(statusCode,200);
    }

    public void deleteCard2(){
        String cardID = (String) this.cardIDList.get(1);

        RestAssured.baseURI = "https://api.trello.com/1";

        RequestSpecification httpRequest = RestAssured.given();

        JSONObject requestParams = new JSONObject();
        requestParams.put("key", "57d9b658cbed958b7146ccb29a08a0e7");
        requestParams.put("token","5d2a4ca448bc14f34cb6130e3c353af2d4e3331debaf83651a8652f6064f666f");

        httpRequest.header("Content-type", "application/json");
        httpRequest.body(requestParams.toString());


        Response response = httpRequest.request(Method.DELETE,"/cards/" + cardID);

        int statusCode = response.getStatusCode();

        System.out.println(statusCode);
        Assert.assertEquals(statusCode,200);
    }

    public void deleteBoard(){

        RestAssured.baseURI = "https://api.trello.com/1";

        RequestSpecification httpRequest = RestAssured.given();

        JSONObject requestParams = new JSONObject();
        requestParams.put("key", "57d9b658cbed958b7146ccb29a08a0e7");
        requestParams.put("token","5d2a4ca448bc14f34cb6130e3c353af2d4e3331debaf83651a8652f6064f666f");

        httpRequest.header("Content-type", "application/json");
        httpRequest.body(requestParams.toString());


        Response response = httpRequest.request(Method.DELETE,"/boards/" + boardID);

        int statusCode = response.getStatusCode();

        System.out.println(statusCode);
        Assert.assertEquals(statusCode,200);
    }

}

