package proyectpoo;
// Clase extendida de la clase base personaje,aplicando herencia
public class tirador extends personaje{
    // Atributos de la subclase con un acesso protected para accederlos dentro del paquete
    protected int tiroExtra;
    protected int critico;
    protected int vampirismo;
    // Constructor de la subclase tirador con el metodo super para agregarle los atributos de la clase base
    public tirador(int nuevoAtaque, int nuevaVida, String nuevaArma,int nuevoRango, int nuevoTiroExtra, int critico, int nuevoRuido, int vampirismo, int nuevoNivel){
        super(nuevoAtaque,nuevaVida,nuevaArma,nuevoRango,nuevoRuido,nuevoNivel);
        this.tiroExtra = nuevoTiroExtra;
        this.critico = critico;
        this.vampirismo = vampirismo;
    }
    // getters para los atributos de esta instancia 
    public int getHabilidad1(){
        return tiroExtra;
    }
    public int getHabilidad2(){
        return critico;
    }
    public int getHabilidad3(){
        return vampirismo;
    }
}
