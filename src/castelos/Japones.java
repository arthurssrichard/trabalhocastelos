package castelos;

public class Japones extends Castelo{
    protected int numSamurai;

    public Japones(int defesa, int pontosVida, int numSamurai){
        super(defesa, pontosVida);
        this.numSamurai = numSamurai;
    }

    public String situacao(){
        return "coroi";
    }
    public boolean ataque(int p){
        return false;
    }
}
