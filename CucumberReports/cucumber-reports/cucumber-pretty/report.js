$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginHRM.feature");
formatter.feature({
  "line": 2,
  "name": "Login functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Verify login functionality",
  "description": "",
  "id": "login-functionality;verify-login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I navigate to \"https://opensource-demo.orangehrmlive.com/index.php/auth/login\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I type username \"\u003cusername\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Click login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I verify the \"\u003cexpected_result\u003e\" in step",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "login-functionality;verify-login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "expected_result"
      ],
      "line": 12,
      "id": "login-functionality;verify-login-functionality;;1"
    },
    {
      "cells": [
        "Admin",
        "admin123",
        "https://opensource-demo.orangehrmlive.com/index.php/dashboard"
      ],
      "line": 13,
      "id": "login-functionality;verify-login-functionality;;2"
    },
    {
      "cells": [
        "invalid",
        "admin123",
        "Invalid credentials"
      ],
      "line": 14,
      "id": "login-functionality;verify-login-functionality;;3"
    },
    {
      "cells": [
        "Admin",
        "invalid",
        "Invalid credentials"
      ],
      "line": 15,
      "id": "login-functionality;verify-login-functionality;;4"
    },
    {
      "cells": [
        "invalid",
        "invalid",
        "Invalid credentials"
      ],
      "line": 16,
      "id": "login-functionality;verify-login-functionality;;5"
    },
    {
      "cells": [
        "",
        "admin123",
        "Username cannot be empty"
      ],
      "line": 17,
      "id": "login-functionality;verify-login-functionality;;6"
    },
    {
      "cells": [
        "Admin",
        "",
        "Password cannot be empty"
      ],
      "line": 18,
      "id": "login-functionality;verify-login-functionality;;7"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2400217700,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify login functionality",
  "description": "",
  "id": "login-functionality;verify-login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 4,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I navigate to \"https://opensource-demo.orangehrmlive.com/index.php/auth/login\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I type username \"Admin\" and password \"admin123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Click login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I verify the \"https://opensource-demo.orangehrmlive.com/index.php/dashboard\" in step",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://opensource-demo.orangehrmlive.com/index.php/auth/login",
      "offset": 15
    }
  ],
  "location": "LoginHRM_StepDef.i_navigate_to(String)"
});
formatter.result({
  "duration": 770766300,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: cannot determine loading status\nfrom disconnected: received Inspector.detached event\n  (Session info: chrome\u003d89.0.4389.90)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-0TK5P9S\u0027, ip: \u0027192.168.103.21\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 89.0.4389.90, chrome: {chromedriverVersion: 89.0.4389.23 (61b08ee2c5002..., userDataDir: C:\\Users\\drivas\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:53363}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 8c5d56cef60aae820f490a6cce1b5313\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat stepdefinition.LoginHRM_StepDef.i_navigate_to(LoginHRM_StepDef.java:32)\r\n\tat ✽.Given I navigate to \"https://opensource-demo.orangehrmlive.com/index.php/auth/login\"(LoginHRM.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 17
    },
    {
      "val": "admin123",
      "offset": 38
    }
  ],
  "location": "LoginHRM_StepDef.i_type_username_and_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginHRM_StepDef.click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "https://opensource-demo.orangehrmlive.com/index.php/dashboard",
      "offset": 14
    }
  ],
  "location": "LoginHRM_StepDef.i_verify_the_in_step(String)"
});
formatter.result({
  "status": "skipped"
});
