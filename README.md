# CIS2858Project1
Project 1 for CIS 2858

#Project Requirements
This project requires creating a Java EE e-commerce application for out new client, a local farmer in the Michigan area. The farmer lives near the US-Canadian border and wishes to be able to sell his products in both countries. Each country has their own system for deciding expiration dates and the farmer’s current code is getting out of hand. Using what we know about Injecting and Qualifiers, let’s give our client a dependable solution.


Create a Food POJO with the following fields
name, price, expirationDate, category
Create a category enum with options for MEAT, PRODUCE, DAIRY
Create a FoodService to create Food POJOs.
The Interface for GenerateExperationDate will have two implementations, one for the CFIA (Canadian Food Inspection Agency) and one for the FDA (Federal Food and Drug Administration). As well as one to mock dates for integration tests. GenerateExperationDate will have one input parameter, category;
@CFIA
<ul>
<li>Meat - 7 days after the current date</li>
<li>Produce - 10 days after the current date</li>
<li>Dairy - 6 days after the current date</li>
  </ul>
@FDA
<ul>
<li>Meat - 5 days</li>
<li>Produce - 10 days</li>
<li>Dairy -  5 days</li>
  </ul>
@MockGenerator
As Java Craftsman we also need to implement a reliable LoggingInterceptor to keep a record of generating expiration dates in case of an audit.
Our final product should be implementing our FDA expiration date generator, because the farmer has expressed that he will begin his business operations in the US.
