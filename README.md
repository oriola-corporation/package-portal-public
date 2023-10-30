# Package Portal

## The issue
We have an endpoint in this service that returns if the supplied person identity number is a valid one.   
But we have received reports from the business that this is not working properly. This service has  
not been given the love it deserves by various reasons. So we need your help to fix the issues and  
give it the love it deserves. Please be our hero and save the day. 

## Assignment
### Part 1
1. The endpoint should validate if the parameter _personal identity number_ is valid or not.  
Use the following algorithm to validate if the input is a personal identity number or not.  
https://en.wikipedia.org/wiki/Personal_identity_number_(Sweden)#Checksum  
2. Every validation attempt should be persisted in the h2 database.  
3. There might be some code smells in this repository, please correct these.

### Part 2
Every day our warehouse sends "Click&Collect" packages to our pharmacies.
We require a new API to keep track of which packages should be sent to which pharmacies, and to which recipients. <br/>
A package includes packageId, pharmacyId and recipient. The api should include: <br/>
    - List all packages <br/>
    - Get single package <br/>
    - Add new package <br/>
    - Remove package <br/>

When done send us your work on email. <br/>

### Overall code qualitites: 
Qualities we look for in a code submission: <br/> 
_Clarity and readability_: Code should be easy to read and understand by colleagues to facilitate collaboration and maintenance. <br/>
_Security and privacy_: Code should take into consideration the handling of sensitive information and adhere to best practices to protect data integrity and confidentiality. <br/>
_Resilience and error handling_: Code should be resilient, capable of withstanding use from numerous clients without crashing as well as give resonable information to clients <br/>

## Run the app

Prerequisites: Java17, Maven

1. Start by building the app using command ```mvn clean install```
2. Run the app by using command ```java -jar target/package-portal-public-0.0.1-SNAPSHOT.jar```


