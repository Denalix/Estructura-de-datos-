/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.reservada.Data;

/**
 *
 * @author User
 */
public class Sala {
    int numeroSala;
    int capacidad = 100;
    Silla[] sillas = new Silla[capacidad];
    int llenura = 0;
    public Sala(int numeroSala){
        this.numeroSala = numeroSala;
        for(int i=0;i<sillas.length/10;i++){
            for(int j=0;j<sillas.length/10;j++){
                sillas[i*10 + j] = new Silla(this.numeroSala,j+1,i+1);
            }
        }
    }
    
    Silla ocuparSilla(int numeroSilla){
        sillas[numeroSilla].setOcupada(true);
        llenura++;
        return sillas[numeroSilla];
        
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Silla[] getSillas() {
        return sillas;
    }

    public void setSillas(Silla[] sillas) {
        this.sillas = sillas;
    }

    public int getLlenura() {
        return llenura;
    }

    public void setLlenura(int llenura) {
        this.llenura = llenura;
    }
    
    public void mostrarSala(){
        for(int i=0;i<sillas.length/10;i++){
            for(int j=0;j<sillas.length/10;j++){
                if(sillas[i*10 + j].isOcupada()){
                    System.out.print("-- ");
                }else if (i<1){
                    System.out.print("0"+(j+1)+" ");
                } else{
                    System.out.print((i*10+(j+1))+" ");
                }
            }
            System.out.println("");
        }
    }
}
