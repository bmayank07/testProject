package loginRadius;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class Create {
	
	@BeforeClass
	public static void init(){
		RestAssured.baseURI="https://reqres.in";
		RestAssured.basePath="/api/users";
		
	}

	@Test(priority = 1)
	public void getUser() {
		//RestAssured.baseURI = "https://reqres.in";
		//RestAssured.basePath = "/api/users";
		given().when().body("{\n" + "  \"name\": \"morpheus\",\n" + "  \"job\": \"leader\"\n" + "}")

				.post().then().log().all();

	}
}