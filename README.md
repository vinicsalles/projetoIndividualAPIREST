<h1 align="center">
    
Projeto Individual - API REST FULL


<img src="https://github.com/Amandac-b/G6BancoDeDados/blob/main/imagemcapa.jfif">
</h1>
</div>
</br>
  <p> Bem-vindo(a) ao repositório do Projeto em Grupo de Conclusão da Disciplina "Banco de Dados" na Residência de Software 2024.1 do SERRATEC. Este projeto consiste na criação de um Banco de Dados para um marketplace onde um usuário pode tanto comprar como vender produtos.</p>


## :detective:Índice

<ul>
    <li>Sobre o Projeto</li>
    <li>Tecnologias utilizadas</li>
    <li>Diagrama</li>
    <li>Autores do Projeto</li>
</ul>

## :desktop_computer:Sobre o Projeto



Contexto - E-commerce Marketplace
O Banco de Dados, composto por modelos conceitual, lógico e físico, vai armazenar dados e regras de negócios relevantes para o funcionamento de uma ferramenta virtual de compra e venda de mercadorias na qual o usuário pode efetuar tanto compras quanto vendas de produtos.

Regras do negócio:

Funcionalidades:

- O banco deve armazenar as informações de acesso de cada usuário, como nome de usuário e senha.
- O banco deve armazenar as informações de contato de cada usuário, como telefone, endereço e e-mail.
- O banco deve armazenar as informações de cadastro de cada produto, como nome, valor, categoria, descrição e data de fabricação.
- O banco deve organizar os produtos por categorias.
- O banco deve ser capaz de armazenar pedidos com produtos de diferentes categorias.
- O usuário pode vender e/ou comprar 1 ou mais produtos.
- O banco deve permitir que o próprio usuário, ao inserir um produto no sistema, possa associá-lo a uma categoria.
- À cada categoria de produto devem ser associados os seguintes valores: código, nome e descrição
- O banco deve armazenar as informações de identificação de cada usuário, como número de identificação (id), nome, CPF e data de nascimento.

Permissões: 

- O usuário deve ter acesso à categoria de cada produto.
- O usuário deve poder consultar o conteúdo e a data de realização de seus pedidos.
- Em caso de compra, o usuário deve poder consultar de quem está comprando o(s) produto(s).
- Em caso de venda, o usuário deve poder consultar a quem está vendendo seu(s) produto(s).
- Um pedido pode ter mais de um item de um mesmo produto, de acordo com
- a quantidade disponível em estoque, mas apenas se esse item for comprado do mesmo vendedor.
 
Restrições:

- Cada produto pode pertencer a apenas 1 categoria.
- O usuário não deve ter acesso ao conteúdo dos pedidos de outros usuários.
- Não podem ser realizados pedidos que não possuam ao menos 1 produto.
- O banco não deve permitir registros duplicados de um mesmo produto, deve apenas permitir a atualização da quantidade dele em estoque.

## :hammer_and_wrench: Tecnologias utilizadas

- [DBeaver](https://dbeaver.io/download/)
- [PostgreSQL](https://www.postgresql.org)
- [Draw.io](https://app.diagrams.net/)
- [GitHub](https://github.com/)

## :chart_with_upwards_trend: Diagramas

<div align="center">

  ## Modelo Conceitual
   <img src="grupo_modelo_conceitual.png">
  
  ## Modelo Lógico
   <img src="https://github.com/Amandac-b/G6BancoDeDados/blob/main/modelologicogrupo.png">

</div>
<br/>
<br/>
<br/>
Autores:<br/>
<a href="https://github.com/Amandac-b">Amanda Bernardes</a><br>
<a href="https://github.com/rafaelacostamg">Rafaela Costa</a><br>
<a href="https://github.com/vinicsalles">Vinicius Sales</a><br>
<a href="https://github.com/filipelomba">Filipe Lomba</a><br>
<a href="https://github.com/vintinls">Victor Hugo Lisboa</a><br>
