# Selenium

selenium WebDriver Framework Architecture

1. Selenium Client Libraries

Selenium Client library(supports a variety of library like python, java, c#, due to the language binding created by selenium developer to ensure language compatibility. any language u use, you can get all the supporting language binding from the selenium official website

1. JSON Wire Protocol

It provides a mechanism to send data between the web client and the server, supports a variety of data structures like array and object making it easier to read and write data from json.

1. Browser Drivers - (Chrome driver, Gecko Drive, Microsoft Edge, WebDriver) - For each selenium command, and HTTP request is generated and sent to the web driver, the browser driver receives the HTTP request from the HTTP server
2. Real Browsers (supports a variety of browsers like Chrome, Firefox, Safari, internet explorer)

Benefits of selenium WebDriver

1. It is one of the most popular Open-source tools for testing web-based applications
2. Operating systems supported include windows, mac,linux, and unix
3. Supports modern browsers such as chrome, firefox,safari, and internet explorer.
4.  Selenium WebDriver completes test script execution faster that other tools
5. API that is faster than Selenium RC

Limitations

1. It lacks built-in support for testing desktop application, mobile apps, other
2. Selenium WebDriver does not include reporting capabilities, you solely have to depend on third party apps
3. CAPTCHA is a problem for selenium WebDriver and directly reading barcodes
4. Selenium WebDriver can have a steep learning curve. It may take some time to mater it
5. Selenium WebDriver does not directly support file upload and download dialogues

Selenium Remote Control (RC)

Selenium Remote Control (RC) was one of the earliest components of the Selenium framework, designed for automating web browser interactions. It was introduced as a way to programmatically control web browsers using a server-client architecture. However, Selenium RC has been deprecated in favour of newer and more powerful tools like Selenium WebDriver.

 selenium web browser api

helps communication between languages and web browsers

WEB ELEMENTS

Components

HTML tag attribute and text field

Types of Web elements  & Operations performed on these web elements

1. Edit Box(typing into it, clearing the value in it, check the enable status, edit box existence)
2. Link(click on it, check link existence, check link enable state
3. Image, image link, image button
    1. types of images 
        1. General images(does not have any functionalities)
        2. Image button(helps in submitting the image)
        3. image link(helps in redirecting to other web pages or locations)
4. Text Area(return or capture of the text area, displaying the error message)
5. Radio Button(verify radio button, verifies if the radio button is displayed or enabled or not)
6. Drop down Box(check the presence of the checkbox, enabled or not
7. List Box(selects a list and deselect it as well)
8. Button(click, check enabled status, display status)
9. Combo Box -a combination of drop down and list
10. checkbox-(selecting and un-selecting, enabled and disabled)
11. Web Table(helps to get the cell value, the row count )
12. Frames-(Switching from the top window to a particular frame in the web page and switching from a frame to the top window and may more

Locators

class

xpath

linkText

css selector

name

DOM

identifier

Filters

Tag

Id

Partial link text

Selenium links

ID

name

class

LinkText

CSS selector

Partial link text 

xpath