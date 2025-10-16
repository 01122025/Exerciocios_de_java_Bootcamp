import java.util.Scanner;

// sistema de verificador de números impares.
public class Main {
    public static void main(String[] args) {

        Scanner inputDeEntrada = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int resultado =  inputDeEntrada.nextInt();

        if (resultado % 2 == 1 && resultado >2 && resultado < 5 ) {
                System.out.println("Esse Valor é impar de categoria A está entre 2 e 5");
        }
        else if (resultado < 6 && resultado < 20 ) {
                System.out.println("Esse valor é impar de categoria B e está entre 6 e 20");
            }
        else if ( resultado > 20){
                System.out.println("Esse valor é impar de categoria C e está acima de 20");
            }
        else {
                System.out.printf( resultado + " é par");
        }

        }

    }
