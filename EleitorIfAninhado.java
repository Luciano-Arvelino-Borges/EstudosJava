import javax.swing.*;

public class EleitorIfAninhado {
    public static void main(String[] args) {
        int idade;
        String auxiliar;

        auxiliar = JOptionPane.showInputDialog("Digite sua idade: ");
        idade = Integer.parseInt(auxiliar);

        if (idade>=18){
            if(idade==18){
                JOptionPane.showMessageDialog(null, "Igual a 18");
            }else {
                JOptionPane.showMessageDialog(null, "Maior que 18");
            }
        }else {
            JOptionPane.showMessageDialog(null, "Menor de idade");
        }


    }
}
