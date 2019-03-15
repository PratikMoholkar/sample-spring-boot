FROM openjdk:8-jre-alpine
ADD target/demo-0.0.2-SNAPSHOT.jar demo-0.0.2.jar
ENTRYPOINT ["java", "-jar", "demo-0.0.2.jar"]

EXPOSE 9000