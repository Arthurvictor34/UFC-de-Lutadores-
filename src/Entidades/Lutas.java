package Entidades;

public class Lutas {
    private Lutadores desafiado;
    private Lutadores desafiante;
    private int rounds;
    private boolean aprovado;

    public void marcarLuta( Lutadores l1, Lutadores l2){
        if((l1.getCategoria().equals(l2.getCategoria()) && l1 != l2)){
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void Lutar(){
        if(this.aprovado == true){
            System.out.println("O DESAFIANDO DA NOITE!!!");
            this.desafiado.apresentar();
            System.out.println("O DESAFIANTE DA NOITE!!!");
            this.desafiante.apresentar();

            int vencedor = (int)(Math.random() * 3);
            System.out.println("===== RESULTADO DA LUTA =====");
            switch(vencedor){
                case 0:
                System.out.println("Empatou!"); 
                this.desafiado.empatarLuta();;
                this.desafiante.empatarLuta();
                break;

                case 1:
                System.out.println("Ganhou a luta: " + this.desafiado.getNome());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                System.out.println("Atualização do Status do Vencendor!");
                this.desafiado.status();
                break;

                case 2:
                System.out.println("Ganhou a luta : " + this.desafiante.getNome());
                this.desafiado.perderLuta();
                this.desafiante.ganharLuta();
                System.out.println("Atualização do Status do Vencendor!");
                this.desafiante.status();
                break;

                default:
                System.out.println("Resultado invalido! ");
            }
        } else {
            System.out.println("Luta não pode ocorre!");
        }
    }

    public void setDesafiado(Lutadores novoDesafiado){
        this.desafiado = novoDesafiado;
    }

    public Lutadores getDesafiado(){
        return this.desafiado;
    }

    public void setDesafiante(Lutadores novoDesafiante){
        this.desafiante = novoDesafiante;
    }

    public Lutadores getDesafiante(){
        return this.desafiante;
    }

    public void setRounds(int ro){
        this.rounds = ro;
    }

    public int getRounds(){
        return this.rounds;
    }

    public void setAprovado(boolean ap){
        this.aprovado = ap;
    }

    public boolean getAprovado(){
        return this.aprovado;
    }
}
