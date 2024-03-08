FROM openjdk:17-alpine

ADD /build/libs/configserver-0.0.1-SNAPSHOT.jar /app/

CMD ["java", "-Xmx200m", "-jar", "/app/configserver-0.0.1-SNAPSHOT.jar"]

EXPOSE 8888