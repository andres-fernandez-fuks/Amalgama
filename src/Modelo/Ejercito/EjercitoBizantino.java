package Modelo.Ejercito;

import Modelo.Unidad.Unidad;
import Modelo.Unidad.UnidadPiquero;

public class EjercitoBizantino extends Ejercito {
    public EjercitoBizantino() {
        super();
        agregarPiqueros(5);
        agregarArqueros(8);
        agregarCaballeros(15);
    }
}
