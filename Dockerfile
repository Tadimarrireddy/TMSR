# Use OpenJDK 17 base image
FROM openjdk:17

# Copy the jar file into container
COPY target/tmsr-sts-fullsite-1.0.0.jar app.jar

# Run the jar
ENTRYPOINT ["java","-jar","/app.jar"]
