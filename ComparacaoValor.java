import javax.swing.*;

public class ComparacaoValor {
    public static void main(String[] args) {
        double numero;
        String auxiliar;

        auxiliar = JOptionPane.showInputDialog("Digite um número: ");
        numero = Double.parseDouble(auxiliar);

        if (numero >=200){
            JOptionPane.showMessageDialog(null, "O valor digitado é maior ou igual a 200.");
        }else{
            JOptionPane.showMessageDialog(null, "O número digitado é menor que 200.");
        }
    }
}
