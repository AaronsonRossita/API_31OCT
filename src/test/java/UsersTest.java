import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UsersTest {

//   given() - parameters
//   when() - request
//   then() - response

    @Test
    void testOne(){
        given().when().get(K.findById(7)).then().log().all();
    }

    @Test
    void testTwo(){
        //given().when().get(K.LOCAL).then().log().all();
        //given().when().get(K.LOCAL + "?" + K.ID + 1).then().log().all();
        given().when().get(K.LOCAL + "?" + K.NAME + "b").then().log().all();
    }

    @Test
    void testThree(){
//        given().when().get(K.LOCAL).then().log().all();
        given().when().get(K.LOCAL).then().statusCode(200);
//        int responseCode = given().when().get(K.LOCAL).getStatusCode();
//        Assert.assertEquals(responseCode,201);
    }

    //https://api.nytimes.com/svc/movies/v2/reviews/search.json
    //api-key
    //JtoqAANtDZP1xsaRtcBNlAKJ3BAZbPQF
    //query
    //

    @Test
    void testFour(){
        given()
                .queryParam("api-key","JtoqAANtDZP1xsaRtcBNlAKJ3BAZbPQF")
                .queryParam("query","matrix")
        .when()
                .get("https://api.nytimes.com/svc/movies/v2/reviews/search.json")
        .then()
                .log().all();
    }

    @Test
    void testFive(){
        given().when().delete(K.LOCAL + "/2").then().statusCode(200);
    }

    @Test
    void testSix(){
        given()
                .contentType(ContentType.JSON)
//                .body("{\n"+
//                        "\"name\": \"c\",\n" +
//                        "\"lastname\": \"cc\"\n" +
//                        "}")
//                .body("{\"name\": \"d\",\"lastname\":\"dd\"}")
                .body(K.jsonBody("e","ee"))
                .post(K.LOCAL)
        .then()
                .statusCode(201);
    }

}
