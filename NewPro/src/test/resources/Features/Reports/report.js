$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/fblogin.feature");
formatter.feature({
  "name": "Facebook Functionality test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Facebook Creadentials Test",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user should be in the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefin.user_should_be_in_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter the username and password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefin.user_should_enter_the_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefin.user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefin.user_should_verify_the_login_page()"
});
formatter.result({
  "status": "passed"
});
});