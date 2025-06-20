# Email Microservice - Uber Backend Challenge (Java Spring + AWS SES)

Este projeto é uma API desenvolvida em **Java** com **Spring Boot** que utiliza o **AWS Simple Email Service (SES)** para envio de e-mails.  
O microserviço foi criado para meu canal no YouTube, demonstrando uma solução para o desafio backend do Uber.

---

## Índice

- [Instalação](#instalação)  
- [Configuração](#configuração)  
- [Uso](#uso)  
- [Endpoints da API](#endpoints-da-api)  
- [Banco de Dados](#banco-de-dados)  
- [Contribuições](#contribuições)  

---

## Instalação

1. Clone o repositório:

```bash
git clone https://github.com/Fernanda-Kipper/desafio-backend-uber.git
Instale as dependências com Maven:

bash
Copiar
Editar
mvn clean install
Configuração
No arquivo src/main/resources/application.properties, configure suas credenciais AWS SES:

properties
Copiar
Editar
aws.region=us-east-1
aws.accessKeyId=SEU_ACCESS_KEY_ID
aws.secretKey=SEU_SECRET_ACCESS_KEY
⚠️ Importante: Nunca commit essas chaves no repositório público. Use variáveis de ambiente em produção.

Uso
Execute a aplicação com Maven:

bash
Copiar
Editar
mvn spring-boot:run
A API estará disponível em: http://localhost:8080

Endpoints da API
GET /
Endpoint para verificar se a API está rodando (opcional).

POST /api/email/send
Envia um e-mail do remetente configurado para o destinatário.

Exemplo de corpo da requisição (JSON):
json
Copiar
Editar
{
  "to": "ff.s4ntoss@gmail.com",
  "subject": "Teste",
  "body": "Conteúdo do e-mail de teste"
}
