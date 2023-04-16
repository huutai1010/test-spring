FROM openjdk:8
EXPOSE 8080
ADD target/springTest-0.0.1-SNAPSHOT.jar springTest-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/springTest-0.0.1-SNAPSHOT.jar"]