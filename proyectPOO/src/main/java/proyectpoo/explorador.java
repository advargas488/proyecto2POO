package proyectpoo;

// Clase extendida de la clase base personaje,aplicando herencia
public class explorador extends personaje {
    // atributos
    protected int escudoProtector;
    protected int regeneracionVida;
    protected int vidaextra;
    // Constructor y el super para declarar los atributos de la clase base
    public explorador(int nuevoAtaque, int nuevaVida, String nuevaArma,int nuevoRango, int escudo, int nuevaRegeneracionVida, int nuevoRuido, int nuevaVidaExtra, int nuevoNivel){
        super(nuevoAtaque,nuevaVida,nuevaArma,nuevoRango,nuevoRuido,nuevoNivel);
        this.escudoProtector = escudo;
        this.regeneracionVida = nuevaRegeneracionVida;
        this.vidaextra = nuevaVidaExtra;
    }
    // getters de los atributos del objeto
    public int getHabilidad1(){
        return escudoProtector;
    }
    public int getHabilidad2(){
        return regeneracionVida;
    }
    public int getHabilidad3(){
        return vidaextra;
    }
}
