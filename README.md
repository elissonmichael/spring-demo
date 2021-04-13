# Spring Demo

### My Spring Boot CRUD REST API Scaffold

The objective of this repository is to register a commit history for a CRUD Scaffold.

**Requirements**:

- Java 16
- Spring Boot 2.3.9
- Maven 3.8.1
- PostgreSQL 12.6

**Using the API**:

```bash
  cd spring-demo/
  mvn clean install
  mvn spring-boot:run
```

Open Insomnia, Postman or Similar and test the following routes on the endpoint `localhost:8080`:

| Route         | Method | Params (JSON)
| --------------| -------| ------------- |
| /notices      | GET    |                                   |
| /notices      | POST   | { "title": "Sample Notice Title", "description": "Sample Notice Description" } |

![Insomnia Example](/insomnia.png)

Check the [commits history](https://poseidon.les.inf.puc-rio.br/elisson/spring-crud/commits/master) for more detailed information.
