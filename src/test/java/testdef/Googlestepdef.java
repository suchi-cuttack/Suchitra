package testdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

import io.cucumber.java.en.*;

public class Googlestepdef {
	public WebDriver driver;
	public String actT;
	@Given("Open the Google application")
	public void open_the_google_application() {
	    driver=new ChromeDriver();
	   driver.get("https://www.Google.com");
	}

	@When("User captures current page title")
	public void user_captures_current_page_title() {
		String expT="Google";
		 actT = driver.getTitle();
	 
	}

	@Then("Title should match")
	public void title_should_match() {
	 Assert.assertTrue(actT.contains("Google"),"Title is matched, TC is passed");
	 Reporter.log("Title is matched,TC is passed",true);
	}



}
