import javax.swing.*;

public class ConversaoTiposPrimitivos2 {
    public static void main(String[] args) {
         int codigo;
         String nomeProduto, aux;
         float preco;

         aux = JOptionPane.showInputDialog("Digite o código do produto: ");
         codigo = Integer.parseInt(aux);

         nomeProduto = JOptionPane.showInputDialog("Digite seu nome: ");

         aux = JOptionPane.showInputDialog("Digite o preço do produto: ");
         preco = Float.parseFloat(aux);

         JOptionPane.showMessageDialog(null, "O produto " + nomeProduto + "\n Com código " + codigo + "\n Custa R$ " + preco);
    }
}
