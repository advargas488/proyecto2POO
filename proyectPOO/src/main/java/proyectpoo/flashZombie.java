package proyectpoo;

public class flashZombie extends zombie {
    protected int dañodoble;
    protected int regeneracion;

    public flashZombie(int _vida, int _daño, String _item, int _dañodoble,int _regeneracion) {
        super(_vida, _daño, _item);
        this.dañodoble = _dañodoble;
        this.regeneracion = _regeneracion;
    }
    public int  getDañoDoble(){
        return dañodoble;
    }
    public int  getRegeneracion(){
        return regeneracion;
    }
}   

