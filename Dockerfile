# Use a base image with Java and a Linux distribution (e.g., Ubuntu)
FROM adoptopenjdk:11-jre-hotspot

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot JAR file into the container (you need to build the JAR file first)
COPY target/BillPro-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that your Spring Boot application will run on (default is 8080)
EXPOSE 8080

# Define environment variables if needed (e.g., for Spring profiles)
# ENV SPRING_PROFILES_ACTIVE=production

# Specify the command to run your Spring Boot application when the container starts
CMD ["java", "-jar", "app.jar"]
