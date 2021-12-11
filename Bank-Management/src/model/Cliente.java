package model;

public class Cliente {

    private String CNI;
    private String nome;
    private String apelido;
    private String data_nasc;
    private String telemovel;


    public Cliente(){}

    public Cliente(String CNI, String nome, String apelido, String data_nasc, String telemovel){
        this.CNI = CNI;
        this.nome = nome;
        this.apelido = apelido;
        this.data_nasc = data_nasc;
        this.telemovel = telemovel;
    }

    public String getCNI() {
        return CNI;
    }

    public void setCNI(String CNI) {
        this.CNI = CNI;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getTelemovel() {
        return telemovel;
    }

    public void setTelemovel(String telemovel) {
        this.telemovel = telemovel;
    }
}
