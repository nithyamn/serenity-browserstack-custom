package com.browserstack.cucumber.pages;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("page:home.page")
public class GooglePage extends PageObject {

    @FindBy(name = "q")
    WebElementFacade search;

    @FindBy(name = "btnK")
    WebElementFacade searchButton;

    public void searchForString(String searchString) {

        //search.sendKeys(searchString, Keys.ENTER);
    }

    public void submitForm() throws Exception {
        Thread.sleep(5000);
    }

    public void titleShouldMatch(String matchTitle) {
        //assertThat(this.getTitle()).containsIgnoringCase(matchTitle);
    }
}
