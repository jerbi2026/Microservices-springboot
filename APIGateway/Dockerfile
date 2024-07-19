FROM openjdk:17-jdk
WORKDIR /app
EXPOSE 8875
ADD target/APIGateway-0.0.1-SNAPSHOT.jar APIGateway-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","APIGateway-0.0.1-SNAPSHOT.jar"]