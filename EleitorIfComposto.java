import javax.swing.*;

public class EleitorIfComposto {
    public static void main(String[] args) {
        int idade;
        String auxiliar;

        auxiliar = JOptionPane.showInputDialog("Digite sua idade: ");
        idade = Integer.parseInt(auxiliar);

        if (idade < 16) {
            JOptionPane.showMessageDialog(null, "Voto Proibido");
        } else {
            if ((idade >= 16 && idade < 18) || (idade > 70)) {
                JOptionPane.showMessageDialog(null, "Voto Facultativo");
            } else {
                JOptionPane.showMessageDialog(null, "Voto Obrigatório.");
            }
        }
    }
}

