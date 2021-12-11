package model;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(long numero, String data_criacao, float saldo, boolean status_ativo, Cliente cliente) {
        super(numero, data_criacao, saldo, status_ativo, cliente);
    }
}
