package proyectpoo;

// Clase extendida de la clase base personaje,aplicando herencia
public class ninja extends personaje {
    protected int dañoExtra;
    protected int sangrado;
    protected int danoabsorbido;
  // Constructor de la subclase ninja con el metodo super para agregarle los atributos de la clase base personaje
    public ninja(int nuevoAtaque, int nuevaVida, String nuevaArma,int nuevoRango, int nuevoDañoExtra, int nuevoSangrado, int nuevoRuido,int danoabsorbido,int nuevoNivel){
        super(nuevoAtaque,nuevaVida,nuevaArma,nuevoRango,nuevoRuido,nuevoNivel);
        this.dañoExtra = nuevoDañoExtra;
        this.sangrado = nuevoSangrado;
        this.danoabsorbido = danoabsorbido;
    }
    // getters para los atributos de esta instancia 
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
