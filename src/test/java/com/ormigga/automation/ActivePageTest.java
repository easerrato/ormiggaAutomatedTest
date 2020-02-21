package com.ormigga.automation;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/ormigga/automation/LoginRegister/ActiveAccount.feature"},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/active-page.json",
        "html:target/active-page-html"},
        glue = {"com.ormigga.automation.infrastructure.driver",
                "com.ormigga.automation.activeaccount"})
public class ActivePageTest {
}
