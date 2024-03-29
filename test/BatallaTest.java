import Modelo.Batalla;
import Modelo.Ejercito.*;
import org.junit.jupiter.api.Test;

public class BatallaTest {
    private EjercitoChino ejercito_debil = new EjercitoChino();
    private EjercitoBizantino ejercito_fuerte = new EjercitoBizantino();
    private EjercitoBizantino ejercito_igualado = new EjercitoBizantino();

    @Test
    public void siUnEjercitoPierdeUnaBatallaDeberiaPerderSusDosUnidadesDeMayorPuntaje() {
        int cantidad_de_caballeros_inicial = ejercito_debil.cantidadDeCaballeros();
        Batalla batalla = new Batalla(ejercito_debil, ejercito_fuerte);
        assert(batalla.ganador() == ejercito_fuerte.getId());
        assert(ejercito_debil.cantidadDeCaballeros() == cantidad_de_caballeros_inicial -2);
    }

    @Test
    public void siUnEjercitoGanaUnaBatallaDeberiaPObtener100UnidadesExtraDeOro() {
        int cantidad_inicial_de_oro = ejercito_fuerte.oroDisponible();
        Batalla batalla = new Batalla(ejercito_debil, ejercito_fuerte);
        assert(batalla.ganador() == ejercito_fuerte.getId());
        assert(ejercito_fuerte.oroDisponible() == cantidad_inicial_de_oro + 100);
    }

    @Test
    public void siDosEjercitosEmpatanUnaBatallaAmbosDeberianPerderSuUnidadDeMayorPuntaje() {
        int cantidad_de_caballeros_inicial_1 = ejercito_fuerte.cantidadDeCaballeros();
        int cantidad_de_caballeros_inicial_2 = ejercito_igualado.cantidadDeCaballeros();
        Batalla batalla = new Batalla(ejercito_fuerte, ejercito_igualado);
        assert(batalla.ganador() == 0);
        assert(ejercito_fuerte.cantidadDeCaballeros() == cantidad_de_caballeros_inicial_1 -1);
        assert(ejercito_igualado.cantidadDeCaballeros() == cantidad_de_caballeros_inicial_2 -1);
    }
}
