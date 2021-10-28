# Insurance-Management-System
Insurance Management System provide details about Client, Vehicle and Policy with CRUD Operations(create, View, Update and Delete).
It easily helps to add new clients, their vehicle detail, update,delete those details and client can view policy details using this system.
Spring boot and MySQL use as technologies for the implementation of this application. In
this project used Thymeleaf as a template for interaction between HTML files and Java Classes.

Database Name:Insurancesystemdb
3 Tables:
clients
vehicles
policys


Navigation bar is enable. Thus, after browse Localhost:8080, then easily can view vehicle and policy details using navigation button.

RUN:
Localhost:8080

or
Localhost:8080/clients
Localhost:8080/vehicles
Localhost:8080/policys

In source code, there are several 

Controller Package
-ClientController
-VehicleController
-PolicyController

Model Package
-Client
-Vehicle
-Policy

Repository Package
-ClientsRepository
-PolicysRepository
-VehiclesRepository

Templete folder contains all HTML files show in frontend
-create_client.html
-create_vehicle.html
-create_policy.html
-clients.html
-edit_client.html
-edit_vehicle.html
-Index.html
-policys.html
-vehicles.html


application.properties files have all databases details.
spring.datasource.url=jdbc:mysql://localhost:3306/insurancesystemDB
spring.datasource.username=root
spring.datasource.password=
#Hibernate
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect
#Hibernate auto ddl
spring.jpa.hibernate.ddl-auto=update
logging.level.org.hibernate.SQL=DEBUG
