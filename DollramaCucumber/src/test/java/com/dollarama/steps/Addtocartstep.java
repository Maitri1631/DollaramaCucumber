package com.dollarama.steps;

import com.dollarama.pages.Addtocart;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Addtocartstep {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @And("^I click on Food section$")
    public void iClickOnFoodSection() throws InterruptedException {
        new Addtocart().ClickonSection();
    }

    @And("^I click on Chocolate categories$")
    public void iClickOnChocolateCategories() {
        new Addtocart().Clickonchocolate();
    }

    @And("^I Click on Product$")
    public void iClickOnProduct() {
        new Addtocart().ClickonProduct();
    }

    @Then("^I click on Add to cart button$")
    public void iClickOnAddToCartButton() {
        new Addtocart().ClickonAddtoCart();
    }
}
