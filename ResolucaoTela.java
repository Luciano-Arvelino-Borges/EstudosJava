import java.awt.*;

public class ResolucaoTela {
    public static void main(String[] args) {
        Toolkit ferramenta = Toolkit.getDefaultToolkit();
        Dimension dimensao = ferramenta.getScreenSize();
        System.out.println("A resolução da tela é: " + dimensao.width + " x " + dimensao.height);

    }
}
