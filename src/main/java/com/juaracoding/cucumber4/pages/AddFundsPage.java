package com.juaracoding.cucumber4.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber4.drivers.DriverSingleton;

public class AddFundsPage {

	private WebDriver driver;
	
	public AddFundsPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#fadein > div.sidebar-nav > div > div.sidebar-menu-wrap > ul > li")
	List<WebElement> menuAddFunds;
	
	public void goToMenuAddFunds(){
		menuAddFunds.get(2).click();
	}
	
	public String getTxtTitleAddFundsPage() {
		return driver.getTitle();	
	}
}
