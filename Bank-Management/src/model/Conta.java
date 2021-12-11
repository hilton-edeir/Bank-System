package model;

public abstract class Conta {

    protected long numero;
    protected float saldo;
    protected String data_criacao;
    protected boolean status_ativo;
    Cliente cliente = new Cliente();

    public void depositar(float quantia){
        this.saldo += quantia;

        System.out.println("\n-----------------------------------------------");
        System.out.println("Depósito feito com sucesso\nSaldo total: " + this.saldo);
    }

    public void levantar_(float quantia){
        this.saldo -= quantia;

        System.out.println("\n-----------------------------------------------");
        System.out.println("Levantou "+quantia+"\nSaldo total: " + this.saldo);
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(String data_criacao) {
        this.data_criacao = data_criacao;
    }

    public boolean isStatus_ativo() {
        return status_ativo;
    }

    public void setStatus_ativo(boolean status_ativo) {
        this.status_ativo = status_ativo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
