import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        float n1;
        float n2;
        float soma;
        float diferenca;
        float produto;
        float quociente;
        float restodivisao;


        System.out.println("Cálculo de Operações Matemáticas");
        System.out.print("Digite o primero valor: ");
        n1 = leitor.nextFloat();
        System.out.print("Digite o segundo valor: ");
        n2 = leitor.nextFloat();
        soma = n1 + n2;
        System.out.println("A soma entre " + n1 + " e " + n2 + " é " + soma + ".");
        diferenca = n1 - n2;
        System.out.println("A diferença entre " + n1 + " e " + n2 + " é " + diferenca + ".");
        produto = n1 * n2;
        System.out.println("O produto de " + n1 + " e " + n2 + " é " + produto + ".");
        quociente = n1 / n2;
        System.out.println("O quociente de " + n1 + " e " + n2 + " é " + quociente + ".");
        restodivisao = n1 % n2;
        System.out.println("O resto da divisão entre " + n1 + " e " + n2 + " é " + restodivisao + ".");

    }
}
