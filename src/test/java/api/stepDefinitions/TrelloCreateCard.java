//package api.stepDefinitions;
//
//import io.cucumber.java.en.Given;
//import io.restassured.RestAssured;
//import io.restassured.http.Method;
//import io.restassured.path.json.JsonPath;
//import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//import static io.restassured.RestAssured.given;
//
//public class TrelloCreateCard extends TrelloTestBaseApi {
//    Response response;
//    JsonPath jsonPath;
//    public String boardID="";
//    public ArrayList cardIDList = new ArrayList();
//    @Given("Send request for create {string} board")
////    public void send_request_for_create_board(String boardName) {
////        //url tanimla
////        //expected data-request data
////        //request gönder
////        //responsu al
////        //assert et
////        setUp();
////        spec.pathParams("first",1,"second","boards");
////        HashMap<String,String>requestBody=new HashMap<>();
////        requestBody.put("name",boardName);
////        requestBody.put("key", "57d9b658cbed958b7146ccb29a08a0e7");
////        requestBody.put("token","5d2a4ca448bc14f34cb6130e3c353af2d4e3331debaf83651a8652f6064f666f");
////        System.out.println(requestBody);
////
////        response= given()
////                .spec(spec)
////                .contentType("application/json")
////                .body(requestBody)
////                .when()
////                .post("/{first}/{second}");
////
////        response.prettyPrint();
////        jsonPath=response.jsonPath();
////        RequestSpecification httpRequest = RestAssured.given();
////
////        //Response object
////        Response response = httpRequest.request(Method.POST,"/boards");
////
////        this.boardID = response.jsonPath().getString("idList");
////
//////    }
////
////    //https://api.trello.com/1/cards?key=57d9b658cbed958b7146ccb29a08a0e7&token=5d2a4ca448bc14f34cb6130e3c353af2d4e3331debaf83651a8652f6064f666f&idList=621e584c335b8f5a8760ac86&name=This is my postman card
////    public String increment(String number) {
////
////        char[] cars = number.toCharArray();
////        for (int i = cars.length - 1; i >= 0; i--) {
////            if (cars[i] == 'z') {
////                cars[i] = 'a';
////            } else if (cars[i] == '9') {
////                cars[i] = '0';
////            } else {
////                cars[i]++;
////                break;
////            }
////        }
////        return String.valueOf(cars);
////    }
//
//
//    @Given("Send request for create {string} card")
//    public void sendRequestForCreateCard(String cardName) {
//        String idList = increment(this.boardID);
//        setUp();
//        spec.pathParams("first",1,"second","cards");
//        HashMap<String,String> requestBody=new HashMap<>();
//
//        requestBody.put("key", "57d9b658cbed958b7146ccb29a08a0e7");
//        requestBody.put("token","5d2a4ca448bc14f34cb6130e3c353af2d4e3331debaf83651a8652f6064f666f");
//        requestBody.put("idList",idList);
//        requestBody.put("name",cardName);
//        System.out.println(requestBody);
//
//        response=given()
//                .spec(spec)
//                .contentType("application/json")
//                .body(requestBody)
//                .when()
//                .post("/{first}/{second}");
//        response.prettyPrint();
//        jsonPath=response.jsonPath();
//        this.cardIDList.add(response.jsonPath().getString("idList"));
//    }
//
//
//
//
//
//
////--url 'https://api.trello.com/1/cards/{id}' \
//    @Given("Send request for GET {string} card")
//    public void sendRequestForGETCard(String id) {
//        setUp();
//        spec.pathParams("first",id,"second",1,"third","cards");
//        HashMap<String,String> requestBody=new HashMap<>();
//        requestBody.put("key", "57d9b658cbed958b7146ccb29a08a0e7");
//        requestBody.put("token","5d2a4ca448bc14f34cb6130e3c353af2d4e3331debaf83651a8652f6064f666f");
//        requestBody.put("",id);
//        System.out.println(requestBody);
//
//        response=given()
//                .spec(spec)
//                .contentType("application/json")
//                .body(requestBody)
//                .when()
//                .get("/{first}/{second}/{third}");
//        response.prettyPrint();
//        jsonPath=response.jsonPath();
//
//    }
//
//
//}
