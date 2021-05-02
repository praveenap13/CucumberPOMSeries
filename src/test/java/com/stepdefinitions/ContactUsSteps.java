package com.stepdefinitions;

import org.testng.Assert;

import com.pages.ContactUsPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsSteps {

	private ContactUsPage contactuspage = new ContactUsPage(DriverFactory.getDriver());

	@Given("user navigates to contact us page")
	public void user_navigates_to_contact_us_page() {
		DriverFactory.getDriver()
				.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@When("user fills the form from given sheetname {string} and rownumber {int}")
	public void user_fills_the_form_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber) {
		// ExcelReader reader = new ExcelReader();
		// List<Map<String, String>> testData =
		// reader.getData("D:\\MyProjects\\CucumberPOMSeries\\src\\test\\resources\\DataContactus.xlsx",sheetName);
		//
		// String heading = testData.get(rowNumber).get("subjectheading");
		// String email = testData.get(rowNumber).get("email");
		// String orderRef = testData.get(rowNumber).get("orderref");
		// String message = testData.get(rowNumber).get("message");
		// contactuspage.fillContactUsForm(heading, email, orderRef, message);

		// fillContactUsForm(heading, email, orderRef, message);
	}

	@When("user clicks on send button")
	public void user_clicks_on_send_button() {
		contactuspage.clickSend();
	}

	@Then("it shows successful message {string}")
	public void it_shows_successful_message(String exSuccessmessage) {
		String actualSuccessMsg = contactuspage.getSuccessMessg();
		Assert.assertEquals(actualSuccessMsg, exSuccessmessage, "not equal");
	}

}
