FROM eclipse-temurin:17-jdk-alpine
RUN mkdir /app
WORKDIR /app
ARG JAR_FILE=build/libs/*.jar
COPY  ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]