import java.util.Scanner;

public class Boletim {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome, tel, serie;
        float nota1, nota2, nota3, nota4;
        float media;

        System.out.print("Digite o nome do aluno: ");
        nome = leitor.next();
        System.out.print("Digite o telefone do aluno ou responsável: ");
        tel = leitor.next();
        System.out.print("Digite a série do aluno: ");
        serie = leitor.next();
        System.out.print("Digite a primeira nota: ");
        nota1 = leitor.nextFloat();
        System.out.print("Digite a segunda nota: ");
        nota2 = leitor.nextFloat();
        System.out.print("Digite a terceina nota: ");
        nota3 = leitor.nextFloat();
        System.out.print("Digite a querta nota: ");
        nota4 = leitor.nextFloat();
        media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("----------Curso EAD----------");
        System.out.print("Nome: " + nome + "\nTelefone: " + tel + "\nSérie " + serie + ". ");
        System.out.println("A média do aluno " + nome + " é " + media + ".");

    }
}
