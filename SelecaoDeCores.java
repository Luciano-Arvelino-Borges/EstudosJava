import javax.swing.*;

public class SelecaoDeCores {
    public static void main(String[] args) {
        int cor;
        cor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número de 1 a 5"));
        switch (cor){
            case 1:
                JOptionPane.showMessageDialog(null, "Azul");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Vermelho");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Rosea");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Verde");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Amarelo");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Número inválido");


        }

    }
}
