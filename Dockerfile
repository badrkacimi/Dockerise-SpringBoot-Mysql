FROM openjdk:8
ADD target/users-mysql.jar users-mysql.jar
EXPOSE 8084
ENTRYPOINT ["java", "-jar", "users-mysql.jar"]