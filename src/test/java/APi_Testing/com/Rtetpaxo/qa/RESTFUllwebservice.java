package APi_Testing.com.Rtetpaxo.qa;
import static com.jayway.restassured.RestAssured.given;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;


public class RESTFUllwebservice {
	
	WebDriver driver=null;
	@BeforeMethod
	public void setUp(){
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		RestAssured.baseURI="http://www.thomas-bayer.com";
		RestAssured.port=80;
		RestAssured.basePath="/sqlrest/CUSTOMER";
		
	}
	@Test
	//JASON Report
	public void test_REST1(){
	Response response=	given()
						.log().everything()
						.contentType(ContentType.XML)
						.accept(ContentType.JSON)
						.when()
						.then().log().body().statusCode(200)
						
						.get("/94");
						
	System.out.println(response.getBody().prettyPrint());
		
		
	}
	@Test
//XML Report
	public void test_REST2(){
	Response response=	given()
						.log().everything()
						.contentType(ContentType.XML)
						.accept(ContentType.XML)
						.when()
						.then().log().body().statusCode(200)
						
						.get("/99");
						
	System.out.println(response.getBody().prettyPrint());
		
		
	}
	@Test
	//Post
	public void test_REST3(){
		String ID="{\"ID\":\"100\"}";
		String FirstName="{\"FIRSTNAME\":\"RONU\"}";
		String LastName="{\"LASTANME\":\"MOLLA\"}";
		String CITY="{\"CITY\":\"JA\"}";
		
		
		
	Response response=	given()
						.log().everything()
						.contentType(ContentType.JSON)
						.accept(ContentType.XML)
						
						.when()
						//.then().log().body().statusCode(200)
						.post();
						//.get("/99");
						
	System.out.println(response.getBody().prettyPrint());
		
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
		driver.close();
		
		
	}

}
