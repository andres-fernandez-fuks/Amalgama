import Modelo.Unidad.*;
import org.junit.jupiter.api.Test;

public class UnidadTest {
    @Test
    public void laFuerzaDeUnaUnidadDeTipoPiqueroDeberiaSer5() {
        assert(new UnidadPiquero().fuerza() == 5);
    }

    @Test
    public void laFuerzaDeUnaUnidadDeTipoArqueroDeberiaSer10() {
        assert(new UnidadArquero().fuerza() == 10);
    }

    @Test
    public void laFuerzaDeUnaUnidadDeTipoCaballeroDeberiaSer20() {
        assert(new UnidadCaballero().fuerza() == 20);
    }
}
