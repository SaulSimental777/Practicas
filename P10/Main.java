package com.company;

import IO.ClaseIO;

public class Main {

    public static void main(String [] args){

        int opcion;

        Zoo zoologico = new Zoo(new Veterinario("Gabriel Montiel", 10000));

        String [] opciones = new String[]{"Animales dentro del zoologico", "Actividades para Veterinario", "Imprimir registros"};

        do{
            ClaseIO.limpiaPantalla();
            ClaseIO.imprimirMensaje("\t\tZoologico de Tijuana\n\n");
            ClaseIO.imprimirMenu(opciones);
            opcion = ClaseIO.capturaEntero("Que opcion elige?");

            switch (opcion){
                case 1 ->{
                    Menus.menuAnimales(zoologico);
                    ClaseIO.pausa();
                }

                case 2 ->{
                    Menus.menuVeterinario(zoologico);
                    ClaseIO.pausa();
                }

                case 3 ->{
                    zoologico.imprimirVeterinario();

                    if(!zoologico.getAnimales().isEmpty()) {
                        ClaseIO.imprimirMensaje("\n\nAnimales registrados en el zoologico:\n");

                        zoologico.imprimirAnimales();
                    }else{
                        ClaseIO.imprimirMensaje("Error: No hay animales registrados");
                    }

                    ClaseIO.pausa();
                }

                case 4 -> ClaseIO.imprimirMensaje("Gracias por su visita!");

                default -> {
                    ClaseIO.imprimirMensaje("Opcion no valida!");
                    ClaseIO.pausa();
                }
            }
        }while(opcion != 4);

    }
}
