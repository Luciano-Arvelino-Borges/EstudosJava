import javax.swing.*;

public class IfAninhadoMeses {
    public static void main(String[] args) {


        int mes;
        String auxiliar;

        auxiliar = JOptionPane.showInputDialog("Digite um número de 1 a 12: ");
        mes = Integer.parseInt(auxiliar);

        if(mes == 1){
            JOptionPane.showMessageDialog(null, "Janeiro");
        }else {
            if(mes == 2){
                JOptionPane.showMessageDialog(null, "Fevereiro");
            }else{
                if(mes == 3){
                    JOptionPane.showMessageDialog(null, "Março");
                }else {
                    if(mes==4){
                        JOptionPane.showMessageDialog(null, "Abril");
                    }else{
                        if(mes==5){
                            JOptionPane.showMessageDialog(null, "Maio");
                        }else{
                            if(mes==6){
                                JOptionPane.showMessageDialog(null, "Junho");
                            }else{
                                if(mes==7){
                                    JOptionPane.showMessageDialog(null, "Julho");
                                }else{
                                    if(mes==8){
                                        JOptionPane.showMessageDialog(null, "Agosto");
                                    }else{
                                        if(mes==9){
                                            JOptionPane.showMessageDialog(null, "Setembro");
                                        }else{
                                            if(mes==10){
                                                JOptionPane.showMessageDialog(null, "Outubro");
                                            }else{
                                                if(mes==11){
                                                    JOptionPane.showMessageDialog(null, "Novembro");
                                                }else{
                                                    if(mes==12){
                                                        JOptionPane.showMessageDialog(null, "Dezembro");
                                                    }else{
                                                        JOptionPane.showMessageDialog(null, "Mês Inválido");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
