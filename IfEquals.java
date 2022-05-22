import javax.swing.*;

public class IfEquals {
    public static void main(String[] args) {
        String nome;
        nome = JOptionPane.showInputDialog("Digite um nome: ");

        if(nome.equals("José")){
            JOptionPane.showMessageDialog(null, "O nome digitado é José");
        }else{
            JOptionPane.showMessageDialog(null, "O nome digitado foi: " + nome);
        }
    }
}
