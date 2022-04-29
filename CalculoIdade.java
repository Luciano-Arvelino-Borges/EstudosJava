import java.util.Scanner;

public class CalculoIdade {
    public static void main(String[] args) {

        int anonas;
        int anoatual;
        int idade;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Em que ano voce nasceu? ");
        anonas = leitor.nextInt();
        System.out.println("Digite o ano atual: ");
        anoatual = leitor.nextInt();

        idade = anoatual - anonas;
        System.out.println("Você tem " + idade + " anos");
        leitor.close();
    }
}
