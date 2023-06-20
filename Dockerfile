FROM openjdk:latest
EXPOSE 8081
ADD target/parolify.jar parolify.jar
ENTRYPOINT [ "java", "-jar", "parolify.jar"]
