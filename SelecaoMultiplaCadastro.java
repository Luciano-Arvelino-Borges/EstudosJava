import javax.swing.*;

public class SelecaoMultiplaCadastro {
    public static void main(String[] args) {
        int menu;
        menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleione as opções desejadas: 1 - Cadastrar Usuário; 2 - Alterar dados; 3 - Excluir Unuário"));
        switch (menu){
            case 1:
                JOptionPane.showMessageDialog(null, "Cadastrar Usuário");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Alterar dados");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Excluir Usuário");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }
}
