package proyectpoo;

public class ninja extends personaje {
    protected int dañoExtra;
    protected int sangrado;
    protected int danoabsorbido;
    
    public ninja(int nuevoAtaque, int nuevaVida, String nuevaArma,int nuevoRango, int nuevoDañoExtra, int nuevoSangrado, int nuevoRuido){
        super(nuevoAtaque,nuevaVida,nuevaArma,nuevoRango,nuevoRuido);
        this.dañoExtra = nuevoDañoExtra;
        this.sangrado = nuevoSangrado;
    }
    public int getHabilidad1(){
        return dañoExtra;
    }
    public int getHabilidad2(){
        return sangrado;
    }
}
