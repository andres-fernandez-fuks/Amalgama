package Modelo;

import Modelo.Excepciones.OroInsuficienteException;
import Modelo.Unidad.*;

public class ManejadorDeOro {
    private int oro_disponible = 1000;

    public int oroDisponible() {
        return oro_disponible;
    }

    public void ingresarOro(int cantidad) {
        oro_disponible += cantidad;
    }

    public void afrontarGastoDeEntrenamiento(UnidadPiquero piquero, int cantidad) {
        int gasto_total = cantidad * 10;
        if (gasto_total > oro_disponible)
            throw new OroInsuficienteException();
        oro_disponible -= gasto_total;
    }

    public void afrontarGastoDeEntrenamiento(UnidadArquero arquero, int cantidad) {
        int gasto_total = cantidad * 20;
        if (gasto_total > oro_disponible)
            throw new OroInsuficienteException();
        oro_disponible -= gasto_total;
    }

    public void afrontarGastoDeEntrenamiento(UnidadCaballero caballero, int cantidad) {
        int gasto_total = cantidad * 30;
        if (gasto_total > oro_disponible)
            throw new OroInsuficienteException();
        oro_disponible -= gasto_total;
    }

    public void afrontarGastoDeTransformacion(UnidadPiquero piquero, int cantidad) {
        int gasto_total = cantidad * 30;
        if (gasto_total > oro_disponible)
            throw new OroInsuficienteException();
        oro_disponible -= gasto_total;
    }

    public void afrontarGastoDeTransformacion(UnidadArquero arquero, int cantidad) {
        int gasto_total = cantidad * 40;
        if (gasto_total > oro_disponible)
            throw new OroInsuficienteException();
        oro_disponible -= gasto_total;
    }
}
