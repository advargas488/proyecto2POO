package proyectpoo;

// atributos de los items que dropean los zombies
public class items {
    private int Vida;
    private int dano;
    
    // constructor de la clase 
    public items (int _vida, int _dano){
        this.Vida = _vida;
        this.dano = _dano;
    }
    // getters de los atributos de la clase
    public int getVida(){
        return Vida;
    }
    public int getDano(){
        return dano;
    }
}
