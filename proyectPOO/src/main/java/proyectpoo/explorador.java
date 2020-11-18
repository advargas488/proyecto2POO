package proyectpoo;

public class explorador extends personaje {
    protected int escudoProtector;
    protected int regeneracionVida;
<<<<<<< HEAD
    protected int vidaextra;
    public explorador(int nuevoAtaque, int nuevaVida, String nuevaArma,int nuevoRango, int escudo, int nuevaRegeneracionVida, int nuevoRuido, int nuevaVidaExtra, int nuevoNivel){
        super(nuevoAtaque,nuevaVida,nuevaArma,nuevoRango,nuevoRuido,nuevoNivel);
        this.escudoProtector = escudo;
=======
    proteced int vidaextra;
    public explorador(int nuevoAtaque, int nuevaVida, String nuevaArma,int nuevoRango, int casillas, int nuevaRegeneracionVida, int nuevoRuido){
        super(nuevoAtaque,nuevaVida,nuevaArma,nuevoRango,nuevoRuido);
        this.casillasAvanzar = casillas;
>>>>>>> fe9a266f33ad2db387170d2c734f99dc6735bee1
        this.regeneracionVida = nuevaRegeneracionVida;
        this.vidaextra = nuevaVidaExtra;
    }
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
