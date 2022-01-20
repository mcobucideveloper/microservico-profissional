FROM openjdk

WORKDIR /app

COPY target/microservico-profissional-0.0.1-SNAPSHOT.jar /app/microservico-profissional.jar

ENTRYPOINT ["java", "-jar", "microservico-profissional.jar"]