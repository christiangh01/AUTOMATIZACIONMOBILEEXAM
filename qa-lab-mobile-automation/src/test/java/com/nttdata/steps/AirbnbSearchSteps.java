package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.SearchDetailsScreen;
import com.nttdata.screens.SearchScreen;
import net.thucydides.core.annotations.Step;

public class AirbnbSearchSteps {

    LoginScreen loginScreen;
    SearchScreen searchScreen;
    SearchDetailsScreen searchDetailsScreen;

    @Step("Click en cerrar")
    public void clickClose(){
        loginScreen.clickClose();
    }

    @Step("Click en el Where To")
    public void clickWhereTo(){
        searchScreen.clickSearchInput();
    }

    @Step("Búsqueda por texto")
    public void searchByText(String place){
        searchDetailsScreen.enterSearchInput(place);
        searchDetailsScreen.clickFirstOption();

    }

    @Step("Click en Skip")
    public void clickSkip(){
        searchDetailsScreen.clickSkip();
    }

    @Step("Click en search")
    public void clickSearch(){
        searchDetailsScreen.clickSearch();
    }

    @Step("Obtiene el texto del resultado")
    public String getResultText(){
        return searchScreen.getResultText();
    }


}
