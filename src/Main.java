import java.util.ArrayList;

public class Main {
    private static void testeando() {
        CancionFactory listaCanciones = new CancionFactory();
        ArrayList<Cancion> listaReproduccion = new ArrayList<>();
        listaReproduccion.add(CancionFactory.getCancion("I Shot the Sheriff"));
        listaReproduccion.add(CancionFactory.getCancion("Rebel"));
        listaReproduccion.add(CancionFactory.getCancion("I Shot the Sheriff"));
        listaReproduccion.add(CancionFactory.getCancion("Sympathy for the devil"));
        if(listaCanciones.getContadorCancionesCreadas() == 3){
            System.out.println("¡Bien testeado!");
            for(int i=0;i < listaReproduccion.size(); i++){
                System.out.println(listaReproduccion.get(i).getNombre());
            }
        }else{
            System.out.println("Mal Testeado");
        }
    }
    public static void main(String [ ] args){
        testeando();
    }
}
