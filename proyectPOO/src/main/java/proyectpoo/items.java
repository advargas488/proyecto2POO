package proyectpoo;

public class items {
    private String Nombre;
    private int Vida;
    private int Velocidad;
    private int Vision;

    public items (String _nombre, int _vida, int _velocidad, int _vision){
        this.Nombre = _nombre;
        this.Vida = _vida;
        this.Velocidad = _velocidad;
        this.Vision = _vision;
    }
    public String getNombre(){
        return Nombre;
    }
    public int getVida(){
        return Vida;
    }
    public int getVelocidad(){
        return Velocidad;
    }
    public int getVision(){
        return Vision;
    }
}
