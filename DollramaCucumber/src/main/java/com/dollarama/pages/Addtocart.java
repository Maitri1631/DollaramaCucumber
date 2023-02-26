package com.dollarama.pages;

import com.dollarama.utility.Utility;
import com.google.j2objc.annotations.Weak;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart extends Utility {
    private static final Logger log = LogManager.getLogger(Addtocart.class.getName());

    public Addtocart(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='row small-gutters departments']/div[6]/div/a/img")
    WebElement FoodSection;

    @FindBy(xpath = "//div[@class='col-md-3  col-lg-2  hidden-xs  hidden-sm']/div[2]/div/div/ul/li[3]/a")
    WebElement ChocolateSection;

    @FindBy(xpath = "//div[@class='product-tile js-product-tile']/div/div[2]/a[@title='KitKat Snack Size 9PK']")
    WebElement firstProduct;

    @FindBy(xpath = "//div[@class='col-xs-12 col-md-5']/span/button")
    WebElement Addtocart;

    public void ClickonSection() throws InterruptedException {
        ScrollBy();
        clickOnElement(FoodSection);
    }

    public void Clickonchocolate(){
        clickOnElement(ChocolateSection);
    }

    public void ClickonProduct(){
        clickOnElement(firstProduct);
    }

    public void ClickonAddtoCart(){
        clickOnElement(Addtocart);
    }
}
