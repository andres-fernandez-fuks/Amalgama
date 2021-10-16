package Modelo;
import Modelo.Unidad.*;

public class Transformador {
    public UnidadArquero transformar(UnidadPiquero piquero) {
        return new UnidadArquero();
    }

    public UnidadCaballero transformar(UnidadArquero arquero) {
        return new UnidadCaballero();
    }

    public UnidadCaballero transformar(UnidadCaballero caballero) {
        return caballero;
    }

}
