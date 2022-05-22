import javax.swing.*;

public class EleitorIfComposto {
    public static void main(String[] args) {
        int idade;
        String auxiliar;

        auxiliar = JOptionPane.showInputDialog("Digite sua idade: ");
        idade = Integer.parseInt(auxiliar);

        if(idade>=18){
            JOptionPane.showMessageDialog(null, "Maior de idade");
        }else{
            JOptionPane.showMessageDialog(null, "Menor de idade");
        }
    }
}
