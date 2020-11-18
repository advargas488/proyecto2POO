package proyectpoo;

public class items {
    private int Vida;
    private int dano;

    public items (int _vida, int _dano){
        this.Vida = _vida;
        this.dano = _dano;
    }
    public int getVida(){
        return Vida;
    }
    public int getDano(){
        return dano;
    }
}
