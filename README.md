### Renata Hassum - [Linkedin](https://www.linkedin.com/in/renataviottohassumdev) | renatahassum@gmail.com

# Sobre o projeto DSCatalog [![NPM](https://img.shields.io/npm/l/react)](https://github.com/RenataHassum/dscatalog_backend/blob/main/LICENSE)

O DS Catalog é um projeto de E-Commerce desenvolvido como trabalho de conclusão de curso pela instituição de ensino <a href="https://devsuperior.com.br/cursos"><img align="center" height="16" alt="DevSuperior" src="https://devsuperior.com.br/_next/static/images/logo-white-10059e26f600604a7b5bd7782ed7550c.svg"></a> - Bootcamp Spring.

O projeto oferece um conjunto abrangente de recursos para gerenciar um catálogo online, juntamente com uma área administrativa. Foi construído com foco nas melhores práticas, incluindo testes automatizados unitários e de integração, garantindo a qualidade e a robustez do sistema.

Além disso, o DS Catalog possui funcionalidades de autenticação, autorização e CRUD completo para buscar, inserir, atualizar e excluir recursos. Também é possível controlar o acesso com base no tipo de perfil do usuário cadastrado e consultas customizadas de produtos.

# Teste as requisições no Postman Collection
#### Siga o passo a passo:
1) Faça o clone do projeto
```bash
# Pré-requisitos: Java 17
# clonar repositório
git clone git@github.com:RenataHassum/dscatalog_backend.git

# entrar na pasta do projeto back end
cd dscatalog_backend
cd backend

# executar o projeto
./mvnw spring-boot:run
```
2) Clique no botão "Run in Postman"
3) Acesse a opção "View collection"
4) Teste as requisições conforme orientações abaixo
   
      [![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/22138191-38e89ef4-e2b8-4590-8b07-15587c945047?action=collection%2Ffork&source=rip_markdown&collection-url=entityId%3D22138191-38e89ef4-e2b8-4590-8b07-15587c945047%26entityType%3Dcollection%26workspaceId%3D848c5366-5e58-43d6-8f78-6e9d5bcd5d4e)

## Login endpoints
#### Escolha o ambiente do projeto: "dsCatalog" (lembre-se de substituir os emails para login)

`POST` Permite efetuar o login de um usuário. Utilize as seguintes credenciais para teste:
- maria@gmail.com
  - Funções: "ROLE_ADMIN"
  - Acesso: Liberado

- alex@gmail.com
  - Funções: "ROLE_OPERATOR"
  - Acesso: Restrito

## Product / Category endpoints
`GET Page / by ID`
- Liberado para todos os usuários, incluindo aqueles que não estão autenticados
- Permite obter informações sobre produtos/categorias

`POST Create / PUT Update / DELETE Delete`
- Restrito a usuários com função "ROLE_OPERATOR"
- Liberado para usuários com função "ROLE_ADMIN"
- Permitem criar, atualizar e excluir produtos/categorias

## User endpoints
`GET by ID / PUT Update / DELETE Delete`
- Liberado para o próprio usuário (usando seu próprio ID) com função "ROLE_OPERATOR" e para "ROLE_ADMIN" com acesso adicional
- Retorna informações de um usuário específico
- Permite atualizar informações de um usuário
- Permite excluir um usuário

`GET Page users`
- Restrito a usuários com função "ROLE_OPERATOR"
- Liberado para usuários com função "ROLE_ADMIN"
- Recupera uma lista paginada de usuários

`POST Create User`
- Liberado para todos os usuários, incluindo não autenticados
- Permite criar um novo usuário


# Tecnologias | Implantação em produção
- Java, Spring Boot, Spring Cloud, Spring Security, Validation, OAuth2, JWT, API REST, JPA, Hibernate, Maven, H2 Database, PostgreSQL, ORM, Git, JUnit5, Mockito e MockBean
- Implantação Backend: Até o presente momento, o projeto não conta com a implementação no backend em uma plataforma de hospedagem
- Implantação banco de dados: Postgresql

# Técnicas | Competências
- Programação Orientada a Objetos (POO) e Seed de Banco de Dados: Permite o desenvolvimento eficiente de um sistema orientado a objetos e a criação de um modelo conceitual representando entidades e relacionamentos.
- Arquitetura em Camadas: Utiliza uma estrutura organizada em camadas, proporcionando separação clara de responsabilidades e facilitando a manutenibilidade do sistema.
- Web Services RESTful: Implementa web services RESTful, seguindo o padrão DTO para transferência de dados.
- Operações CRUD completas: Realiza as operações completas de Criar, Ler, Atualizar, Excluir e Procurar.
- Tratamento de Exceções: Implementa mecanismos de tratamento de exceções, garantindo mensagens de erro claras para os usuários.
- Paginação de Dados: Implementa técnicas de paginação para otimizar o desempenho e viabilizar a navegação eficiente em conjuntos de dados extensos.
- Auditoria: Registra dados relevantes para oferecer recursos de auditoria das operações realizadas nos recursos, utilizando anotações como @PrePersist | @PreUpdate.
- Validação de Dados: Realiza validação de dados utilizando o Bean Validation para garantir conformidade com os requisitos especificados.
- Autenticação e Autorização: Implementa OAuth2 e JWT para autenticação e autorização segura dos usuários.
- Password Token: Implementa o uso de tokens para garantir a segurança na redefinição de senhas e manter a autenticação contínua dos usuários.
- Autorizações Personalizadas: Realiza pré-autorização de métodos sensíveis, restringindo o acesso apenas a usuários autorizados.
- Consultas ao Banco de Dados com JPQL: Realiza consultas ao banco de dados utilizando a linguagem de consulta JPQL.
- Testes Automatizados: Compreende testes unitários e de integração que abrangem as camadas de serviço e controlador. Utiliza JUnit para testar repositórios, serviços e recursos, além de simular dependências com Mockito e MockBean, garantindo verificações precisas dos resultados.

## Figma
https://www.figma.com/file/1n0aifcfatWv9ozp16XCrq/DSCatalog-Bootcamp

## Modelo conceitual
![Modelo Conceitual](https://github.com/RenataHassum/assets/blob/main/dscatalog_assets/modelo_conceitual.jpg?raw=true)

## Padrão camadas
![Padrão camadas](https://github.com/RenataHassum/assets/blob/main/padrao_camadas.jpg?raw=true)

# Agradecimentos
<a href="https://devsuperior.com.br/cursos"><img align="center" height="16" alt="DevSuperior" src="https://devsuperior.com.br/_next/static/images/logo-white-10059e26f600604a7b5bd7782ed7550c.svg"></a> - Professor Nélio Alves

# Autora
### Renata Hassum - [Linkedin](https://www.linkedin.com/in/renataviottohassumdev) | renatahassum@gmail.com
Fico à disposição para qualquer esclarecimento, não hesite em me contatar
