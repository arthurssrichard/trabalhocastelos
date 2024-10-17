package castelos;

public class Europeu extends Castelo{
    protected int numPaladino;

    public Europeu(int defesa, int pontosVida, int numPaladino){
        super(defesa, pontosVida);
        this.numPaladino = numPaladino;
    }

    public String situacao(){
        return "coroi";
    }

    public boolean ataque(int p){
        return false;
    }
}
