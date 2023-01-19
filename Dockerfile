FROM adoptopenjdk/openjdk11:alpine-jre

EXPOSE 8080

ADD target/Rest-0.0.1-SNAPSHOT.jar docker.jar

ENTRYPOINT ["java", "-jar", "/docker.jar"]