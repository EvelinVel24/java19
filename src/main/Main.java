import models.DirectorTecnico;
import models.Jugador;

public class Main {
    public static void main(String[] args) {
        // Crear director técnico
        DirectorTecnico dt = new DirectorTecnico("Juan", "Pérez", 50, 20);
        System.out.println(dt.hablar());
        System.out.println(dt.celebrar());
        System.out.println(dt.toString());

        // Crear jugadores
        Jugador[] jugadores = {
            new Jugador("Carlos", "Gómez", 25, 10, "Delantero"),
            new Jugador("Luis", "Fernández", 27, 7, "Defensa"),
            new Jugador("Pedro", "Martínez", 23, 11, "Portero")
        };

        // Mostrar equipo titular
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.toString());
        }
    }
}
