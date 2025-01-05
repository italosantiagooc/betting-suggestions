FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY . /app
RUN ./gradlew build --no-daemon
EXPOSE 8080
CMD ["java", "-jar", "build/libs/sua-aplicacao.jar"]