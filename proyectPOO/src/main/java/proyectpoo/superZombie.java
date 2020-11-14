package proyectpoo;

public class superZombie extends zombie{
    protected int vidaExtra;
    protected int fuerza;
    public superZombie(int _vida, int _daño, String _item, int _vidaExtra,int _fuerza) {
        super(_vida, _daño, _item);
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
