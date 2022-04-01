import javax.swing.JOptionPane;

public class ex21 {
    public static void main(String[] args) {
        int num, soma, media;
        num = 1;
        while (num<=100) {
            soma = num + num;
            JOptionPane.showMessageDialog(null, soma);
            num++;

        }

    }
}
