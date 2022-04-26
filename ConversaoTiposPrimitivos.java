import javax.swing.*;

public class ConversaoTiposPrimitivos {
    public static void main(String[] args) {
        String auxiliar;
        int nInteiro;
        double nDouble;
        float nFloat;

        //entrada
        auxiliar = JOptionPane.showInputDialog("Digite um número inteiro: ");

        //conversão
        nInteiro = Integer.parseInt(auxiliar);
        nDouble = Double.parseDouble(auxiliar);
        nFloat = Float.parseFloat(auxiliar);

        //saída
        JOptionPane.showMessageDialog(null,"O valor inteiro é: " + nInteiro);
        JOptionPane.showMessageDialog(null, "O valor double é: " + nDouble);
        JOptionPane.showMessageDialog(null, "O valor float é: " + nFloat);

    }
}
