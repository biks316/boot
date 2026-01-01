FROM maven:3.9.4-eclipse-temurin-17 AS builder
WORKDIR /workspace

# Cache dependencies by copying only pom first
COPY pom.xml ./
RUN mvn -B dependency:go-offline

# Copy source and build
COPY src ./src
RUN mvn -B -DskipTests package

FROM eclipse-temurin:17-jre
WORKDIR /app

# Copy artifact from builder (match any generated jar)
COPY --from=builder /workspace/target/*.jar /app/app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
