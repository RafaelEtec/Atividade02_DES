package Exercicio0707;

import javax.swing.*;

public class Categoria {

    public static void Classif(double IMC, String Class) {
        if (IMC < 18.5) {
            Class = "Excesso de magreza";
        } else if (IMC >= 18.5 && IMC < 25) {
            Class = "Peso normal";
        } else if (IMC >= 25 && IMC < 30) {
            Class = "Excesso de peso";
        } else if (IMC >= 30 && IMC < 35) {
            Class = "Obesidade ( Grau I )";
        } else if (IMC >= 35 && IMC < 40) {
            Class = "Obesidade ( Grau II )";
        } else if (IMC >= 40) {
            Class = "Obesidade ( Grau III )";
        }
        if (IMC < 25) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + IMC + "\nClassificação: " + Class, "IMC do usuário", JOptionPane.INFORMATION_MESSAGE);
        } else if (IMC >= 25) {

            JOptionPane.showMessageDialog(null, "Seu IMC é: " + IMC + "\nClassificação: " + Class, "IMC do usuário", JOptionPane.WARNING_MESSAGE);
        }
    }
}
//Feito por Rafael Ferreira Goulart