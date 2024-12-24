package in.co.gorest.testbase;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

/**
 * Created by Jay Vaghani
 */
public class TestBase {

    @BeforeClass
    public  void inInt(){
        RestAssured.baseURI = "https://gorest.co.in";
        RestAssured.basePath = "/public/v2";
    }

}