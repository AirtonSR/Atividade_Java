package com.mycompany.aula11_d;

public class Aula11_d {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();
        Tecnico t1 =new Tecnico();
        
        a1.setCurso("Informatica");
        a1.setMatricula(1232);
        a1.setNome("Jose Airton");
        a1.setIdade(21);
        a1.setSexo("M");
        
        p1.setNome("Francisco");
        p1.setIdade(45);
        p1.setSexo("M");
        p1.setEspecialidade("Tecnico em informatica");
        p1.setSalario(3234f);
        
        p1.status();
        p1.receberAumento(500f);
        p1.status();
        
        t1.setNome("Airton");
        t1.setIdade(21);
        t1.setMatricula(312312);
        t1.status();
    }
}
