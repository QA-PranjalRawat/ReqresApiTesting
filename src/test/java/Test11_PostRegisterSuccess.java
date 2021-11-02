import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test11_PostRegisterSuccess {

    @Test
    public void postRegisterSuccess(){
        JSONObject request = new JSONObject();
        request.put("email","eve.holt@reqres.in");
        request.put("password","testing@mail");

        System.out.println(request);

        given().
                body(request.toJSONString())
                .when()
                .header("Content-Type", "application/json")
                .post("https://reqres.in/api/register")
                .then()
                .statusCode(200)
                .log().body();
    }
}
