
import javax.swing.JOptionPane;

public class ex01 {
    public static void main(String[] args) {
        double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número pra ver se ele é positivo, negativo ou neutro:"));
        if (num == 0) {
            JOptionPane.showMessageDialog(null,"O número é neutro");
        } else {
            if(num>=1) {
                JOptionPane.showMessageDialog(null, "O número é positivo");
            } else {
                if(num < 0) {
                    JOptionPane.showMessageDialog(null, "O número é negativo");
                }
            }
        } 
    }
}

