package proyectpoo;

// Clase extendida de la clase base zombie,aplicando herencia
public class flashZombie extends zombie {
    // Atributos de la subclase con un acesso protected para accederlos dentro del paquete
    protected int dañodoble;
    protected int regeneracion;
    // Constructor de la subclase flashzombie con el metodo super para agregarle los atributos de la clase base
    public flashZombie(int _vida, int _daño, String _item, int _dañodoble,int _regeneracion) {
        super(_vida, _daño, _item);
        this.dañodoble = _dañodoble;
        this.regeneracion = _regeneracion;
    }
    // getters para los atributos de esta instancia 
    public int  getDañoDoble(){
        return dañodoble;
    }
    public int  getRegeneracion(){
        return regeneracion;
    }
}   

