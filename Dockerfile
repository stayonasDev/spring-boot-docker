# Use Amazon Corretto JDK 17 as the base image
#FROM amazoncorretto:17


# Copy the JAR file from the build directory to the image
#COPY build/libs/dockerSboot-0.0.1-SNAPSHOT.jar spring-base.jar

# Define the entry point to run the JAR file
#ENTRYPOINT ["java", "-jar", "/spring-base.jar"]


FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","ApplcationApplication", "RestControllerTest"]/