import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class Test06_GetSingleResourceNotFound extends ResponseFile{
    @Test
    public void getSingleResourceNotFOund() throws IOException {
        Response response = RestAssured.get("https://reqres.in/api/unknown/23");

        System.out.println(response.statusLine());
        responseMethod(response.asString());

        int statusCode =  response.statusCode();
        Assert.assertEquals(statusCode,404);

        given().get("https://reqres.in/api/unknown/23")
                .then()
                .statusCode(404);

    }
}
