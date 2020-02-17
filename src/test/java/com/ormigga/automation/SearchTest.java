package com.ormigga.automation;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/ormigga/automation/Search.feature"},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/search.json",
        "html:target/search-html"},
        glue = {"com.ormigga.automation.infrastructure.driver",
                "com.ormigga.automation.homepage",
                "com.ormigga.automation.searchresultpage"})
public class SearchTest {
}
