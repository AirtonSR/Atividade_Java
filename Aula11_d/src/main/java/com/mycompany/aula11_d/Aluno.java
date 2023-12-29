package com.mycompany.aula11_d;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    private float mensalidade = 500;
    
    public void pagarMensalidade(float pagar){
        System.out.println("|-------------------------------------|");
        System.out.println("| Sua mensalidade ta no valor de " + this.mensalidade + "|");
        System.out.println("|-------------------------------------|");
        System.out.println("\n");
        if(pagar == 500){
            System.out.println("Pagamento realizado com sucesso");
            this.mensalidade -= pagar;
        }else if(pagar > 500){
            System.out.println("Pagamento ta acima da sua mensalidade que esta no valor da mensalidade é " + this.mensalidade);
        }else if (pagar < 500){
            System.out.println("O valor da sua mensalidade é " + this.mensalidade + "e você quer paga " + pagar);
        }else{
            System.out.println("Erro!!!");
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }
    
    public void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Curso: " + this.getCurso());
        System.out.println("idade: " + this.getIdade());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Sexo: " + this.sexo());
    }
}
