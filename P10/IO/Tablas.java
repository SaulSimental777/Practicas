package IO;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public abstract class Tablas {
    public static void tablaSimple(String [][] datos, boolean justificado){
        Map<Integer, Integer> largoColumnas =  new HashMap<>();
        Arrays.stream(datos).forEach(a -> Stream.iterate(0, (i -> i < a.length), (i -> ++i)).forEach(i -> {
            largoColumnas.putIfAbsent(i, 0);

            if(largoColumnas.get(i) < a[i].length())
                largoColumnas.put(i, a[i].length());
        }));

        final StringBuilder cadenaFormato =  new StringBuilder();

        String bandera = justificado ? "-" : " ";
        largoColumnas.forEach((key, value) -> cadenaFormato.append("| %").append(bandera).append(value).append("s "));
        cadenaFormato.append("|\n");

        //Consola Java
        Stream.iterate(0, (i -> i < datos.length), (i -> ++i)).forEach(a -> System.out.printf(cadenaFormato.toString(), (Object[]) (datos[a])));

        //IntelliIdea
        //Stream.iterate(0, (i -> i < datos.length), (i -> ++i)).forEach(a -> System.out.printf(cadenaFormato.toString(),(datos[a])));

    }
}
