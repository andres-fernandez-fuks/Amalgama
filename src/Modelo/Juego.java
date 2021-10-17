package Modelo;

import Modelo.Ejercito.*;
import java.util.HashMap;

public class Juego {
    private final HashMap<Integer, Ejercito> ejercitos = new HashMap<>();
    public int cantidadDeEjercitos() {return ejercitos.size(); }

    public int agregarEjercito(Ejercito nuevo_ejercito) {
        int id_ejercito = cantidadDeEjercitos()+1;
        ejercitos.put(id_ejercito, nuevo_ejercito);
        return id_ejercito;
    }

    public int crearEjercitoBizantino() {
        Ejercito nuevo_ejercito = new EjercitoBizantino();
        return agregarEjercito(nuevo_ejercito);
    }

    public int crearEjercitoChino() {
        Ejercito nuevo_ejercito = new EjercitoChino();
        return agregarEjercito(nuevo_ejercito);
    }

    public int crearEjercitoIngles() {
        Ejercito nuevo_ejercito = new EjercitoIngles();
        return agregarEjercito(nuevo_ejercito);
    }

    public Ejercito getEjercitoById(int id_ejercito) {
        return ejercitos.get(id_ejercito);
    }
}
