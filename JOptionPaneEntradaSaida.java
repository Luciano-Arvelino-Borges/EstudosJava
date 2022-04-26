import javax.swing.*;

public class JOptionPaneEntradaSaida {
    public static void main(String[] args) {
        String nome; //variável String

        //entrada
        nome = JOptionPane.showInputDialog("Digite seu nome: ");

        //saída
        JOptionPane.showMessageDialog(null,"O seu nome é " + nome);
    }
}
