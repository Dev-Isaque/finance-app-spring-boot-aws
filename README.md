Finance App
===========

Descrição do Projeto
--------------------

O **Finance App** é uma aplicação web desenvolvida em **Java Spring Boot** para gestão e controle de finanças pessoais. O objetivo é oferecer uma plataforma intuitiva para gerenciamento de receitas, despesas, relatórios financeiros e análises, permitindo que os usuários tomem decisões financeiras mais informadas.

Tecnologias Utilizadas
----------------------

*   **Back-end**: Java, Spring Boot, Spring Security, JPA/Hibernate
    
*   **Banco de Dados**: MySQL (Amazon RDS)
    
*   **Front-end**: HTML, CSS, Bootstrap, jQuery, Thymeleaf
    
*   **Infraestrutura**: AWS RDS para MySQL
    

Funcionalidades
---------------

*   **Autenticação e Autorizção** (Login e Cadastro de usuários)
    
*   **Gerenciamento de Transações** (Receitas e Despesas)
    
*   **Categorias Financeiras** (Organização de gastos e ganhos)
    
*   **Geração de Relatórios** (Gráficos e tabelas)
    
*   **Dashboard Interativo**
    
*   **Configurações Personalizadas**
    

Estrutura do Projeto
--------------------

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   finance-app/  ├── src/  │   ├── main/  │   │   ├── java/  │   │   │   ├── com/  │   │   │   │   ├── isaquesoares/  │   │   │   │   │   ├── controller/        # Controladores  │   │   │   │   │   ├── model/             # Modelos de dados (Entidades)  │   │   │   │   │   ├── repository/        # Repositórios para banco de dados  │   │   │   │   │   ├── service/           # Regras de negócio  │   │   │   │   │   ├── dto/               # Transferência de dados  │   │   │   ├── application/               # Configurações do Spring Boot  │   │   ├── resources/  │   │   │   ├── static/                    # CSS, JS, imagens  │   │   │   ├── templates/                 # Páginas Thymeleaf  │   │   │   └── application.properties     # Configuração do banco de dados  ├── pom.xml                                 # Dependências Maven  ├── README.md                               # Documentação do projeto   `

Configuração do Banco de Dados (AWS RDS)
----------------------------------------

1.  Criar uma instância MySQL no **Amazon RDS**
    
2.  spring.datasource.url=jdbc:mysql://seu-endereco-rds.amazonaws.com:3306/finance\_dbspring.datasource.username=seu\_usuariospring.datasource.password=sua\_senhaspring.datasource.driver-class-name=com.mysql.cj.jdbc.Driverspring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
    
3.  Criar as tabelas usando Hibernate (ou executar um script SQL manualmente)
    

Como Rodar o Projeto
--------------------

1.  Clonar o repositório
    
2.  Configurar o banco de dados no **application.properties**
    
3.  mvn spring-boot:run
    

Melhorias Futuras
-----------------

*   Implementação de API REST para integração com aplicativos externos
    
*   Suporte para múltiplas moedas
    
*   Exportação de relatórios em PDF/Excel
    
*   Integração com serviços de pagamento
    

Autor
-----

Desenvolvido por **Isaque Soares**
