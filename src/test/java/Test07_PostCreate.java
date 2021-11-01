import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test07_PostCreate {
    @Test
    public void create(){
        JSONObject request = new JSONObject();
        request.put("name","JOHN");
        request.put("job","BA");

        System.out.println(request);

        given().
                body(request.toJSONString())
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .statusCode(201);
    }
}
