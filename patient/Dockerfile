FROM adoptopenjdk/openjdk11:alpine-jre
MAINTAINER maximan(ericmaximan@gmail.com)
ADD ./target/patient-1.0-SNAPSHOT.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]