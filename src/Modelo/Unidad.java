package Modelo;

public class Unidad {
    private String tipo_de_unidad;
    public Unidad(String _tipo_de_unidad) {
        tipo_de_unidad = _tipo_de_unidad;
    }

    public int fuerza() {
        switch (tipo_de_unidad) {
            case "Piquero":
                return 5;
            case "Arquero":
                return 10;
            case "Caballero":
                return 20;
        }
        return 0;
    }
}
