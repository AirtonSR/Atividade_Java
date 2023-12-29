package com.mycompany.aula07_d;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empate;

    public Lutador(String no, String na, int i,float al, float pe, int vi, int de, int em) {
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(i);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitoria(vi);
        this.setDerrota(de);
        this.setEmpate(em);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getIdade() {
        return idade + " anos";
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPeso() {
        return peso + " KG";
    }

    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Invalido";
        }else if(this.peso <= 70.3){
            this.categoria = "Peso Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Peso médio";
        }else if(this.peso <= 120.2){
            this.categoria = "Peso Pesado";
        }else{
            this.categoria = "Peso Invalido";
        }
        
    }
    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }


    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public void aprensentar(){
        System.out.println("-----------------Apresentação------------------");
        System.out.println("Lutador " + this.getNome());
        System.out.println("Pais " + this.getNacionalidade());
        System.out.println("com " + this.getIdade());
        System.out.println("Com a altura de " + this.getAltura());
        System.out.println("Pesando seus " + this.getPeso());
        System.out.println("Ganhou: " + this.getVitoria());
        System.out.println("Perdeu: " + this.getDerrota());
        System.out.println("Empatou: " + this.getEmpate());
        
    }
    public void status(){
        System.out.println("------------Status---------------");
        System.out.println(this.getNome());
        System.out.println("Categoria de " + this.getCategoria());
        System.out.println(this.getVitoria() + " Vitorias");
        System.out.println(this.getDerrota() + " Derrotas");
        System.out.println(this.getEmpate() + " Empates");
    }
    public void ganhaLuta(){
        this.setVitoria(this.getVitoria() + 1);
    }
    public void perdeLuta(){
        this.setDerrota(this.getDerrota() + 1);
    }
    public void empateLuta(){
        this.setEmpate(this.getEmpate()+ 1);
    }
}
