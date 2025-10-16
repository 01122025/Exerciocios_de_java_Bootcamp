public class Car2 {

    public String marca;
    public String modelo;
    public int ano;
    public int valorCarro;
    public int mesesFinanciamento;

    void financiamento (){
        int i = valorCarro / mesesFinanciamento;
        System.out.print("Valor do carro é: R$" + valorCarro +". E o financiamento é de " + mesesFinanciamento + " meses e o valor das parcelas seram R$" + i+"." );
    }
    void acrescimoPorcentagem(){
        double z = valorCarro * 1.1;
        System.out.println("O acrescimo de dez porcento no valor será: R$"+ z+" .");
    }



}
