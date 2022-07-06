Hi, In this post, we'll learn about how to integrate Cucumber with Selenium, TestNG and Maven.

This is as part of a project that we wanted to migrate the UI automation from Junit frame work to TestNG and we also wanted to upgrade to the latest versions of the dependencies. 

For the demo, we will use the HRM website. 
https://opensource-demo.orangehrmlive.com/index.php/auth/login
Username : Admin, Password: admin123 

Let's take the following use case of scenario's. 

Test Cases/Scenarios: 
Verify log-in page with valid credentials 
Display the size of quick launch elements Dashboard page/tab
Directory tab navigation from Dashboard page/tab
Verify Search button is displayed or not in Dictionary page/tab

In this framework, we will see the below technical implementations of Cucumber, Selenium and TestNG

Cucumber features: 
How to implement  data driven approach using DataTable object in Login scenario ? 
How to use Background keyword in feature files to to login for each scenario except for Login?
(keep the tests independent of each other)
How to give Tags(single and multiple tags) in CucumberOptions in RunCucumberTest  class? 
How to use Cucumber Before and  After Hooks for each scenario ?
Online cucumber report 
Selenium features: 
Implicit wait with Duration of times 
Explicit wait with Duration of times
findElements , add elments to List<WebElement>, display the list elements, size of the list

TestNG and Maven features:
Assertions used in this demo are from TestNG framework. 
How to configure testng.xml file in pom.xml in the maven-surefire-plugin ? 
How to run the cucumber scenarios from command line ? 
Let's begin! 
The first and foremost thing, I've come across is to create the proper maven project structure.
i.e., the usage of src/test/java and src/test/resources 
We can keep our source code in src/main/java and src/main/resources but in order to run the scenarios from maven command line, this cucumber-java-skeleton is recommended to keep the code in 
src/test/java and src/test/resources - at least for the RunnerTest classes so the maven sure fire plug-in identifies the code from test

Having walk-through above all,  here we start with what versions this writing consists of! 
cucumber-java 7.1.0
cucumber-testng 7.1.0
selenium 4.3.0
testng 7.1.0
maven-surefire-plugin 3.0.0-M7
maven-compiler-plugin 3.10.1
Maven installed in Windows is 3.8.6
Project Structure: 
Source code : GitHub


Now, the steps: 
Download and install Cucumber plug-in in Eclipse from Market Place
Download and install TestNG plug-in in Eclipse from Market Place
Create a new Maven project (say : CucucumberTestNGSeleniumMavenCommandLine)
Add cucumber-java, cucumber-testng, testng and selenium dependencies in the pom.xml and etc. 
Add Maven compiler plugin, maven-surefire-plugin in pom.xml 
Create feature files(Gherkhin script) in src/test/resources folder
Write java, selenium, glue(step definitions), cucumber testng runner class in src/test/java folder
BasePage class for driver
Hooks class for cucumber Before and After hooks. 
Step Definition Or Glue Code for the feature files
Cucumber & TestNG runner class, RunCucumberTest.java
 Create testng.xml for the project and configure it in pom.xml
 Run Tests from TestNG Tests
 Run Tests from testng.xml
 Run Tests from command line
 Test results analysis from Cucumber report
 Test results analysis from TestNG report
