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

    public void eliminarUnidades() {
        int unidades_a_eliminar = 2;
        int caballeros_eliminados = eliminarCaballeros();
        unidades_a_eliminar -= caballeros_eliminados;
        if (unidades_a_eliminar == 0) return;
        int arqueros_eliminados = eliminarArqueros(unidades_a_eliminar);
        unidades_a_eliminar -= arqueros_eliminados;
        if (unidades_a_eliminar == 0) return;
        eliminarPiqueros(unidades_a_eliminar);
    }

    private void eliminarPiqueros(int unidades_a_eliminar) {
        int cant_iteraciones = min(unidades_a_eliminar, piqueros.size());
        for (int i = 0; i < cant_iteraciones; ++i) {
            piqueros.remove(0);
        }
    }

    private int eliminarArqueros(int unidades_a_eliminar) {
        int cant_iteraciones = min(unidades_a_eliminar, arqueros.size());
        for (int i = 0; i < cant_iteraciones; ++i) {
            arqueros.remove(0);
        }
        return cant_iteraciones;
    }

    private int eliminarCaballeros() {
        int cant_iteraciones = min(2, caballeros.size());
        for (int i = 0; i < cant_iteraciones; ++i) {
            caballeros.remove(0);
        }
        return cant_iteraciones;
    }
}
