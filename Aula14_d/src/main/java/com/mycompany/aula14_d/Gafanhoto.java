package com.mycompany.aula14_d;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistindo;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistindo = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAula() {
        return totAssistindo;
    }

    public void setTotAula(int totAula) {
        this.totAssistindo = totAula;
    }

    @Override
    public String toString() {
        return "\n"+ super.toString() + "\nGafanhoto { login = " + login + ", totAssistindo = " + totAssistindo + '}';
    }
    
    
}
