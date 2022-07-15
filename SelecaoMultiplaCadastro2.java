import javax.swing.*;

public class SelecaoMultiplaCadastro2 {
    public static void main(String[] args) {

        int opcao, submenu;

        opcao = Integer.parseInt(JOptionPane.showInputDialog("Insira a opção desejada: " + "\n 1) - Cadastrar usuário" + "\n 2) - Alterar dados " + "\n 3) - Excluir usuário"));

        switch (opcao) {
            case 1:
                JOptionPane.showMessageDialog(null, "Cadastrar usuário.");
                break;
            case 2:
                submenu = Integer.parseInt(JOptionPane.showInputDialog(
                        "Menu para alterar dados " +
                                "\nSelecione a opção desejada: " +
                                "\n1) Alterar nome " +
                                "\n2) Alterar endereço " +
                                "\n3) Alterar telefone " +
                                "\n4) Alterar CPF "));
                switch (submenu) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Alterar nome");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Alterar endereço");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Alterar telefone");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Alterar CPF");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida");

                }

        }
    }
}
