package clases;

public class Gato extends Mascota {

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void sonido() {
        System.out.println(nombre + " Maullando...");
    }

}
