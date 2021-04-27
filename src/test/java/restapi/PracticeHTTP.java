package restapi;

import org.json.simple.JSONObject;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PracticeHTTP {

	@Test
	public void getTest() {
		String baseUri = "http://localhost:3000";
		String methodUrl = "/comments";
		
		RequestSpecification httpRequest = RestAssured
				.given()
				.contentType(ContentType.JSON)
				.baseUri(baseUri);
		
		System.out.println("=====================================");
		System.out.println("CREATE new Data");
		
		JSONObject jo = new JSONObject();
		
		jo.put("postId", 123);
		jo.put("body", "Another sample text");
		
		Response resp = httpRequest
			.body(jo)
			.post(methodUrl);
		
		System.out.println("Response Code: " + resp.statusCode());
		System.out.println("Body: " + resp.getBody().asString());
		
		int id = resp.getBody().path("id");
		
		System.out.println("=====================================");
		System.out.println("Retrieve Data when postId is: "+123);
		
		
		resp = httpRequest
				.queryParam("postId", 123)
				.get(methodUrl);
		
		System.out.println("Response Code: " + resp.statusCode());
		System.out.println("Body: " + resp.getBody().asString());
		
		
		System.out.println("=====================================");
		System.out.println("PATCH Data when id is: "+id);
		String methodUrlPatch = "/comments/{id}";
		
		JSONObject joPut = new JSONObject();
		joPut.put("body", "Updated comment");

		resp = httpRequest
				.pathParam("id", id)
			    .body(joPut)
				.patch(methodUrlPatch);
		
		System.out.println("Response Code: " + resp.statusCode());
		System.out.println("Body: " + resp.getBody().asString());
		
		System.out.println("=====================================");
		System.out.println("DELETE Data when id is: "+id);

		resp = httpRequest
				.pathParam("id", id)
				.delete(methodUrlPatch);
		
		System.out.println("Response Code: " + resp.statusCode());
		System.out.println("Body: " + resp.getBody().asString());
		
	
	}
	
	


}
