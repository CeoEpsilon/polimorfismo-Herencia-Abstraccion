package clases;

public class Perro extends Mascota {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void sonido() {
        System.out.println(nombre + " Ladrando...");
    }

}
