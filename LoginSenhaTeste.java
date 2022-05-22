import javax.swing.*;

public class LoginSenhaTeste {
    public static void main(String[] args) {
        String login, senha;

        // login = aluno
        // senha = aluno

        login = JOptionPane.showInputDialog("Digite o Login: ");
        senha = JOptionPane.showInputDialog("Digite a senha: ");

        if(login.equals("aluno") && senha.equals("aluno")){
            JOptionPane.showMessageDialog(null, "Acesso liberado");
        }else{
            JOptionPane.showMessageDialog(null, "Login ou senha incorretos.");
        }
    }
}
