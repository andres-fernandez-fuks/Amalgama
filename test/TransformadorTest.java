import Modelo.Transformador;
import Modelo.Unidad.UnidadArquero;
import Modelo.Unidad.UnidadCaballero;
import Modelo.Unidad.UnidadPiquero;
import org.junit.jupiter.api.Test;

public class TransformadorTest {
    private Transformador transformador = new Transformador();
    @Test
    public void laTransformacionDeUnPiqueroDeberiaDevolverUnArquero() {
        assert(transformador.transformar(new UnidadPiquero()).getClass() == UnidadArquero.class);
    }

    @Test
    public void laTransformacionDeUnArqueroDeberiaDevolverUnCaballero() {
        assert(transformador.transformar(new UnidadArquero()).getClass() == UnidadCaballero.class);
    }

    @Test
    public void laTransformacionDeUnCaballeroDeberiaDevolverUnCaballero() {
        assert(transformador.transformar(new UnidadCaballero()).getClass() == UnidadCaballero.class);
    }
}
