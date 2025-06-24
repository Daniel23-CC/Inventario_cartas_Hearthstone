import java.util.ArrayList;
import java.util.List;

class Inventario {
    
    private List<Carta> cartas;
    public Inventario() {
        this.cartas = new ArrayList<>();
    }
    
    public void agregarCarta(Carta carta) {
        this.cartas.add(carta);
    }
    
    public void listarCartas() {
        if (cartas.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }
        System.out.println("Cartas en el inventario:");
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
    
    public void eliminarCarta(String nombre) {
        cartas.removeIf(carta -> carta.getNombre().equals(nombre));
    }
}