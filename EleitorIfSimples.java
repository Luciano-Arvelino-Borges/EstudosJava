import javax.swing.*;

public class EleitorIfSimples {
    public static void main(String[] args) {
        int idade;
        String auxiliar;

        auxiliar = JOptionPane.showInputDialog("Insira sua idade: ");
        idade = Integer.parseInt(auxiliar);

        if(idade>=10){
            JOptionPane.showMessageDialog(null, "Maior de idade");
        }
    }
}
