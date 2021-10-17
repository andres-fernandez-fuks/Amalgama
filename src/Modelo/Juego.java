package Modelo;

import Modelo.Ejercito.*;
import java.util.HashMap;

public class Juego {
    private final HashMap<Integer, Ejercito> ejercitos = new HashMap<>();
    public int cantidadDeEjercitos() {return ejercitos.size(); }

    public int agregarEjercito(Ejercito nuevo_ejercito) {
        int id_ejercito = nuevo_ejercito.getId();
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

    public void entrenarPiquerosParaEjercito(int id_ejercito, int cantidad) {
        Ejercito ejercito = ejercitos.get(id_ejercito);
        ejercito.entrenarPiqueros(cantidad);
    }

    public void entrenarArquerosParaEjercito(int id_ejercito, int cantidad) {
        Ejercito ejercito = ejercitos.get(id_ejercito);
        ejercito.entrenarArqueros(cantidad);
    }

    public void entrenarCaballerosParaEjercito(int id_ejercito, int cantidad) {
        Ejercito ejercito = ejercitos.get(id_ejercito);
        ejercito.entrenarCaballeros(cantidad);
    }

    public void transformarPiquerosParaEjercito(int id_ejercito, int cantidad) {
        Ejercito ejercito = ejercitos.get(id_ejercito);
        ejercito.transformarPiqueros(cantidad);
    }

    public void transformarArquerosParaEjercito(int id_ejercito, int cantidad) {
        Ejercito ejercito = ejercitos.get(id_ejercito);
        ejercito.transformarArqueros(cantidad);
    }

    public void transformarCaballerosParaEjercito(int id_ejercito, int cantidad) {
        Ejercito ejercito = ejercitos.get(id_ejercito);
        ejercito.transformarCaballeros(cantidad);
    }

    public void enfrentarEjercitos(int id_ejercito1, int id_ejercito2) {
        Ejercito ejercito1 = ejercitos.get(id_ejercito1);
        Ejercito ejercito2 = ejercitos.get(id_ejercito2);
        new Batalla(ejercito1, ejercito2);
    }

}
