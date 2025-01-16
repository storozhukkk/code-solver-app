FROM maven as build
ENV HOME=/eureka
RUN mkdir -p $HOME
WORKDIR $HOME
COPY pom.xml $HOME
RUN mvn verify --fail-never
COPY . $HOME
RUN mvn clean package

FROM eclipse-temurin:17-alpine

COPY --from=build /eureka/target/eureka.jar /app/runner.jar

ENTRYPOINT java -jar /app/runner.jar