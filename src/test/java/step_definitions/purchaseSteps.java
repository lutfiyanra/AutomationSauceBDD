package step_definitions;

import com.example.pageObject.inventoryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class purchaseSteps {
    private WebDriver webDriver;
    public purchaseSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User sort product list by \"(.*)\"")
    public void selectProductCart(String sortProduct) throws InterruptedException {
        inventoryPage InventoryPage = new inventoryPage(webDriver);
        Thread.sleep(3000);
        InventoryPage.sortProduct(sortProduct);
    }

    @Then("User select two item in first line")
    public void selectProduct() throws InterruptedException {
        inventoryPage InventoryPage = new inventoryPage(webDriver);
        InventoryPage.clickProduct1();
        InventoryPage.clickProduct2();
        Thread.sleep(1000);
    }

    @Then("User click shopping chart icon")
    public void ShoppingCart() throws InterruptedException {
        inventoryPage InventoryPage = new inventoryPage(webDriver);
        InventoryPage.shopCart();
        Thread.sleep(1000);
    }

    @Then("User remove one item in list shopping chart")
    public void removeItemOne() throws InterruptedException {
        inventoryPage InventoryPage = new inventoryPage(webDriver);
        InventoryPage.removeItem1();
        Thread.sleep(1000);
    }
    @And("User checkout the item")
    public void checkoutAllItem() throws InterruptedException {
        inventoryPage InventoryPage = new inventoryPage(webDriver);
        InventoryPage.CheckOut();
        Thread.sleep(1000);
    }

    @Then("User input \"(.*)\" as setFirstname and \"(.*)\" as setLastname and \"(.*)\" as setPostalcode")
    public void inputCredential(String FirstName,String LastName, String PostalCode) throws InterruptedException {
        inventoryPage InventoryPage = new inventoryPage(webDriver);
        InventoryPage.setFirstName(FirstName);
        InventoryPage.setLastName(LastName);
        InventoryPage.setPostalCode(PostalCode);
        Thread.sleep(1000);
    }

    @And("User click continue")
    public void continueCheckOut() throws InterruptedException {
        inventoryPage InventoryPage = new inventoryPage(webDriver);
        InventoryPage.continueShopping();
        Thread.sleep(1000);
    }

    @Then("User will see \"(.*)\" as expected Item total")
    public void SeeItemTotal(String itemtotal) throws InterruptedException {
        inventoryPage InventoryPage = new inventoryPage(webDriver);
        InventoryPage.ItemTotal();
        Assert.assertEquals(itemtotal, InventoryPage.ItemTotal());
        Thread.sleep(1000);
    }

    @And("\"(.*)\" as expected Tax")
    public void SeeItemTax(String ExpectTax) throws InterruptedException {
        inventoryPage InventoryPage = new inventoryPage(webDriver);
        InventoryPage.tax();
        Assert.assertEquals(ExpectTax, InventoryPage.tax());
        Thread.sleep(1000);
    }

    @And("\"(.*)\" as expected Total")
    public void SeeTotal(String ExpectTotal) throws InterruptedException {
        inventoryPage InventoryPage = new inventoryPage(webDriver);
        InventoryPage.Total();
        Assert.assertEquals(ExpectTotal, InventoryPage.Total());
        Thread.sleep(1000);
    }
    @Then("User click Finish")
    public void EndTransaction(){
        inventoryPage InventoryPage = new inventoryPage(webDriver);
        InventoryPage.Finish();
    }
    @Then("User will see \"(.*)\" as finishing")
    public void TransactionSuccess(String Succes){
        inventoryPage InventoryPage = new inventoryPage(webDriver);
        InventoryPage.Success();
        Assert.assertEquals(Succes, InventoryPage.Success());
    }




}
