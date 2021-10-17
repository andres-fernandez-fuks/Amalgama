import Modelo.Ejercito.*;
import Modelo.Unidad.UnidadCaballero;
import org.junit.jupiter.api.Test;

public class EjercitoTest {
    private final EjercitoBizantino ejercito_bizantino = new EjercitoBizantino();
    private final EjercitoChino ejercito_chino = new EjercitoChino();
    private final EjercitoIngles ejercito_ingles = new EjercitoIngles();

    @Test
    public void laCantidadInicialDePiquerosDeUnEjercitoBizantinoDeberiaSer5() {
        assert(ejercito_bizantino.cantidadDePiqueros() == 5);
    }

    @Test
    public void laCantidadInicialDeArquerosDeUnEjercitoBizantinoDeberiaSer8() {
        assert(ejercito_bizantino.cantidadDeArqueros() == 8);
    }

    @Test
    public void laCantidadInicialDeCaballerosDeUnEjercitoBizantinoDeberiaSer15() {
        assert(ejercito_bizantino.cantidadDeCaballeros() == 15);
    }

    @Test
    public void laCantidadInicialDePiquerosDeUnEjercitoChinoDeberiaSer2() {
        assert(ejercito_chino.cantidadDePiqueros() == 2);
    }

    @Test
    public void laCantidadInicialDeArquerosDeUnEjercitoChinoDeberiaSer25() {
        assert(ejercito_chino.cantidadDeArqueros() == 25);
    }

    @Test
    public void laCantidadInicialDeCaballerosDeUnEjercitoChinoDeberiaSer2() {
        assert(ejercito_chino.cantidadDeCaballeros() == 2);
    }

    @Test
    public void laCantidadInicialDePiquerosDeUnEjercitoInglesDeberiaSer10() {
        assert(ejercito_ingles.cantidadDePiqueros() == 10);
    }

    @Test
    public void laCantidadInicialDeArquerosDeUnEjercitoInglesDeberiaSer10() {
        assert(ejercito_ingles.cantidadDeArqueros() == 10);
    }

    @Test
    public void laCantidadInicialDeCaballerosDeUnEjercitoInglesDeberiaSer10() {
        assert(ejercito_ingles.cantidadDeCaballeros() == 10);
    }

    @Test
    public void elOroDisponibleDeUnEjercitoBizantinoRecienCreadoDeberiaSer1000() {
        assert(ejercito_bizantino.cantidadDeOroDisponible() == 1000);
    }

    @Test
    public void elOroDisponibleDeUnEjercitoChinoRecienCreadoDeberiaSer1000() {
        assert(ejercito_bizantino.cantidadDeOroDisponible() == 1000);
    }

    @Test
    public void elOroDisponibleDeUnEjercitoInglesRecienCreadoDeberiaSer1000() {
        assert(ejercito_ingles.cantidadDeOroDisponible() == 1000);
    }

    @Test
    public void siSeEntrenan10PiquerosLaFuerzaDelEjercitoAumentaEn30() {
        Ejercito ejercito = new EjercitoIngles();
        int fuerza_inicial = ejercito.fuerza();
        ejercito.entrenarPiqueros(10);
        assert(ejercito.fuerza() == fuerza_inicial + 30);
    }

    @Test
    public void siSeEntrenan10ArquerosLaFuerzaDelEjercitoAumentaEn70() {
        Ejercito ejercito = new EjercitoIngles();
        int fuerza_inicial = ejercito.fuerza();
        ejercito.entrenarArqueros(10);
        assert(ejercito.fuerza() == fuerza_inicial + 70);
    }

    @Test
    public void siSeEntrenan10CaballerosLaFuerzaDelEjercitoAumentaEn100() {
        Ejercito ejercito = new EjercitoIngles();
        int fuerza_inicial = ejercito.fuerza();
        ejercito.entrenarCaballeros(10);
        assert(ejercito.fuerza() == fuerza_inicial + 100);
    }

}
