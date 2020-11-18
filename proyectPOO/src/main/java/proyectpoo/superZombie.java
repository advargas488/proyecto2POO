package proyectpoo;

// Clase extendida de la clase base zombie,aplicando herencia
public class superZombie extends zombie{
    // Atributos de la subclase con un acceso protected para accederlos dentro del paquete
    protected int vidaExtra;
    protected int fuerza;
    // Constructor de la subclase superzombie con el metodo super para agregarle los atributos de la clase base
    public superZombie(int _vida, int _daño, String _item, int _vidaExtra,int _fuerza) {
        super(_vida, _daño, _item);
        this.vidaExtra = _vidaExtra;
        this.fuerza = _fuerza;
    }
    // getters para los atributos de esta instancia 
    public int  getVidaExtra(){
        return vidaExtra;
    }
    public int  getFuerza(){
        return fuerza;
    }
}
