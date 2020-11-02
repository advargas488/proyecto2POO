package proyectpoo;

public class flashZombie extends zombie {
    private int velocidad;
    private int regeneracion;

    public flashZombie(int _vida, int _daño, int _vision, int _velocidad,int _regeneracion) {
        super(_vida, _daño, _vision);
        this.velocidad = _velocidad;
        this.regeneracion = _regeneracion;
    }
    public int  getVelocidad(){
        return velocidad;
    }
    public int  getRegeneracion(){
        return regeneracion;
    }
}

