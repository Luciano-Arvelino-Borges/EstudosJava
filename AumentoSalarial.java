import java.util.Scanner;

public class AumentoSalarial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        float sal;
        float reaj;
        float nsal;

        System.out.print("Nome do funcionário: ");
        nome = leitor.next();
        System.out.print("Salário R$: ");
        sal = leitor.nextFloat();

        System.out.print("Reajuste (%): ");
        reaj = leitor.nextFloat();

        nsal = sal + ( sal * reaj /100 );

        System.out.println( nome + " ganhava R$ " + sal + " e depois de ganhar " + reaj + "% de aumento vai passar a ganhar R$ " + nsal);


    }
}
