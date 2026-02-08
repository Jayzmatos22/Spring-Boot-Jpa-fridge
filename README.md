# 🍎 FridgeSistem

API REST para gerenciamento de itens de geladeira, permitindo o controle de estoque e monitoramento de validades.

## 💻 Sobre o Projeto

Este projeto foi desenvolvido utilizando **Spring Boot** e **Spring Data JPA** para facilitar a persistência de dados em um banco de dados H2.

### 🛠️ Funcionalidades implementadas:
* **Listagem completa**: Retorna todos os alimentos salvos através do método `getAll()`.
* **Cadastro de itens**: Recebe um JSON via `@RequestBody` para salvar novos produtos.
* **Lógica de remoção**: Serviço preparado para deletar itens por ID.

---

## 🏗️ Estrutura de Camadas

O sistema está organizado da seguinte forma:
1. **Controller**: `FoodController` - Gerencia as requisições HTTP.
2. **Service**: `FoodService` - Contém as regras de negócio.
3. **Repository**: `FoodRepository` - Interface de comunicação com o banco.
4. **Model**: `Food` - Representação da entidade no banco de dados.


## 📂 Estrutura de Pastas

```text
fridgeSistem/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── fridge/fridgeSistem/
│   │   │       ├── controller/        # Endpoints da API (FoodController)
│   │   │       ├── model/             # Entidades do Banco (Food)
│   │   │       ├── repository/        # Interfaces JPA (FoodRepository)
│   │   │       ├── service/           # Lógica de Negócio (FoodService)
│   │   │       └── FridgeSistemApplication.java  # Classe Principal
│   │   └── resources/
│   │       └── application.yml        # Configurações do H2 e Spring
│   └── test/                          # Testes Unitários e Integrados
├── .gitignore                         # Arquivos ignorados pelo Git
├── pom.xml                            # Dependências do Maven
└── README.md                          # Documentação do Projeto
---
```

## 🚀 Como Testar

### 1. Requisitos
* Java 17 ou superior.
* Maven (incluído via wrapper `./mvnw`).

### 2. Endpoints (Postman/Insomnia)

| Tipo | Rota | Descrição |
| :--- | :--- | :--- |
| `GET` | `/food` | Lista todos os itens |
| `POST` | `/food` | Cria um novo item |

**Exemplo de Corpo JSON (POST):**
```json
{
  "name": "Pineapple",
  "expirationDate": "2025-09-17",
  "quantity": 32
}