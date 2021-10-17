package Modelo;
import Modelo.Unidad.*;

import java.util.ArrayList;

import static java.lang.Math.min;

public class Eliminador {
    private ArrayList<UnidadPiquero> piqueros;
    private ArrayList<UnidadArquero> arqueros;
    private ArrayList<UnidadCaballero> caballeros;

    public Eliminador(ArrayList<UnidadPiquero> _piqueros,
                      ArrayList<UnidadArquero> _arqueros,
                      ArrayList<UnidadCaballero> _caballeros) {
        piqueros = _piqueros;
        arqueros = _arqueros;
        caballeros = _caballeros;
    }

    public void eliminarUnidades(int cantidad_a_eliminar) {
        int caballeros_eliminados = eliminarCaballeros(cantidad_a_eliminar);
        cantidad_a_eliminar -= caballeros_eliminados;
        if (cantidad_a_eliminar == 0) return;
        int arqueros_eliminados = eliminarArqueros(cantidad_a_eliminar);
        cantidad_a_eliminar -= arqueros_eliminados;
        if (cantidad_a_eliminar == 0) return;
        eliminarPiqueros(cantidad_a_eliminar);
    }

    private void eliminarPiqueros(int cantidad_a_eliminar) {
        int cant_iteraciones = min(cantidad_a_eliminar, piqueros.size());
        for (int i = 0; i < cant_iteraciones; ++i) {
            piqueros.remove(0);
        }
    }

    private int eliminarArqueros(int cantidad_a_eliminar) {
        int cant_iteraciones = min(cantidad_a_eliminar, arqueros.size());
        for (int i = 0; i < cant_iteraciones; ++i) {
            arqueros.remove(0);
        }
        return cant_iteraciones;
    }

    private int eliminarCaballeros(int cantidad_a_eliminar) {
        int cant_iteraciones = min(cantidad_a_eliminar, caballeros.size());
        for (int i = 0; i < cant_iteraciones; ++i) {
            caballeros.remove(0);
        }
        return cant_iteraciones;
    }
}
