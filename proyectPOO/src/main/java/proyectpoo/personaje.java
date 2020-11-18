package proyectpoo;
// clase base del personaje 
public class personaje {
    
    // atributos protected para el acesso a estos dentro del mismo paquete
    protected int ataque;
    protected int vida;
    protected String arma;
    protected int rango;
    protected int ruido;
    protected int nivel;
    // constructor del personaje base
    public personaje(int nuevoAtaque, int nuevaVida, String nuevaArma, int nuevoRango, int nuevoRuido, int nuevoNivel){
        this.ataque = nuevoAtaque;
        this.vida = nuevaVida;
        this.arma = nuevaArma;
        this.rango = nuevoRango;
        this.rango = nuevoRuido;
        this.nivel = nuevoNivel;
    }
    // getters de los atributos de la clase base
    public int getAtaque(){
        return ataque;
    }
    public int getVida(){
        return vida;
    }
    public String getArma(){
        return arma;
    }
    public int getRango(){
        return rango;
    }
}
