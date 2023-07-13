<h1 align="left">Messages API </h1>

###

<p align="left">Esta é uma API (Application Programming Interface) para posts de mensagens no estilo de tweets</p>

###

### Funcionalidades

- Cadastro
- Postar tweets
- Listar todos os tweets
- Retornar tweets de um usuário específico  

</br>

### Documentação da API

##### INSCRIÇÃO:

```http
  POST /sign-up
```

- Body:

| Parâmetro  | Tipo     | Descrição                        |
| :--------- | :------- | :--------------------------------|
| `username` | `string` | `Username do usuário`            |
| `avatar`   | `string` | `Endereço do avatar escolhido`   |

--

##### POSTAR TWEET:

```http
  POST /tweets
```

- Body:

| Parâmetro  | Tipo     | Descrição                             |
| :--------- | :------- | :-------------------------------------|
| `username` | `string` | `Username do usuário`                 |
| `tweet`    | `string` | `Tweet que o usuário deseja publicar` |

--

##### RETORNAR OS DEZ ÚLTIMOS TWEETS PUBLICADOS:

```http
  GET /tweets
```

--

##### RETORNAR OS TWEETS DE UM USUÁRIO:

```http
  GET /tweets/:username
```

</br>

### Pré-requisitos
#### Antes de começar, verifique se você tem os seguintes pré-requisitos instalados em sua máquina:
- Java Development Kit (JDK) - versão 17 ou superior
- Apache Maven - versão 3.x ou superior
- Ambiente de Desenvolvimento Integrado (IDE): Embora não seja estritamente necessário, é altamente recomendável usar uma IDE para desenvolver projetos Java. Para esse projeto utilizei o IntelliJ IDEA.

</br>
</br>

### Rodando a aplicação

1. Clone este repositório em uma pasta de sua preferência:

```bash
$ git clone https://github.com/brunnaserafina/messages-api.git
```

2. Navegue até o diretório raíz do projeto clonado:

```bash
$ cd messages-api
```

3. Compile o projeto utilizando o comando Maven:

```bash
$ mvn compile
```

4. Utilize o comando Maven para executar o aplicativo Spring Boot 

```bash
$ mvn spring-boot:run
```

5. O projeto estará rodando na porta http://localhost:8080

</br>
</br>

### Tecnologias utilizadas
[![Java](https://img.shields.io/badge/Java-17.0.6-blue.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.5.3-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Lombok](https://img.shields.io/badge/Lombok-1.18.20-orange.svg)](https://projectlombok.org/)
[![H2 Database](https://img.shields.io/badge/H2%20Database-1.4.200-blue.svg)](https://www.h2database.com/html/main.html)
[![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-2.5.3-blue.svg)](https://spring.io/projects/spring-data-jpa)

</br>
</br>

### Autora

- [@brunnaserafina](https://www.github.com/brunnaserafina)
