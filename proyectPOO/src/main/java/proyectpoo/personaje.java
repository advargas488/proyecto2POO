package proyectpoo;
public class personaje {
    protected int ataque;
    protected int vida;
    protected String arma;
    protected int rango;
    protected int ruido;
    
    public personaje(int nuevoAtaque, int nuevaVida, String nuevaArma, int nuevoRango, int nuevoRuido){
        this.ataque = nuevoAtaque;
        this.vida = nuevaVida;
        this.arma = nuevaArma;
        this.rango = nuevoRango;
        this.rango = nuevoRuido;
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
