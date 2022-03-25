import javax.swing.JOptionPane;

public class ex6 {
    public static void main(String[] args) {
        int idade;
        int dias;

        idade = Integer.parseInt(JOptionPane.showInputDialog("qual sua idade? "));
        dias = idade * 365;

        JOptionPane.showMessageDialog(null, "sua idade em dias é de " + dias + " e sua idade em meses é de " + dias);
    }
}
