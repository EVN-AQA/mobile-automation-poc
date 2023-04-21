# Mobile Automated Testing - POC

## Table of Contents

- [About](#about)
- [Getting Started](#getting_started)
- [Usage](#usage)

## About <a name = "about"></a>

The purpose of this project is to practice the automated testing for Mobile Application.
In this project, we use:
- Appium
- Java 11
- TestNG

Our focus is to execute tests on Local machine and generate an HTML test report.

## Getting Started <a name = "getting_started"></a>

These instructions will get you a copy of the project up and running on your local machine.

### Prerequisites

Your local machine must install:
- Java 11
- Xcode (latest version)
- Android Studio (latest version)
- Setup JAVA_HOME, ANDROID_HOME
- Node JS (latest version)
- Appium 2.x (install by NPM - `npm install -g appium@next`)
- Appium Dashboard (install by NPM - `appium plugin install --source=npm appium-dashboard`)
- Appium Device Farm (install by NPM - `appium plugin install --source=npm appium-device-farm`)
- XCUITest driver (install by NPM - `appium driver install xcuitest`)
- UIAutomator2 driver (install by NPM - `appium driver install uiautomator2`)

### Installing

A step by step series of examples that tell you how to get a development env running.

1. Prepare test device
- Launch Emulator for Android
- Launch Simulator for iOS
- Connect a real device via cable.

2. Start Appium server

`appium server -ka 800 --use-plugins=device-farm,appium-dashboard --plugin-device-farm-platform=both -pa /wd/hub`

3. Update device information at file `src/main/resources/devices.json`

```JSON
{
  "<name>": {
    "platformName": "<Android|iOS>",
    "platformVersion": "<number>",
    "name": "<name>",
    "udid": "<UDID>"
  }
}
```

4. Execute tests

`mvn clean test`

5. Generate an HTML report

`mvn allure:serve`

## Usage <a name = "usage"></a>

Update soon
