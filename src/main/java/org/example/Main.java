package org.example;

import org.example.clasesHalloween.Fiesta;
import org.example.clasesHalloween.Invitado;
import org.example.clasesHalloween.Lugar;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner entradaPorTeclado=new Scanner(System.in);
        Lugar objetoLugar = new Lugar();
        Fiesta objetoFiesta = new Fiesta();

        //Creando nuestro primer arraylist
        ArrayList <Invitado> invitados=new ArrayList<Invitado>();

        System.out.println("****** GRAN FIESTA GRUPO URIBE********");
        System.out.println("**************************************");

        //CICLO PARA UBICAR INVITADOS DENTRO DEL AFORO
        int variableDeControl=0;
        System.out.println("Menu del programa");
        System.out.println("**************");
        System.out.println("0. SALIR");
        System.out.println("1. Registro del Lugar");
        System.out.println("2. Registro de la fiesta");
        System.out.println("3. Registro de Invitado");
        System.out.println("4. Ver Invitados");


        do{
            System.out.println("Digita una opcion del menu: ");
            variableDeControl=entradaPorTeclado.nextInt();


            switch (variableDeControl){

                case 1:
                    System.out.print("Digita el aforo: ");
                    objetoLugar.setAforo(entradaPorTeclado.nextInt());
                    System.out.print("Digita la direccion: ");
                    objetoLugar.setDireccion(entradaPorTeclado.next());
                    break;
                case 2:
                    System.out.print("Fecha: ");
                    objetoFiesta.setFecha(entradaPorTeclado.next());
                    System.out.print("Costos de alimentos: ");
                    objetoFiesta.setCostosAlimentos(entradaPorTeclado.nextDouble());
                    System.out.print("Costos de bebidas: ");
                    objetoFiesta.setCostosBebidas(entradaPorTeclado.nextDouble());
                    System.out.print("Costos de lugar: ");
                    objetoFiesta.setCostosLugar(entradaPorTeclado.nextDouble());
                    System.out.print("Costos de equipos: ");
                    objetoFiesta.setCostosEquipos(entradaPorTeclado.nextDouble());
                    break;
                case 3:

                    if(objetoLugar.getAforo()>=1){

                        //Restamos en 1 el aforo total cada que entra alguien a la fiesta
                        objetoLugar.setAforo(objetoLugar.getAforo()-1);

                        //si voy a guardar objetos de una clase CUALQUIERA
                        //en un arraylist, primero debo crear un objeto de
                        //ESA CLASE CUALQUIERA
                        Invitado objetoInvitado = new Invitado();

                        //LLENAR/PEDIR ALMACENAR/SETEAR/LLEVAR LOS ATRIBUTOS
                        //DEL OBJETO QUE ACABO DE CREAR
                        System.out.println("Digita el nombre del invitado: ");
                        objetoInvitado.setNombres(entradaPorTeclado.next());

                        //si ya llene mi objeto entonces agregamos
                        //el objeto a la lista
                        invitados.add(objetoInvitado);

                    }else{

                        System.out.println("Aragan, no te enra mas gente ahi");


                    }

                    break;
                case 4:

                    //COMO RECORRO UN ARRAYLIST?
                    //con un ciclo for ADAPTADO recorremos facillmente un ARRAYLIST
                    for(Invitado invitado:invitados){

                        System.out.println(invitado.getNombres());

                    }

                    break;

                default:
                    System.out.println("Selecciona una opcion valida");

            }


        }while(variableDeControl != 0);















    }
}