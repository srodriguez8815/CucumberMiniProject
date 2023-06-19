package com.noorteck.cucumber.page;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.noorteck.cucumber.utils.WD;

public class FormPage {

	@FindBy(xpath = "//input[@name='inputName']")
	WebElement firstNameField;

	@FindBy(xpath = "//input[@name='inputName']")
	WebElement lastNameField;

	@FindBy(xpath = "//input[@name='address']")
	WebElement addressField;

	@FindBy(xpath = "//input[@name='city']")
	WebElement cityField;

	@FindBy(xpath = "//input[@name='state']")
	WebElement stateField;

	@FindBy(xpath = "//input[@name='zipCode']")
	WebElement zipcodeField;

	@FindBy(xpath = "//select[@name='cardType']")
	WebElement creditCardDropdown;

	@FindBy(xpath = "//input[@name='creditCardNumber']")
	WebElement creditCardNumberField;

	@FindBy(xpath = "//input[@name='creditCardMonth']")
	WebElement creditCardMonthField;

	@FindBy(xpath = "//input[@name='creditCardYear']")
	WebElement creditCardYearField;

	@FindBy(xpath = "//input[@name='nameOnCard']")
	WebElement cardNameField;

	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement rememberMeButton;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement purchaseFlightButton;

	// Class constructor
	public FormPage() {
		PageFactory.initElements(WD.driver, this);
	}

	public void enterFirstName(String firstName) {
		firstNameField.sendKeys(firstName);
	}

	public void enterLasttName(String lastName) {
		lastNameField.sendKeys(lastName);
	}

	public void enterAddress(String address) {
		addressField.sendKeys(address);
	}

	public void enterCity(String city) {
		cityField.sendKeys(city);
	}

	public void enterState(String state) {
		stateField.sendKeys(state);
	}

	public void enterZipCode(String zipCode) {
		zipcodeField.sendKeys(zipCode);
	}

	public void creditCardType(String  type) {
	
		Select select = new Select(creditCardDropdown);
		List<WebElement> optionList = select.getOptions();
		
		for (WebElement e1 : optionList) {
			String e1Text = e1.getText();
			if(e1Text.equals(type)) {
				e1.click();
				break;
			}
			
		}
		
	}

	public void enterCreditCard(String creditCardNumber) {
		creditCardNumberField.sendKeys(creditCardNumber);
	}

	public void enterCreditCardMonth(String month) {
		creditCardMonthField.sendKeys(month);
	}

	public void enterCreditCardYear(String year) {
		creditCardYearField.sendKeys(year);
	}

	public void enterCreditCardName(String name) {
		cardNameField.sendKeys(name);
	}

	public void clickRememberMeButton() {
		rememberMeButton.click();
	}

	public void clickPurchaseFlightButton() {
		purchaseFlightButton.click();
	}
}
