import java.util.Scanner;

public class ConversorDeMedidas {
    public static void main(String[] args) {
        float medida;
        float km;
        float Hm;
        float Dam;
        float cm;
        float mm;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor a ser convertido em metros:");
        medida = leitor.nextFloat();
        System.out.println("----------CONVERTENDO----------");


        System.out.println(Math.pow(3) + "Km");
        System.out.println(medida + "Hm");
        System.out.println(medida + "Dam");

    }
}
