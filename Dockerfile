

# 1. Use Maven image to build the application
FROM maven:3.9.9-eclipse-temurin-24 AS build

# Set working directory inside container
WORKDIR /app

# Copy pom.xml and download dependencies (cache step)
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy source code and build the JAR
COPY src ./src
RUN mvn clean package -DskipTests

# 2. Use lightweight JRE for running the app
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy built JAR from build stage
COPY --from=build /app/target/*.jar app.jar

# Expose application port (default 8080)
EXPOSE 9091

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

