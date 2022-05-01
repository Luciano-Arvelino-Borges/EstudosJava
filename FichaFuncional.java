import java.util.Scanner;

public class FichaFuncional {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome, ano, salario;
        System.out.println("Nome do Funcionário: ");
        nome = leitor.nextLine();
        System.out.println("Ano de nascimento: ");
        ano = leitor.next();
        System.out.println("Salário: ");
        salario = leitor.next();
        System.out.println("---------------FICHA FUNCIONAL---------------");
        System.out.println("NOME: " + nome);
        System.out.println("NASCIMENTO: " + ano);
        System.out.println("SALÁRIO de R$ " + salario);
        System.out.println("--------------------");
    }
}
