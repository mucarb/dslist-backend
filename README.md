# Projeto DSList - Intensivão Java Spring
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/mucarb/dslist-backend/blob/main/LICENSE)

# Sobre o projeto

Durante a semana de treinamento gratuito da [DevSuperior](https://devsuperior.com "Site da DevSuperior"), denominado de **Intensivão Java Spring**.
O projeto criado é um API back-end na qual exerce end points que retorna um game ou até mesmo uma listagens de games pertencentes a determinada lista específica ordenados por posição, e pra cada games
pertencente a uma lista, há um end point para alterar suas posições.

## Modelo conceitual

![Modelo Conceitual](https://github.com/mucarb/assets/blob/main/sds-dslist/modelo_conceitual.png)

A classe Game tem ralacionamento de muitos para muitos com a classe GameList, assim formando uma classe associativa Belonging, fazendo o meio de campo para que uma instancia de GameList se associe com
mais de um objeto Game, cabendo ao Game também a se associar com mais de uma GameList.
# Tecnologias utilizadas

## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
## Execução de testes
- H2 Console
- Postman
## Implantação em produção
- Back end: Railway
- Container: Docker
    - Banco de dados: Postgresql

## Back end
Pré-requisitos: Java 17

```bash
# clonar repositório
git clone git@github.com:mucarb/dslist-backend.git

# entrar na pasta do projeto back end
cd dslist-backend

# executar o projeto
./mvnw spring-boot:run
```

# Autor

Murilo Ribeiro

[![My Skills](https://skillicons.dev/icons?i=linkedin)](https://www.linkedin.com/in/murilo-rb60)
[![My Skills](https://skillicons.dev/icons?i=github)](https://github.com/mucarb)
[![My Skills](https://skillicons.dev/icons?i=instagram)](https://www.instagram.com/murilo.r10)
