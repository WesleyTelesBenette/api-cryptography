# API de Criptografia
Uma API que criptografa mensagens apartir de uma chave de segurança.

## 🍃 Tecnologias utilizadas
Para criar está solução, foi utilizado as   seguintes tecnologias:
- Java (v.17.0.10)
- Maven (v.3.9.6)

O que deixa implícito que você necessariamente precisa ter essas tecnologias instaladas na sua máquina, caso sua intenção seja executar esse projeto no seu computador

<!--
## 🏬 Arquitetura
Para desenvolver o projeto, foi utilizado:
- Arquitetura RESTfull.
- 
Para a criação da API foi escolhido a [**arquitetura monolítica**](https://microservices.io/patterns/monolithic.html), devido ao sistema não possuir uma grande complexidade ou um alto volume de funcionalidades, o que torna preferível uma arquitetura mais simples e concisa.
-->

## ✉️ Comunicação com a API
### URL para Acessar a API
- Pendente...
<!--- "https://api-inventory-management.onrender.com".-->

### Cryptography
- POST: "/cryptography/encrypt" - Criptografa uma mensagem, com o body de [CryptographyRequestDto](https://github.com/WesleyTelesBenette/api-cryptography/blob/master/src/main/java/com/wesleytelesbenette/apicryptography/dtos/CryptographyRequestDto.java).
- POST: "/cryptography/decrypt" - Descriptografa uma mensagem, com o body de [CryptographyRequestDto](https://github.com/WesleyTelesBenette/api-cryptography/blob/master/src/main/java/com/wesleytelesbenette/apicryptography/dtos/CryptographyRequestDto.java).
