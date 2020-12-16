$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featuresfile/login.feature");
formatter.feature({
  "line": 1,
  "name": "EndToEnd feature",
  "description": "",
  "id": "endtoend-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10255931099,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "as a user i should be able to purchase successfully",
  "description": "",
  "id": "endtoend-feature;as-a-user-i-should-be-able-to-purchase-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "i am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "i click on new tab",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "i navigate to new arrivals page",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "i click on  fitness tracker smart watch",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "i should be bale to select watch successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "EndToEndStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 293646901,
  "status": "passed"
});
formatter.match({
  "location": "EndToEndStepdefs.iClickOnNewTab()"
});
formatter.result({
  "duration": 2219598700,
  "status": "passed"
});
formatter.match({
  "location": "EndToEndStepdefs.iNavigateToNewArrivalsPage()"
});
formatter.result({
  "duration": 119015400,
  "status": "passed"
});
formatter.match({
  "location": "EndToEndStepdefs.iClickOnFitnessTrackerSmartWatch()"
});
formatter.result({
  "duration": 2378474500,
  "status": "passed"
});
formatter.match({
  "location": "EndToEndStepdefs.iShouldBeBaleToSelectWatchSuccessfully()"
});
formatter.result({
  "duration": 116157901,
  "status": "passed"
});
formatter.after({
  "duration": 1049278700,
  "status": "passed"
});
});