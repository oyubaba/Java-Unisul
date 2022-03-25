import javax.swing.JOptionPane;

public class ex9 {
    public static void main(String[] args) {
        double salario;
        double reajuste;
        double novoSalario;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario sem reajuste: "));
        reajuste = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem de reajuste: "));

        novoSalario = ((reajuste/100) * salario) + salario;

        JOptionPane.showMessageDialog(null,"o novo salario é de: " + novoSalario);
    }
}
