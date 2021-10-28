# Insurance-Management-System


Database Name:Insurancesystemdb
3 Tables:
clients
vehicles
policys


Navigation bar is enable. Thus, after browse Localhost:8080, then easily can view vehicle and policy details using navigation button.

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
