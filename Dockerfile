FROM openjdk:11.0.11-jre
#FROM ssq/iac/java-ssq:corretto-11-latest
WORKDIR application
ARG JAR_FILE=/target/SpringBootLovesK8sApplication-*.jar
COPY ${JAR_FILE} application.jar
ENTRYPOINT ["java", "- jar", "application.jar"]