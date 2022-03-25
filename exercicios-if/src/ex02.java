
import java.net.Socket;

import javax.swing.JOptionPane;

public class ex02 {
    public static void main(String[] args) {
        int a;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a: "));
        int b;
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b: "));
        int c;
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de c: "));
        double delta;
        delta = (b*b) - (4*a*c);
        double raizDelta;
        raizDelta = Math.sqrt(delta);
        double raizPositivo;
        raizPositivo = (-b + delta) / (2*a);
        double raizNegativo;
        raizNegativo = (-b - delta) / (2*a);

        if (delta < 0) {
            JOptionPane.showMessageDialog(null, "Delta negativo, nao ha raizes");
        } else {
            if (delta==0){
                JOptionPane.showMessageDialog(null, "Delta 0, a raiz e: " + raizPositivo);
            } else {
                JOptionPane.showMessageDialog(null, "as raizes sao: " + raizPositivo + " e " + raizNegativo);   
              }    
        }
    }
}

