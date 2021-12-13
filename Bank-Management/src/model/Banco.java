package model;
import java.util.Date;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Date date_atual = new Date();
        Cliente cliente;
        ContaCorrente conta_corrente = null;
        ContaPoupanca conta_poupanca = null;

        while(true) {
            System.out.println("------- Bem-vindo ao Bank system -------\n");
            System.out.println("1 - Acessar conta\n2 - Abrir conta\n3 - Sair\n");
            System.out.print("Opção: ");
            int opcao_escolhida = ler.nextInt();

            switch (opcao_escolhida) {
                case 1 -> {
                    System.out.println("----------- Acessar conta -----------\n");

                    System.out.print("Número da conta: ");
                    long numero_conta = ler.nextLong();

                    while (numero_conta != conta_corrente.getNumero()) {
                        System.out.println("---- Esta conta não existe ----");
                        System.out.print("Número da conta: ");
                        numero_conta = ler.nextLong();
                    }
                    ler.nextLine();
                    System.out.print("Palavra-passe: ");
                    String palavra_passe = ler.nextLine();

                    while (!(palavra_passe.equals(conta_corrente.getPalavra_passe()))) {
                        System.out.println("---- Palavra-passe incorreta ----");
                        System.out.print("Palavra-passe: ");
                        palavra_passe = ler.nextLine();
                    }

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
                            ler.nextLine();
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

                            cliente = new Cliente(cni, nome, apelido, data_nasc, telemovel);

                            long numero_aleatorio = (long) Math.floor(Math.random() * (99999999 - 100000 + 1) + 100000);

                            conta_corrente = new ContaCorrente(numero_aleatorio, date_atual.toString(), 0, true, cliente);

                            System.out.println("\nNúmero de conta: " + conta_corrente.getNumero());

                            System.out.print("Insira palavra-passe: ");
                            String palavra_passe = ler.nextLine();

                            System.out.print("Confirmar palavra-passe: ");
                            String confirmar_palavra_passe = ler.nextLine();

                            while (!(confirmar_palavra_passe.equals(palavra_passe))) {
                                System.out.print("-- Falha na confirmação ---\n\n");
                                System.out.print("Insira palavra-passe: ");
                                palavra_passe = ler.nextLine();

                                System.out.print("Confirmar palavra-passe: ");
                                confirmar_palavra_passe = ler.nextLine();
                            }

                            conta_corrente.setPalavra_passe(palavra_passe);

                            System.out.println("\n---- Sua conta foi criada com sucesso ----\n");
                            System.out.println("Cliente: " + conta_corrente.getCliente().getNome() + " " + conta_corrente.getCliente().getApelido());
                            System.out.println("Conta: " + conta_corrente.getNumero());
                            System.out.println("Status: " + conta_corrente.isStatus_ativo());
                            System.out.println("Data Criação: " + conta_corrente.getData_criacao());
                            System.out.println("Saldo: " + conta_corrente.getSaldo() + " ECV");
                            System.out.println("Palavra-passe: " + conta_corrente.getPalavra_passe());
                        }

                        case 2 -> {
                            System.out.println("----------- Abrir conta -----------\n");
                            System.out.println("Tipo: Conta poupança\n");
                            ler.nextLine();
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

                            cliente = new Cliente(cni, nome, apelido, data_nasc, telemovel);

                            long numero_aleatorio = (long) Math.floor(Math.random() * (99999999 - 100000 + 1) + 100000);

                            conta_poupanca= new ContaPoupanca(numero_aleatorio, date_atual.toString(), 0, true, cliente);


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

    public void formulario(){

    }
}
