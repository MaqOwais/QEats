### PROGRAM_V2_DEVSPRINT_BACKEND_DEVELOPER_05022022_BEJAVA2_SELF_PACED-quadirowais2000-ME_QEATS_V2

_**Overview**_
QEats is a popular food ordering app that allows users to browse and order their favorite dishes from nearby restaurants.

During the course of this project,

I had build different parts of the QEats backend which is a Spring Boot application.
Several REST API endpoints were implemented to query restaurant information and place food orders.
To give a sense of real-world problems, production issues were investigated using Scientific Debugging methods.
Along with this, I improved the app performance under large load scenarios as well as included an advanced search feature in the app. 


_**Perform search operations using custom attributes**_

**Scope of Work**
Used MongoDB queries to enable users to search for restaurants using attributes like name, cuisine, dish, and price.
Used multithreading to increase the number of concurrent searches that can be performed.

**Skills used** MongoDB querying, Multithreading

_**Replicate performance issues and solve them using caching strategies**_

**Scope of Work**
Employed JMeter or load testing to expose performance issues.
Identified DB queries contributing to degradation in performance.
Used a Redis cache to alleviate read performance.

**Skills used** Redis, JMeter


_**Resolve production issues using Scientific Debugging**_

**Scope of Work** Debug QEats app crashes from backend leveraging log messages and structured debugging techniques.
Use IDE features (breakpoints) and assert statements to identify the root cause.
**Skills used** Scientific Debugging


_**Retrieve restaurant data for a given user location**_

**Scope of Work**I mplemented GET /API/v1/restaurants and the corresponding request handler and response methods.
Used Mockito to enable the development of the relevant MVCS layers independently.
Retrieved a list of restaurants from MongoDB based on a user location.
**Skills used:** Spring Boot, Spring Data, REST API, Jackson, Mockito, JUnit, MongoDB


See complete overview --> https://www.crio.do/learn/portfolio/quadirowais2000/ME_QEATS_V2/
