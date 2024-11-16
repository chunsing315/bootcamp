FROM arm64v8/openjdk:17
LABEL maintainer="itsupport@gmail.com"
ADD target/demo-helloworld-0.0.1-SNAPSHOT.jar demo-helloworld-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","demo-helloworld-0.0.1-SNAPSHOT.jar"]
EXPOSE 8081