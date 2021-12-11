package model;
import javax.swing.JOptionPane;

public class Banco {

    public static void main(String[] args) {

        String[] opcoes = {"Acessar a minha conta", "Abrir uma conta"};

        JOptionPane.showMessageDialog(null,"Seja bem-vindo ao Bank System",
                "Bank System", JOptionPane.PLAIN_MESSAGE,null);

        int opcao_escolhida = JOptionPane.showOptionDialog(null, null,"Operações",
                    JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);


        if(opcao_escolhida == 0){
            System.out.println("Funcionalidade por implementar");
        }
        else if(opcao_escolhida == 1) {

            String[] contas = {"Conta Correnta", "Conta Poupança", "Voltar"};
            int conta_escolhida = JOptionPane.showOptionDialog(null, null,"Tipo de conta",
                    JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, contas, contas[0]);

            if(conta_escolhida == 0) {
                System.out.println("Conta corrente");
            }
            else if(conta_escolhida == 1){
                System.out.println("Conta poupança");
            }
            else{
                System.out.println("Voltar");
            }
        }
    }
}
