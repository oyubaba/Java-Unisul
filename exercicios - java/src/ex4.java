import javax.swing.JOptionPane;

public class ex4 {
    public static void main(String[] args) {
        int numero;
        int antecessor;

        numero = Integer.parseInt(JOptionPane.showInputDialog("digite um numero inteiro: "));
        antecessor = numero - 1;

        JOptionPane.showMessageDialog(null, "o antecessor de " + numero + " é " + antecessor);
    }
}
