import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test12_PostRegisterUnsuccess {
    @Test
    public void postRegisterUnsuccess(){
        JSONObject request = new JSONObject();
        request.put("email","testing@mail.in");

        System.out.println(request);

        given()
                .body(request.toJSONString())
                .when()
                .header("Content-Type", "application/json")
                .post("https://reqres.in/api/register")
                .then()
                .statusCode(400)
                .log().body();
    }
}
