# Estágio 1: Build da aplicação com Maven
FROM maven:3.8.5-openjdk-11 AS build

# Define o diretório de trabalho
WORKDIR /app

# Copia o pom.xml e baixa as dependências (para aproveitar o cache do Docker)
COPY pom.xml .
RUN mvn dependency:go-offline

# Copia o restante do código-fonte
COPY src ./src

# Compila e empacota a aplicação, pulando os testes
RUN mvn package -DskipTests

# Estágio 2: Imagem final com a aplicação
FROM openjdk:11-jre-slim

# Define o diretório de trabalho
WORKDIR /app

# Copia o artefato JAR do estágio de build
COPY --from=build /app/target/dsmovie-0.0.1-SNAPSHOT.jar app.jar

# Expõe a porta em que a aplicação vai rodar
EXPOSE 8080

# Comando para iniciar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
