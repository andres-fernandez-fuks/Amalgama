package Modelo;

import Modelo.Ejercito.Ejercito;

public class Batalla {
    private final int ganador;
    public Batalla(Ejercito ejercito1, Ejercito ejercito2) {
        int fuerza_ejercito1 = ejercito1.fuerza();
        int fuerza_ejercito2 = ejercito2.fuerza();
        if (fuerza_ejercito1 > fuerza_ejercito2) {
            resolverGanadorPerdedor(ejercito1, ejercito2);
            ganador = ejercito1.getId();
        } else if (fuerza_ejercito1 == fuerza_ejercito2) {
            resolverEmpate(ejercito1, ejercito2);
            ganador = 0;
        } else {
            resolverGanadorPerdedor(ejercito2, ejercito1);
            ganador = ejercito2.getId();
        }
    }

    public void resolverGanadorPerdedor(Ejercito ejercito_ganador, Ejercito ejercito_perdedor) {
        ejercito_ganador.afrontarVictoria();
        ejercito_perdedor.afrontarDerrota();
    }

    public void resolverEmpate(Ejercito ejercito1, Ejercito ejercito2) {
        ejercito1.afrontarEmpate();
        ejercito2.afrontarEmpate();
    }

    public int ganador() { return ganador; }
}
