package com.mycompany.aula05_d;

public class Aula05_d {

    public static void main(String[] args) {
        Conta p1 = new Conta();
        p1.setNumConta(1111);
        p1.abrirConta("CC");
        p1.setTitular("Airton");
        p1.depositar(100);
        p1.sacar(150);
        p1.fechaConta();
        p1.statusAtual();
    }
}
