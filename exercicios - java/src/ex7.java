import javax.swing.JOptionPane;

public class ex7 {
    public static void main(String[] args) {
        int anos;
        int meses;
        int dias;
        int contaDias;

        JOptionPane.showMessageDialog(null, "A seguir escreva sua idade expressa em anos, meses e dias");

        anos = Integer.parseInt(JOptionPane.showInputDialog("Anos: "));
        meses = Integer.parseInt(JOptionPane.showInputDialog("Meses: "));
        dias = Integer.parseInt(JOptionPane.showInputDialog("Dias: "));

        contaDias = (anos*365) + (meses*30) + (dias);

        JOptionPane.showMessageDialog(null, "Sua idade em dias é de " + contaDias);
    }
}
