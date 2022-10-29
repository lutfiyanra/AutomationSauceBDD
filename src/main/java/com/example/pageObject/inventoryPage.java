package com.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.annotation.concurrent.GuardedBy;

public class inventoryPage {
    public static WebDriver driver;
    public inventoryPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    // when untuk input
    // then validasi
    // and buat klik button

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement productList;

    public void sortProduct (String sortProduct){
        productList.click();
        Select a = new Select(productList);
        a.selectByVisibleText(sortProduct);
    }

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement indexItem1;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement indexItem2;

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a[1]")
    private WebElement shoppingCart;

    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement removeItemOne;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkOut;

    @FindBy(xpath = " //input[@id='first-name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCode;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueShop;

    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement itemTotal;

    @FindBy(xpath = "//div[@class='summary_tax_label']")
    private WebElement Tax;

    @FindBy(xpath = "//div[@class='summary_total_label']")
    private WebElement total;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finish;

    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement successHeader;

    public void clickProduct1(){
        indexItem1.click();}

    public void clickProduct2(){
        indexItem2.click();}

    public void shopCart(){
        shoppingCart.click();}

    public void removeItem1(){
        removeItemOne.click();}

    public void CheckOut(){
        checkOut.click();}

    public void setFirstName(String userFirstName){
        firstName.sendKeys(userFirstName);}

    public void setLastName(String userLastName){
        lastName.sendKeys(userLastName);}

    public void setPostalCode(String userPostalCode){
        postalCode.sendKeys(userPostalCode);}

    public void continueShopping(){
        continueShop.click();}

    public String ItemTotal(){
        return itemTotal.getText();
    }

    public String tax(){
        return Tax.getText();}

    public String Total(){
        return total.getText();}

    public void Finish(){
        finish.click();}

    public String Success(){
        return successHeader.getText();
    }

}
