package restapi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PracticeGET {
	
	@Test
	public void getTest() {
		String baseUri = "http://localhost:3000";
		String methodUrl = "/comments";
		
		RequestSpecification httpRequest = RestAssured.
				given().
				contentType(ContentType.JSON).
				baseUri(baseUri);
		
		Response resp = httpRequest.get(methodUrl);
		
		System.out.println("Response Code: " + resp.statusCode());
		
		System.out.println("Body: " + resp.getBody().asString());
	}

}
