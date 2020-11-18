package proyectpoo;
public class tirador extends personaje{
    protected int tiroExtra;
    protected int critico;
    protected int vampirismo;

    public tirador(int nuevoAtaque, int nuevaVida, String nuevaArma,int nuevoRango, int nuevoTiroExtra, int critico, int nuevoRuido, int vampirismo, int nuevoNivel){
        super(nuevoAtaque,nuevaVida,nuevaArma,nuevoRango,nuevoRuido,nuevoNivel);
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
