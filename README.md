SoapUI Groovy examples
======================

This is a collection of SoapUI projects and Groovy Scripts used to demonstrate the Groovy scripting capabilities in soapUI

## Tips and tricks
* Use `log.info <variable>` to get the class of a variable, such as the `testRunner`. Then you can refer to this class in the [SoapUI API documentation](https://github.com/SmartBear/soapui-groovy-examples#soapui-api-documentation).
* Use the Groovy shortcut notation for getters and setters. For example, use `testRunner.testCase` instead of `testRunner.getTestCase()` and `project.abortOnError = true` instead of `project.setAbortOnError(true)` ([Read more](http://groovy.codehaus.org/Groovy+style+and+language+feature+guidelines+for+Java+developers))

## Resources
* [The official Groovy site](http://groovy.codehaus.org)
* [SoapUI scriping tips & tricks](http://www.soapui.org/Scripting-Properties/tips-a-tricks.html)
* [10 Groovy scripts on your finger tips](http://learnsoapui.wordpress.com/2011/07/17/10-groovy-scripts-on-your-finger-tips-soapui/)
* [SoapUI source code](http://github.com/SmartBear/soapui)

### SoapUI API documentation
* [SoapUI docs](http://www.soapui.org/apidocs/)
* [SoapUI Pro docs](http://www.soapui.org/apidocs/pro)
* [UI helper methods](http://www.soapui.org/apidocs/index.html?com/eviware/soapui/support/UISupport.html)
