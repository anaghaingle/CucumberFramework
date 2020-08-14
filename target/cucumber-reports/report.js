$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/LoginTest.feature");
formatter.feature({
  "name": "LoginTest",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Successful login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "User is at home page",
  "keyword": "Given "
});
formatter.step({
  "name": "user navigate to login page",
  "keyword": "When "
});
formatter.step({
  "name": "user enter Username\u003cuserID\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user enter Password\u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "message dispayed is successful login",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userID",
        "password"
      ]
    },
    {
      "cells": [
        "Anagha",
        "123456"
      ]
    },
    {
      "cells": [
        "Om",
        "123564"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Successful login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "User is at home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefn.user_is_at_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to login page",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefn.user_navigate_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter UsernameAnagha",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefn.user_enter_Username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter Password123456",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefn.user_enter_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "message dispayed is successful login",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefn.message_dispayed_is_successful_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Successful login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "User is at home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefn.user_is_at_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to login page",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefn.user_navigate_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter UsernameOm",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefn.user_enter_Username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter Password123564",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefn.user_enter_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "message dispayed is successful login",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefn.message_dispayed_is_successful_login()"
});
formatter.result({
  "status": "passed"
});
});