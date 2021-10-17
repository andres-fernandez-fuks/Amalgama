import Modelo.Ejercito.*;
import Modelo.Juego;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JuegoTest {
    private Juego juego;

    @BeforeEach
    public void setearJuego() {
        juego = new Juego();
    }
    @Test
    public void laCantidadDeEjercitosDeUnJuegoRecienCreadoDeberiaSer0() {
        assert(juego.cantidadDeEjercitos() == 0);
    }

    @Test
    public void siSeCreaUnEjercitoBizantinoLaCreacionDelEjercitoEsCorrecta() {
        int id_ejercito = juego.crearEjercitoBizantino();
        assert(juego.cantidadDeEjercitos() == 1);
        assert(juego.getEjercitoById(id_ejercito).getClass() == EjercitoBizantino.class);
    }

    @Test
    public void siSeCreaUnEjercitoChinoLaCreacionDelEjercitoEsCorrecta() {
        int id_ejercito = juego.crearEjercitoChino();
        assert(juego.cantidadDeEjercitos() == 1);
        assert(juego.getEjercitoById(id_ejercito).getClass() == EjercitoChino.class);
    }

    @Test
    public void siSeCreaUnEjercitoInglesLaCreacionDelEjercitoEsCorrecta() {
        int id_ejercito = juego.crearEjercitoIngles();
        assert(juego.cantidadDeEjercitos() == 1);
        assert(juego.getEjercitoById(id_ejercito).getClass() == EjercitoIngles.class);
    }

    @Test
    public void SiUnEjercitoEntrenaSusUnidadesSeVuelveMasFuerte() {
        int id_ejercito_1 = juego.crearEjercitoIngles();
        int id_ejercito_2 = juego.crearEjercitoIngles();
        juego.entrenarPiquerosParaEjercito(id_ejercito_2, 5);
        int id_ganador = juego.enfrentarEjercitos(id_ejercito_1, id_ejercito_2);
        assert(id_ganador == id_ejercito_2);
    }

    @Test
    public void SiUnEjercitoTransformaSusUnidadesSeVuelveMasFuerte() {
        int id_ejercito_1 = juego.crearEjercitoIngles();
        int id_ejercito_2 = juego.crearEjercitoIngles();
        juego.transformarPiquerosParaEjercito(id_ejercito_2, 5);
        int id_ganador = juego.enfrentarEjercitos(id_ejercito_1, id_ejercito_2);
        assert(id_ganador == id_ejercito_2);
    }
}
