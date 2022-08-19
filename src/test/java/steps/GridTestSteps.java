package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.GridPage;

public class GridTestSteps {

    GridPage grid = new GridPage();

    @Given("^I navigate to the static table$")
    public void navigateToGridPage() throws InterruptedException
    {
        Thread.sleep(1000);
        grid.navigateToGrid();
    }

    @Then("^I can return the value I wanted$")
    public void returnValue()
    {
        //System.out.println("Hola");
        String value = grid.getValueFromGrid(3, 2);
        System.out.println(value);
    }
    

}