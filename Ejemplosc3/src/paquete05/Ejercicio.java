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
        String[] estaciones = new String[5];
        String[] encargados = new String[5];
        int destacado = 0;
        int mayorPro = 0;
        
        String reporte = "";
        int[][] producciones = new int[5][12];
        
        
        int[] sumaTotal = new int[5];
        int suma = 0;
        
        System.out.println(
                "ANÁLISIS DE PRODUCCIÓN");

        for (int i = 0; i < estaciones.length; i++){
            suma = 0;
            
            System.out.printf("Ingrese el nombre de la Estación %d: ",i+1);
            estaciones[i] = entrada.nextLine();
            System.out.println("Ingrese el nombre del encargado: ");
            encargados[i] = entrada.nextLine();
            
            for (int c = 0; c < 12; c++) {
                System.out.printf("Ingrese la producción del mes %d de la estación %s",
                        c +1 ,
                        estaciones[i]);
                producciones[i][c] = entrada.nextInt();
                suma = suma + producciones[i][c];
                

            }
            sumaTotal[i] = suma;
            entrada.nextLine();

        }
        
        for (int i = 0; i < estaciones.length; i++){
        reporte = String.format("%sESTACIÓN %d: %s - TOTAL PRODUCCIÓN: %d\n",
                reporte,
                i+1,
                estaciones[i],
                sumaTotal[i]);
        }
        
        
        for(int i = 0; i<5;i++){
            if (sumaTotal[i] > mayorPro){
                mayorPro= sumaTotal[i];
                destacado = i;
            }
        }
        reporte = String.format("%s\nEstación más Productiva:%s\n"
                + "Encargado de la Estación: %s\n"
                + "Cantidad de la Estación más Productiva: %d",
                reporte,
                estaciones[destacado],
                encargados[destacado],
                sumaTotal[destacado]);
        System.out.printf("%s",reporte);
    }
}
