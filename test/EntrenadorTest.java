import Modelo.Entrenador;
import Modelo.Unidad.*;
import org.junit.jupiter.api.Test;

public class EntrenadorTest {
    private Entrenador entrenador = new Entrenador();
    @Test
    public void unPiqueroEntrenadoDeberiaTener8PuntosDeFuerza() {
        UnidadPiquero piquero = new UnidadPiquero();
        entrenador.entrenar(piquero);
        assert(piquero.fuerza() == 8);
    }

    @Test
    public void unArqueroEntrenadoDeberiaTener17PuntosDeFuerza() {
        UnidadArquero arquero = new UnidadArquero();
        entrenador.entrenar(arquero);
        assert(arquero.fuerza() == 17);
    }

    @Test
    public void unCaballeroEntrenadoDeberiaTener30PuntosDeFuerza() {
        UnidadCaballero caballero = new UnidadCaballero();
        entrenador.entrenar(caballero);
        assert(caballero.fuerza() == 30);
    }
}
