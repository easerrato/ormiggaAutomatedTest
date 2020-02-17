package com.ormigga.automation;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/ormigga/automation/LoginRegister/Login.feature"},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/home-page.json",
        "html:target/login-page-html"},
        glue = {"com.ormigga.automation.infrastructure.driver",
                "com.ormigga.automation.loginpage"})
public class LoginPageTest {
}
