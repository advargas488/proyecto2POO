package proyectpoo;

public class ninja extends personaje {
    protected int dañoExtra;
    protected int sangrado;
    protected int danoabsorbido;

    public ninja(int nuevoAtaque, int nuevaVida, String nuevaArma,int nuevoRango, int nuevoDañoExtra, int nuevoSangrado, int nuevoRuido,int danoabsorbido,int nuevoNivel){
        super(nuevoAtaque,nuevaVida,nuevaArma,nuevoRango,nuevoRuido,nuevoNivel);
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
