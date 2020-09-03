package Exercicio0706;

import javax.swing.*;

public class Salario {

    public static void main(String[] args) {

        double salLiq = 0, salBruto = 0, aliquota = 0, desconto = 0;
        String aux = " ";

        aux = JOptionPane.showInputDialog(null, "Insira o seu salário", "Desconto INSS", JOptionPane.PLAIN_MESSAGE);
        aux = aux.replace(',', '.');
        salBruto = Double.parseDouble(aux);

        if (salBruto < 465.00 || salBruto > 3218.90) {

            JOptionPane.showMessageDialog(null, "Não é possível fazer o desconto \ncom valor menor que R$465,00 \nou maior que R$3.218,00 ", "Valor inválido", JOptionPane.ERROR_MESSAGE);
        } else if (salBruto <= 965.67) {

            aliquota = 8;
            desconto = (salBruto / 100) * aliquota;
            salLiq = salBruto - desconto;
            Ext.saidaUsuario(salBruto, aliquota, desconto, salLiq);
        } else if (salBruto >= 965.68 && salBruto <= 1609.45) {

            aliquota = 9;
            desconto = (salBruto / 100) * aliquota;
            salLiq = salBruto - desconto;
            Ext.saidaUsuario(salBruto, aliquota, desconto, salLiq);
        } else if (salBruto >= 1609.46 && salBruto <= 3218.90) {

            aliquota = 11;
            desconto = (salBruto / 100) * 11;
            if (desconto >= 354.07) {

                salLiq = 2864.83;
                desconto = 354.07;
                Ext.saidaUsuario(salBruto, aliquota, desconto, salLiq);
            } else if (desconto <= 354.07) {
                salLiq = salBruto - desconto;
                Ext.saidaUsuario(salBruto, aliquota, desconto, salLiq);
            }

        }
    }

}
//Feiro por Rafael Ferreira Goulart