import javax.swing.JOptionPane;

public class IfEx {
    public static void main(String[] args) {
        double num, metade; 
        num = Double.parseDouble(JOptionPane.showInputDialog("digite um numero"));

        if (num > 10) {
            metade = num / 2;
            JOptionPane.showMessageDialog(null, "a metade é " + metade);
        } else {
            num = num * 2;
            JOptionPane.showMessageDialog(null, "o dobro é " + num);
        }
    }
    
}
