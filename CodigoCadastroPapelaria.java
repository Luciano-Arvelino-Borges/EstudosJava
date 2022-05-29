import javax.swing.*;

public class CodigoCadastroPapelaria {
    public static void main(String[] args) {
        int cod;
        cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do produto"));
        switch (cod){
            case 100:
                JOptionPane.showMessageDialog(null, "O produto é lápis preto");
                break;
            case 150:
                JOptionPane.showMessageDialog(null, "O produto é borracha branca");
                break;
            case 200:
                JOptionPane.showMessageDialog(null, "O produto é caneta azul");
                break;
            case 230:
                JOptionPane.showMessageDialog(null, "O produto é caneta vermelha");
                break;
            case 256:
                JOptionPane.showMessageDialog(null,"O produto é Giz de cera");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Produto não cadastrado");
        }

    }

}
