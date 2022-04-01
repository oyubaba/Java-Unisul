import javax.swing.JOptionPane;
public class ex23 {
    public static void main(String[] args) {
    int numInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero inicial: "));
    int numFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero final: "));
    int soma = 0;
    while (numInicial<=numFinal) {
        soma = numInicial + soma;
        numInicial++;
    }
    JOptionPane.showMessageDialog(null, soma);
}
}
