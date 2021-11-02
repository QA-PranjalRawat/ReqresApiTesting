import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test10_Delete{
    @Test
    public void delete(){
        JSONObject request = new JSONObject();
        given()
                .body(request.toJSONString())
                .when().delete("https://reqres.in/api/users/2").then()
                .statusCode(204).log();
    }
}
