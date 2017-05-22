# UiTest-MavenExample
以Selenium與Appium實現Web與App自動化測試.

## Motivation

To provide the QE quick set-up the automated environment, the document is mention how step-by-step to build up your environment of automation. 

## Installation

### Appium

1. Open terminal and get node.js.
2. Download Appium GUI from http://appium.io/ through safari.
3. Open Appium and click the Doctor button and Appium will run iOS Checks.
4. Set the ios setting.
5. Click the Developer Settings button, tick the Custom Server Flag and fill "--native-instruments-lib".
6. Launch the Appium.

### Eclipse

1. Install Eclipse from https://wiki.eclipse.org/Eclipse/Installation.
2. Search and install by Maven / TestNG / Git from Eclipse Marketplace.
3. Setup the Git repo from File -> import -> Git.
4. Right click on pom.xml after git pull completed.
5. Click run as -> Maven install.
6. Try run automation testing.

### Chrome

https://www.google.com.tw/chrome/browser/desktop/

### ChromeDriver

https://chromedriver.storage.googleapis.com/index.html

## Tests

### ExtentReports

Finish the tests, ExtentReports will create a folder call "ExtentReports" under the userDir folder, and you will see the test report.

### Parallel Test

We use RemoteWebDriver and TestNG to achieve Parallel Test.
