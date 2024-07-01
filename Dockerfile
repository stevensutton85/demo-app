# Use a base image with Java 17 installed
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/demo.jar /app/demo.jar

# Expose the port that the Spring Boot application will run on
EXPOSE 8081

# Set the entry point command to run the Spring Boot application
CMD ["java", "-jar", "demo.jar"]