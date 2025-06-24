public class Carta {
    private String nombre;
    private String tipo;
    private int ataque;
    private int defensa;

    public Carta(String nombre, String tipo, int ataque, int defensa) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    @Override
    public String toString() {
        return nombre + " | Tipo: " + tipo + " | Ataque: " + ataque + " | Defensa: " + defensa;
    }

    public String getNombre() {
        return nombre;
    }
}