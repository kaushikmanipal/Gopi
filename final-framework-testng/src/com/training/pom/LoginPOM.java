package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//*[@id='responsive']/li[7]/a/i")
	private WebElement LinkTextLogin;
	@FindBy(xpath ="//*[@id=\"post-133\"]/div/div/div/ul/li[2]/a")
	private WebElement TagNameRegisterBtn;
	
	@FindBy(id="user_login")
	private WebElement userName; 
	
	@FindBy(id="user_pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement loginBtn; 
	
	@FindBy(xpath = " //li[@id='wp-admin-bar-my-account']")
	private WebElement HyperLinkAdmin;
	
	@FindBy(id="last_name")
	private WebElement LastName;
	
	@FindBy(id="phone")
	private WebElement Phone;
	
	@FindBy(id="submit")
	private WebElement SubmitBtn;	

	@FindBy(xpath="//*[@id=\"password\"]/td/button")
	private WebElement ChangePasswordBtn; 
	
	@FindBy(id="pass1-text")
	private WebElement newpassword; 
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="first-name")
	private WebElement firstname;
	
	@FindBy(xpath = "//*[@id=\"signupform\"]/p[5]/input")
	private WebElement RegisterBtn;
	
	@FindBy(xpath = "//*[@id=\"wp-admin-bar-logout\"]/a")
	private WebElement LogOutBtn;
	
	
	public void clickLinkTextLogin() {
		this.LinkTextLogin.click();
	}
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}	
	public void clickHyperLinkAdmin() {
		this.HyperLinkAdmin.click();
	}
	
	public void sendLastName(String lastName) {
		this.LastName.clear();
		this.LastName.sendKeys(lastName);
	}
	public void sendPhone(String phone) {
		this.Phone.clear();
		this.Phone.sendKeys(phone);
	}
	public void clickSubmitBtn() {
		this.SubmitBtn.click();
		
	}
	public void clickChangePasswordBtn() {
		this.ChangePasswordBtn.click();
	}
	public void clickTagNameRegisterBtn() {
		this.TagNameRegisterBtn.click();
	}
	public void sendNewPassword(String newpassword) {
		this.newpassword.clear(); 
		this.newpassword.sendKeys(newpassword); 
	}
	public void sendEmail(String email) {
		this.email.clear(); 
		this.email.sendKeys(email); 
	}
	public void sendFirstName(String firstname) {
		this.firstname.clear(); 
		this.firstname.sendKeys(firstname); 
	}
	public void clickRegisterBtn() {
		this.RegisterBtn.click();
	}
	public void clickLogOutBtn() {
		this.LogOutBtn.click();
	}
}
