# Betting Suggestions

**Betting Suggestions** é uma aplicação que oferece sugestões de apostas esportivas baseadas em dados e análises. O projeto foi desenvolvido utilizando a stack de tecnologias **Spring Boot** e **Kotlin**.

## Tecnologias Utilizadas

Este projeto utiliza as seguintes tecnologias:

- **Kotlin**: Linguagem moderna e concisa para desenvolvimento de aplicações JVM.
- **Spring Boot**: Framework para criar aplicativos Java baseados em Spring de maneira rápida e fácil.
- **Gradle**: Sistema de build para gerenciar dependências e construir a aplicação.
- **Spring Web**: Para construção de APIs RESTful.
- **Spring Data JPA**: Para integração com bancos de dados relacionais.
- **Spring Boot DevTools**: Para recarga automática durante o desenvolvimento.
- **Spring Boot Actuator**: Para monitoramento da aplicação.
- **Spring Security**: Para adicionar segurança à aplicação (futuro).

## Pré-requisitos

Antes de começar, você precisará ter instalado em sua máquina:

- **Java 17** (ou versão superior)
- **Kotlin**
- **Gradle** (ou o wrapper do Gradle)
- **IDE** (como IntelliJ IDEA ou Visual Studio Code)

## Como Rodar a Aplicação

### 1. Clonar o Repositório

Clone este repositório para sua máquina local:

```bash
git clone https://github.com/italosantiagoo22/betting-suggestions.git
cd betting-suggestions
```

### 2. Rodar a Aplicação Localmente

Você pode rodar a aplicação de duas formas:

#### Usando o Gradle Wrapper

Para rodar a aplicação com o Gradle Wrapper, utilize o seguinte comando:

```bash
./gradlew bootRun
```

#### Usando a IDE

1. Abra o projeto na sua IDE (por exemplo, **IntelliJ IDEA**).
2. Execute a classe `BettingSuggestionsApplication.kt`, que contém o método `main` para iniciar a aplicação.

Após a aplicação iniciar, você pode acessar a aplicação através de `http://localhost:8080`.
