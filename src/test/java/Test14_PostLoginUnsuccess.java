import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test14_PostLoginUnsuccess {

    @Test
    public void postLoginUnsuccess(){
        JSONObject request = new JSONObject();
        request.put("email","peter@kelvin");

        System.out.println(request);

        given()
                .body(request.toJSONString())
                .when()
                .header("Content-Type", "application/json")
                .post("https://reqres.in/api/login")
                .then()
                .statusCode(400)
                .log().body();
    }

}
