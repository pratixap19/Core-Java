$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/DataTable.feature");
formatter.feature({
  "name": "Test the login functionality of OrangeHRM using Data Table",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test the valid login page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.StepDefinition.LoginSteps.user_is_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters credentials using DataTable",
  "rows": [
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.LoginSteps.user_enters_credentials_using_DataTable(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.LoginSteps.click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should land on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.LoginSteps.user_should_land_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:src/test/resources/Features/Login.feature");
formatter.feature({
  "name": "Test the login functionality of OrangeHRM",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Test the valid login page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "name": "user should land on home page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "admin123"
      ]
    },
    {
      "cells": [
        "admin1",
        "admin1234"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Test the valid login page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.StepDefinition.LoginSteps.user_is_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters admin and admin123",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.LoginSteps.user_enters_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.LoginSteps.click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should land on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.LoginSteps.user_should_land_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Test the valid login page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.StepDefinition.LoginSteps.user_is_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters admin1 and admin1234",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.LoginSteps.user_enters_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.LoginSteps.click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should land on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.LoginSteps.user_should_land_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:src/test/resources/Features/TagExample.feature");
formatter.feature({
  "name": "Using of tags in Cucumber",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Scenario1",
  "description": "Given: This is Scenario1",
  "keyword": "Scenario"
});
formatter.scenario({
  "name": "Scenario2",
  "description": "Given: This is Scenario2",
  "keyword": "Scenario"
});
formatter.scenario({
  "name": "Scenario3",
  "description": "Given: This is Scenario3",
  "keyword": "Scenario"
});
formatter.scenario({
  "name": "Scenario4",
  "description": "Given: This is Scenario4",
  "keyword": "Scenario"
});
formatter.scenario({
  "name": "Scenario5",
  "description": "Given: This is Scenario5",
  "keyword": "Scenario"
});
formatter.scenario({
  "name": "Scenario6",
  "description": "Given: This is Scenario6",
  "keyword": "Scenario"
});
});