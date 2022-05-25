import java.util.Scanner;

public class ComparacaoValor2 {
    public static void main(String[] args) {
        int numero;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = leitor.nextInt();
        if (numero>=10 && numero <=100){
            System.out.println("O " + numero +" está entre 10 e 100");
        }else{
            System.out.println("O " + numero + " é menor que 10 ou maior que 100");
        }


    }
}
