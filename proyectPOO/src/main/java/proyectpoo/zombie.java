package proyectpoo;
public class zombie {
    protected int vida;
    protected int dano;
    protected String item;
    
    public zombie(int _vida, int _dano, String _item) {
        this.vida = _vida;
        this.dano = _dano;
        this.item = _item;
    }
    public int getVida(){
        return vida;
    }
    public int getDano(){
        return dano;
    }
    public String getItem(){
        return item;
    }
}
