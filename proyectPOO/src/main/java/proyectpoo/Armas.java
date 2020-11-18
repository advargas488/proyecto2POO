package proyectpoo;

public class Armas {
    private String nombre;
    protected int ataque;
    protected int nivelRuido;
    protected int rango;
    public Armas (String _nombre, int _ataque, int _nivelruido, int _rango){
        this.nombre = _nombre;
        this.ataque = _ataque;
        this.nivelRuido = _nivelruido;
        this.rango = _rango;
    }
    public String getNombre(){
        return nombre;
    }
    public int getAtaque(){
        return ataque;
    }
    public int getNivelRuido(){
        return nivelRuido;
    }
    public int getRango(){
        return rango;
    }


}
