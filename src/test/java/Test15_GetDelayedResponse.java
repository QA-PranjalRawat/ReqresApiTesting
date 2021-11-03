import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class Test15_GetDelayedResponse extends ResponseFile{

    @Test
    public void getDelayedResponse() throws IOException {
        Response response = RestAssured.get("https://reqres.in/api/users?delay=3");

        System.out.println(response.statusLine());
        responseMethod(response.asString());

        int statusCode =  response.statusCode();
        Assert.assertEquals(statusCode,200);

        given().get("https://reqres.in/api/users?delay=3")
                .then()
                .statusCode(200)
                .body("data.id[0]", equalTo(1));

    }

}
