package paquete01;

import java.util.Formatter;

/**
 *
 * @author BrandonVS
 */
public class CrearArchivo {
    
    // Metodo void para crear los archivos con los datos
    public static void crearArchivo(String dato, String nom){
        
        try {
            String ruta = String.format("data/%s.txt", nom);
            Formatter salida = new Formatter(ruta);
            salida.format("%s\n", dato);
            salida.close();
            
            
        } catch (Exception e){
            System.err.println("Ocurrio un error al crear el archivo.");
            System.exit(1);
        }
    }
}
