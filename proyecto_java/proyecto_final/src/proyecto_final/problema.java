/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final;

import java.util.Scanner;
import paquete01.problemaFutbol;
import paquete02.problemaNatacion;
import paquete03.problemaAtletismo;
import paquete04.problemaBasquetball;
import paquete05.problemaCiclismo;
import paquete06.problemaTenis;
import paquete07.problemaYoga;
/**
 *
 * @author utpl
 */

public class problema {

    public static String cadenaAcumuladora = "";

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] contador = new int[7];
        boolean bandera = true;
        int opcion;
        String cadena;
        String[] mensaje = {"1. Numero de participantes de Futbol: ",
            "2. Numero de Participantes de Natación: ",
            "3. Numero de Participantes de Atletismo: ",
            "4. Numero de Participantes de Basquetbol: ",
            "5. Numero de Participantes de Ciclismo: ",
            "6. Numero de Participantes de Tenis: ",
            "7. Numero de Participantes de Yoga:"};

        while (bandera) {
            System.out.println("Ingrese la disciplina a la que desea registrarse: "
                    + "futbol(1), natacion(2), atletismo(3), basquetball(4),"
                    + " ciclismo(5), tenis(6), yoga(7)");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    cadena = problemaFutbol.obtenerDatosFutbol();
                    contador[0]++;

                    break;
                case 2:
                    cadena = problemaNatacion.obtenerDatosNatacion();
                    contador[1]++;
                    break;
                case 3:
                    cadena = problemaAtletismo.obtenerDatosAtletismo();
                    contador[2]++;
                    break;
                case 4:
                    cadena = problemaBasquetball.obtenerDatosBasquetball();
                    contador[3]++;
                    break;
                case 5:
                    cadena = problemaCiclismo.obtenerDatosCiclismo();
                    contador[4]++;
                    break;
                case 6:
                    cadena = problemaTenis.obtenerDatosTenis();
                    contador[5]++;
                    break;
                case 7:
                    cadena = problemaYoga.obtenerDatosYoga();
                    contador[6]++;
                    break;
                default:
                    System.out.println("Lo sentimos, "
                            + "el club no tiene esa opción.");
            }

            System.out.println("¿Desea registrar otra actividad? "
                    + "(1 para si, 0 para no):");
            int continuar = entrada.nextInt();
            if (continuar == 0) {
                bandera = false;
            }
        }

        int totalActividades = 0;
        for (int i = 0; i < contador.length; i++) {
            totalActividades += contador[i];
        }
        int[] totalReporte = new int[contador.length];
        for (int i = 0; i < contador.length; i++) {
            totalReporte[i] = contador[i];
        }

        obtenerInformacion(totalActividades);

        cadenaAcumuladora = obtenerReporte(mensaje, totalReporte);
        System.out.printf("\nLas actividades ingresadas son:\n%s",
                cadenaAcumuladora);

    }

    public static String obtenerInformacion(int totalActividades) {
        
        String cadena = "";

        if (totalActividades == 0) {
            cadena = ("\nMala campaña, debemos mejorar.");
        } else if (totalActividades >= 1 && totalActividades <= 5) {
            cadena = ("\nPoca participación en el club, hay que mejorar.");
        } else if (totalActividades >= 6 && totalActividades <= 15) {
            cadena = ("\nBuena participación, sigan así.");
        } else if (totalActividades >= 16) {
            cadena = ("\nExcelente campaña del club.");
        }
        
        return cadena; 
    }

    public static String obtenerReporte(String[] a, int[] b) {
        String resultado = "";
        for (int i = 0; i < a.length; i++) {
            resultado += String.format("%s%d\n",
                    a[i],
                    b[i]);
        }
        return resultado;
    }
}
