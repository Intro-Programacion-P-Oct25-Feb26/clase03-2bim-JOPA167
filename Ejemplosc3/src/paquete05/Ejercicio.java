/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

//import. java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejercicio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String[] estaciones = new String[3];
        int[][] producciones = new int[5][12];
        
        int[] sumaTotal = new int[5];

        int suma = 0;
        String estacion;
        int produccion;

        System.out.println(
                "ANÁLISIS DE PRODUCCIÓN");

        for (int i = 0; i < estaciones.length; i++){
            suma = 0;
            entrada.nextLine();
            System.out.println("Ingrese el nombre de la Estación");
            estaciones[i] = entrada.nextLine();
            for (int c = 0; c < 12; c++) {
                System.out.printf("Ingrese la producción del mes %d de la estación %s",
                        c +1 ,
                        estaciones[i]);
                producciones[i][c] = entrada.nextInt();
                suma = suma + producciones[i][c];
                

            }
            sumaTotal[i] = suma;

        }
        
        for (int i = 0; i < estaciones.length; i++){
        System.out.printf("ESTACIÓN 1: %s - TOTAL PRODUCCIÓN: %d",
                estaciones[i],
                sumaTotal[i]);
        }
    }
}
