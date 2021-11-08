package com.syniti.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TargetPageClass {

    private WebDriver driver;
    @FindBy(id="add-btn")
    private WebElement addButton;
    @FindBy(id="save-btn")
    private WebElement saveButton;
    @FindBy(id="target-txt")
    private WebElement target;
    @FindBy(id="database1")
    private WebElement databaseName;

    public TargetPageClass(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void addDatabase(String database){
        
    	WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(addButton));
        addButton.click();
        wait.until(ExpectedConditions.visibilityOf(target));
        target.sendKeys(database+Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOf(saveButton));
        saveButton.click();     
    }
    
    public String getAddedDatabaseName() {
    	WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(databaseName));
        return databaseName.getText();
    	
    }
    

}
