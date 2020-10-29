package proyectpoo;
public class zombie {
    protected int vida;
    protected int daño;
    protected int vision;
    
    public zombie(int vida, int daño, int vision) {
        this.vida = vida;
        this.daño = daño;
        this.vision = vision;
    }
    public int getVida(){
        return vida;
    }
    public int getDaño(){
        return daño;
    }
    public int getVision(){
        return vision;
    }
}
