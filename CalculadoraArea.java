import java.util.Scanner;

public class CalculadoraArea {
    static double custoMetal = 2.5;    //custo por cm2 de metal
    static double custoPlastico = 1.5; //custo por cm2 de plástico

    public static double areaQuadrado(double lado) {
        return lado * lado;
    }

    public static double areaTrianguloReto(double cateto) {
        return cateto * cateto / 2;
    }

    public static double areaParalelogramo(double base, double altura) {
        return base * altura;
    }

    public static void main(String[] args) {

        System.out.println("Calculador de áreas");
        System.out.println("Area quadrado com 2.5 de lado: " + areaQuadrado(2.5) + "cm2");
        System.out.println("Area triangulo reto com 4 cm de lado: " + areaTrianguloReto(4) + "cm2");
        System.out.println("Area paralelogramo com base 4 cm e altura 2.5 cm: " + areaParalelogramo(4, 2.5) + "cm2");

        double custoTrangram = custoMetal * areaQuadrado(16); //custo para tangram 16x16 de metal

        System.out.println("Custo tangram 16x16 cm2 em metal: " + custoTrangram);

        double areaPlastico = 3 * areaTrianguloReto(5) + 2 * areaParalelogramo(7.1, 2.7); //area de plástico
        double areaMetal = areaQuadrado(4) + areaTrianguloReto(4);              //area de metal
        double custoTotal = custoPlastico*areaPlastico + custoMetal*areaMetal;  //calcula o custo total
        System.out.println("Custo total de pecas de reposicao: " + custoTotal); //imprime custo total


        Scanner input = new Scanner(System.in); //cria scanner para ler dados do usuário

        System.out.println("Entre com o custo da borracha:");
        double custoBorracha = input.nextDouble(); // lê o número fornecido pelo usuário, no formato double

        double custoTrangramBorracha = custoBorracha * areaQuadrado(10.5); //custo para tangram 16x16 de metal
        System.out.println("Custo tangram 10.5 x 10.5 cm2 em borracha: " + custoTrangramBorracha);



    }

}


