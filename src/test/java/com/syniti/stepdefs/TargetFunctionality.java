package com.syniti.stepdefs;

import com.syniti.pages.LoginPageClass;
import com.syniti.pages.TargetPageClass;

import com.syniti.util.Browser;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TargetFunctionality {
	LoginPageClass loginPageClass;
	TargetPageClass targetPageClass;
	WebDriver driver;
	@Given("an user navigates to collect application")
	public void an_user_navigates_to_collect_application(){

		loginPageClass = PageFactory.initElements(driver,LoginPageClass.class);

		loginPageClass.navigate_to_url();
		
	}
	@And("user login with credentials")
	public void user_login_with_credentials(String user,String password){

		loginPageClass = PageFactory.initElements(driver,LoginPageClass.class);
		loginPageClass.enter_credentials(user,password);

		String title = driver.getTitle();
		Assert.assertEquals("Header", title);

	}
	@When("an database is added in Target is added in Target")
	public void database_added_in_Target(String database) {

		targetPageClass = PageFactory.initElements(driver, TargetPageClass.class);
		targetPageClass.addDatabase(database);
		

		
	}
	@Then("user should see the actual database in the list")
	public void user_should_see_the_actual_database_in_the_list(String database) {

		targetPageClass = PageFactory.initElements(driver, TargetPageClass.class);
		String dbName = targetPageClass.getAddedDatabaseName();
		Assert.assertEquals(database, false);
		
	}


}
