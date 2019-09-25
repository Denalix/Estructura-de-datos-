
package sistema.de.reservada.Data;

import java.time.LocalDate;

public class Pelicula {
    LocalDate fechaPelicula;
    String nombrePelicula;
    Sala sala;
    String hora;
    Pelicula(String nombrePelicula,int numeroSala,LocalDate fechaPelicula,String hora){
        this.sala = new Sala(numeroSala);
        this.nombrePelicula = nombrePelicula;
        this.fechaPelicula = fechaPelicula;
        this.hora = hora;
    }

    public LocalDate getFechaPelicula() {
        return fechaPelicula;
    }

    public void setFechaPelicula(LocalDate fechaPelicula) {
        this.fechaPelicula = fechaPelicula;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
 
    
    
}
