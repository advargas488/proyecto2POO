package proyectpoo;
public class tirador extends personaje{
    protected int tiroExtra;
    protected int critico;
    protected int vampirismo;
<<<<<<< HEAD
    public tirador(int nuevoAtaque, int nuevaVida, String nuevaArma,int nuevoRango, int nuevoTiroExtra, int critico, int nuevoRuido, int vampirismo, int nuevoNivel){
        super(nuevoAtaque,nuevaVida,nuevaArma,nuevoRango,nuevoRuido,nuevoNivel);
=======
    
    public tirador(int nuevoAtaque, int nuevaVida, String nuevaArma,int nuevoRango, int nuevoTiroExtra, int critico, int nuevoRuido){
        super(nuevoAtaque,nuevaVida,nuevaArma,nuevoRango,nuevoRuido);
>>>>>>> fe9a266f33ad2db387170d2c734f99dc6735bee1
        this.tiroExtra = nuevoTiroExtra;
        this.critico = critico;
        this.vampirismo = vampirismo;
    }

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
