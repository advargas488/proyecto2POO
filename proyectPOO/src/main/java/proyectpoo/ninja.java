package proyectpoo;

public class ninja extends personaje {
    protected int dañoExtra;
    protected int sangrado;
    protected int danoabsorbido;
<<<<<<< HEAD
    public ninja(int nuevoAtaque, int nuevaVida, String nuevaArma,int nuevoRango, int nuevoDañoExtra, int nuevoSangrado, int nuevoRuido,int danoabsorbido,int nuevoNivel){
        super(nuevoAtaque,nuevaVida,nuevaArma,nuevoRango,nuevoRuido,nuevoNivel);
=======
    
    public ninja(int nuevoAtaque, int nuevaVida, String nuevaArma,int nuevoRango, int nuevoDañoExtra, int nuevoSangrado, int nuevoRuido){
        super(nuevoAtaque,nuevaVida,nuevaArma,nuevoRango,nuevoRuido);
>>>>>>> fe9a266f33ad2db387170d2c734f99dc6735bee1
        this.dañoExtra = nuevoDañoExtra;
        this.sangrado = nuevoSangrado;
        this.danoabsorbido = danoabsorbido;
    }
    public int getHabilidad1(){
        return dañoExtra;
    }
    public int getHabilidad2(){
        return sangrado;
    }
    public int getHabilidad3(){
        return danoabsorbido;
    }
}
