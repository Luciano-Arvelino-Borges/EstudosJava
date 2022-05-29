import javax.swing.*;

public class SelacaoMultiplaCadastro {
    public static void main(String[] args) {

        int opcao;

        opcao = Integer.parseInt(JOptionPane.showInputDialog("Insira a opção desejada: " + "\n 1) - Cadastrar usuário" + "\n 2) - Alterar dados " + "\n 3) - Excluir usuário"));

        switch (opcao){
            case 1:
                JOptionPane.showMessageDialog(null, "Cadastrar usuário.");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Alterar dados.");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Excluir usuário.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
                break;
        }
    }
}