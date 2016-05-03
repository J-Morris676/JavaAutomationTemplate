### Automation Template

A template Java web project with a web automation test structure that's ready to go by using:

  * [Cucumber for Java](https://cucumber.io/docs/reference/jvm)
  * [Selenium](http://www.seleniumhq.org/)
  * [ChromeDriver](http://chromedriver.storage.googleapis.com/index.html?path=2.21/) - to enable Selenium to drive Chrome
  * [Gradle](http://gradle.org/) - to build files & run Cucumber
  
Hooks don't start and end a server so one should be running TestTemplate-App before running the tests

You'll also need to change where your installation of ChromeDriver is in NavigationsSteps.java