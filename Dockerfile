
FROM openjdk:8-jre-alpine
COPY /target/*.jar customer.jar
CMD ["java","-jar","/customer.jar"]
