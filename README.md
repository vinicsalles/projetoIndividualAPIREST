<h1 align="center">
    
Projeto Individual - API REST FULL


<img src="https://miro.medium.com/v2/resize:fit:600/1*ljHUhFnaBissdRBe7DIo6g.png">
</h1>
</div>
</br>
  <p> Bem-vindo(a) ao repositório do Projeto individual da  Disciplina "API REST FULL" na Residência de Software 2024.1 do SERRATEC.</p>


## :detective:Índice

<ul>
    <li>Sobre o Projeto</li>
    <li>Tecnologias utilizadas</li>
</ul>




## ROTAS PARA TESTES
http://localhost:8080/livros - Metodo get listar todos


http://localhost:8080/livros/1 - Metodo get listar por id (/1 é o id  de cada objeto do banco)


http://localhost:8080/livros/1 - Metodo post inserir dados (/1 é o id  de cada objeto do banco)


http://localhost:8080/livros/1 - Metodo put atualizar dados (/1 é o id  de cada objeto do banco)


http://localhost:8080/livros/1 - Metodo delete deletar dados (/1 é o id  de cada objeto do banco)




## :desktop_computer:Sobre o Projeto

Voces foram convidados para desenvolver um sistema de biblioteca e precisam criar uma entidade livro contendo as informações, id, titulo

O livro tambem deve ter informações da publicacao contendo autor, data da publicacao, e editora

(Livro, InformacaoPublicacao) (@Embedded, @Embeddable)

Deve-se criar:
entidade
interface do repositorio
o controller contendo um CRUD (GET, POST, PUT, DELETE) do recurso (Inserir as anotações necessárias para que esta classe funcione como um controlador.)
Inserir as validações para tratamento dos campos obrigatórios na classe Livro (titulo, autor)
Inserir a classe de ControllerExceptionHandler e ErroResposta para tratamento das exceções



 
Restrições:

(usar o banco H2)


Dependencias:


-spring-boot-starter-data-jpa


-spring-boot-starter-web


-spring-boot-devtools


-h2 (banco de dados)


-spring-boot-starter-validation



## :hammer_and_wrench: Tecnologias utilizadas

- [Spring Boot]([https://dbeaver.io/download/](https://spring.io/projects/spring-boot))





