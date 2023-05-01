FROM --platform=linux/amd64 maven:3.8.3-openjdk-17

COPY target/greeting-*.jar /app/
WORKDIR /app
ENV ARG "--server.port=8080"

# Copying the Jar files.
RUN mv /app/greeting-*.jar /app/main.jar
CMD java -jar main.jar $ARG
