$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/login.feature");
formatter.feature({
  "name": "Test login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check login is successful with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user is navigated to the login page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});