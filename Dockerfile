FROM frolvlad/alpine-oraclejdk8:slim
ADD target/foodie-restuarent-service-0.0.1-SNAPSHOT.jar app.jar
ARG PROFILE
ENV JAVA_OPTS="-Dspring.profiles.active=${PROFILE}"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]