import Modelo.Ejercito.Ejercito;
import Modelo.Ejercito.EjercitoIngles;
import Modelo.Excepciones.OroInsuficienteException;
import Modelo.Excepciones.TipoDeUnidadIntransformableException;
import Modelo.ManejadorDeOro;
import Modelo.Unidad.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManejadorDeOroTest {
    private ManejadorDeOro manejador;

    @BeforeEach
    public void setearManejador() {
        manejador = new ManejadorDeOro();
    }

    @Test
    public void elOroDisponibleDeUnManejadorRecienCreadoDeberiaSer1000() {
        assert(manejador.oroDisponible() == 1000);
    }

    @Test
    public void elOroDisponibleDeUnManejadorLuegoDeEntrenar5PiquerosDeberiaReducirseEn50() {
        int oro_inicial = manejador.oroDisponible();
        manejador.afrontarGastoDeEntrenamiento(new UnidadPiquero(), 5);
        assert(manejador.oroDisponible() == oro_inicial - 50);
    }

    @Test
    public void elOroDisponibleDeUnManejadorLuegoDeEntrenar5ArquerosDeberiaReducirseEn100() {
        int oro_inicial = manejador.oroDisponible();
        manejador.afrontarGastoDeEntrenamiento(new UnidadArquero(), 5);
        assert(manejador.oroDisponible() == oro_inicial - 100);
    }

    @Test
    public void elOroDisponibleDeUnManejadorLuegoDeEntrenar5CaballerosDeberiaReducirseEn150() {
        int oro_inicial = manejador.oroDisponible();
        manejador.afrontarGastoDeEntrenamiento(new UnidadCaballero(), 5);
        assert(manejador.oroDisponible() == oro_inicial - 150);
    }

    @Test
    public void elOroDisponibleDeUnManejadorLuegoDeTransformar5PiquerosDeberiaReducirseEn150() {
        int oro_inicial = manejador.oroDisponible();
        manejador.afrontarGastoDeTransformacion(new UnidadPiquero(), 5);
        assert(manejador.oroDisponible() == oro_inicial - 150);
    }

    @Test
    public void elOroDisponibleDeUnManejadorLuegoDeTransformar5ArquerosDeberiaReducirseEn200() {
        int oro_inicial = manejador.oroDisponible();
        manejador.afrontarGastoDeTransformacion(new UnidadArquero(), 5);
        assert(manejador.oroDisponible() == oro_inicial - 200);
    }

    @Test
    public void siElGastoDeEntrenamientoEsSuperiorAlOroDisponibleDeberiaLanzarseUnaExcepcion() {
        try { manejador.afrontarGastoDeEntrenamiento(new UnidadCaballero(), 50); }
        catch(Exception e) {
            assert(e.getClass() == OroInsuficienteException.class);
        }
    }

    @Test
    public void siElGastoDeTransformacionEsSuperiorAlOroDisponibleDeberiaLanzarseUnaExcepcion() {
        try { manejador.afrontarGastoDeTransformacion(new UnidadArquero(), 30); }
        catch(Exception e) {
            assert(e.getClass() == OroInsuficienteException.class);
        }
    }

}
