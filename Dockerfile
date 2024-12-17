FROM openjdk:23-jdk-slim
EXPOSE 8080
WORKDIR /app

COPY target/service*.jar /opt/app.jar
ENTRYPOINT ["java","-jar","/opt/app.jar"]