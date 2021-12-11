package model;

import javax.swing.*;

public class Banco {

    public static void main(String[] args) {

        String[] opcoes = {"Acessar a minha conta", "Abrir uma conta"};

        JOptionPane.showMessageDialog(null,"Seja bem-vindo ao Bank System",
                "Bank System", JOptionPane.PLAIN_MESSAGE,null);

        int opcao = JOptionPane.showOptionDialog(null, null,"Operações",
                    JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);



    }
}
