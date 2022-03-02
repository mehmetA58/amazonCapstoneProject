package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "(//div[@class='a-section a-spacing-small a-spacing-top-small'])")
    public WebElement sonucYazisi;

    @FindBy(id = "nav-hamburger-menu")
    public WebElement AllMenusu;

    @FindBy(xpath = "//select[@id='searchDropdownBox']")
    public WebElement AllDropdownMenu;

    @FindBy(xpath = "//a[@data-menu-id='5']")
    public WebElement ElectronicMenu;

    @FindBy(xpath = "//a[@id='nav-link-accountList']")
    public WebElement signInButon;

    @FindBy(xpath = "//input[@id='ap_email']")
    public WebElement eMailInput;

    @FindBy(xpath = "//input[@id='continue']")
    public WebElement continueButon;

    @FindBy(xpath = "//input[@id='ap_password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    public WebElement signInSubmit;

    @FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
    public WebElement usersSignInText;

    @FindBy(xpath = "(//h4[@class='a-alert-heading'])")
    public WebElement wrongPasswordText;

    @FindBy(xpath = "(//a[@id='nav-item-signout'])")
    public WebElement closeToAccount;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement filterCheckbox;

    @FindBy(xpath = "(//span[@class='a-size-medium-plus a-color-base a-text-normal'])")
    public WebElement results;

    @FindBy(xpath = "(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1]")
    public WebElement firstProduct;

    @FindBy(xpath = "(//span[@class='a-price-whole'])")
    public WebElement prodPrice;

    @FindBy(xpath = "//span[@class='a-price-fraction']")
    public WebElement prodPriceFrac;

    @FindBy(xpath = "(//input[@id='add-to-cart-button'])")
    public WebElement addToCartButon;
    @FindBy(xpath = "(//a[@id='attach-close_sideSheet-link'])")
    public WebElement closeToIFrame;

    @FindBy(xpath = "(//a[@id='nav-cart'])")
    public WebElement goToCart;


    @FindBy(xpath = "(//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])")
    public WebElement totalPriceToCart;

    @FindBy(xpath = "(//div[@id='navFooter'])")
    public WebElement footer;

    @FindBy(xpath = "(//a[@class='nav_a'])[6]")
    public WebElement FooterAmazonScienceLink;

    @FindBy(xpath = "(//a[@class='nav_a'])")
    public WebElement FooterLink;

    @FindBy(linkText = "Create a List")
    public WebElement createAList;

    @FindBy(xpath = "(//span[@id='createList'])")
    public WebElement createAListButton;

    @FindBy(xpath = "(//input[@id='list-name'])")
    public WebElement listNameInput;

    @FindBy(xpath = "//span[@id='wl-redesigned-create-list']")
    public WebElement endOfCreateAListButon;

    @FindBy(xpath = "(//span[@id='profile-list-name'])")
    public WebElement NewlistName;

    @FindBy(xpath = "(//div[@class='aok-inline-block aok-align-center overflow-menu-icon-with-more-label'])")
    public WebElement ucNokta;

     @FindBy(xpath = "(//a[@id='editYourList'])")
     public WebElement manageYourList;

     @FindBy(xpath = "(//input[@class='a-button-input'])[7]")
     public WebElement deleteListButon;

     @FindBy(xpath = "(//input[@name='submit.save'])")
     public WebElement confirmDeleteButon;

     @FindBy(xpath = "//span[@class='al-intro-banner-subheader']")
     public WebElement forAllYourShoppingNeeds;

     @FindBy(xpath = "(//input[@id='add-to-wishlist-button-submit'])")
     public WebElement productAddToListButon;

     @FindBy(xpath = "//span[@id='productTitle']")
     public WebElement productName;

     @FindBy(xpath = "//li[@class='w-asin']//table//tbody//tr//td//a")
     public WebElement productInList;

     @FindBy(linkText = "View Your List")
    public WebElement viewYourList;

     @FindBy(xpath = "(//span[@id='profile-list-name'])")
    public WebElement listOfMehmet;

     @FindBy(xpath = "(//input[@name='submit.deleteItem'])")
     public WebElement deleteProductInListButon;

     @FindBy(xpath = "(//div[@class='a-box a-alert-inline a-alert-inline-success']//div//div)")
    public WebElement deleteIsDisplayed;

@FindBy(linkText = "Accessories & Supplies")
    public WebElement allAccessories;

    @FindBy(xpath = "(//span[@id='nav-search-label-id'])")
    public WebElement AllMenuDogrulama;

}
