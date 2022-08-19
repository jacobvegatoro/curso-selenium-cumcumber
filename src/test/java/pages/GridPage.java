package pages;

public class GridPage extends BasePage {

    private String cell = "//*[@id='datos']/";

    public GridPage()
    {
        super(driver);
    }

    public void navigateToGrid()
    {
        navigateTo("http://localhost:8080/courses/tabla");
    }

    public String getValueFromGrid(int row, int column)
    {
        return getValueFromTable(cell, row, column);
    }

}
