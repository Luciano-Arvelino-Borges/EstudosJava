import java.util.Scanner;

public class AntesDepois {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float numero, ant, suc;
        System.out.println("Digite um número: ");
        numero = leitor.nextFloat();
        ant = numero - 1;
        suc = numero + 1;
        System.out.println("O antecessor de " + numero + " é: " + ant + " e o sucessor é: " + suc + ".");
    }
}
