
package sistema.de.reservada;
import sistema.de.reservada.Data.*;


public class SistemaDeReservada {

    static final int numeroMaximoSalas = 10;
    
    public static void main(String[] args) {
        Dia dia = new Dia();
        //for(Pelicula pelicula: dia.getPeliculas())
        //System.out.printf("%s %s \n", pelicula.getNombrePelicula(), pelicula.getHora());
   dia.getPeliculas()[1].getSala().mostrarSala();
    }
    
}
