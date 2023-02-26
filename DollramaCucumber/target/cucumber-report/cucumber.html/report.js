$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddtoCart.feature");
formatter.feature({
  "line": 1,
  "name": "Add to cart Product",
  "description": "",
  "id": "add-to-cart-product",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8599638000,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should add to cart product successfully",
  "description": "",
  "id": "add-to-cart-product;user-should-add-to-cart-product-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Food section",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on Chocolate categories",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I Click on Product",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on Add to cart button",
  "keyword": "Then "
});
formatter.match({
  "location": "Addtocartstep.iAmOnHomePage()"
});
formatter.result({
  "duration": 88586600,
  "status": "passed"
});
formatter.match({
  "location": "Addtocartstep.iClickOnFoodSection()"
});
formatter.result({
  "duration": 3819242300,
  "status": "passed"
});
formatter.match({
  "location": "Addtocartstep.iClickOnChocolateCategories()"
});
formatter.result({
  "duration": 451322300,
  "status": "passed"
});
formatter.match({
  "location": "Addtocartstep.iClickOnProduct()"
});
formatter.result({
  "duration": 452741200,
  "status": "passed"
});
formatter.match({
  "location": "Addtocartstep.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 125567500,
  "status": "passed"
});
formatter.after({
  "duration": 698044500,
  "status": "passed"
});
});