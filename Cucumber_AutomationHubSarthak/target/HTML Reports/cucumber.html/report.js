$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Cucumber_learning/login.feature");
formatter.feature({
  "name": "I want to learn MMA with a good trainer",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Looking for a MMA gym near my place",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LookingForMMAGym"
    }
  ]
});
formatter.step({
  "name": "I am interested in practicing MMA",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_StepDefinition.i_am_interested_in_practicing_MMA(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I went online to find MMA gym near me",
  "keyword": "And "
});
formatter.match({
  "location": "Login_StepDefinition.i_went_online_to_find_MMA_gym_near_me(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I went to see the nearest gym on 19th Jan 2021",
  "keyword": "And "
});
formatter.match({
  "location": "Login_StepDefinition.i_went_to_see_the_nearest_gym_on_th_Jan(String)"
});
formatter.result({
  "error_message": "cucumber.runtime.CucumberException: Step [^I went to see the nearest gym on [^\"]*$] is defined with 1 parameters at \u0027Cucumber_learning.Login_StepDefinition.i_went_to_see_the_nearest_gym_on_th_Jan(String) in file:/C:/Users/prati/Eclipse-workspace%20Selenium%202021/Cucumber_AutomationHubSarthak/target/test-classes/\u0027.\nHowever, the gherkin step has 0 arguments.\nStep text: I went to see the nearest gym on 19th Jan 2021\r\n\tat cucumber.runtime.PickleStepDefinitionMatch.arityMismatch(PickleStepDefinitionMatch.java:84)\r\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:34)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:55)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:42)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:98)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:55)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:107)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:542)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:770)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "They gave me annual membership discount of 10% from 15th Jan 2021 to 14th Jan 2022",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "My friends got to hear about this",
  "keyword": "When "
});
formatter.match({
  "location": "Login_StepDefinition.my_friends_got_to_hear_about_this(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "3 of them decided to join",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_StepDefinition.of_them_decided_to_join(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I further got discount of 25% as referal bonus",
  "keyword": "And "
});
formatter.match({
  "location": "Login_StepDefinition.i_further_got_discount_of_as_referal_bonus(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "we could not start because of lockdown",
  "keyword": "But "
});
formatter.match({
  "location": "Login_StepDefinition.we_could_not_start_because_of_lockdown()"
});
formatter.result({
  "status": "skipped"
});
});