/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.reservada.Data;

import java.time.LocalDate;


public class Dia {
    static long diaAuxiliar = 0;
    int numeroFunciones = 15;
    LocalDate fechaDia = LocalDate.now().plusDays(diaAuxiliar);
    Pelicula[] peliculas = new Pelicula[numeroFunciones];
    String[] nombresPeliculas= {"Avengers","Avatar","Titanic","Godzilla","toy Story"};
    String[] horarios = {"9:00","11:00","12:00","14:00","16:00","19:00"};
    public Dia(){
        for (int i = 0; i < peliculas.length; i++) {
            peliculas[i] = new Pelicula(nombresPeliculas[(i%5)],(i%10 + 1),fechaDia,horarios[i%6]);
        }
        diaAuxiliar++;
    }

    public static long getDiaAuxiliar() {
        return diaAuxiliar;
    }

    public static void setDiaAuxiliar(long diaAuxiliar) {
        Dia.diaAuxiliar = diaAuxiliar;
    }

    public int getNumeroFunciones() {
        return numeroFunciones;
    }

    public void setNumeroFunciones(int numeroFunciones) {
        this.numeroFunciones = numeroFunciones;
    }

    public LocalDate getFechaDia() {
        return fechaDia;
    }

    public void setFechaDia(LocalDate fechaDia) {
        this.fechaDia = fechaDia;
    }

    public Pelicula[] getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Pelicula[] peliculas) {
        this.peliculas = peliculas;
    }

    public String[] getNombresPeliculas() {
        return nombresPeliculas;
    }

    public void setNombresPeliculas(String[] nombresPeliculas) {
        this.nombresPeliculas = nombresPeliculas;
    }

    public String[] getHorarios() {
        return horarios;
    }

    public void setHorarios(String[] horarios) {
        this.horarios = horarios;
    }
    
    
    
}
