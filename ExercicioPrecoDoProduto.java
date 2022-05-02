import java.util.Scanner;

public class ExercicioPrecoDoProduto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float preco;
        float precoFinal;
        System.out.print("Qual é o preço do produto? ");
        preco = leitor.nextFloat();
        precoFinal = preco -(preco * 5 /100);
        System.out.println("O preço com 5% de desconto é: " + precoFinal);
    }
}
