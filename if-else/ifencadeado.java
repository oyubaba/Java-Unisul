import javax.swing.JOptionPane;

public class ifencadeado {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("insira um numero:"));

        if ((numero % 10) == 0){
            JOptionPane.showMessageDialog(null, "é multiplo de 10");
        }else{
        if((numero % 2) == 0) {
            JOptionPane.showMessageDialog(null, "é multiplo de 2");}
            else {
                if((numero % 5) == 0) {
                    JOptionPane.showMessageDialog(null, "é multiplo de 5");
                } else {
                    JOptionPane.showMessageDialog(null, "não é multiplo de nenhum destes!");
                }
            }
        }
    }
}
