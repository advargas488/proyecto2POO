package proyectpoo;
public class tirador extends personaje{
    private int tiroExtra;
    private int critico;
    
    public tirador(int nuevoAtaque, int nuevaVida, String nuevaArma,int nuevoRango, int nuevoTiroExtra, int critico){
        super(nuevoAtaque,nuevaVida,nuevaArma,nuevoRango);
        this.tiroExtra = nuevoTiroExtra;
        
    }
    public int getHabilidad1(){
        return tiroExtra;
    }
    public int getHabilidad2(){
        return critico;
    }
}
