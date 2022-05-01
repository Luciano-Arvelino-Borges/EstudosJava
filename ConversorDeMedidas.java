import java.util.Scanner;

public class ConversorDeMedidas {
    public static void main(String[] args) {
        float medida;
        float km;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor a ser convertido em metros:");
        medida = leitor.nextFloat();
        System.out.println("----------CONVERTENDO----------");

        System.out.println(medida + "Km");
        System.out.println(medida + "Hm");
        System.out.println(medida + "Dam");

    }
}
