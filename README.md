# API REST - Gerenciamento de Produtos

API REST desenvolvida com **Java 17 e Spring Boot**, com o objetivo de implementar operações CRUD (Create, Read, Update e Delete) para gerenciamento de produtos.

## Tecnologias utilizadas

- Java 17
- Spring Boot 4.1.2
- Spring WebMVC
- Maven
- Lombok
- Springdoc OpenAPI (Swagger)

## Estrutura do projeto

```text
src/
└── main/
    ├── java/
    │   └── com/marcusantosproject/api_rest/
    │       ├── controller/
    │       │   └── ProdutoController.java
    │       ├── database/
    │       │   └── model/
    │       │       └── ProdutoEntity.java
    │       ├── dto/
    │       │   └── ProdutoDto.java
    │       ├── exceptions/
    │       │   ├── NotFoundException.java
    │       │   └── ErrorResponse.java
    │       ├── handler/
    │       │   └── GlobalExceptionHandler.java
    │       └── service/
    │           └── ProdutoService.java
    └── resources/
        └── application.properties
```

## Endpoints

Todos os endpoints utilizam o prefixo `/v1/produtos`.

| Método HTTP | Endpoint | Descrição |
|---|---|---|
| GET | `/v1/produtos` | Lista todos os produtos |
| POST | `/v1/produtos` | Cadastra um novo produto |
| PUT | `/v1/produtos/{id}` | Atualiza um produto |
| DELETE | `/v1/produtos/{id}` | Remove um produto |

## Exemplos de requisições

### Listar produtos

```http
GET /v1/produtos
```

Retorna a lista de produtos cadastrados.

### Cadastrar produto

```http
POST /v1/produtos
Content-Type: application/json
```

Exemplo de corpo da requisição (ajuste os campos conforme o `ProdutoDto`):

```json
{
  "nome": "Notebook",
  "preco": 5000.00,
  "quantidade": 10
}
```

### Atualizar produto

```http
PUT /v1/produtos/1
Content-Type: application/json
```

Recebe o identificador do produto pela URL e os dados atualizados no corpo da requisição.

### Excluir produto

```http
DELETE /v1/produtos/1
```

Retorna o status HTTP `204 No Content` quando a operação é concluída.

## Documentação da API

O projeto utiliza Springdoc OpenAPI para disponibilizar a documentação interativa da API por meio do Swagger UI.

Com a aplicação em execução, acesse:

```text
http://localhost:8080/swagger-ui/index.html
```

## Executando o projeto

Clone o repositório:

```bash
git clone URL_DO_REPOSITORIO
```

Entre no diretório:

```bash
cd api_rest
```

Execute a aplicação com Maven:

```bash
mvn spring-boot:run
```

A API estará disponível em:

```text
http://localhost:8080
```

---

Desenvolvido para praticar conceitos de desenvolvimento Back-End com Java e Spring Boot.
