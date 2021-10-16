package Modelo.Ejercito;

import Modelo.Unidad.Unidad;
import Modelo.Unidad.UnidadArquero;
import Modelo.Unidad.UnidadCaballero;
import Modelo.Unidad.UnidadPiquero;

import java.util.ArrayList;
import java.util.List;

public abstract class Ejercito {
    protected int oro_disponible = 1000;
    protected List<UnidadPiquero> piqueros = new ArrayList<UnidadPiquero>();
    protected List<UnidadArquero> arqueros  = new ArrayList<UnidadArquero>();
    protected List<UnidadCaballero> caballeros  = new ArrayList<UnidadCaballero>();

    public int cantidadDeOroDisponible() { return oro_disponible;}

    protected void agregarPiqueros(int cantidad) {
        for (int i = 0; i < cantidad; ++i) {
            piqueros.add(new UnidadPiquero());
        }
    }
    protected void agregarArqueros(int cantidad) {
        for (int i = 0; i < cantidad; ++i) {
            arqueros.add(new UnidadArquero());
        }
    }
    protected void agregarCaballeros(int cantidad) {
        for (int i = 0; i < cantidad; ++i) {
            caballeros.add(new UnidadCaballero());
        }
    }

    public int cantidadDePiqueros() { return piqueros.size();}
    public int cantidadDeArqueros() { return arqueros.size();}
    public int cantidadDeCaballeros() { return caballeros.size();}
}
