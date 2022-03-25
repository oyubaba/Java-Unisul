import javax.swing.JOptionPane;

public class ex06 {
    public static void main(String[] args) {
        int ano = Integer.parseInt(JOptionPane.showInputDialog("digite um ano: "));

        if ((ano % 4) == 0) {
            JOptionPane.showMessageDialog(null, ano + " e um ano bissexto");
        } else {
            JOptionPane.showMessageDialog(null, "nao e ano bissexto");
        }
    }
}
