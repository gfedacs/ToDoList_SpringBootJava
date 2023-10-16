Text in English :

1 - Prerequisites:

Make sure you have Java installed on your system.
You will need a program that can send HTTP requests, like API Dog. (https://apidog.com/)

2 - Clone the Repository:

git clone https://github.com/gfedacs/ToDoList_SpringBootJava
cd your-repository

3 - Run the Program:

Open your terminal.
Navigate to the project root directory.
Run the program's main class.

- The To Do List server will be active and ready to receive requests.

How to use

After successful installation, you can start interacting with To Do List. Here are some basic instructions:

Authentication: To use the API, you must authenticate. You must provide valid credentials to access system functionalities.

Send Requests: Use a program that sends HTTP requests (such as API Dog) to interact with the API routes. You can create, update and list tasks.

Inside Api Dog, select new request and then type the URL http://localhost:8080/users/ to connect to the application, right after running main via terminal or any IDE of your choice.
Then select POST, and click on body and JSON. Then provide the necessary information:

{ "name" : "gabriel",
"username" : "gab",
"password" : "123"}

If successful, simply create a task. Now enter the URL http://localhost:8080/tasks/ , then click on the POST, body and JSON option, passing:

{
  "title": "Learn spring boot",
  "description": "Controller and Repository",
  "startAt": "2023-08-08T15:30:00",
  "endAt": "2023-09-09T15:30:00",
  "priority" : "HIGH"
}

If you have been authenticated, you will be able to create this task and perform future updates.

Bonuses ->

If you want to deploy this application to test on another machine, for example, simply access the website https://render.com and create/access a registration. When logged in,
just choose this project, and it will go up. Then a URL will be generated, which you will pass into the Dog API, and make the necessary requests.


Summary :

This is a program for a back-end web application developed in Java, using the Spring Boot framework. The program plays a key role in user login authentication and task management. Furthermore, it offers functionalities for creating and updating tasks, making it a complete solution for managing tasks in web environments.
 
 
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
 Texto em Português :

1 - Pré-requisitos:

Certifique-se de ter o Java instalado em seu sistema.
Você precisará de um programa que possa enviar requisições HTTP, como o API Dog. (https://apidog.com/)

2 - Clone o Repositório:

git clone https://github.com/gfedacs/ToDoList_SpringBootJava
cd seu-repositorio

3 - Execute o Programa:

Abra o seu terminal.
Navegue até o diretório raiz do projeto.
Execute a classe principal (main) do programa.

- O servidor do To Do List estará ativo e pronto para receber requisições.

Como usar 

Após a instalação bem-sucedida, você pode começar a interagir com o To Do List. Aqui estão algumas instruções básicas:

Autenticação: Para usar a API, é necessário autenticar-se. Você deve fornecer credenciais válidas para acessar as funcionalidades do sistema.

Enviar Requisições: Utilize um programa que envie requisições HTTP (como o API Dog) para interagir com as rotas da API. Você pode criar, atualizar e listar tarefas.

Dentro do Api Dog, selecione o new request e depois digite a URL http://localhost:8080/users/ para se conectar a aplicação, logo após de rodar o main via terminal ou alguma IDE a sua escolha.
Em seguida selecione o POST, e clique no body e em JSON. Aí passe as informações necessárias:

{ "name" : "gabriel",
"username" : "gab",
"password" : "123"}

Se for bem sucedido, basta criar uma tarefa. Agora digite a URL http://localhost:8080/tasks/ , depois clique na opção POST, body e JSON, passando:

{
  "title": "Aprender spring boot",
  "description": "Controller and Repository",
  "startAt": "2023-08-08T15:30:00",
  "endAt": "2023-09-09T15:30:00",
  "priority" : "ALTA"
}

Se você foi autenticado, poderá criar essa tarefa, e realizar updates futuros.

Bônus ->

Se quiser realizar o deploy dessa aplicação para testar em outra máquina por exemplo, basta acessar o site https://render.com e criar/acessar um cadastro. Quando estiver logado,
basta escolher esse projeto, que ele irá subir. Aí vai ser gerado um uma URL, que você passará no API Dog, e fazer as requisições necessárias.


Resumo :

Este é um programa para uma aplicação back-end web desenvolvido em Java, utilizando o framework Spring Boot. O programa desempenha um papel fundamental na autenticação de login de usuários e na gestão de tarefas. Além disso, oferece funcionalidades para a criação e atualização de tarefas, tornando-o uma solução completa para o gerenciamento de tarefas em ambientes web.

