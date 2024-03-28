FROM eclipse-temurin:17
WORKDIR /home
COPY ./target/primesservice-0.0.1-SNAPSHOT.jar /home/primesservice.jar
ENTRYPOINT ["java", "-jar", "primesservice.jar"]
