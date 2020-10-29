package proyectpoo;

public class tankZombie extends zombie {
    private int vidaExtra;
    private int armadura;
    private int aliado;
    
    public tankZombie(int vida, int daño, int vision,int vidaExtra, int armadura, int aliado){
        super(vida,daño,vision);
        this.aliado = aliado;
        this.armadura = armadura;
        this.vidaExtra = vidaExtra;
    }
    public int  getVidaExtra(){
        return vidaExtra;
    }
    public int  getArmadura(){
        return vidaExtra;
    }
    public int  getAliado(){
        return vidaExtra;
    }
}
