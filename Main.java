//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /*Clientes ID001 = new Clientes();
       ID001.primeiroNome = "Pedro Henrique Alves dos Santos";
       ID001.Idade = 26;
       ID001.cpf = "123.456.789-00";*/

        //Declaramos Variáveis publicas;
       Car2 car2 = new Car2();
       car2.marca = "GM";
       car2.modelo= "Corsa frente Montana";
       car2.ano = 2005;
       car2.valorCarro = 125_000;
       car2.mesesFinanciamento = 60;

       car2.acrescimoPorcentagem();
       car2.financiamento();


       // declaramos novos valores a variaveis privadas.
       Car car = new Car("Voksvagem","Fox",2020, 125_000, 72);
        System.out.println("\n"+car.getMarca());
        System.out.println(car.getModelo());
        System.out.println(car.getano());
        System.out.println(car.getValorCarro());
        System.out.println(car.getMesesFinanciamento());

        //Aqui alteramos o valores da mensalidade e valor do veiculo no  car
        car.setValorCarro2(137_500);
        car.setMesesFinanciamento2(72);

        // aqui declarmos a construtor acrescimo e finaciamento.
        car.acrescimoPorcentagem2();
        car.financiamento2();
    }
}