package com.syniti.pages;

import com.syniti.util.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageClass {

    private WebDriver driver;
    @FindBy(id="userid")
    private WebElement userid;
    @FindBy(id="password")
    private WebElement passwd;

    public LoginPageClass(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void navigate_to_url(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://<collect-url>");
    }
    public void enter_credentials(String user ,String password){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(userid));
        userid.sendKeys(user);
        wait.until(ExpectedConditions.visibilityOf(passwd));
        passwd.sendKeys(password);
    }


}
