package proyectpoo;

public class tankZombie extends zombie {
    protected int vidaExtra;
    protected int armadura;
    
    public tankZombie(int _vida, int _daño, String _item,int _vidaExtra, int _armadura){
        super(_vida, _daño, _item);
        this.armadura = _armadura;
        this.vidaExtra = _vidaExtra;
    }
    public int  getVidaExtra(){
        return vidaExtra;
    }
    public int  getArmadura(){
        return armadura;
    }
}
