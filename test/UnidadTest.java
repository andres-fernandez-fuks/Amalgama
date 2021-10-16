import Modelo.Juego;
import Modelo.Unidad;
import org.junit.jupiter.api.Test;

public class UnidadTest {
    @Test
    public void laFuerzaDeUnaUnidadDeTipoPiqueroDeberiaSer5() {
        assert(new Unidad("Piquero").fuerza() == 5);
    }

    @Test
    public void laFuerzaDeUnaUnidadDeTipoArqueroDeberiaSer10() {
        assert(new Unidad("Arquero").fuerza() == 10);
    }

    @Test
    public void laFuerzaDeUnaUnidadDeTipoCaballeroDeberiaSer20() {
        assert(new Unidad("Caballero").fuerza() == 20);
    }
}
