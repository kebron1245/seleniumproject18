package test.day2_findElement_getText_getAttribute;

/*
JUN 5, FRIDAY
Selenium -->
	- Basically a collection of jar files
	- The jar files have classes
	- And these classes have ready methods
	- We use these jar files to allow ourselves to do action on the browsers with the help of browser drivers

Maven -> Maven is a built automation tool
	- Normally maven is used by developers to develop the application
	- Maven helps us automating creating projects
	- It gives us pre-configured folder structure with pom.xml

	- pom.xml file is the most important file in the maven project
	- it helps us manage & add dependencies
	- it helps us control versions on the tools and dependencies we are using

	- you should always know what version of which tool you are using
	currently used version:
		-> java 8
		-> selenium 3.141.59
		-> WebDriverManager 4.0.0

Built automation tool: What is built?
	Built is the repeated processes when you are creating a project
		-creating folder structure
		-compiling
		-adding jarfiles, dependencies

Is maven for testers?
	- No. it is for developers. But we will take advantage of some of the functionalities provided by maven. Such as pom.xml file and the existing folder structure

Are we going to use maven to its full extent?
	- No. We will not be using maven's all of the functionalities.

What is the folder structure of your current framework?
Interview Question: Gave pen and paper. And was told to draw the folder structure of the current framework.
	projectName
		src
			main --> this folder is used by developers to develop the application
			test --> this folder is used by developers to write their UNIT tests
				java
					test
						day1_selenium_intro
		pom.xml

So in real world, if developers use both the main and test folders,  what folder the testers work on?

	- In the real work environment, you will not be working on the the project where the application is being developed.
	- You will create your own project, and work on the that one.

System.setProperty("the type of driver", "path to the driver");
WebDriverManager.chromedriver().setup(); -->
	- This line is creating the connection between the browser driver and the selenium
	- These two lines are doing the same thing.

intranet -> repository -> get dependencies from there



WebDriver driver = new ChromeDriver(); --> opens chrome browser
WebDriver driver = new FirefoxDriver(); --> opens firefox browser

driver.get("URL") -->
	- this method allows us to get any URL we want to on an open browser
	- Accepts a String parameter

PROJECT DOCUMENTATION:
	- It is better to document what your classes and methods are created about.
ex: web element name-->	manageInterestCollectionButtonHomePage


driver.getTitle() -->
	- Returns the title of the page as a String
	- Does not accept any arguments
	- Return type: String

driver.getCurrentUrl() -->
	- Returns the currentURL of the page as a String
	- Does not accept any arguments
	- Return type: String

driver.navigate().forward()
driver.navigate().back()
driver.navigate().refresh()

driver.navigate().to("URL")
	-> to method, does exactly the same thing with .get("url") method
	-> it accepts a String argument
	-> the difference between .get and navigate().to() is get method will wait the page to be loaded, but navigate().to() method will not wait. It will just continue to the page.

driver.manage().window().maximize() --> makes the opened browser page full screen

driver.close() --> closes the currently opened browser page
driver.quit() --> will close all of the opened browser pages (tabs)


- To be able to do any action on any web element we need to locate that web element for the selenium webdriver.
- We will use findElement method that comes from Selenium to locate web elements

.findElement(By.locator) -->
	- This method finds and returns a single WebElement
	- return type is WebElement
	- Whenever it cannot find a webElement by given locator, it will throw NoSuchElement exception




LOCATORS : There are 8 different types of locators in Selenium
	1- name: This locator will be looking into the whole HTML code, and return the WebElement with matching name attribute value
		- it will find and return the first webelement it finds

	syntax: driver.findElement(By.name("name attribute value"))

.sendKeys("text to be sent here") ==> this method will send the keys to the located web element
	--> accepts a string parameter to be sent
	syntax: driver.findElement(By.locator).sendKeys("text here");

.click();
	--> clicks to the webelement that we located
	--> does not accept any arguments
	--> does not have a return type

 */
public class Notes {
}
