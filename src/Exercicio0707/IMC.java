package Exercicio0707;

import javax.swing.*;

public class IMC {

    public static void main(String[] args) {
        
        double IMC = 0, Pes = 0, Alt = 0;
        String aux = " ", Class = " ";

        try {
            aux = JOptionPane.showInputDialog(null, "Insira o quanto você pesa em Kg", "Cálculo IMC - Peso", JOptionPane.PLAIN_MESSAGE);
            aux = aux.replace(',', '.');
            Pes = Double.parseDouble(aux);

            if (Pes <= 0.5) {
                JOptionPane.showMessageDialog(null, "O peso a ser inserido não \npode ser menor que 0,5Kg", "Erro - Peso inválido", JOptionPane.ERROR_MESSAGE);
                System.exit(1);
            }

            aux = JOptionPane.showInputDialog(null, "Insira sua altura em Metros", "Cálculo IMC - Altura", JOptionPane.PLAIN_MESSAGE);
            aux = aux.replace(',', '.');
            Alt = Double.parseDouble(aux);

            if (Alt <= 0.1) {
                JOptionPane.showMessageDialog(null, "A altura a ser inserida não \npode ser menor que 0,1 Metros", "Erro - Altura inválida", JOptionPane.ERROR_MESSAGE);
                System.exit(1);
            }

            IMC = Pes / Math.pow(Alt, 2);

            IMC = IMC * 100;
            IMC = Math.ceil(IMC);
            IMC = IMC / 100;

            Categoria.Classif(IMC, Class);
        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(null, "É preciso inserir apenas números para o \ncálculo do IMC", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
//Feito por Rafael Ferreira Goulart