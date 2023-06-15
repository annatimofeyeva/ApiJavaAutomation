import org.junit.jupiter.api.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HelloWorldTest {
    @Test
    public void testHelloWorld() {
        System.out.println("Hello from Anna");
    }
    @Test
    public void firstApiTest() {
        Response responce = RestAssured
                .get("https://playground.learnqa.ru/api/hello")
                .andReturn();
        responce.prettyPrint();
    }
}

