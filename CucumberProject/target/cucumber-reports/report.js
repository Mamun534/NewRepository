$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# Author : Mamun Chowdhury"
    },
    {
      "line": 2,
      "value": "# Date : 7/13/2021"
    }
  ],
  "line": 3,
  "name": "Positive \u0026 Nagetive Test",
  "description": "",
  "id": "positive-\u0026-nagetive-test",
  "keyword": "Feature"
});
formatter.background({
  "line": 5,
  "name": "For the login page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user in the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "users click on the login button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 10,
  "name": "Positive Testing for Login",
  "description": "",
  "id": "positive-\u0026-nagetive-test;positive-testing-for-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user enter right username",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "users enter right password",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user should be able to login",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});