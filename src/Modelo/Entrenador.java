package Modelo;

import Modelo.Excepciones.CantidadDeUnidadesInsuficienteException;
import Modelo.Unidad.*;

import java.util.ArrayList;

public class Entrenador {
    private ArrayList<Unidad> unidades_a_entrenar = new ArrayList<>();
    public void entrenar(Unidad unidad) {
        unidad.entrenar();
    }

    public void entrenarUnidades(ArrayList<Unidad> unidades, int cantidad) {
        if (cantidad > unidades.size()) {
            throw new CantidadDeUnidadesInsuficienteException();
        }
        for (int i = 0; i < cantidad; ++i) {
            unidades.get(i).entrenar();
        }
    }

}
