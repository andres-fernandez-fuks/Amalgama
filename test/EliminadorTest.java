import Modelo.Eliminador;
import Modelo.Unidad.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class EliminadorTest {
    @Test
    public void siUnEliminadorCuentaconCaballerosDeberiaEliminarCaballeros() {
        ArrayList<UnidadCaballero> caballeros =
                new ArrayList<UnidadCaballero>(Arrays.asList(new UnidadCaballero(), new UnidadCaballero()));
        ArrayList<UnidadPiquero> piqueros = new ArrayList<>();
        ArrayList<UnidadArquero> arqueros = new ArrayList<>();
        Eliminador eliminador = new Eliminador(piqueros, arqueros, caballeros);
        eliminador.eliminarUnidades();
        assert(caballeros.size() == 0);
    }

    @Test
    public void siUnEliminadorNoCuentaConCaballerosDeberiaEliminarArqueros() {
        ArrayList<UnidadArquero> arqueros =
                new ArrayList<UnidadArquero>(Arrays.asList(new UnidadArquero(), new UnidadArquero()));
        ArrayList<UnidadPiquero> piqueros = new ArrayList<>();
        ArrayList<UnidadCaballero> caballeros = new ArrayList<>();
        Eliminador eliminador = new Eliminador(piqueros, arqueros, caballeros);
        eliminador.eliminarUnidades();
        assert(arqueros.size() == 0);
    }

    @Test
    public void siUnEliminadorNoCuentaConCaballerosNiArquerosDeberiaEliminarPiqueros() {
        ArrayList<UnidadPiquero> piqueros =
                new ArrayList<UnidadPiquero>(Arrays.asList(new UnidadPiquero(), new UnidadPiquero()));
        ArrayList<UnidadCaballero> caballeros = new ArrayList<>();
        ArrayList<UnidadArquero> arqueros = new ArrayList<>();
        Eliminador eliminador = new Eliminador(piqueros, arqueros, caballeros);
        eliminador.eliminarUnidades();
        assert(piqueros.size() == 0);
    }
}
