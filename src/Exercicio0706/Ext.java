package Exercicio0706;

import javax.swing.*;

public class Ext {

    public static void saidaUsuario(double salBruto, double aliquota, double desconto, double salLiq) {
        JOptionPane.showMessageDialog(null, "Salário bruto: " + salBruto + "\n Alíquota INSS: " + aliquota + "\n Desconto: " + desconto + "\n Salário líquido: " + salLiq, "Desconto INSS", JOptionPane.INFORMATION_MESSAGE);
    }   
}
