package in.co.gorest.usersinfo;

import in.co.gorest.model.UserPojo;
import in.co.gorest.testbase.TestBase;
import in.co.gorest.utils.TestUtils;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostCreateUsersTest extends TestBase {

    static String name = "user5";
    static String email = TestUtils.getRandomValue() + "raj12345.gmail.com";
    static String gender = "male";
    static String status = "active";

    @Test
    public void createUser(){
        UserPojo userPojo = new UserPojo();
        userPojo.setName(name);
        userPojo.setEmail(email);
        userPojo.setGender(gender);
        userPojo.setStatus(status);

        Response response = given().log().all()
                .header("Content-Type","application/json")
                .header("Authorization","Bearer ed8a5d9ec04128888f7bd454ccf787e5cc0733efb423c7fec479119577d8edd4")
                .when()
                .body(userPojo)
                .post();
        response.prettyPrint();
        response.then().statusCode(404);
    }
}
