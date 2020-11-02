package proyectpoo;

public class superZombie extends zombie{
    private int vidaExtra;
    private int fuerza;
    public superZombie(int _vida, int _daño, int _vision, int _vidaExtra,int _fuerza) {
        super(_vida, _daño, _vision);
        this.vidaExtra = _vidaExtra;
        this.fuerza = _fuerza;
    }
    public int  getVidaExtra(){
        return vidaExtra;
    }
    public int  getFuerza(){
        return fuerza;
    }
}
