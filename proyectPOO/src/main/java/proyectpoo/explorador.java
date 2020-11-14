package proyectpoo;

public class explorador extends personaje {
    protected int casillasAvanzar;
    protected int regeneracionVida;
    public explorador(int nuevoAtaque, int nuevaVida, String nuevaArma,int nuevoRango, int casillas, int nuevaRegeneracionVida, int nuevoRuido){
        super(nuevoAtaque,nuevaVida,nuevaArma,nuevoRango,nuevoRuido);
        this.casillasAvanzar = casillas;
        this.regeneracionVida = nuevaRegeneracionVida;
    }
    public int getHabilidad1(){
        return casillasAvanzar;
    }
    public int getHabilidad2(){
        return regeneracionVida;
        
    }
}
