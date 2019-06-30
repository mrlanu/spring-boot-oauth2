FROM java:8
EXPOSE 8080
LABEL maintainer=“mrlanu@gmail.com”
ADD ./target/auth-server-0.0.1-SNAPSHOT.jar auth-server-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","auth-server-0.0.1-SNAPSHOT.jar"]

