package proyectpoo;

public class explorador extends personaje {
    private int casillasAvanzar;
    private int regeneracionVida;
    public explorador(int nuevoAtaque, int nuevaVida, String nuevaArma,int nuevoRango, int casillas, int nuevaRegeneracionVida){
        super(nuevoAtaque,nuevaVida,nuevaArma,nuevoRango);
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
