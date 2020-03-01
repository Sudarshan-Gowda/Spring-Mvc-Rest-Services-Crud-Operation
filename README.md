# Restfull Webservices For Crud Operation

## Topics Covered
* This Example covers wriring simple & robust web services using HTTP Methods of GET & POST.
* Also covers Many To Many Real time example with Annotation.
* Experience towards loading properties from the configuration file at runtime.
* Proper way of handling exception & also code clean & maintainance


## Running Spring rest locally

You can then access Restfull here: https://github.com/Sudarshan-Gowda/Spring-Mvc-Rest-Services-Crud-Operation


## In case you find a bug/suggested improvement for Spring Restfull Webservices
Our issue tracker is available here: https://github.com/Sudarshan-Gowda/Spring-Mvc-Rest-Services-Crud-Operation/issues


## Working with Rest in Eclipse

### prerequisites
The following items should be installed in your system:
* Tool - STS(Spring Toot Suite) or Eclipse
* Server - Apache Tomcat 7
* Database - MySQL
* Postman

### Steps:

1) Download this Project and do maven import.
```
git clone https://github.com/Sudarshan-Gowda/Spring-Mvc-Rest-Services-Crud-Operation.git
```
2) To Import the Praject Using STS or Eclipse.
```
File -> Import -> Maven -> Existing Maven project
```


## Looking for something in particular?

|Spring Boot Configuration | Class or Java property files  |
|--------------------------|---|
|The Main Class | [RestController]
(https://github.com/Sudarshan-Gowda/Spring-Mvc-Rest-Services-Crud-Operation/blob/master/src/main/java/com/star/sud/controller/RestController.java) |
|Properties Files | [application.properties]
(https://github.com/Sudarshan-Gowda/Spring-Mvc-Rest-Services-Crud-Operation/blob/master/src/main/resources/application.properties) |
|Data Base Scripts Files | [scripts.sql]
(https://github.com/Sudarshan-Gowda/Spring-Mvc-Rest-Services-Crud-Operation/blob/master/src/main/resources/scripts.sql) |
|Sample Json | [sample-json.txt]
(https://github.com/Sudarshan-Gowda/Spring-Mvc-Rest-Services-Crud-Operation/blob/master/src/main/resources/sample-json.txt) |

## Steps to test the application:

1) Once the application is installed properly, Run the application
2) Once the application is deployed properly, Create schema and execute query into database. 
   For scripts reference use the link [scripts.sql]
   (https://github.com/Sudarshan-Gowda/Spring-Mvc-Rest-Services-Crud-Operation/blob/master/src/main/resources/scripts.sql)
3) Find the below exposed urls to test the application.
	```	
	a. To fetch all the course details
	http://localhost:8090/Spring-Mvc-Rest-Services-Crud-Operation/getCourseDetails

	b. To fetch the course details by id
	http://localhost:8090/Spring-Mvc-Rest-Services-Crud-Operation/getCourseById/{id}

	c. To register the student (POST Method)
	http://localhost:8090/Spring-Mvc-Rest-Services-Crud-Operation/registerStudent
	{
		"student": {
			"stdFirstName":"Jennifer",
			"stdLastName":"L",
			"stdEmail": "Jennifer@gmail.com"
		}
	}

	d. To Opt/subscribe the Student Id with Course (POST Method)
	http://localhost:8090/Spring-Mvc-Rest-Services-Crud-Operation/optCourseForStudentById
	{
		"stdId":"1",
		"courseId":"1"
	}

	e. To fetch all Course and Student details
	http://localhost:8090/Spring-Mvc-Rest-Services-Crud-Operation/getAllCourseDetailsByStdId

	f. To remove or delete the Student from the course (POST Method)
	http://localhost:8090/Spring-Mvc-Rest-Services-Crud-Operation/deleteStudentOptCourseById
	{
		"stdId":"1",
		"courseId":"2"
	}
	```
   
## User reference or guide.
  Application Landing Page: [click here]
  (https://github.com/Sudarshan-Gowda/Spring-Mvc-Rest-Services-Crud-Operation/blob/master/docs/picture1.png)

# Contributing

The [issue tracker]
(https://github.com/Sudarshan-Gowda/Spring-Mvc-Rest-Services-Crud-Operation/issues) is the preferred channel for bug reports, features requests and submitting pull requests.

