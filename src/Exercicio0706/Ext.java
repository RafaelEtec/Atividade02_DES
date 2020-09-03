package Exercicio0706;

import javax.swing.*;

public class Ext {

    public static void saidaUsuario(double salBruto, double aliquota, double desconto, double salLiq) {

        desconto = desconto * 100;
        salLiq = salLiq * 100;
        desconto = Math.ceil(desconto);
        salLiq = Math.ceil(salLiq);
        desconto = desconto / 100;
        salLiq = salLiq / 100;

        JOptionPane.showMessageDialog(null, "Salário bruto: " + salBruto + "\n Alíquota INSS: " + aliquota + "\n Desconto: " + desconto + "\n Salário líquido: " + salLiq, "Recebimento", JOptionPane.INFORMATION_MESSAGE);

    }
}
