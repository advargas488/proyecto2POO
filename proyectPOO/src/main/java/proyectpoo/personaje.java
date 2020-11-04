package proyectpoo;
public class personaje {
    protected int ataque;
    protected int vida;
    protected String arma;
    protected int rango;
    
    
    public personaje(int nuevoAtaque, int nuevaVida, String nuevaArma, int nuevoRango){
        this.ataque = nuevoAtaque;
        this.vida = nuevaVida;
        this.arma = nuevaArma;
        this.rango = nuevoRango;
    }
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
