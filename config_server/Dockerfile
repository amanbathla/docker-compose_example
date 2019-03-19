FROM openjdk:11

ADD ./target/config_server-0.0.1-SNAPSHOT.jar /usr/src/config_server-0.0.1-SNAPSHOT.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "config_server-0.0.1-SNAPSHOT.jar"]