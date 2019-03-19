FROM openjdk:11

ADD ./target/eureka_server-0.0.1-SNAPSHOT.jar /usr/src/eureka_server-0.0.1-SNAPSHOT.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "eureka_server-0.0.1-SNAPSHOT.jar"]