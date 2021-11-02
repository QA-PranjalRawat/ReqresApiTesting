import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test08_PutUpdate extends ResponseFile{

    @Test
    public void update(){
        JSONObject request = new JSONObject();
        request.put("name","don");
        request.put("job","MA");

        System.out.println(request);

        given().body(request.toJSONString()).
                when().put("https://reqres.in/api/users/2").then()
                .statusCode(200);

    }
}
