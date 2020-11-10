package proyectpoo;

public class ninja extends personaje {
    private int dañoExtra;
    private int sangrado;
    
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
