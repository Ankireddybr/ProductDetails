

productDetails

This project is Used to get the information about product details and config details.

Technologies used:

1.Java 11

2.Spring Boot

3.Spring Rest

4.Spring Security

5.Maven

Depedencies used :


        <dependency>
                 <groupId>org.springframework.boot</groupId>
                 <artifactId>spring-boot-starter-test</artifactId>
                 <scope>test</scope>
        </dependency>
        <dependency>
                 <groupId>org.springframework.security</groupId>
                 <artifactId>spring-security-test</artifactId>
                 <scope>test</scope>
        </dependency>
        <dependency>
                 <groupId>org.projectlombok</groupId>
                 <artifactId>lombok</artifactId>
                 <version>1.18.12</version>
                 <scope>provided</scope>
        </dependency>
        
Project installation:

1.Clone or downlaod the project from the github.com

https://github.com/Ankireddybr/productDetails/

2.build the project using maven -- use mvn clean install

3.Got to main class of product details of application and run the applcation by setting the profile as local in VM arguments -- 

-Dspring.profiels.active=local

Testing the Application:

Use the below mentioned two endpoints to test the application.

for getting the product details .

http://http://localhost:59600/product/api/getproductdetails

spring security credentials:

username : blah

Password: blah

for getting the config detaisl .

http://localhost:59600/product/api/getconfigdetails

Spring security credentials:

username :foo 

password:foo

