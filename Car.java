public class Car {
    private String marca;
    private String modelo;
    private int ano;
    private int valorCarro2;
    private int mesesFinanciamento2;


// Aqui é o construtor que converteu as informações das variaveis em privado
    Car (String marca, String modelo, int Ano, int valorCarro2, int mesesFinanciamento2) {
// quando usamos o this. ele me direciona a variável
        this.marca = marca;
        this.modelo = modelo;
        this.ano = Ano;
        this.valorCarro2 = 125_000;
        this.mesesFinanciamento2= 60;
    }
    // Aqui usaremos os Getters para retonar o valor que está encapsulado.
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
            return modelo;
    }
    public int getano() {
        return ano;
    }
    public int getValorCarro() {
        return valorCarro2;
    }

    public int getMesesFinanciamento() {
        return mesesFinanciamento2;
    }


    void financiamento2 (){
        int i = valorCarro2 / mesesFinanciamento2;
        System.out.print("Valor do carro é: R$" + valorCarro2 +". E o financiamento é de " + mesesFinanciamento2 + " meses e o valor das parcelas seram R$" + i+"." );
    }
    void acrescimoPorcentagem2(){
        double z = valorCarro2 * 1.1;
        System.out.println("O acrescimo de dez porcento no valor será: R$"+ z+" .");
    }




    /* Aqui usamos os Setters para captar aquilo que foi deixado no privado e trocar a informação ou dado. */
    public  void setMarca(String marca) {
        this.marca = marca;
    }

    public  void setValorCarro2(int valorCarro2) {
        this.valorCarro2 = valorCarro2;
    }

    public  void setMesesFinanciamento2(int mesesFinanciamento2) {
        this.mesesFinanciamento2 = mesesFinanciamento2;
    }

    }
