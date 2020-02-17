package com.ormigga.automation.loginpage;

import com.ormigga.automation.basepage.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class LoginPageSteps extends BasePage {

    @Given("we visit the {string}")
    public void weVisitThe(String url) throws InterruptedException {
        dv.get(url);
        Thread.sleep(5000);
        //wait.forLoading(20);
        //driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")).click();
        dv.findElement(By.linkText("INGRESA")).click();
        Thread.sleep(2000);
    }

    @And("we put this credentials {string} and password {string}")
    public void wePutThisCredentialsAndPassword(String email, String password) throws InterruptedException {
        //Send Email
        dv.findElement(By.cssSelector("#mat-input-0")).sendKeys(email);

        //Send Password
        dv.findElement(By.cssSelector("#mat-input-1")).sendKeys(password);

        //Click Sign In
        dv.findElement(By.cssSelector("body > app-root > app-login > div > div > div.form-log.ng-star-inserted > div > form > div.form-login.text-center > button")).click();

        Thread.sleep(5000);
    }

    @Then("we receive a message containing an {string}")
    public void weReceiveAMessageContainingAn(String message) {

        if (message == "El correo o la contraseña no es válida, intenta nuevamente...") {
            String actualString = dv.findElement(By.xpath("//*[@id=\"mat-dialog-1\"]/app-alert-warning/div[1]/div[2]/p")).getText();

            String expectedString = message;

            assertTrue(actualString.contains(expectedString));
        } else {
            if (message == "TAREAS QUE REQUIEREN TU ATENCIÓN") {
                String actualString = dv.findElement(By.xpath("/html/body/app-root/app-dash/mat-sidenav-container/mat-sidenav-content/app-dash-usuario/div/div[1]/h1")).getText();

                String expectedString = message;

                assertTrue(actualString.contains(expectedString));
            }
        }
    }
}
