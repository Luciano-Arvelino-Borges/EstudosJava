import javax.swing.*;

public class IfAninhadoDiaSemana {


    public static void main(String[] args) {
        int dia;
        String auxiliar;

        auxiliar = JOptionPane.showInputDialog("Digite um número de 1 a 7: ");
        dia = Integer.parseInt(auxiliar);

        if (dia == 1){
            JOptionPane.showMessageDialog(null, "Você escolheu domingo");
        }else{
            if (dia == 2) {
                JOptionPane.showMessageDialog(null, "Você escolheu segunda");
            }else{
                if (dia == 3){
                    JOptionPane.showMessageDialog(null, "Você escolheu terça");
                }else{
                    if (dia == 4){
                        JOptionPane.showMessageDialog(null, "Você escolheu quarta");
                    }else{
                        if (dia == 5){
                            JOptionPane.showMessageDialog(null, "Você escolheu quinta");
                        }else{
                            if (dia == 6){
                                JOptionPane.showMessageDialog(null, "Você escolheu sexta");
                            }else{
                                if (dia == 7){
                                    JOptionPane.showMessageDialog(null, "Você escolheu sábado");
                                }else{
                                    JOptionPane.showMessageDialog(null, "Você digitou número inválido!");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
