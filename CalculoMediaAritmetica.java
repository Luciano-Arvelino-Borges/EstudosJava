import java.util.Scanner;

public class CalculoMediaAritmetica {
    public static void main(String[] args) {
        float n1, n2, n3, n4, media;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Cálculo para média escolar");
        System.out.print("Digite a pimeira nota: ");
        n1 = leitor.nextFloat();
        System.out.print("Digite e segunda nota: ");
        n2 = leitor.nextFloat();
        System.out.print("Digite a terceira nota: ");
        n3 = leitor.nextFloat();
        System.out.print("Digite a quarta nota: ");
        n4 = leitor.nextFloat();

        media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("A média calculada entre " + n1 + " + " + n2 + " + " + n3 + " + " + n4 + " é: " + media);
    }
}
