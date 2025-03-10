FROM openjdk:17
ADD ./docker-api.jar docker-api.jar
ENTRYPOINT ["java","-jar","docker-api.jar"]