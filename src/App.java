import Entidades.Lutadores;
import Entidades.Lutas;
public class App {
    public static void main(String[] args) throws Exception {
        Lutadores[] l = new Lutadores[6];

        l[0] = new Lutadores("Pretty Boy", "França", 31, 1.75, 68.9, 11, 1, 2);
        l[1] = new Lutadores("PutsScript", "Brasil", 29, 1.68, 57.9, 14, 2, 3);
        l[2] = new Lutadores("SnapShadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        l[3] = new Lutadores("Dead Code", "Australia", 28, 1.93, 81.9, 13, 0, 2);
        l[4] = new Lutadores("Ufocobol" , "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        l[5] = new Lutadores("Nerdaard", "EUA", 30, 1.81, 105.7, 12, 2, 4);     

        l[0].apresentar();
        l[0].getCategoria();
        l[0].perderLuta();
        l[0].status(); 

        l[3].apresentar();
        l[3].getCategoria();
        l[3].ganharLuta();
        l[3].status();

        l[5].apresentar();
        l[5].getCategoria();
        l[5].empatarLuta();
        l[5].status();

        Lutas UEC01 = new Lutas();
        UEC01.marcarLuta(l[5], l[4]);
        UEC01.Lutar();

    }
}
