
import javax.swing.JOptionPane;
public class switchTeste {
    public static void main(String[] args) {
        int controle, resultado;
        int num1 = 10;
        int num2 = 5;

        controle = Integer.parseInt(JOptionPane.showInputDialog("qual operação vc quer realizar?" + "\n -adição \n -subtração"));
        switch(controle){
            case 1: 
            resultado = num1 + num2;
            JOptionPane.showMessageDialog(null,"o resultado é de " + resultado);
            break;
            case 2:
            resultado = num1 - num2;
            JOptionPane.showMessageDialog(null,"o resulatdo é " + resultado);
            break;
            default:
            JOptionPane.showMessageDialog(null, "opção invalida");
        }
    }
}
