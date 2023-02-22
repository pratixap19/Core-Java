$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/TagExample.feature");
formatter.feature({
  "name": "Using of tags in Cucumber",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Scenario3",
  "description": "Given: This is Scenario3",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SanityTest"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
});