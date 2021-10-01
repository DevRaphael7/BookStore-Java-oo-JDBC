# Sistema de cadastro de livros com JAVA e JDBC

Neste repositório treino para criar um código que me permita me conectar ao banco de dados `MySQL` usando a classe JDBC do Java.

Na O.O do código existem cinco classes:

1) Livro (Classe *abstrata*).
2) LivroImpresso (Subclasse da super classe Livro).
3) Ebook (Subclasse da super classe Livro).
4) Autor (Classe do autor com seus próprios atributos como nome, email, cpf, etc).
5) ConexaoBD (Classe que realiza operações como SELECT, INSERT e UPDATE)

## Como conectar com o banco de dados?

``` java
    // App.java
    ConexaoDB conection = new ConexaoDB(url, user, password);

    //ConexaoBD
    conn = DriverManager.getConnection(url, user, password);
```
São necessário ao menos três argumentos para poder acessar o banco de dados: o primeiro é o `url` que deve conter a porta(exemplo: 3306 que é porta padrão do *oracle*) e o nome do <i>Database</i> que vai acessar, `usuário` e `senha`, caso o usuário não tenha senha pode deixar esse espaço em branco.
Feito isso você já está com o código de conexão ao banco de dados pronto.

Para executar instruções na base de dados é necessário o seguinte código:

``` java
    statement = conn.createStatement();
```

*Statement* prepara as instruções SQL para serem compiladas.

Após isso você poderá compilar códigos como `SELECT`, `UPDATE`, `INSERT`, etc...

- `statement.executeQuery(sql)` usado para fazer consulta.

- `statement.executeUpdate(sql)` usado para realizar atualizações em um registro de minha base de dados.

> Link da documentação JDBC 👉 [JDBC Concepts](https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-usagenotes-basic.html).





