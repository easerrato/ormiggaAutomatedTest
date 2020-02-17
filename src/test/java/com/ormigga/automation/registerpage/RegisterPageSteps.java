package com.ormigga.automation.registerpage;

import com.ormigga.automation.basepage.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class RegisterPageSteps extends BasePage {

    @Given("we visit the {string}")
    public void weVisitThe(String url) throws InterruptedException {
        dv.get(url);
        Thread.sleep(5000);
    }

    @And("we click on the link button {string}")
    public void weClickOnTheLinkButtonLinkButton(String linkButton) throws InterruptedException {
        dv.findElement(By.linkText(linkButton)).click();
        Thread.sleep(3000);
    }

    @When("we fill the field Name or The business social reason {string}")
    public void weFillTheFieldNameOrTheBusinessSocialReasonName(String name) throws InterruptedException {
        dv.findElement(By.cssSelector("#mat-input-0")).sendKeys(name);
        Thread.sleep(1000);
    }

    @And("we fill the field Cedula or Nit {string}")
    public void weFillTheFieldCedulaOrNitId(String id) throws InterruptedException {
        dv.findElement(By.cssSelector("#mat-input-1")).sendKeys(id);
        Thread.sleep(1000);
    }

    @And("we select the Country of residence {string}")
    public void weSelectTheCountryOfResidenceCountry(String country) throws InterruptedException {
        dv.findElement(By.id("mat-select-0")).click();
        dv.findElement(By.id("mat-option-0")).click();
        Thread.sleep(1000);
    }

    @And("we select the Perfil {string}")
    public void weSelectThePerfilPerfil(String perfil) throws InterruptedException {
        dv.findElement(By.id("mat-select-1")).click();
        dv.findElement(By.id("mat-option-2")).click();
        Thread.sleep(1000);
    }

    @And("we fill the field Email {string} and the field Password {string}")
    public void weFillTheFieldEmailEmailAndTheFieldPasswordPassword(String email, String password) throws InterruptedException {
        dv.findElement(By.cssSelector("#mat-input-2")).sendKeys(email);
        Thread.sleep(1000);
        dv.findElement(By.cssSelector("#mat-input-3")).sendKeys(password);
        Thread.sleep(1000);
    }

    @And("We accept Terms and Conditions")
    public void weAcceptTermsAndConditions() throws InterruptedException {
        dv.findElement(By.cssSelector("#mat-checkbox-1 > label > div")).click();
        Thread.sleep(4000);
    }

    @And("We click on the button Create Account {string}")
    public void weClickOnTheButtonCreateAccountCreteAccount(String creteAccount) throws InterruptedException {
        dv.findElement(By.cssSelector("body > app-root > app-logup > div > div > div.form-log.ng-star-inserted > div > form > div:nth-child(8) > button")).click();
        Thread.sleep(2000);
    }

    @Then("We receive an alert {string}")
    public void weReceiveAnAlertMessage(String message) throws InterruptedException {
        String actualString = dv.findElement(By.xpath("//*[@id=\"mat-dialog-1\"]/app-alert-info/div[1]/div[2]/p")).getText();

        String expectedString = message;

        assertTrue(actualString.contains(expectedString));
    }
}
