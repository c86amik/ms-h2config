FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 7100
ADD target/*.jar flight-eureka-server-0.1.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /flight-eureka-server-0.1.jar" ]