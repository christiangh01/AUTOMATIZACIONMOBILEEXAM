package com.nttdata.stepsdefinitions;

import com.nttdata.steps.AirbnbSearchSteps;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertTrue;

public class AirbnbSearchStepsDefs {

    @Steps
    AirbnbSearchSteps airbnbSearchSteps;

    @Given("que me encuentro en el login de Airbnb")
    public void que_me_encuentro_en_el_login_de_airbnb() {
        airbnbSearchSteps.clickClose();
    }

    @Then("muestra el texto {string}")
    public void muestra_el_texto(String text) {
        Assert.assertEquals(airbnbSearchSteps.getResultText(), text);
    }

    @And("presiono Where to")
    public void presionoWhereTo() {
        airbnbSearchSteps.clickWhereTo();
    }

    @And("realizo la siguiente busqueda {string}")
    public void realizoLaSiguienteBusqueda(String places) {
        airbnbSearchSteps.searchByText(places);
    }

    @And("selecciono Skip")
    public void seleccionoSkip() {
        airbnbSearchSteps.clickSkip();
    }

    @And("presiono el boton Search")
    public void presionoElBotonSearch() {
        airbnbSearchSteps.clickSearch();
    }
}
