package com.noorteck.cucumber.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.noorteck.cucumber.page.FormPage;
import com.noorteck.cucumber.utils.WD;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FormSteps {

	
	FormPage form;

@Given("User navigates to {string}")
public void userNaviagetsToForm(String url) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	Thread.sleep(2000);
	WD.driver = new ChromeDriver();
	WD.driver.manage().window().maximize();
	WD.driver.get(url);
	Thread.sleep(2000);
	
	form = new FormPage();
}


@When("User enters Full Name {string} {string}")
public void entersFullName(String first, String last) {
    form.enterFirstName(first);
    form.enterLasttName(last);
}

@When("User enters Address {string}")
public void enterUserAddress(String address) {
    form.enterAddress(address);
}

@When("User enters City {string}")
public void enterUserCity(String city) {
    form.enterCity(city);
}

@When("User enters State {string}")
public void enterUserState(String state) {
    form.enterState(state);
}

@When("User enters Zipcode {string}")
public void enterUserZipcode(String zipCode) throws InterruptedException {
    form.enterZipCode(zipCode);
    Thread.sleep(2000);
}

@When("User selects cardType")
public void selectCardType(DataTable dataTable) {
	
	
	List<Map<String, String>> listMap = dataTable.asMaps();
	for(Map<String, String> map : listMap) {
		for (Map.Entry<String, String> entry : map.entrySet()) {
			
			String key = entry.getKey();
			String value = entry.getValue();
		}
	}
}

@When("User enters Credit Card {string}")
public void creditCard(String cardNumber) {
    form.enterCreditCard(cardNumber);
}

@When("User enters Month {string}")
public void enterMonth(String month) {
    form.enterCreditCardMonth(month);
}

@When("User enters Year {string}")
public void enterYear(String year) {
    form.enterCreditCardYear(year);
}

@When("User enters Name on Card {string}")
public void user_enters_name_on_card(String name) {
    form.enterCreditCardName(name);
}

@When("User clicks Remember Me checkbox")
public void clickRememberMeButton() {
    form.clickRememberMeButton();
}

@When("User clicks Purhcase Flight button")
public void submitButton() {
    form.clickPurchaseFlightButton();
}

@Then("User verifies success message {string}")
public void successMessage(String message) throws InterruptedException {
    
	System.out.println("Thank you for your purchase today!");
	
	Thread.sleep(3000);
	WD.driver.quit();
}






}
