FROM eclipse-temurin:23-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app/jar"]
EXPOSE 8080