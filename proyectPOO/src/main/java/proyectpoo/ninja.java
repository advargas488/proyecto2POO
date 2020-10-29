package proyectpoo;

public class ninja extends personaje {
    private int dañoExtra;
    private int sangrado;
    
    public ninja(int nuevoAtaque, int nuevaVida, String nuevaArma,int nuevoRango, int nuevoDañoExtra, int nuevoSangrado){
        super(nuevoAtaque,nuevaVida,nuevaArma,nuevoRango);
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
