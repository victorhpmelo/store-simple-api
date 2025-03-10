FROM openjdk:17
ADD target/docker-api.jar docker-api.jar
ENTRYPOINT ["java","-jar","docker-api.jar"]
