import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        float numero1;
        float numero2;
        float soma;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Programa para cálculo de soma entre dois valores");
        System.out.print("Digite o primeiro valor: ");
        numero1 = leitor.nextFloat();
        System.out.print("Digite o segundo valor: ");
        numero2 = leitor.nextFloat();

        soma = numero1 + numero2;

        System.out.println("A soma entre " + numero1 + " e " + numero2 + " é " + soma + ".");
    }
}



