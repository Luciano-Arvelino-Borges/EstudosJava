import java.util.Scanner;

public class CalculoParidade {
    public static void main(String[] args) {

        int numero;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        numero = leitor.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
            } else {
                System.out.println("O número é impar.");
            }
        }
    }

