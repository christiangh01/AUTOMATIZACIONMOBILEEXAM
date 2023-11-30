package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class SearchScreen extends PageObject {

    @AndroidFindBy(id = "start_button")
    private WebElement searchInput;

    @AndroidFindBy(id = "n2_bottom_sheet_title_title")
    private WebElement resultText;



    public void clickSearchInput(){
        searchInput.click();
    }

    public String getResultText(){
        return resultText.getText();
    }


}
