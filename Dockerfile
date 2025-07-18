FROM openjdk:17
EXPOSE 9091
ADD target/springbootmysql.jar springbootmysql.jar
ENTRYPOINT ["java", "-jar", "/springbootmysql.jar"]
