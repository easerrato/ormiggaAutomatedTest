package com.ormigga.automation.basepage;

import com.ormigga.automation.infrastructure.driver.Setup;
import com.ormigga.automation.infrastructure.driver.Wait;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver dv;
    protected Wait wait;

    public BasePage() {
        this.dv = Setup.driver;
        this.wait = new Wait(this.dv);
    }
}
