install JDK 1.8

install it - give the path in environment variable upto \bin



install eclipse : https://www.eclipse.org/downloads/packages/release/kepler/sr2/eclipse-ide-java-developers - give path to jre

follow steps:

https://www.javatpoint.com/spring-boot-application

use gradle project

https://start.spring.io/ (select gradle)


gradle dependency:

implementation 'org.springframework.boot:spring-boot-starter'                 ---- to start boot application
	implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
	implementation 'org.springframework.boot:spring-boot-starter-web'  -------- for rest api mapping
	

create a static folder in resources:
create index.html

create LoginController.java in src/main/java
give @restController - to identfy controler
@requestMapping to map the path
@requestParam to match  the name of the field.





Application with docker

https://spring.io/guides/gs/spring-boot-docker/

for gradle: https://gradle.org/install/
set path in path variable

gradle wrapper --gradle-version {version}

goto initial folder of above project: 
open terminal and run command:
./gradlew build
java -jar build/libs/gs-spring-boot-docker-0.1.0.jar

to build docker image: docker build --build-arg JAR_FILE=build/libs/*.jar -t parth-demo .
to run the image: docker image parth-demo

