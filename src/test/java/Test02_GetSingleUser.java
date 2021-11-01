import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Test02_GetSingleUser extends ResponseFile{
    @Test
    public void singleUser() throws IOException {
        Response response = RestAssured.get("https://reqres.in/api/users/2");
        System.out.println(response.statusLine());

        responseMethod(response.asString());

        int statusCode =  response.statusCode();
        Assert.assertEquals(statusCode,200);

        given().get("https://reqres.in/api/users/2")
                .then()
                .statusCode(200)
                .body("data.id", equalTo(2));
    }
}
