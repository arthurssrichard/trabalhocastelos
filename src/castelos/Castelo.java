package castelos;

public abstract class Castelo {
    protected int defesa;
    protected int pontosVida;
    protected String nome;

    public Castelo(int defesa, int pontosVida){
        this.defesa = defesa;
        this.pontosVida = pontosVida;
    }

    public abstract String situacao();
    public abstract boolean ataque(int p);
}
