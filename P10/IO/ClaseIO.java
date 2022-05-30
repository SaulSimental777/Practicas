
package IO;

import java.io.IOException;
import java.util.Scanner;

public abstract class ClaseIO {
    public static String capturaCadena(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print("" + msg +": ");
        return (sc.nextLine());
    }

    public static int capturaEntero(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print("" + msg +": ");
        return (sc.nextInt());
    }

    public static float capturaFloat(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print("" + msg +": ");
        return (sc.nextFloat());
    }

    public static double capturaDouble(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print("" + msg +": ");
        return (sc.nextDouble());
    }

    public static boolean capturaBoolean(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print("" + msg +": ");
        return (sc.nextBoolean());
    }

    public static void imprimirMenu(String [] opciones){
        int numOpciones = 0;
        for(int i =0 ;i < opciones.length; ++i){
            System.out.println((i+1) + ") " + opciones[i]);
            numOpciones = i;
        }
        System.out.println((numOpciones + 2) + ") Salir");

        System.out.println("\n");
    }

    public static void imprimirMensaje(String msg){
        System.out.println(msg);
    }

    public static void limpiaPantalla(){
        for(int i = 0; i < 40; i++){
            imprimirMensaje("");
        }
    }

    public static void pausa(){
        System.out.println("Presione Enter para continuar...");

        try {
            System.in.read();
        }catch (IOException ignored){

        }
    }

    public static String[] encriptarCadenas(String [] cadenas, char caracter){
        String [] nuevaCadena = new String[cadenas.length];

        for(int i = 0; i < cadenas.length; i++){
            nuevaCadena[i] = cadenas[i].charAt(0) + cadenas[i].substring(1).replaceAll("(?<=\\s|^)[a-zA-Z]*(?=[.,;:]?\\s|$)", "*");
        }

        return nuevaCadena;
    }
}
