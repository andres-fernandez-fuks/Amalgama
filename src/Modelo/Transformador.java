// Clase utilizada por Ejercito para delegar la transformación de unidades.

package Modelo;
import Modelo.Excepciones.CantidadDeUnidadesInsuficienteException;
import Modelo.Unidad.*;

import java.util.ArrayList;

public class Transformador {
    public UnidadArquero transformar(UnidadPiquero piquero) {
        return new UnidadArquero();
    }

    public UnidadCaballero transformar(UnidadArquero arquero) {
        return new UnidadCaballero();
    }

    public UnidadCaballero transformar(UnidadCaballero caballero) {
        return caballero;
    }

    public void transformarPiqueros(ArrayList<UnidadPiquero>piqueros, ArrayList<UnidadArquero>arqueros, int cantidad) {
        if (cantidad > piqueros.size()) {
            throw new CantidadDeUnidadesInsuficienteException();
        }
        for (int i = 0; i < cantidad; ++i) {
            UnidadArquero arquero = transformar(piqueros.get(0));
            piqueros.remove(0);
            arqueros.add(arquero);
        }
    }

    public void transformarArqueros(ArrayList<UnidadArquero> arqueros,
                                    ArrayList<UnidadCaballero> caballeros,
                                    int cantidad){
        if (cantidad > arqueros.size()) {
            throw new CantidadDeUnidadesInsuficienteException();
        }
        for (int i = 0; i < cantidad; ++i) {
            UnidadCaballero caballero = transformar(arqueros.get(0));
            arqueros.remove(0);
            caballeros.add(caballero);
        }
    }

}
