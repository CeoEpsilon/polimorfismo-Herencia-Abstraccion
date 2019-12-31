package main;

import clases.Perro;
import clases.Gato;
import clases.Mascota;

public class Main {

    public static void main(String[] args) {
        Mascota Dog = new Perro("Perro");
        Dog.sonido();
        Mascota Cat = new Gato("Gato");
        Cat.sonido();
    }

}
