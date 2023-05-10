FROM amazoncorretto:11-alpine-jdk
MAINTAINER francofrighetto
COPY target/portfolio-back-0.0.1-SNAPSHOT.jar portfolio-back-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/portfolio-back-0.0.1-SNAPSHOT.jar"]
