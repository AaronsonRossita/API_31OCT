import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UsersTest {

    //given() - parameters
    //when() - request
    //then() - response

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


}
