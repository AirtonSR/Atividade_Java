package com.mycompany.aula10_h;

public class Aula10_h {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno a1 = new Aluno();
        Professor p2 = new Professor();
        Funcionario f1 = new Funcionario();
        
        a1.setNome("Airton");
        a1.setIdade(21);
        a1.setSexo("Masculino");
        
        a1.status();
        a1.fazerAniversario();
        a1.status();
    }
}
