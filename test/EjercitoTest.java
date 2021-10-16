import Modelo.Ejercito;
import org.junit.jupiter.api.Test;

public class EjercitoTest {
    @Test
    public void laCantidadDeUnidadesDeUnEjercitoRecienCreadoDeberiaSer0() {
        assert(new Ejercito().cantidadDeUnidades() == 0);
    }

    @Test
    public void elOroDisponibleDeUnEjercitoRecienCreadoDeberiaSer1000() {
        assert(new Ejercito().cantidadDeOroDisponible() == 1000);
    }

}
