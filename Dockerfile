FROM openjdk:17-oracle
COPY ./target/samplePrac1-0.0.1-SNAPSHOT.jar /user/
WORKDIR /user
ENTRYPOINT ["java","-jar","samplePrac1-0.0.1-SNAPSHOT.jar"]