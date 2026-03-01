# Use a lightweight Java 21 runtime
FROM eclipse-temurin:21-jre-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged JAR file from the target directory into the container
COPY target/calculator-app-1.0-SNAPSHOT.jar /app/calculator.jar

# Define the command to run the application
CMD ["java", "-jar", "calculator.jar"]

