package com.company;

import IO.ClaseIO;

public class Menus {

    public static void menuAnimales(Zoo zoologico){

        String [] opciones = new String[]{"Agregar Perro", "Agregar Gato", "Agregar Leon", "Retirar animal del zoologico", "Realizar metodo propio"};
        int opcion, indiceAnimal;

        do{
            ClaseIO.limpiaPantalla();
            ClaseIO.imprimirMensaje("\t\tZoologico de Tijuana\n\n");
            ClaseIO.imprimirMenu(opciones);

            opcion = ClaseIO.capturaEntero("Que opcion elige?");

            switch (opcion){

                case 1 -> {
                    zoologico.agregarAnimal(new Perro(
                            ClaseIO.capturaCadena("Nombre"),
                            ClaseIO.capturaEntero("Edad"),
                            ClaseIO.capturaBoolean("Esta vacunado? (True - False)"),
                            ClaseIO.capturaCadena("Tipo de alimento")
                    ));

                    ClaseIO.pausa();
                }

                case 2 -> {
                    zoologico.agregarAnimal(new Gato(
                            ClaseIO.capturaCadena("Nombre"),
                            ClaseIO.capturaEntero("Edad"),
                            ClaseIO.capturaBoolean("Esta vacunado? (True - False)"),
                            ClaseIO.capturaCadena("Tipo de alimento")
                    ));

                    ClaseIO.pausa();
                }

                case 3 -> {
                    zoologico.agregarAnimal(new Leon(
                            ClaseIO.capturaCadena("Nombre"),
                            ClaseIO.capturaEntero("Edad"),
                            ClaseIO.capturaBoolean("Esta vacunado? (True - False)"),
                            ClaseIO.capturaCadena("Tipo de alimento")
                    ));

                    ClaseIO.pausa();
                }


                case 4 -> {
                    String nombre = ClaseIO.capturaCadena("Ingresa el nombre del animal");

                    indiceAnimal = OperacionesBusqueda.buscarAnimal(zoologico.getAnimales(), nombre);

                    if(indiceAnimal != -1){
                        zoologico.eliminarAnimal(zoologico.getAnimales().get(indiceAnimal));
                        ClaseIO.imprimirMensaje(nombre + " ha sido retirado del Zoologico!");
                    }else{
                        ClaseIO.imprimirMensaje("Error: No se encontro un animal con ese nombre...");
                    }

                    ClaseIO.pausa();
                }

                case 5 -> {
                    String nombre = ClaseIO.capturaCadena("Ingresa el nombre del animal");

                    indiceAnimal = OperacionesBusqueda.buscarAnimal(zoologico.getAnimales(), nombre);

                    if(indiceAnimal != -1){
                        Animal tempAnimal = zoologico.getAnimales().get(indiceAnimal);
                        if( tempAnimal instanceof Perro)
                            ((Perro) tempAnimal).ladrar();

                        if( tempAnimal instanceof Gato)
                            ((Gato) tempAnimal).maullar();

                        if( tempAnimal instanceof Leon)
                            ((Leon) tempAnimal).rugir();


                    }else{
                        ClaseIO.imprimirMensaje("Error: No se encontro un animal con ese nombre...");
                    }

                    ClaseIO.pausa();
                }

                case 6 -> ClaseIO.imprimirMensaje("Regresando al menu principal...");

                default -> ClaseIO.imprimirMensaje("Opcion no valida!");

            }

        }while(opcion != 6);
    }

    public static void menuVeterinario(Zoo zoologico){
        String nombre;

        String [] opciones = new String[]{"Aplicar vacuna", "Imprimir Diagnostico Animal", "Aplicar Sedante", "Recetar Medicamento"};

        int opcion, indiceAnimal;

        do{
            ClaseIO.limpiaPantalla();
            ClaseIO.imprimirMensaje("\t\tZoologico de Tijuana\n\n");
            ClaseIO.imprimirMenu(opciones);

            opcion = ClaseIO.capturaEntero("Que opcion elige?");

            switch (opcion){

                case 1 -> {
                    nombre = ClaseIO.capturaCadena("Ingresa el nombre del animal");

                    indiceAnimal = OperacionesBusqueda.buscarAnimal(zoologico.getAnimales(), nombre);

                    if(indiceAnimal != -1){
                        zoologico.getVeterinario().aplicarVacuna( zoologico.getAnimales().get(indiceAnimal));
                    }else{
                        ClaseIO.imprimirMensaje("Error: No se encontro animal con ese nombre...");
                    }

                    ClaseIO.pausa();
                }

                case 2 -> {
                    nombre = ClaseIO.capturaCadena("Ingresa el nombre del animal");

                    indiceAnimal = OperacionesBusqueda.buscarAnimal(zoologico.getAnimales(), nombre);

                    if(indiceAnimal != -1){
                        zoologico.getVeterinario().imprimirDiagnosticoAnimal( zoologico.getAnimales().get(indiceAnimal));
                    }else{
                        ClaseIO.imprimirMensaje("Error: No se encontro animal con ese nombre...");
                    }

                    ClaseIO.pausa();
                }

                case 3 -> {
                    nombre = ClaseIO.capturaCadena("Ingresa el nombre del animal");

                    indiceAnimal = OperacionesBusqueda.buscarAnimal(zoologico.getAnimales(), nombre);

                    if(indiceAnimal != -1){
                        zoologico.getVeterinario().aplicarSedante( zoologico.getAnimales().get(indiceAnimal));
                    }else{
                        ClaseIO.imprimirMensaje("Error: No se encontro animal con ese nombre...");
                    }

                    ClaseIO.pausa();
                }

                case 4 -> {
                    nombre = ClaseIO.capturaCadena("Ingresa el nombre del animal");

                    indiceAnimal = OperacionesBusqueda.buscarAnimal(zoologico.getAnimales(), nombre);

                    if(indiceAnimal != -1){
                        zoologico.getVeterinario().recetarMedicamento( zoologico.getAnimales().get(indiceAnimal));
                    }else{
                        ClaseIO.imprimirMensaje("Error: No se encontro animal con ese nombre...");
                    }

                    ClaseIO.pausa();
                }

                case 5 -> ClaseIO.imprimirMensaje("Regresando al menu principal...");

                default -> ClaseIO.imprimirMensaje("Opcion no valida!");

            }

        }while(opcion != 5);

    }
}
