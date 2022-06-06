Http Status Code

200			OK

401			UNAUTHORIZED (Username, Password not sent Or Not Correct)

403			Forbidden (authenticated but not allowed to access a resource)

This Project uses DB Authentication

Steps for applying Spring security
----------------------------------

1) To add dependency in pom.xml
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-security</artifactId>
</dependency>

By default one user with username: user
and password : displayed on console : f60a6676-49d5-45b6-b192-47b987c042eb

Problem ?
	Every time you run application new password is generated
	
Above is the default behaviour (functionality) we are getting from Spring security

We want to give custom username and password

2) To write configuration class

Spring security is giving implicit support for an attack know as -CSRF : (cross site request forgery)
POST request doesn't work
So we need to do additional configuration as follows - 