package proyectpoo;
// Clase extendida de la clase base zombie,aplicando herencia
public class tankZombie extends zombie {
   // Atributos de la subclase con un acceso protected para accederlos dentro del mismo paquete
    protected int vidaExtra;
    protected int armadura;
    // Constructor de la subclase tankzombie con el metodo super para agregarle los atributos de la clase base
    public tankZombie(int _vida, int _daño, String _item,int _vidaExtra, int _armadura){
        super(_vida, _daño, _item);
        this.armadura = _armadura;
        this.vidaExtra = _vidaExtra;
    }
     // getters para los atributos de esta instancia 
    public int  getVidaExtra(){
        return vidaExtra;
    }
    public int  getArmadura(){
        return armadura;
    }
}
