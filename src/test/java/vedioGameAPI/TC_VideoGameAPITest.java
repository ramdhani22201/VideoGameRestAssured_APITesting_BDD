package vedioGameAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import static io.restassured.RestAssured.*;
public class TC_VideoGameAPITest {
	@Test(priority = 1)
	public void test_getAllVedeoGames()
	{
		given()
		.when()
			.get("http://localhost:8080/app/videogames")
		.then()
			.statusCode(200);
	}
	
	@Test(priority = 2)
	public void test_addNewVideoGame()
	{
		HashMap<String, String> data = new HashMap<String, String>();
		data.put("id", "1343");
		data.put("name", "ramdhani");
		data.put("release-date", "2023-01");
		data.put("reviewScore", "3");
		data.put("category", "Adventure");
		data.put("rating", "Universal");
		Response res =
			given()
				.contentType("application/json")
				.body(data)
			.when()
				.post("http://localhost:8080/app/videogames")
			.then()
				.statusCode(200)
				.log().body()
					.extract().response();
		String jsonString = res.asString();
		Assert.assertEquals(jsonString.contains("Record Added Successfully"),true);
	}
	@Test(priority = 3)
	public void test_getVeiwGame()
	{
		given()
		.when()
			.get("http://localhost:8080/app/videogames/1343")
		.then()
			.statusCode(200)
			.log().body()
			.body("videoGame.id" , equalTo("1343"))
			.body("videoGame.name" , equalTo("ramdhani"));
	}
	@Test(priority = 4)
	public void test_putForUpdateData()
	{
		HashMap<String, String> data = new HashMap<String, String>();
		data.put("id", "1343");
		data.put("name", "Amit");
		data.put("release-date", "2023-01");
		data.put("reviewScore", "3");
		data.put("category", "Adventure");
		data.put("rating", "Universal");
		
			given()
				.contentType("application/json")
				.body(data)
			.when()
				.put("http://localhost:8080/app/videogames/1343")
			.then()
				.statusCode(200)
				.log().body()
				.body("videoGame.id" , equalTo("1343"))
				.body("videoGame.name" , equalTo("Amit"));
	}
	@Test(priority = 5)
	public void test_DeleteVideoGame()
	{
		Response resp=
			given()
			.when()
				.delete("http://localhost:8080/app/videogames/1343")
			.then()
				.statusCode(200)
				.log().body()
				.extract().response();
		String jsonString =resp.asString();
		Assert.assertEquals(jsonString.contains("Record Deleted Successfully"), true);
	}
	
}
