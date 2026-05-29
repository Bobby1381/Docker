FROM eclipse-temurin:17

COPY target/rest-demo.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]