public class Clientes {
    // Aqui é o metodo de atributos do cliente de uma forma publica.
    String primeiroNome;
    int Idade;
    String cpf;
    int balance;

    // Esse construtor iniciará na excução do código.
    Clientes (){
        balance = 10;
    }

    // Esse é um metodo que não tem retorno apenas mostrará da declaração de nova conta.
    void novaConta (){
        System.out.println("Olá " + "'" + this.primeiroNome + "' " + " a sua conta foi criada com Sucesso !!!");
        System.out.println("Olá você receberá um valor de bonificação de R$ " + balance);
    }

}
