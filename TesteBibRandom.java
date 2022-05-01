import java.util.Random;

public class TesteBibRandom {
    public static void main(String[] args) {
    Random sorteia = new Random();
    int numero = sorteia.nextInt(50);
        System.out.println("O número sorteado foi: " + numero);
    }

    }

