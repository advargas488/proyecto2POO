package proyectpoo;
// clase base del zombie 
public class zombie {
    // atributos del zombie con una acceso protected para el acesso a estos dentro del mismo paquete
    protected int vida;
    protected int dano;
    protected String item;
    // constructor del zombie base
    public zombie(int _vida, int _dano, String _item) {
        this.vida = _vida;
        this.dano = _dano;
        this.item = _item;
    }
    // getters de los atributos de la clase base
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
