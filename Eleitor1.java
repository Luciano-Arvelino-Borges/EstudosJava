import java.util.Scanner;

public class Eleitor1 {
    public static void main(String[] args) {
        int idade;
        Scanner leitor =new Scanner(System.in);
        System.out.print("Entre com sua idade: ");
        idade = leitor.nextInt();

        if (idade>=18){
            System.out.println("Maioridade. Voto Obrigatório");
        }else{
            System.out.println("Menor. Não vota");
        }

    }
}
