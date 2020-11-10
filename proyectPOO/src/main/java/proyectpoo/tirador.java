package proyectpoo;
public class tirador extends personaje{
    private int tiroExtra;
    private int critico;
    
    public tirador(int nuevoAtaque, int nuevaVida, String nuevaArma,int nuevoRango, int nuevoTiroExtra, int critico, int nuevoRuido){
        super(nuevoAtaque,nuevaVida,nuevaArma,nuevoRango,nuevoRuido);
        this.tiroExtra = nuevoTiroExtra;
        
    }
    public int getHabilidad1(){
        return tiroExtra;
    }
    public int getHabilidad2(){
        return critico;
    }
}
