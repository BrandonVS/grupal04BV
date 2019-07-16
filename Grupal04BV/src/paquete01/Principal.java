package paquete01;

import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author BrandonVS
 */
public class Principal {

    public static void main(String[] args) {
        // Se abre el archivo
        try {
            // Se leen los registros usando el scanner
            Scanner scan = new Scanner(new File("data/arhivo-grupal-04.txt"));
            
            // Se leen los datos de cada linea del archivo y se los almacena en
            // un ArrayList
            while (scan.hasNext()) {
                String linea = scan.nextLine();
                
                ArrayList<String> linea_partes = new ArrayList<>(Arrays.asList(
                        linea.split("\\|")));
                // Se alacenan los datos en variables
                String display = linea_partes.get(0);
                String nom = linea_partes.get(1);
                String pais = linea_partes.get(2);
                String apel = linea_partes.get(3);
                String segun = linea_partes.get(4);
                String camis = linea_partes.get(5);
                String nacim = linea_partes.get(6);
                String ln = linea_partes.get(7);
                String club = linea_partes.get(8);
                String alt = linea_partes.get(9);
                String cap = linea_partes.get(10);
                String goles = linea_partes.get(11);
                // Se crea el reporte de cada linea de datos
                String cadena = String.format("Name: %s\nFIFA Display: %s\nCoun"
                        + "try: %s\nLast Name: %s\nFirst Name: %s\nShirt Name: "
                        + "%s\nDOB: %s\nPOS: %s\nClub: %s\nHeight: %s\nCaps: %s"
                        + "\nGoals: %s", nom, display, pais, apel, segun, camis,
                        nacim, ln, club, alt, cap, goles);
                // Se envia el reporte de cada linea
                CrearArchivo.crearArchivo(cadena, nom);
            }
            // Se cierra el archivo
            scan.close();
        } catch (Exception e) {
            System.err.println("Error al leer el archivo.");
            System.exit(1);
        }
    }

}
