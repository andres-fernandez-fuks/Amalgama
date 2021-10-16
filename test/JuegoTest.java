import Modelo.Juego;
import org.junit.jupiter.api.Test;

public class JuegoTest {
    @Test
    public void laCantidadDeEjercitosDeUnJuegoRecienCreadoDeberiaSer0() {
        assert(new Juego().cantidadDeEjercitos() == 0);
    }
}
