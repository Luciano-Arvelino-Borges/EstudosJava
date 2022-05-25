import java.util.Scanner;

public class ClassificarPrioridadeIdoso {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade;
        System.out.println("Olá. Por gentileza, quantos anos o senhor tem? ");
        idade = leitor.nextInt();
        if (idade >=60){
            System.out.println("Fila Prioritária.");
        }else{
            System.out.println("Fila comum.");
        }
    }
}
