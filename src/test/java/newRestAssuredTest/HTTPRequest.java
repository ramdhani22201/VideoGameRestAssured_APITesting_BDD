package newRestAssuredTest;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import static io.restassured.RestAssured.*;
public class HTTPRequest {

	int id;
	@Test(priority = 1)
	public void getUser()
	{
		given()
		.when()
			.get("https://reqres.in/api/users?page=2")			
		.then()
			.statusCode(200)
			.body("page",equalTo(2))
			.log().all();		
	}
	
	@Test(priority = 2)
	public void createUser()
	{
		
		
		HashMap<String, String> hmap = new HashMap<String, String>();
		hmap.put("name", "Ramdhani");
		hmap.put("job", "tester");
		
		id = given()
			.contentType("application/json")
			.body(hmap)
			
		.when()
			.post("https://reqres.in/api/users")
			.jsonPath().getInt("id");
//		.then()
//			.statusCode(201)
//			.log().all();
			
	}
	
	@Test(priority = 3, dependsOnMethods = {"createUser"})
	public void updateData()
	{
		HashMap<String, String> hmap = new HashMap<String, String>();
		//hmap.put("name", "Ramdhani ");
		hmap.put("job", "developer");
		
		given()
			.contentType("application/json")
			.body(hmap)
			
		.when()
			.put("https://reqres.in/api/users/"+id)
		.then()
			.statusCode(200)
			.log().all();
	}
	
	@Test(priority = 4)
	public void deleteReq()
	{
		given()
		
		.when()
			.delete("https://reqres.in/api/users/"+id)
		.then()
			.statusCode(204)
			.log().all();
	}
}
