package com.mycompany.aula11_d;

public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }
    
    @Override
    public void pagarMensalidade(float pagar){
        System.out.println("|-------------------------------------|");
        System.out.println("| Sua mensalidade ta no valor de " + this.getMensalidade() + "|");
        System.out.println("|-------------------------------------|");
        System.out.println("\n");
        if(pagar == 500){
            System.out.println("Pagamento realizado com sucesso");
        }else if(pagar > 500){
            System.out.println("Pagamento ta acima da sua mensalidade que esta no valor da mensalidade é " + this.getMensalidade());
        }else if (pagar < 500){
            System.out.println("O valor da sua mensalidade é " + this.getMensalidade() + "e você quer paga " + pagar);
        }else{
            System.out.println("Erro!!!");
        }
    }
}   
    
