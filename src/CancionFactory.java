import java.util.HashMap;
import java.util.Scanner;

public class CancionFactory {
    private static final HashMap<String, Cancion> cancionMap = new HashMap<>();
    private static int contadorCancionesCreadas = 0;
    public static Cancion getCancion(String nombreCancion){
        Cancion cancion = (Cancion) cancionMap.get(nombreCancion);
        if(cancion == null){
            cancion = new Cancion(nombreCancion);
            Scanner datosCancion = new Scanner(System.in);
            System.out.println("Ingrese el nombre del artista: ");
            String nombreArtista = datosCancion.nextLine();
            System.out.println("Ingrese el genero de la cancion: ");
            String generoCancion = datosCancion.nextLine();
            cancion.setArtista(nombreArtista);
            cancion.setGenero(generoCancion);
            cancionMap.put(nombreCancion, cancion);
            System.out.println("Se creó una nueva canción en la lista de reproducción");
            contadorCancionesCreadas ++;
        }
        return cancion;
    }

    public int getContadorCancionesCreadas() {
        return contadorCancionesCreadas;
    }
}
