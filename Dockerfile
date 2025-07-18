FROM openjdk:17
EXPOSE 9091
COPY target/springbootmysql.jar /springbootmysql.jar
ENTRYPOINT ["java", "-jar", "springbootmysql.jar"]
