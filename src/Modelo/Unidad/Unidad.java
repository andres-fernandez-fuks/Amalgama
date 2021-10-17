// Clase abstracta que modela una unidad, con su correspondiente fuerza y métodos

package Modelo.Unidad;

public abstract class Unidad implements Comparable<Unidad> {
    protected Integer fuerza;
    protected Boolean esta_entrenado = false;
    public Integer fuerza() { return fuerza; }
    public abstract void entrenar();

    @Override
    public int compareTo(Unidad u) {
        return fuerza.compareTo(u.fuerza());
    }

    public boolean estaEntrenado() {
        return esta_entrenado;
    }
}
