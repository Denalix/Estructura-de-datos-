
package sistema.de.reservada.Data;

public class Silla {
    int precio,numeroSala,fila,columna;
    int[] numeroSilla = new int[2];
    boolean ocupada;
    public Silla(int numeroSala,int fila,int columna){
        this.numeroSala = numeroSala;
        this.ocupada = false;
        this.columna = columna;
        this.fila = fila;
        if(fila>7){
           this.precio=20000; 
        }else{
            this.precio=10000;
        }
        this.numeroSilla[0] = this.fila;
        this.numeroSilla[1] = this.columna;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public int[] getNumeroSilla() {
        return numeroSilla;
    }

    public int getPrecio() {
        return precio;
    }

    public int getNumeroSala() {
        return numeroSala;
    }
    
    
}
