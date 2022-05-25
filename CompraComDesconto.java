import java.util.Scanner;

public class CompraComDesconto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        float valorCompra;
        float valorCDesconto;
        System.out.println("Olá. Por gentileza, qual o seu nome? ");
        nome = leitor.next();
        System.out.println("Qual o valor da sua compra, " + nome + "?");
        valorCompra = leitor.nextFloat();
        valorCDesconto = valorCompra - (valorCompra * 10 / 100);
        if (valorCompra >= 1000){
            System.out.println("Você é um cliente VIP " + nome +". Por isso você tem 10% de desconto e o valor a pagar é: " + valorCDesconto);
        }else{
            System.out.println("Lembre-se, a cada R$1000,00 em compras você consegue 10% de desconto!");
        }
    }
}
