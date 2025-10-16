import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner imprimir1 =  new Scanner(System.in);
        System.out.print("Imprima o primeiro numero: ");
        int primeironumero = imprimir1.nextInt();

        Scanner imprimir2 =  new Scanner(System.in);
        System.out.print("Imprima o segundo numero: ");
        int Segundonumero = imprimir2.nextInt();

        Scanner imprimir3 =  new Scanner(System.in);
        System.out.print("Imprima o terceiro numero: ");
        int terceironumero = imprimir3.nextInt();

        System.out.println("Esse é o conjunto de números: " + primeironumero+ " " + Segundonumero+ " "  + terceironumero );
    }
}