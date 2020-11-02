package proyectpoo;

public class tankZombie extends zombie {
    private int vidaExtra;
    private int armadura;

    
    public tankZombie(int _vida, int _daño, int _vision,int _vidaExtra, int _armadura){
        super(_vida, _daño, _vision);
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
