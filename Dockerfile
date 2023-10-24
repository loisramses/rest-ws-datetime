FROM openjdk:17
WORKDIR /app
COPY target/rest-ws-datetime-0.0.1-SNAPSHOT.jar /app
CMD ["java", "-jar", "rest-ws-datetime-0.0.1-SNAPSHOT.jar"]