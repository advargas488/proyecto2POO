package proyectpoo;
public class zombie {
    private int vida;
    private int dano;
    private int vision;
    
    public zombie(int _vida, int _dano, int _vision) {
        this.vida = _vida;
        this.dano = _dano;
        this.vision = _vision;
    }
    public int getVida(){
        return vida;
    }
    public int getDano(){
        return dano;
    }
    public int getVision(){
        return vision;
    }
}
