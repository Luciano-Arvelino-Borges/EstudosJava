import java.util.Scanner;

public class InverterNomeSobrenome {
    public static void main(String[] args) {
        String nome;
        String sobrenome;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = leitor.next();
        System.out.print("Digite seu sobrenome: ");
        sobrenome = leitor.next();
        System.out.println("A inversão entre os nomes é: " + sobrenome + " ; " + nome);
    }
}
