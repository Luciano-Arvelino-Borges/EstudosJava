import javax.swing.*;

public class CalculadoraSimples {
    public static void main(String[] args) {
        float num1, num2, resultado;
        int operacao;

        num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor: "));

        operacao = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite a operação: " +
                        "\n1)Soma"+
                        "\n2)Subtração"+
                        "\n3)Multilicação"+
                        "\n4)Divisão"+
                        "\n5)Resto da divisão"));
        switch (operacao){
            case 1:
                resultado = num1+num2;
                break;
            case 2:
                resultado = num1-num2;
                break;
            case 3:
                resultado = num1*num2;
                break;
            case 4:
                resultado = num1/num2;
                break;
            case 5:
                resultado = num1%num2;
                break;
            default:
                resultado = 0;
                break;
        }
        JOptionPane.showMessageDialog(null, "O resultado da operação é: "+ resultado);
    }
}

