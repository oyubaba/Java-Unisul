import javax.swing.JOptionPane;

public class ex2 {
    public static void main(String[] args) {
        int primeiroNum;
        int segundoNum;
        int terceiroNum;
        int quartoNum;
        int resultado;

        primeiroNum = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro valor: "));
        segundoNum = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo valor: "));
        terceiroNum = Integer.parseInt(JOptionPane.showInputDialog("digite o terceiro valor: "));
        quartoNum = Integer.parseInt(JOptionPane.showInputDialog("digite o quarto valor: "));

        resultado = (primeiroNum * primeiroNum) + (segundoNum * segundoNum) + (terceiroNum * terceiroNum) + (quartoNum * quartoNum);

        JOptionPane.showMessageDialog(null, "o resultado da soma dos quadrados é de: " + resultado);
    }
}
