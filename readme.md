# API de Gerenciamento de Reservas de Hotel 🏨

Esta é uma API REST desenvolvida com **Spring Boot** para o gerenciamento de estadias.

## 🚀 Tecnologias Utilizadas

* **Java 21**
* **Spring Boot 3.5.11**
* **Spring Data JPA** (Persistência)
* **H2 Database** (Banco em arquivo)
* **Bean Validation** (Regras de entrada)


## 📌 Principais Endpoints

### Reservas
* `POST /api/reservas`: Cria uma nova reserva. [cite_start]O status inicial é sempre `PENDENTE`.
* `GET /api/reservas`: Lista todas as reservas cadastradas.
* `GET /api/reservas/{id}`: Busca uma reserva específica e seus detalhes vinculados.
* `PATCH /api/reservas/{id}/checkin`: Realiza o check-in, alterando o status para `EM_HOSPEDAGEM`.
* `PATCH /api/reservas/{id}/checkout`: Realiza o check-out, alterando o status para `CONCLUIDA`.

### Detalhes da Estadia
* `POST /api/reservas/{id}/detalhes`: Vincula número do quarto, andar e amenidades a uma reserva existente.


## ⚙️ Como Executar

1.  Clone o repositório.
2.  Execute a aplicação utilizando o Maven Wrapper:
    ```bash
    ./mvnw spring-boot:run
    ```
3.  Acesse o Console do H2 para validar as tabelas:
    * **URL**: `http://localhost:8080/h2-console`

---
**Desenvolvido por:** Gabriella e Luiz.
