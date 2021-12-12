package model;
import java.util.Date;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Date date_atual = new Date();

        System.out.println("------- Bem-vindo ao Bank system -------\n");
        System.out.println("1 - Acessar conta\n2 - Abrir conta\n3 - Sair\n");
        System.out.print("Opção: ");
        int opcao_escolhida = ler.nextInt();

        switch(opcao_escolhida) {
            case 1 -> {
                System.out.println("----------- Acessar conta -----------\n");

                System.out.print("Número da conta: ");
                long numero_conta = ler.nextLong();
                ler.nextLine();
                System.out.print("Palavra-passe: ");
                String palavra_passe = ler.nextLine();

                System.out.println("\nSaldo: 488 744,00 ECV");
            }

            case 2 -> {
                System.out.println("----------- Abrir conta -----------\n");
                System.out.println("1 - Conta corrente\n2 - Conta poupança\n3 - Voltar");
                System.out.print("\nOpção: ");
                int tipo_conta = ler.nextInt();

                switch (tipo_conta) {
                    case 1 -> {
                        System.out.println("----------- Abrir conta -----------\n");
                        System.out.println("Tipo: Conta corrente\n");

                        System.out.print("CNI: ");
                        String cni = ler.nextLine();

                        System.out.print("Nome: ");
                        String nome = ler.nextLine();

                        System.out.print("Apelido: ");
                        String apelido = ler.nextLine();

                        System.out.print("Data nascimento: ");
                        String data_nasc = ler.nextLine();

                        System.out.print("Telemóvel: ");
                        String telemovel = ler.nextLine();

                        Cliente cliente = new Cliente(cni, nome, apelido, data_nasc, telemovel);

                        long numero_aleatorio = (long) Math.floor(Math.random()  * (99999999 - 100000 + 1) + 100000);

                        ContaCorrente conta_corrente = new ContaCorrente(numero_aleatorio, date_atual.toString(), 0, true, cliente);
                    }

                    case 2 -> {
                        System.out.println("w");
                        System.out.println("Por implementar");
                        //ContaPoupanca conta_poupanca = new ContaPoupanca();
                    }

                    case 3 -> {
                        System.out.println("f");
                        System.out.println("Por implementar");
                    }
                }
            }

            case 3 -> {
                System.exit(0);
            }
        }
    }
}
