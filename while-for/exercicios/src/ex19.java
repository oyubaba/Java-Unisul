import javax.swing.JOptionPane;

public class ex19 {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Digite uma frase: ");
        int vezes = Integer.parseInt(JOptionPane.showInputDialog("digite o tanto de vezes que ela devera aparecer: "));
        for (int num = 0; num < vezes; num++) {
            JOptionPane.showMessageDialog(null, frase);
        }
    }
}