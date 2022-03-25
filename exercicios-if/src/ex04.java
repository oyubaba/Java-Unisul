import javax.swing.JOptionPane;
public class ex04 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 1 a 7: "));
        
        if (num > 7 || num < 1) {
            JOptionPane.showMessageDialog(null, num + " nao esta entre 1-7!!");
        } else {
            if (num == 1){
                JOptionPane.showMessageDialog(null,num + " e equivalente a domingo");
            } else {
                if (num == 2) {
                    JOptionPane.showMessageDialog(null,num + " e equivalente a segunda feira");
                } else {
                    if (num == 3) {
                        JOptionPane.showMessageDialog(null,num + " e equivalente a terca feira");
                    } else {
                        if (num == 4) {
                            JOptionPane.showMessageDialog(null,num + " e equivalente a quarta feira");
                        } else {
                            if (num == 5) {
                                JOptionPane.showMessageDialog(null,num + " e equivalente a quinta feira");
                            } else {
                                if (num == 6) {
                                    JOptionPane.showMessageDialog(null,num + " e equivalente a sexta feira");
                                } else {
                                    if (num == 7) {
                                        JOptionPane.showMessageDialog(null, num + " e equivalente a sabado");
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
