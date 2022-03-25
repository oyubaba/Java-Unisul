import javax.swing.JOptionPane;
public class ex05 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 1 a 12: "));

        if (num > 12 || num < 1) {
            JOptionPane.showMessageDialog(null, num + " nao esta entre 1-12!!");
        } else {
            if (num == 1) {
                JOptionPane.showMessageDialog(null, num + " e equivalente a janeiro");
            } else {
                if (num == 2) {
                    JOptionPane.showMessageDialog(null, num + " e equivalente a fevereiro");
                } else {
                    if (num == 3) {
                        JOptionPane.showMessageDialog(null, num + " e equivalente a marco");
                    } else {
                        if (num == 4) {
                            JOptionPane.showMessageDialog(null, num + " e equivalente a abril");
                        } else {
                            if (num == 5) {
                                JOptionPane.showMessageDialog(null, num + " e equivalente a maio");
                            } else {
                                if (num == 6) {
                                    JOptionPane.showMessageDialog(null, num + " e equivalente a junho");
                                } else {
                                    if (num == 7) {
                                        JOptionPane.showMessageDialog(null, num + " e equivalente a julho");
                                    } else {
                                        if (num == 8) {
                                            JOptionPane.showMessageDialog(null, num + " e equivalente a agosto");
                                        } else {
                                            if (num == 9) {
                                                JOptionPane.showMessageDialog(null, num + " e equivalente a setembro");
                                            } else {
                                                if (num == 10) {
                                                    JOptionPane.showMessageDialog(null, num + " e equivalente a outubro");
                                                }else {
                                                    if (num == 11) {
                                                        JOptionPane.showMessageDialog(null, num + " e equivalente a novembro");
                                                    } else {
                                                        if (num == 12) {
                                                            JOptionPane.showMessageDialog(null, num + " e equivalente a dezembro");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}
