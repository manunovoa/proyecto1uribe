package org.example.clasesHalloween;

public class Lugar {
    //ATRIBUTOS
     private String direccion;
     private int aforo;


    //CONSTRUCTOR

    public Lugar() {


    }

    public Lugar(String direccion, int aforo) {
        this.direccion = direccion;
        this.aforo = aforo;
    }

    //METODOS


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        if (aforo>=0){
            this.aforo = aforo;
        }else {
            System.out.println("minimo 1 persona");
        }
    }
}
