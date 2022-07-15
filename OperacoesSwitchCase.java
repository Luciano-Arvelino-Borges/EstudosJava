import javax.swing.*;

public class OperacoesSwitchCase {
    public static void main(String[] args) {
        float num1, num2, resultado;
        int operacao;

        num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número: "));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número: "));

        operacao = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite a operação desejada: " +
                        "\n 1) soma " +
                        "\n 2) subtração " +
                        "\n 3) multiplicação " +
                        "\n 4) divisão " +
                        "\n 5) resto da divisão "));

        switch (operacao){
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 / num2;
                break;
            case 5:
                resultado = num1 % num2;
                break;
            default:
                resultado = 0;
                break;
        }
        JOptionPane.showMessageDialog(null, "O resultado da operação desejada é: " + resultado);
    }
}
