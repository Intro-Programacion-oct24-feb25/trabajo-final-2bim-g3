/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final;

import java.util.Scanner;
import paquete01.ProblemaFutbol;
import paquete02.ProblemaNatacion;
import paquete03.ProblemaAtletismo;
import paquete04.ProblemaBasquetball;
import paquete05.ProblemaCiclismo;
import paquete06.ProblemaTenis;
import paquete07.ProblemaYoga;

/**
 *
 * @author utpl
 */
public class Problema {

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
                    cadena = ProblemaFutbol.obtenerDatosFutbol();
                    cadenaAcumuladora = String.format("%s\n%s",
                            cadenaAcumuladora, cadena);
                    contador[0]++;

                    break;
                case 2:
                    cadena = ProblemaNatacion.obtenerDatosNatacion();
                    cadenaAcumuladora = String.format("%s\n%s",
                            cadenaAcumuladora, cadena);
                    contador[1]++;
                    break;
                case 3:
                    cadena = ProblemaAtletismo.obtenerDatosAtletismo();
                    cadenaAcumuladora = String.format("%s\n%s",
                            cadenaAcumuladora, cadena);
                    contador[2]++;
                    break;
                case 4:
                    cadena = ProblemaBasquetball.obtenerDatosBasquetball();
                    cadenaAcumuladora = String.format("%s\n%s",
                            cadenaAcumuladora, cadena);
                    contador[3]++;
                    break;
                case 5:
                    cadena = ProblemaCiclismo.obtenerDatosCiclismo();
                    cadenaAcumuladora = String.format("%s\n%s",
                            cadenaAcumuladora, cadena);
                    contador[4]++;
                    break;
                case 6:
                    cadena = ProblemaTenis.obtenerDatosTenis();
                    cadenaAcumuladora = String.format("%s\n%s",
                            cadenaAcumuladora, cadena);
                    contador[5]++;
                    break;
                case 7:
                    cadena = ProblemaYoga.obtenerDatosYoga();
                    cadenaAcumuladora = String.format("%s\n%s",
                            cadenaAcumuladora, cadena);
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

        String cadena1 = obtenerReporte(mensaje, totalReporte);

        cadenaAcumuladora = String.format("%s%s", cadena1,
                cadenaAcumuladora);

        System.out.printf("\nLas actividades ingresadas son:\n%s",
                cadenaAcumuladora);

    }

    public static void obtenerInformacion(int totalActividades) {

        if (totalActividades == 0) {
            System.out.println("\nMala campaña, debemos mejorar.");
        } else if (totalActividades >= 1 && totalActividades <= 5) {
            System.out.println("\nPoca participación en el club, hay que mejorar.");
        } else if (totalActividades >= 6 && totalActividades <= 15) {
            System.out.println("\nBuena participación, sigan así.");
        } else if (totalActividades >= 16) {
            System.out.println("\nExcelente campaña del club.");
        }
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
