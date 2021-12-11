package model;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("------- Bem-vindo ao Bank system -------\n");
        System.out.println("1 - Acessar a minha conta\n2 - Abrir uma conta\n3 - Sair\n");

        int opcao_escolhida = ler.nextInt();

        switch(opcao_escolhida) {
            case 1:
                System.out.println("------- Bank system -------\n");
                System.out.println("Número da conta: ");
                int numero_conta = ler.nextInt();
                System.out.println("Palavra-passe: ");
                String palavra_passe = ler.nextLine();
                break;

            case 2:
                System.out.println("------- Bank system -------\n");
                System.out.println("1 - Conta corrente\n2 - Conta poupança\n3 - Voltar");
                int tipo_conta = ler.nextInt();

                switch (tipo_conta) {
                    case 1:
                        System.out.println("Por implementar");
                        //ContaCorrente conta_corrente= new ContaCorrente();
                        break:
                    case 2:
                        System.out.println("w");
                        System.out.println("Por implementar");
                        //ContaPoupanca conta_poupanca = new ContaPoupanca();
                        break;

                    case 3:
                        System.out.println("f");
                        System.out.println("Por implementar");
                        break;
                }

            case 3:
                System.exit(0);
                break;
        }
    }
}
