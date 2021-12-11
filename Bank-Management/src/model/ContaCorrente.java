package model;

public class ContaCorrente extends Conta {
    public ContaCorrente(long numero, String data_criacao, float saldo, boolean status_ativo, Cliente cliente) {
        super(numero, data_criacao, saldo, status_ativo, cliente);
    }
}
