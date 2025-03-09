
# Store Simple API 

API RESTful simples em Java usando Spring Boot com Spring Data JPA para o Decola Tech 2025. 

## Descrição 

Este projeto é uma API RESTful simples desenvolvida em Java utili
ando o framework Spring Boot e Spring Data JPA. O objetivo é fornecer uma base para a criação de APIs robustas e escaláveis, facilitando o desenvolvimento de aplicações web. 

## Funcionalidades 

- CRUD de produtos 
- CRUD de categorias 
- Integração com banco de dados relacional 
- Documentação da API com OpenAPI (Swagger) 

## Tecnologias Utilizadas 

- Java 17 
- Spring Boot 3.4.3 
- Spring Data JPA 
- H2 Database (para desenvolvimento e testes) 
- OpenAPI (Swagger) para documentação 

## Pré-requisitos 

- JDK 17 ou superior 
- Maven 3.6.3 ou superior 

## Como Executar 

1. Clone o repositório: 

```sh
git clone https://github.com/victorhpmelo/store-simple-api.git 
```

2. Navegue até o diretório do projeto: 

```sh 
cd store-simple-api 
```

3. Execute o projeto usando Maven: 

```sh 
mvn spring-boot:run 
```

4. Acesse a documentação da API no navegador: 

```sh
http://localhost:8080/swagger-ui.html 
```

## Endpoints 

### Produtos 

- GET /api/products - Lista todos os produtos 
- GET /api/products/{id} - Obtém um produto pelo ID 
- POST /api/products - Cria um novo produto 
- PUT /api/products/{id} - Atuali
a um produto existente 
- DELETE /api/products/{id} - Remove um produto 

## Contribuição 

1. Faça um fork do projeto 
2. Crie uma branch para sua feature (git checkout -b feature/nova-feature) 
3. Commit suas mudanças (git commit -m 'Adiciona nova feature') 
4. Faça o push para a branch (git push origin feature/nova-feature) 
5. Abra um Pull Request 
