import javax.swing.JOptionPane;
public class ex5 {
    public static void main(String[] args) {
        double base;
        double altura;
        double area;

        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));

        area = base * altura;

        JOptionPane.showMessageDialog(null, "a area do retangulo é de: " + area);
    }
}
