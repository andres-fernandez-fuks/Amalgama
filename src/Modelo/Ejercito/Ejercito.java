// Clase abstracta que modela un ejército, con sus unidades correspondientes y la posibilidad de entrenarlas y transformarlas

package Modelo.Ejercito;

import Modelo.Eliminador;
import Modelo.Entrenador;
import Modelo.Excepciones.TipoDeUnidadIntransformableException;
import Modelo.ManejadorDeOro;
import Modelo.Transformador;
import Modelo.Unidad.Unidad;
import Modelo.Unidad.UnidadArquero;
import Modelo.Unidad.UnidadCaballero;
import Modelo.Unidad.UnidadPiquero;

import java.util.ArrayList;

public abstract class Ejercito {
    protected ManejadorDeOro manejador_de_oro = new ManejadorDeOro();
    protected ArrayList<UnidadPiquero> piqueros = new ArrayList<>();
    protected ArrayList<UnidadArquero> arqueros  = new ArrayList<>();
    protected ArrayList<UnidadCaballero> caballeros  = new ArrayList<>();
    protected Entrenador entrenador = new Entrenador();
    protected Transformador transformador = new Transformador();
    protected Eliminador eliminador = new Eliminador(piqueros, arqueros, caballeros);

    protected static int contador_ids;
    protected int id;

    public Ejercito() {
        contador_ids++;
        id = contador_ids;
    }

    public int getId() {
        return id;
    }

    public int oroDisponible() { return manejador_de_oro.oroDisponible();}

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

    public int fuerza() {
        ArrayList<Unidad> unidades = unidades();
        int fuerza = 0;
        for (Unidad unidad : unidades) {
            fuerza += unidad.fuerza();
        }
        return fuerza;
    }

    protected ArrayList<Unidad> unidades() {
        ArrayList<Unidad> unidades = new ArrayList<>();
        unidades.addAll(piqueros);
        unidades.addAll(arqueros);
        unidades.addAll(caballeros);
        return unidades;
    }

    public void afrontarVictoria() {
        manejador_de_oro.ingresarOro(100);
    }

    public void afrontarDerrota() {
        eliminador.eliminarUnidades(2);
    }

    public void afrontarEmpate() {
        eliminador.eliminarUnidades(1);
    }

    public void entrenarPiqueros(int cantidad) {
        entrenador.entrenarUnidades((ArrayList<Unidad>)(ArrayList<?>) piqueros, cantidad);
    }

    public void entrenarArqueros(int cantidad) {
        entrenador.entrenarUnidades((ArrayList<Unidad>)(ArrayList<?>) arqueros, cantidad);
    }

    public void entrenarCaballeros(int cantidad) {
        entrenador.entrenarUnidades((ArrayList<Unidad>)(ArrayList<?>) caballeros, cantidad);
    }

    public void transformarPiqueros(int cantidad) {
        transformador.transformarPiqueros(piqueros, arqueros, cantidad);
    }

    public void transformarArqueros(int cantidad) {
        transformador.transformarArqueros(arqueros, caballeros, cantidad);
    }

    public void transformarCaballeros(int cantidad) {
        throw new TipoDeUnidadIntransformableException();
    }

    public int cantidadDePiqueros() { return piqueros.size();}
    public int cantidadDeArqueros() { return arqueros.size();}
    public int cantidadDeCaballeros() { return caballeros.size();}
}
