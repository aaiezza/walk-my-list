FROM amazoncorretto:11
ADD target/walk-my-list.jar /app/walk-my-list.jar
CMD ["/usr/bin/java", "-jar", "/app/walk-my-list.jar"]
