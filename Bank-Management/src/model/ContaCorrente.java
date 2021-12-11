package model;

public class ContaCorrente extends Conta{


    public ContaCorrente(long numero, String data_criacao, float saldo, boolean status_ativo, Cliente cliente) {
        this.numero = numero;
        this.data_criacao  = data_criacao;
        this.saldo = saldo;
        this.status_ativo = status_ativo;
    }


}
