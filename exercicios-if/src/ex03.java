import javax.swing.JOptionPane;

public class ex03 {
    public static void main(String[] args) {
        int num1, num2, num3;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero: "));

        if (num1 == num2 || num1 == num3 || num2 == num3) {
            JOptionPane.showMessageDialog(null, "Digite numeros diferentes!!!");
        } else {
            if (num1 > num2 && num1 > num3) {
                JOptionPane.showMessageDialog(null, "O maior numero e o numero 1");
            } else {
                if (num2 > num1 && num2 > num3) {
                    JOptionPane.showMessageDialog(null, "O maior numero e o numero 2");
                } else {
                    if (num3 > num1 && num3 > num2) {
                        JOptionPane.showMessageDialog(null, "O maior numero e o numero 3");
                    }
                }
            }
        }
    }
}
