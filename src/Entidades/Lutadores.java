package Entidades;

public class Lutadores {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutadores(String no, String na, int id, double al, double pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;

    }
    public void apresentar(){
        System.out.println(" ");
        System.out.println("NESSA NOITE, TEMOS A PRESENÇA DO LUTADOR: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Pesando: " + this.getPeso() + "kg");
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println(" ");

    }

    public void status(){
        System.out.println("Nome do lutador é " + this.getNome() + "!");
        System.out.println("é um peso: " + this.getCategoria());
        System.out.println(this.getVitorias() + " Vitorias");
        System.out.println(this.getDerrotas() + " Derrotas");
        System.out.println(this.getEmpates() + " Empates");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    public void setNome(String no){
        this.nome = no;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNacionalidade(String na){
        this.nacionalidade = na;
    }

    public String getNacionalidade(){
        return this.nacionalidade;
    }

    public void setIdade(int id){
        this.idade = id;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setAltura(double alt){
        this.altura = alt;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setPeso(double pe){
        this.peso = pe;
        this.setCategoria();
    }

    public double getPeso(){
        return this.peso;
    }

    private void setCategoria(){
        if(this.peso < 52.2){
            this.categoria = "Invalido";
        } else if(peso <= 70.3) {
            this.categoria = "Leve";
        } else if( peso <= 83.9){
            this.categoria = "Medio";
        } else if( peso <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }
    }

    public String getCategoria(){
        return this.categoria;
    }

    public void setVitorias(int vi){
        this.vitorias = vi;
    }

    public int getVitorias(){
        return this.vitorias;
    }

    public void setDerrotas(int de){
        this.derrotas = de;
    }

    public int getDerrotas(){
        return this.derrotas;
    }

    public void setEmpates(int em){
        this.empates = em;
    }

    public int getEmpates(){
        return this.empates;
    }

}
