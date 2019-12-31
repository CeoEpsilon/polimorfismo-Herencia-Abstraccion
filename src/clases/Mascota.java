package clases;

public abstract class Mascota {

    protected String nombre;

    public abstract void sonido();

    public Mascota(String nombre) {
        this.nombre = nombre;
    }
}
