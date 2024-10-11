package castelos;

public class Japones extends Castelo{
    protected int numSamurai;

    public String situacao(){
        return "coroi";
    }
    public boolean ataque(int p){
        return false;
    }
}
