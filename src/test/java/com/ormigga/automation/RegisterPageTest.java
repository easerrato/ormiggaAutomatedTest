package com.ormigga.automation;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/ormigga/automation/LoginRegister/Register.feature"},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/register-page.json",
        "html:target/home-page-html"},
        glue = {"com.ormigga.automation.infrastructure.driver",
                "com.ormigga.automation.registerpage"})
public class RegisterPageTest {
}
