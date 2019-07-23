package package1;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition {

@When("^Larry increases headphones quantity by 2$")
public void Larry_increases_headphones_quantity_by_2() {
	System.out.println("Test is passed");
}

@And("^continue for checkout$")
public void continue_for_checkout() {
	System.out.println("Test is passed");
}

@And("^change the shipping address to a new address as pune$")
    public void change_the_shipping_address_to_a_new_address_as_pune() {
	System.out.println("Test is passed");
}

@Then("^The product should be delivered to the new address$")
public void The_product_should_be_delivered_to_the_new_address() {
	System.out.println("Test is passed");
}
}
