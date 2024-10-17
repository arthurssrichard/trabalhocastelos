//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import castelos.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("oii");
    }

    public static ArrayList<Castelo> init(){
        ArrayList<Castelo> lista = new ArrayList<Castelo>();
        Japones castelo_jap1 = new Japones(2, 2, 15);
        Japones castelo_jap2 = new Japones(2, 2, 15);

        Europeu castelo_eur1 = new Europeu(3, 2, 10);
        Europeu castelo_eur2 = new Europeu(3, 2, 10);

        lista.add(castelo_jap1);
        lista.add(castelo_jap2);
        lista.add(castelo_eur1);
        lista.add(castelo_eur2);

        return lista;
    }

    public static void rodada(){
        ArrayList<Castelo> lista = new ArrayList<Castelo>();
        atacar(lista.get(0), lista);
    }

    public static void atacar(Castelo castelo, ArrayList<Castelo> lista){
        System.out.println("Selecione qual castelo quer atacar: ");
        for(Castelo atacavel : lista){
            System.out.println(atacavel);
        }
    }

}