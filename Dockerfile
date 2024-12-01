FROM openjdk:17-jdk-slim

WORKDIR /usr/app

COPY ./build/libs/*.jar /usr/app/app.jar

CMD ["java", "-jar", "app.jar"]
