# API REST com Spring Boot e Swagger

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.x-green)
![Maven](https://img.shields.io/badge/Maven-Build-red)

## Sobre o Projeto

Este projeto consiste no desenvolvimento de uma **API REST utilizando Spring Boot**, com **documentação automática utilizando Swagger/OpenAPI**.

A aplicação foi desenvolvida para demonstrar boas práticas no desenvolvimento de APIs REST com **Java**, incluindo:

- Arquitetura em camadas
- Tratamento global de exceções
- Documentação de endpoints
- Organização de código seguindo padrões utilizados no mercado

O projeto foi desenvolvido como prática durante estudos de **Java e Spring Boot no bootcamp da DIO (Digital Innovation One)**.

---

# Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Swagger / OpenAPI**
- **Maven**
- **JUnit**

---

# Arquitetura do Projeto

A aplicação segue uma arquitetura organizada em camadas:

- **Controller** → Responsável pelos endpoints da API
- **Repository** → Responsável pela manipulação de dados
- **Model** → Representação das entidades
- **Handler** → Tratamento global de exceções
- **Doc** → Configuração da documentação Swagger

---

# Estrutura do Projeto

```
src/
├── main/
│   ├── java/
│   │   └── dio/
│   │       └── my_rest_api/
│   │           ├── controller/
│   │           │   ├── WelcomeController.java
│   │           │   └── UsuarioController.java
│   │           │
│   │           ├── model/
│   │           │   └── Usuario.java
│   │           │
│   │           ├── repository/
│   │           │   └── UsuarioRepository.java
│   │           │
│   │           ├── handler/
│   │           │   ├── BusinessException.java
│   │           │   ├── CampoObrigatorioException.java
│   │           │   ├── ResponseError.java
│   │           │   └── GlobalExceptionHandler.java
│   │           │
│   │           ├── doc/
│   │           │   └── SwaggerConfig.java
│   │           │
│   │           └── MyRestApiApplication.java
│   │
│   └── resources/
│       └── application.properties
│
└── test/
    └── java/
        └── dio/
            └── my_rest_api/
                └── MyRestApiApplicationTests.java
```

---

# Documentação da API

A API possui documentação automática gerada pelo **Swagger**.

Após iniciar o projeto, acesse:

```
http://localhost:8080/swagger-ui.html
```

ou

```
http://localhost:8080/swagger-ui/index.html
```


# Tratamento de Erros

A API possui um **tratamento global de exceções**, retornando respostas padronizadas.

Exemplos de exceções tratadas:

- `BusinessException`
- `CampoObrigatorioException`
