package castelos;

public class Europeu extends Castelo{
    protected int numPaladino;

    public String situacao(){
        return "coroi";
    }

    public boolean ataque(int p){
        return false;
    }
}
